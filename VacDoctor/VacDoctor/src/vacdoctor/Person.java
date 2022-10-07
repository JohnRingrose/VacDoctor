/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacdoctor;

/**
 *23/3/22
 *Person.java
 * @author John Ringrose
 */
public class Person {
   private String name;
   private String details;

    public Person(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
 
}
