/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacdoctor;

import java.util.ArrayList;

/**
 *23/3/22
 *DocPQ.java
 * @author John Ringrose
 */
public class DocPQ implements PQInterface {

    //data memebers
    private ArrayList<PQElement> gpList;
    
    //constructors
    public DocPQ(){
        gpList = new ArrayList<PQElement>();
    }
    
    @Override
    public void enqueue(int priorityKey, Object element) {
        int index;//need this to find where they go in the list
        PQElement elem = new PQElement((Person)element, priorityKey);
        index = findInsertPosition(priorityKey);
        
        if(index == gpList.size()){//add object
            gpList.add(elem);
        }else{//add(index, obj)
            gpList.add(index, elem);
        }
    }
    
    private int findInsertPosition(int newKey){
        boolean found = false;//flag to jump out when we have idenitifed the index
        PQElement elem;
        int position =0;
        while(position < gpList.size() && !found){
            elem = gpList.get(position);
            if(elem.getPriorityKey() > newKey){
                position++;
            }else{
                found = true;
                
            }
        }
        return position;
    }
    @Override
    public Object dequeue() {
        return gpList.remove(0);
    }

    @Override
    public Object frontElem() {
        return gpList.get(0);
    }
    
    public String printPQ(){
        String msge="";//initalising message
        for(int i =0;i < gpList.size(); i++){//using for loop to go throughthe llst
            PQElement temp = gpList.get(i);
            msge = msge + temp.printPerson()+"\n";//printing out message
        }
        return msge;
    }
}
