package com.sdajava.listimplementation;

/**
 * Created by user on 2017-03-06.
 */
public class Node {

    private String value;
    private Node next;
    private Node prev;

    public Node(String value, Node next, Node prev) { //konstruktor alt+insert
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public String getValue() { //getery alt+insert
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setValue(String value) { //seter alt+insert
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;

    }
}
