/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );

        // // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
            //System.out.println(list); debugging purposes
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());


        System.out.println("Testing Add");
        list.add(3, "d");
        System.out.println("Adding \"d\" at element 3: " + list);
        list.add(0, "K");
        System.out.println("Adding \"K\" at the head: " + list);
        list.add(1, "l");
        System.out.println("Adding \"l\" at element 1: " + list);
        list.add(list.size(), "j");
        System.out.println("Adding \"j\" at the end: " + list);

        System.out.println("Testing Get");
        for (int i = 0; i < list.size(); i ++) {
          System.out.println("Element " + i + " : " + list.get(i));
        }

        /*System.out.println("\nTesting Set");
        list.set(3, "e");
        System.out.println("Setting element 3 to \"e\": " + list);*/

        System.out.println("\nTesting Remove");
        list.remove(3);
        System.out.println("Removing element 3: " + list);

        /*System.out.println("*****Test Using Recursive*****");
        List_inChainOfNodes_recursive list1 = new List_inChainOfNodes_recursive();

        System.out.println( "number of elements: " + list1.size() );

        // // the spec requests that toString include the size
        System.out.println( "empty list: " + list1
                          + System.lineSeparator());

        elements = new String[]{"y","u","t","S",};
        for( String elem : elements ) {
            list1.addAsHead( elem);
            System.out.println( "number of elements: " + list1.size() );
            //System.out.println(list); debugging purposes
        }
        System.out.println( "populated list: " + list1
                          + System.lineSeparator());*/
    }
}
