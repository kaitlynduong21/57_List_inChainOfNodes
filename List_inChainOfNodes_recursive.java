/*
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_recursive{
    private Node headReference;

    /**
      Construct an empty list
     */

     public List_inChainOfNodes_recursive() {
     }

     public List_inChainOfNodes_recursive(Node headReference) {
       this.headReference = headReference;
     }


    /**
      @return the number of elements in this list
     */
    public int size() {
      //int count = 0;
      Node current = headReference;
      if(current == null) {
        return 0;
      } else {
        current = current.getReferenceToNextNode();
        List_inChainOfNodes_recursive smallerList = new List_inChainOfNodes_recursive(current);
        return 1 + smallerList.size();
      }
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
}
