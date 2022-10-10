package com.mycompany.learndsa;


/**
 *
 * @author aniketsingh
 * @param <E>
 */
public class SinglyLinkedList<E> {
    private class Node<E> {
        private E element;
        private Node next;

        public E getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        public Node(Node n, E ele) {
            this.next = n;
            this.element = ele;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;
    public Node<E> getHead() {
        return head;
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public int size() {
        return size;
    }
    public Node<E> getTail() {
        return tail;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }
    
    public void addToFirst(E ele) {
        head = new Node(head,ele);
        if(size == 0) {
            tail = head;
        }
        size++;
    }
    public void addToLast(E ele) {
        Node n = new Node(null,ele);
        if(size == 0) {
            head = n;
        }
        else 
            tail.setNext(n);
        tail = n;
        size++;
    }
    public E removeFromFirst() {
        if(size == 0)
            return null;
        E res = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0) {
            tail = null;
        }
        return res;
    }
    public E removeFromLast() {
        if(size == 0) {
            return null;
        }
        if(size == 1){
            removeFromFirst();
        }
        Node tmp = head;
        while(tmp.next.next != null) {
            tmp = tmp.getNext();
        }
        E res = (E) tmp.getElement();
        tmp.setNext(null);
        tail = tmp;
        size--;
        return res;
    }
    public void traverse() {
        Node tmp = head;
        while(tmp != null) {
            System.out.print(tmp.getElement() + " ");
            tmp = tmp.getNext();
        }
    }
    public void reverseIterative() {
        if(head == null || head.next == null)
            return;
        Node<E> prevNode = head;
        Node<E> currentNode = head.next;
        while(currentNode != null) {
            Node<E> nextNode = currentNode.next;
            currentNode.next = prevNode;
            
            //update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node<E> reverseRecursive(Node<E> head) {
      if(head == null || head.next == null)
          return head;
      Node<E> newHead =  reverseRecursive(head.next);
      head.next.next = head;
      head.next = null;
      
      return newHead;
    }
    
 
    
    public void deleteNodeByPos(int pos) {
         if(pos < 1) {         
             System.out.println("Wrong position; should be 1 or greater");
         }
         else if(pos == 1 && head != null) {
             Node<E> current = head;
             head = head.next;
             current = null;
         }
         else {
             Node<E> tmp = head;
             for(int i = 1; i < pos - 1; i++) {
                 if(tmp != null) {
                     tmp = tmp.next;
                 }
             }
             if(tmp != null && tmp.next != null) {
                 Node<E> current = tmp;
                 tmp.next = tmp.next.next;
                 current = null;
             }  
             else {
                 System.out.println("Already null position");
             }
         }
    }
    
    public E nthNodeFromEnd(int n) {
        Node<E> fast = head, slow = head;
        for(int i = 0; i < n; i++)
            fast = fast.next;
        if(fast == null)
            return (E) head.getElement();
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        E res = (E) slow.next.getElement();
        return res;
    }
    public boolean hasCycle() {
        Node<E> fastPointer = head, slowPointer = head;
        while(slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        if(slowPointer == fastPointer)
            return true;
        
        return false;
    }
    public int countNodes(Node<E> n) {
        int count = 1;
        Node<E> temp = n;
        while(temp.next != n) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public int countCycleLength() {
        Node<E> fastPointer = head, slowPointer = head;
        while(slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        if(slowPointer == fastPointer)
            return countNodes(slowPointer);
        
        return 0;
    }
    
    public void sortedInsertion(Node<E> newNode) 
    {        

    }
    public boolean isEven() {
        Node<E> current = head;
       while(current != null && current.next != null) {
           current = current.next.next;
       }
       if(current == null) {
           return true;
       }
       return false;
    }
    public void deleteNodeByKey(int key) {
        Node<E> tmp = head, prev = null;
        
    }
    public E middleOfLinkedList() {
        Node<E> fastPointer  = head, slowPointer = head;
        while(fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        E res =  (E) slowPointer.element;
        return res;
    }
    public void exchangeAdjecentElements() {
        Node<E> temp = head;
        
        while( temp != null && temp.next != null) {
            E k = temp.element;
            temp.element = (E) temp.next.element;
            temp.next.element = k;
            temp = temp.next.next;
        }
    }
    
   

}