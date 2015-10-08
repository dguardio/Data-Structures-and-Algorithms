/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meltwater.java.datastructures;
import java.util.ArrayList;

/**
 *
 * @author Opiza
 * @param <E>
 */
public class BSTree <E extends Comparable> {
    ArrayList<Node> store = new ArrayList<>();
    
    class Node{
        E value;
        Node leftSide;
        Node rightSide;
        
        public Node(E val){
            this.value = val;
            leftSide = null;
            rightSide = null;
        }
    }
      
   
    public void add(E data){
        Node instance;
        if(store.size() == 0){
            instance = new Node(data);
            store.add(instance);
        } else{
            if (data.compareTo(store.get(0).value) > 0 || data.compareTo(store.get(0).value) == 0){
            instance = new Node(data);
            store.get(0).rightSide = instance;
            store.add(instance);
            }else{
            instance = new Node(data);
            store.get(0).leftSide = instance;
            store.add(instance);
            }
        }
    }
    public Boolean contains(E data){

    }
}

