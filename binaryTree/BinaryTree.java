
package com.mycompany.learndsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author aniketsingh
 */
public class BinaryTree {
    private class Node {
        int value;
        Node left, right;        
        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
    Node root;
    public void insert(int value) {
        root = addRecursive(root,value);
    }
    private Node addRecursive(Node current, int value) {
        if(current == null) {
            current = new Node(value);
            return current;
        }
        if(value < current.value) {
            current.left = addRecursive(current.left, value);
        }
        else {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }
    private boolean containsNodeRecursive(Node current, int value) {
        if(current == null) {
            return false;
        }
        if(current.value == value)
            return true;
        if(value < current.value) {
            return containsNodeRecursive(current.left,value);
        }
        else {
            return containsNodeRecursive(current.right, value);
        }
    }
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
    
    public Node deleteNodeRecursiveLargest(Node current, int value) {
        if(current == null)
            return null;
        if(current.value == value) {
            if(current.left == null && current.right == null) 
                return null;
            if(current.left == null) 
                return current.right;
            if(current.right == null) 
                return current.left;
            
            int largestValue = findLargestValue(current.left);
            current.value = largestValue;
            current.left = deleteNodeRecursiveLargest(current.left, largestValue);
            return current;
        }
        if(value < current.value) {
            current.left = deleteNodeRecursiveLargest(current.left, value);
            return current;
        }
        current.right = deleteNodeRecursiveLargest(current.right,value);
        return current;
    }
    
    private int findLargestValue(Node root) {
        return root.right == null ? root.value : findLargestValue(root.right);
    }
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findLargestValue(root.right);
    }
    
    public Node getRoot() {
        return root;
    }
    
    public Node deleteNodeRecursiveSmallest(Node current, int value) {
         if(current == null)
            return null;
        if(current.value == value) {
            if(current.left == null && current.right == null) 
                return null;
            if(current.right == null) 
                return current.left;
            if(current.left == null) 
                return current.right;
           
            
            int smallestValue = findSmallestValue(current.left);
            current.value = smallestValue;
            current.left = deleteNodeRecursiveSmallest(current.left, smallestValue);
            return current;
        }
        if(value < current.value) {
            current.left = deleteNodeRecursiveSmallest(current.left, value);
            return current;
        }
        current.right = deleteNodeRecursiveSmallest(current.right,value);
        return current;
    }
    public void deleteNodeSmall(int value) {
        deleteNodeRecursiveSmallest(root,value);
    }
     public void deleteNodeLarge(int value) {
        deleteNodeRecursiveLargest(root,value);
    }
     
    public void traverseInOrder(Node node) {
        if(node != null) {
            //LNR
            traverseInOrder(node.left);
            System.out.print(" "+ node.value);
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(Node node) {
        if(node != null) {
            //NLR
            System.out.print(" "+ node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(Node node) {
        if(node != null) {
            //LRN
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+ node.value);

        }
    }
    public void traverseLevelOrder() {
        if(root == null)
            return;
        //liked list of nodes traversed
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()) {
            //remove from the top node from the list and print them
            Node node = nodes.remove();
            System.out.print(" " + node.value);
            if(node.left != null)
                nodes.add(node.left); //if it has left child, we add it to the list
            if(node.right != null)
                nodes.add(node.right); //now adding right child
        }
    }
    

     
}
