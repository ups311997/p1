package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Prog6Test {
    Prog6 app;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("Inside setup");
        app = new Prog6();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "small letter";

        //Act
        String actualValue = app.check('a');

        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);


    }
    @Test
    public void test2() throws Exception {
        //Arrange
        String expectedValue = "capital letter";

        //Act
        String actualValue = app.check('A');

        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);


    }
    @Test
    public void test3() throws Exception {
        //Arrange
        String expectedValue = "digit";

        //Act
        String actualValue = app.check('6');

        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);


    }
    @Test
    public void test4() throws Exception {
        //Arrange
        String expectedValue = "special symbol";

        //Act
        String actualValue = app.check('$');

        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);


    }
}


