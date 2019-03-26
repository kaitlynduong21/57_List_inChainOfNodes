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
        str += getNode(i).getCargoReference() + ",";
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
       Node node = getNode(index);
       Object old = node.getCargoReference();
       node.setCargoReference(val);
       return old;
     }

     private Node getNode(int index) {
       int count;
       Node current;
       for (count = 0, current = headReference;
            count != index;
            count ++, current = current.getReferenceToNextNode()){
       }
       return current;
     }

     public Object get(int index) {
       return getNode(index).getCargoReference();
     }

     public void add (int index, Object val) {
       if (index == 0) {
         addAsHead(val);
       } else {
         Node current = getNode(index - 1);
         Node addThis = new Node (val, current.getReferenceToNextNode());
         current.setReferenceToNextNode(addThis);
       }
     }

     public Object remove(int index) {
       int count;
       Node current;
       Object removed;
       if (index == 0) {
         removed = headReference.getCargoReference();
         headReference = headReference.getReferenceToNextNode();
       } else {
         Node node = getNode(index - 1);
         removed = node.getReferenceToNextNode().getCargoReference();
         Node holder = node.getReferenceToNextNode().getReferenceToNextNode();
         node.setReferenceToNextNode(holder);
       }
       return removed;
     }
}
