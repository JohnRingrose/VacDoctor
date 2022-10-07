/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacdoctor;

/**
 **23/3/22
 *PQInterface.java
 * @author John Ringrose
 */
public interface PQInterface {
    public void enqueue(int priorityKey,Object element);
    public Object dequeue();
    public Object frontElem();
}
