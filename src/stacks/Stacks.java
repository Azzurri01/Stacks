/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stacks;

import java.util.Random;

/**
 *
 * @author djohanne
 */
public class Stacks {
    public static void main(String[] args) {
        
//Code for Int
        StacksImplementationInt st = new StacksImplementationInt();
        int j;
        Random r = new Random();

        System.out.println(st.isEmpty() + "\n");        
        for(int i=0; i<5; i++)
        {
            j = r.nextInt(100); //Generate random numbers 
            st.push(j); //push the random numbers 
            int k = i+1; 
            System.out.println("Number" + k + ": " + st.peek());
        }
        System.out.println("\n" + st.isEmpty() + "\n");
        System.out.println(st.pop());
        
//Code for String
        /*StacksImplementationString st = new StacksImplementationString();
        String[] names = {"Dimitri", "Fowzia", "Nuriyat", "Naqeeb", "Niyal"};
        
        System.out.println(st.isEmpty() + "\n");
        for(int i=0; i<5; i++)
        {            
            st.push(names[i]);
            int k = i+1;
            System.out.println("Name" + k + ": " + st.peek());
        }
        System.out.println("\n" + st.isEmpty() + "\n");
        System.out.println(st.pop());*/
        
//Code for Object(Person)
        /*StacksImplementationPerson st = new StacksImplementationPerson();
        Person dad = new Person("Dimitri", "Johannes", "dadID");
        Person mom = new Person("Fowzia", "Johannes", "momID");
        Person daughter1 = new Person("Nuriyat", "Johannes", "daughter1ID");
        Person son = new Person("Naqeeb", "Johannes", "sonID");
        Person daughter2 = new Person("Niyal", "Johannes", "daughter2ID");
 
        Person[] person = {dad, mom, daughter1, son, daughter2};
        
        System.out.println(st.isEmpty() + "\n");
        for(int i=0; i<5; i++)
        {
            st.push(person[i]);
            System.out.println(st.peek().toString());
        }
        System.out.println("\n" + st.isEmpty() + "\n");
        System.out.println(st.pop());*/
    }
}
