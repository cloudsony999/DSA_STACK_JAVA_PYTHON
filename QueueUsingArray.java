package com.example;

import java.util.NoSuchElementException;

public class QueueUsingArray {
    private int[] queueArray;
    private int front;
    private int rear;

    public QueueUsingArray(int maxSize) {
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    //Queue Operations
    //check whether the stack is full
    public boolean isFull() {
        return (rear == queueArray.length - 1);
    }

    public boolean isEmpty() {
        return (front == -1 || front == rear + 1);
    }

    public int size() {
        if (isEmpty())
            return 0;
        else
            return rear - front + 1;
    }

    public void insert(int key) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1)
            front = 0;
        rear = rear + 1;
        queueArray[rear] = key;
    }

    public int delete() {
        int key;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            throw new NoSuchElementException("Queue is empty");
        }
        key = queueArray[front];
        front = front + 1;
        return key;
    }

    public int peek() {
        int key;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            throw new NoSuchElementException("Queue is empty");
        }
        return queueArray[front];

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue contents: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i]+" ");
        }
    }
}
