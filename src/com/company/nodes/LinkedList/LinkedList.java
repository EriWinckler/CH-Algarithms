package com.company.nodes.LinkedList;


import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    public static void main(String[] args) {
        Node<Integer> head = null;
        head = addNode(head, 2);
        head = addNode(head, 8);
        head = addNode(head, 5);
        head = addNode(head, 9);

        assertResult(head.value == 2);
        assertResult(head.next.value == 8);
        assertResult(head.next.next.value == 5);
        assertResult(head.next.next.next.value == 9);

        displayList(head);

        displayList(find(head, 5));
        displayList(head); // if2859 them its pass by value, if its 59 them pass by reference
    }

    private static void assertResult(boolean result) {
        if (result) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }

    private static Node<Integer> addNode(Node<Integer> head, int value) {
        if (head == null) {
            return new Node<>(value);
        } else {
            Node<Integer> trav = head;

            while (trav.next != null) {
                trav = trav.next;
            }

            trav.next = new Node<>(value);

            return head;
        }
    }

    public static Node<Integer> recAddNode(Node<Integer> head, int value) {
        //only add the value as a new node onto a node with a next == null
        if(head == null) {
            return new Node<Integer>(value);
        }

        head.next = recAddNode(head.next, value);
        return head;
    }

    public static void displayList(Node<Integer> head) {
        //output should be 2859 additional challenge 2, 8, 5, 9
        Node<Integer> trav = head;
        StringBuilder output = new StringBuilder();
        while(trav != null) {
            output.append(trav.value);
            if(trav.next != null) {
                output.append(", ");
            }
            trav = trav.next;
        }
        System.out.println(output);
    }

    private static List<Integer> listBuilder(Node<Integer> head) {
        if (head == null) {
            return new ArrayList<>();
        } else {
            List<Integer> result = listBuilder(head.next);

            result.add(head.value);

            return result;
        }
    }

    private static Node<Integer> find(Node<Integer> head, int query) {
        //0. integer return the query if found null if not
        //1. int return the index if found or -1 if not found
        //2. node return of the node object that contains the query of null if not found
        Node<Integer> trav = head;
        while(trav != null && trav.value != query) {
            trav = trav.next;
        }
        //trav = null so no additional checks
        return trav;
    }

    public static void remove(Node<Integer> head, int query) {
        Node<Integer> trav = head;
        if(head.value == query) {
            head = head.next;
            return;
        }

        while(trav.next != null && trav. next.value != query) {
            trav = trav.next;
        }

        //trav is now pointing at the node before the "badnode"
        trav.next = trav.next.next;
    }
}
