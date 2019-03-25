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
        str += current.getCargoReference() + ",";
        current = current.getReferenceToNextNode();
      }
      return str += "]";
    }


    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
       //Node tempReference = headReference.getReferenceToNextNode();
       Node addVal = new Node (val, headReference);
       headReference = addVal;
      return true;
     }

     public Object set(int index, Object val) {
       int count = 0;
       Node current = headReference;
       while(count != index) {
         count ++;
         current = current.getReferenceToNextNode();
       }
       Object old = current.getCargoReference();
       current.setCargoReference(val);
       return old;
     }

     public Object get(int index) {
       int count = 0;
       Node current = headReference;
       while(count != index) {
         count ++;
         current = current.getReferenceToNextNode();
       }
       return current.getCargoReference();
     }

     public void add (int index, Object val) {
       int count = 0;
       Node current = headReference;
       while(count != index - 1) {
         count ++;
         current = current.getReferenceToNextNode();
       }
       Node addThis = new Node (val, current.getReferenceToNextNode());
       current.setReferenceToNextNode(addThis);
     }

    public Object remove(int index) {
      int count = 0;
      Node current = headReference;
      while(count != index - 1) {
        count ++;
        current = current.getReferenceToNextNode();
      }
      Object removed = current.getReferenceToNextNode().getCargoReference();
      Node holder = current.getReferenceToNextNode().getReferenceToNextNode();
      current.setReferenceToNextNode(holder);
      return removed;
    }
}
