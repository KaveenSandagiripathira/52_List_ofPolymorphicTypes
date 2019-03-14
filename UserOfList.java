/**
 Test list features.
 */
public class UserOfList {
//<<<<<<< HEAD
    private static List_inArraySlots list;
    
    public static void main( String[] args ) {
        list = new List_inArraySlots();

         System.out.println( "number of elements: " + list.size() );
         System.out.println( "empty list: " + list);

        // Populate the list with a string
         list.add("Important");
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added string: " + list);

		// Populate the list with a Integer object
		Integer myIntObject = new Integer(11);
         list.add(myIntObject);
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added int: " + list);

		// Populate the list with a Double Object
         
		 Double myDoubleObject = new Double(3.521);
		 list.add(myDoubleObject);
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "added double: " + list);
		 
		 // Populate the list with a user made Point Object
		 
		 Point myPointObject = new Point(2,3);
		 list.add(myPointObject);
		 System.out.println( "number of elements: " + list.size() );
         System.out.println( "added point: " + list);

         // Add enough elements that expansion is expected
		 String test;
         for( int elemIndex = list.size(); elemIndex < 15; elemIndex++ ) {
			 test = "";
			 test += -elemIndex;
             if( list.size() == 10) System.out.println( "expansion expected");

             list.add(test);
             System.out.println( "number of elements: " + list.size() );
         }
         System.out.println("result of expanded list: "
              + list.size() + " elements:");
         System.out.println( list + System.lineSeparator());
    }//test
}//=======

