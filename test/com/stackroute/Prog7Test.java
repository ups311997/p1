package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Prog7Test {
    Prog7 app;

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
        app = new Prog7();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue = "false";
        int a[] = {2, 3, 4, 5, 3, 4};

        //Act
        String actualValue = app.sort(a, 6);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}
