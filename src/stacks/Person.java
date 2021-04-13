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
public class Person 
{
    private String fName, lName, idNum;
    
     public Person()
    {

    }
    
    public Person(String firstName, String lastName, String id)
    {
        fName=firstName;
        lName=lastName;
        idNum=id;
    }
    
    public void setFirstName(String firstName)
    {
        fName=firstName;
    }
    
    public void setLastName(String lastName)
    {
        lName=lastName;
    }
    
    public void setId(String id)
    {
        idNum=id;
    }
    
    public String getFirstName()
    {
        return fName;
    }
    
    public String getLastName()
    {
        return lName;
    }
    
    public String getId()
    {
        return idNum;
    }
    
    @Override
    public String toString()
    {
        return "First name: " + fName + ", Last name: " + lName + ", ID: " + idNum;
    }
}
