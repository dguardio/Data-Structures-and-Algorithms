/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meltwater.java.datastructures;

import java.util.Arrays;


/**
 *
 * @author Opiza
 * @param <E> is generic
 */
public class BetterArray<E> {
    
    private static final int CAPACITY = 10;
    private Object elementCont[] = {};
    private int objSize = 0;
    
    public BetterArray(){
        elementCont = new Object[CAPACITY];
        
    }
    public void IncreaseArray(){
        int newCap = elementCont.length * 2;
        elementCont = Arrays.copyOf(elementCont, newCap);  
    }
    public void insert(int index, E a){
        for(int i = index; i < elementCont.length - 1; i--){
            
        }
    }
    public void shift(E a){
        
    }
    public void index(E a){
        
    }
    public void contains(E a){
        
    }
    public void get(int index){
        
    }
    public void size(){
        
    }
    public void isEmpty(){
        
    }
    public void remove(int index){
        
    }
    public void remove(E element){
        
    }
    public void reverse(){
        
    }
    
    public String toString(){
        
    }
}
