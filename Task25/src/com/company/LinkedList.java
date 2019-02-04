package com.company;

public class LinkedList <T> {
    private T value;
    private LinkedList next;

    public LinkedList(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext() {
        setNext();
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
