/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacdoctor;

/*23/3/22
 *PQElement.java
 *
 * @author John RIngrose
 */
public class PQElement {
    private Person element;
    private int priorityKey;

    public PQElement(Person element, int priorityKey) {
        this.element = element;
        this.priorityKey = priorityKey;
    }

    public Person getElement() {
        return element;
    }

    public void setElement(Person element) {
        this.element = element;
    }

    public int getPriorityKey() {
        return priorityKey;
    }

    public void setPriorityKey(int priorityKey) {
        this.priorityKey = priorityKey;
    }
    
     public String printPerson(){
      String msge = "Name: " +element.getName()+ "details" +element.getDetails()+"Priority level: "+priorityKey;
      return msge;
  }
}
