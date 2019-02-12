package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Prog8Test {
    Prog8 app;

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
        app = new Prog8();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "guess is right";

        //Act
        String actualValue = app.check(40);

        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);


    }

    @Test
    public void test2() throws Exception {
        //Arrange
        String expectedValue = "Number guessed is less than original number";

        //Act
        String actualValue = app.check(10);

        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);


    }

    @Test
    public void test3() throws Exception {
        //Arrange
        String expectedValue = "Number guessed is greater than original number";

        //Act
        String actualValue = app.check(80);

        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);


    }
}