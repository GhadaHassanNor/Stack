/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import javax.swing.JOptionPane;

/**
 *
 * @author MAGIC
 */
public class Stack {
    
    private int array[];
    private int top;
    
    public Stack(){
        array = new int[100];
        top = 0;
    }
    
    public void clear(){
        for(int i=0;i<array.length;i++){
            array[i] = 0;
        }
        top = 0;
    }
    
    public boolean isEmpty(){
        if(top==0)
            return true;
        else
            return false;
    }
    
    public void push(int item){
        if(top<(array.length)){
            array[top] = item;
            top++;
        }
        else
            JOptionPane.showMessageDialog(null, "Error : Array is full");
    }
    
    public int pop(){
        if(top!=0){
            int i = array[top-1];
            array[top-1] = 0;
            top--;
            return i;
        }
        else
            return -1;
    }
    
    public int top(){
        int index = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                index = i;
            }
        }
        if(index>=0)
            return array[index];
        else
            return -1;
    }
    
}
