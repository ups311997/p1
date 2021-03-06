package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Prog2Test {
    Prog2 app;
    @BeforeClass
    public static void setUpOnce(){
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce(){
        System.out.println("Inside teardown once");

    }
    @Before
    public void setUp(){
        System.out.println("Inside setup");
        app=new Prog2();
    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }
    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue="jerry";

        //Act
        String actualValue=app.check(24);

        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);


        String expectedValue1="tom";

        //Act
        String actualValue1=app.check(23);

        //Assert
        assertEquals(expectedValue1, actualValue1);

        assertNotNull(actualValue1);
    }


}


