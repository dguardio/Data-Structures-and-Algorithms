/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meltwater.java.datastructures;
import java.util.ArrayList;
import java.util.Iterator;

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
    
    /*
    public void contains(E data){
        for(int i = 0; i < store.size(); i++){
            if(data == store.get(i)){
                return true;
            } else{
                return false;
            }
        }
    Before prompt from NetBeans to restructure to below
    }
    */
    public boolean contains(E data){
        for (Node store1 : store) {
            if(data == store1)
            {
                int n = store.indexOf(store1);
                return true;
            }            
         }
        return false;
    }
   
    
       
    public void remove (E data){
      if(contains(data) == true){
          
      }  
    }
}
    
    
       


