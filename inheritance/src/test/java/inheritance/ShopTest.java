package inheritance;



import org.junit.Test;

import static org.junit.Assert.*;



//TEST 5 for the shop add method
@Test public void testTheAddMethodShop() {

        Shop macys = new Shop("Macys", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 1);
        Review test1 = new Review("This place is okay!", "emily", 3);
        Review test2 = new Review("This place is cool!", "tom", 2);
        macys.addReview(test);
        macys.addReview(test1);
        macys.addReview(test2);
        int expected = 2;

        assertEquals("Tests for the shop add method", expected, macys.average);


        }

// TEST 6 This will test the average for the shop
@Test public void testTheAverageStarsShop() {

        Shop macys = new Shop("Macys", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 4);
        Review test1 = new Review("This place is okay!", "emily", 5);
        Review test2 = new Review("This place is cool!", "tom", 6);
        macys.addReview(test);
        macys.addReview(test1);
        macys.addReview(test2);
        int expected = 5;

        assertEquals("This will test the average for the shop", expected, macys.average);


        }

//TEST 7 This will test the to string method for the shop
@Test public void testToStringShop() {

        Shop zoomies = new Shop("zoomies", "$$$");
        Review test = new Review("This place is awesome!", "Peter", 5);
        Review test1 = new Review("This place is okay!", "emily", 3);
        zoomies.addReview(test);
        zoomies.addReview(test1);
        String expected = "zoomies Average Stars: 4 Price: $$$";
        // System.out.println(zoomies.toString(zoomies));
        Theater local = new Theater("home");


        local.addMovie("die hard");
        local.addMovie("die hard 2");
        local.addMovie("die hard 3");
        local.delMovie("die hard");

        local.printMovies();


        assertEquals(" This will test the to string method for the shop", expected, zoomies.toString(zoomies));


        }