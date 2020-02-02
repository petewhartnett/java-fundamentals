package inheritance;



import org.junit.Test;

import static org.junit.Assert.*;

//TEST 1 Initial test to make sure the Restaurant constructor and class are working properly
public class RestaurantTest {

    @Test public void testRestaurantClass() {

        Restaurant arbys = new Restaurant("arbys",  "$$$");

//        System.out.println(arbys.name);
//        System.out.println(arbys.stars);
//        System.out.println(arbys.price);
        String expected = "$$$" ;
        String expected2 = "arbys" ;

       // System.out.println(arbys.toString(arbys));

        assertEquals("Returns Restaurant price testing constructor", expected, arbys.price);
        assertEquals("inserted value into middle of array", expected2, arbys.name);

    }




// TEST 2 tests out toString for the Restaurant Class
    @Test public void testToString() {

        Restaurant arbys = new Restaurant("arbys", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 5);
        Review test1 = new Review("This place is okay!", "emily", 3);
            arbys.addReview(test);
            arbys.addReview(test1);
String expected = "arbys Average Stars: 4 Price: $$$";
        System.out.println(arbys.toString(arbys));


       assertEquals("Tests Restaurant Class toStirng method", expected, arbys.toString(arbys));


    }


    //TEST 3 tests the Review class and the ToString method
    @Test public void testReviewToString() {

        Review test = new Review("This place is awesome!", "Peter", 5);

        System.out.println(test.toString(test));

        String expected = "This place is awesome! Peter 5";

        assertEquals("inserted value into middle of array",expected, test.toString(test) );
    }

    @Test public void testTheAddMethod() {

        Restaurant arbys = new Restaurant("arbys", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 1);
        Review test1 = new Review("This place is okay!", "emily", 3);
        Review test2 = new Review("This place is cool!", "tom", 2);
        arbys.addReview(test);
        arbys.addReview(test1);
        arbys.addReview(test2);
        int expected = 2;

     assertEquals("Tests Restaurant Class addReview method", expected, arbys.average);


    }

//TEST 4 tests the average for the stars from the reviews.
    @Test public void testTheAverage() {

        Restaurant arbys = new Restaurant("arbys",  "$$$");
        Review test = new Review("This place is awesome!", "Peter", 5);
        Review test1 = new Review("This place is okay!", "emily", 3);
        Review test2 = new Review("This place is cool!", "tom", 4);
        arbys.addReview(test);
        arbys.addReview(test1);
        arbys.addReview(test2);
        int expected = 4;
        System.out.println(arbys.toString(arbys));


        assertEquals("tests the average for the stars from the reviews.", expected, arbys.average);


    }

    // Test 8 for theater to string
    @Test public void testToStringTheater() {


        String expected = "home Average Stars: 4";

        Theater local = new Theater("home");
        Review test = new Review("This place is awesome!", "Peter", 4);
        local.addReview(test);

        local.addMovie("die hard");
        local.addMovie("die hard 2");
        local.addMovie("die hard 3");

        System.out.println( local.toString(local));


        assertEquals("Test 8 for theater to string", expected, local.toString(local));


    }



}