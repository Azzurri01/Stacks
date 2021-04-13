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
public class StacksImplementationPerson 
{
    private Person[] person;
    private int top;
    
    public StacksImplementationPerson()
    {
        top=-1;
        person = new Person[5];
    }
    
    public void push(Person p)
    {
        top++;
        person[top]=p;
    }
    
    public Person pop()
    {
        top--;
        return person[top];
    }
    
    public Person peek()
    {
        return person[top];
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
