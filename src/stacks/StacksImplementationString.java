/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stacks;

/**
 *
 * @author djohanne
 */
public class StacksImplementationString 
{
 private String[] names;
 private int top;
 
 public StacksImplementationString()
 {
     names = new String[5];
     top=-1;
 }
 
 public void push(String nm)
 {
     top++;
     names[top]=nm;
 }
 
 public String pop()
 {
     top--;
     return names[top];
 }
 
 public String peek()
 {
     return names[top];
 }
 
 public boolean isEmpty()
 {
     if(top==-1)
     {
         return true;
     }
        else
        {
            return false;
        }
 }
}
