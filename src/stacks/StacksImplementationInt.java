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
public class StacksImplementationInt 
{
    private int[] numbers;
    private int top;
    
    public StacksImplementationInt()
    {
        numbers = new int[5];
        top=-1;
    }
    
    public void push(int num)
    {
        top++; //Increment top by 1
        numbers[top] = num;
    }
    
    public int pop()
    {
        top--;
        return numbers[top];
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
    
    public int peek()
    {
        return numbers[top];
    }
}
