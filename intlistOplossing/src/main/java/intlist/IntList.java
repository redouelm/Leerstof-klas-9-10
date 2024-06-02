package intlist;

import java.util.ArrayList;

/** Stores a bunch of Integers */
public class IntList {

    /** Stores all elements */
    protected ArrayList<Integer> list = new ArrayList<Integer>();

    /** add an element to the list
     * @param element element that will be added
     */
    public void add(int element){
        list.add(element);
    }

    /** removes an element at position <index> from the list
     * @param index indicates the position of the element to remove
     * @return the element removed
     */
    public Integer remove(int index){
        if(index < list.size()){
            return list.remove(index);
        } else {
            return null;
        }
    }

    /** finds the smallest element in the list
     * @return the smallest element, null if the list is empty
     */
    public Integer findMin(){
        if(list.isEmpty()){
            return null;
        }

        int minimum = Integer.MAX_VALUE;
        for(int element: list){
            if(element < minimum){
                minimum = element; //make element the smallest Integer found yet
            }
        }
        return minimum;
    }

}
