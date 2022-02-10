package com.company;

import java.util.Collection;

public class LinkList implements ICustomCollection {
    private Link first;
    private int id = 0;

    public LinkList() {
        first = null;
    }

    @Override
    public boolean add(String str) { //добавление элемента
        id++;
        Link newLink = new Link(id, str);
        newLink.next = first;
        first = newLink;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) { //добавление элементов
        for (String str : strArr) {
            add(str);
        }
        return true;
    }

    @Override
    public void show() { //отображение
        System.out.print("List: ");
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    @Override
    public boolean addAll(Collection strColl) {// добавление коллекции
        Object[] objects = strColl.toArray();
        for (Object o : objects) {
            add(o.toString());
        }
        return true;
    }

    @Override
    public boolean delete(int index) {// удаление по индексу
        Link current = first;
        Link previous = first;
        while (current.iData != index) {
            if (current.next == null)
                return false;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        changeID();
        return true;
    }

    private void changeID() {
        id--;
        Link current = first;
        int i = current.iData;
        while (current != null) {
            i--;
            current.iData = i;
            current = current.next;
        }
    }

    @Override
    public boolean delete(String str) { //удаление по значению
        Link current = first;
        int i = current.iData;
        while (current != null) {
            if(current.dData.equals(str)){
                delete(i);
            }
            current = current.next;
            i--;
        }
        return true;
    }

    @Override
    public String get(int index) {// получение значения
        Link current = first;
        while (current != null) {
            if (current.iData == index) {
                return current.dData;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean contains(String str) {// содержание элемента
        Link current = first;
        while (current.dData.equals(str)) {
            if (current.next == null)
                return false;
            else
                current = current.next;
        }
        return true;
    }

    @Override
    public boolean clear() {// удалить ВСЕ!
        first = null;
        id = 0;
        return false;
    }

    @Override
    public int size() {// получение размера
        return id;
    }

    @Override
    public boolean compare(LinkList coll) {
        if (this.size() != coll.size()) return false;
        for (int i = coll.size(); i < 0; i--) {
            if (!this.get(i).equals(coll.get(i))) {
                return false;
            }
        }
        return true;
    }



}



