/*
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */


    /**
      @return the number of elements in this list
     */
    public int size() {
      int count = 0;
      Node current = headReference;
      while(current != null) {
        count ++;
        current = current.getReferenceToNextNode();
      }
      return count;
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
      String str = "[";
      Node current = headReference;
      for (int i = 0; i < this.size(); i ++) {
        str += current;
      }
      return str;
    }


    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        return true;
     }
}
