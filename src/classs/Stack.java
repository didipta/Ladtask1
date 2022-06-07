package classs;
import java.io.*;
import java.util.*;
public class Stack<T extends Object>{
 private T[] arr;
 private int top;
 private int capacity;
 Stack( int size)
 {

     this.capacity=size;
     this.arr=(T[]) new Object[capacity];
     this.top=-1;

 }
 public void push(T entry) throws Exception
 {
     if(this.isStackFall())
     {
         System.out.println("Stack overflow");
         this.increase();
     }
     System.out.println("Add->"+entry);
     this.arr[++top]=entry;
 }
 public T pop ( ) throws Exception
 {
     if(this.isstackempty())
     {
         System.out.println("Stack Underflow");

     }
     T entry=this.arr[top--];
     System.out.println("Removed entry->"+entry);
     return entry;
 }

    private boolean isstackempty() {
     return (top==-1);
    }

     public T peck()
     {
         return arr[top];
     }
    private void increase() {
     T[] n=(T[]) new Object[this.capacity*2];
     for (int i=0;i<capacity;i++)
     {
         n[i]=this.arr[i];

     }
     this.arr=n;
     this.capacity=this.capacity*2;
    }

    private boolean isStackFall() {
     return (top==capacity-1);
    }



}
