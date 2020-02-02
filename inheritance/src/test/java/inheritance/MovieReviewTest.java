package inheritance;



import org.junit.Test;



// Test 11 Test Movie Review toString
@Test public void testMovieReviewToString() {

        MovieReview movieTest = new MovieReview("this movie was cool", 4, "die hard");
        System.out.println(movieTest.toString(movieTest));

        String expected = "Movie: die hard Review: this movie was cool Stars: 4";

        assertEquals("Test Movie Review to String",expected, movieTest.toString(movieTest) );
        }


@Test public void testAddMovietoTheater() {


        int expected = 3;

        Theater local = new Theater("home");
        Review test = new Review("This place is awesome!", "Peter", 4);
        local.addReview(test);

        local.addMovie("die hard");
        local.addMovie("die hard2");
        local.addMovie("die hard3");
        local.printMovies();


        assertEquals("for adding movie to theater through linked list", expected, local.theaterReviewcount);


        }

// Test 10 for deleting movie from movie linked list for theater
@Test public void testDeleteMovietoTheater() {


        int expected = 2;

        Theater local = new Theater("home");
        Review test = new Review("This place is awesome!", "Peter", 4);
        local.addReview(test);

        local.addMovie("die hard");
        local.addMovie("die hard2");
        local.addMovie("die hard3");
        local.delMovie("die hard");
        local.printMovies();



        assertEquals("Tests Restaurant Class toStirng method", expected, local.theaterReviewcount);


        }
// Test 11 Test Movie Review toString
@Test public void testMovieReviewToString() {

        MovieReview movieTest = new MovieReview("this movie was cool", 4, "die hard");
        System.out.println(movieTest.toString(movieTest));

        String expected = "Movie: die hard Review: this movie was cool Stars: 4";

        assertEquals("Test Movie Review to String",expected, movieTest.toString(movieTest) );
        }
// Test 12 Movie review linked list test
@Test public void testMovieReviewLinkedList() {

        MovieReview movieTest = new MovieReview("this movie was cool", 4, "die hard");
        MovieReview movieTest1 = new MovieReview("this movie was okay", 3, "die hard");
        MovieReview movieTest2 = new MovieReview("this movie was lame", 1, "die hard");
        Theater regal = new Theater("regal");
        System.out.println(movieTest.toString(movieTest));
        regal.addReviewMovie(movieTest);
        regal.addReviewMovie(movieTest1);
        regal.addReviewMovie(movieTest2);

        int expected = 3;




        assertEquals("tests movie review linked list",expected, regal.movieReviewCount);
        }

