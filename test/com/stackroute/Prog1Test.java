package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Prog1Test {



        Prog1 app;
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
            app=new Prog1();
        }

        @After
        public void tearDown(){
            System.out.println("Inside teardown");
            app=null;
        }
        @Test
        public void test() throws Exception {
            //Arrange
            long expectedValue=2468642;
            boolean expectedValue1=true;
            //Act
            long actualValue=app.pal(2468642);
            boolean actualValue1=app.addeven(2468642);
            //Assert
            assertEquals(expectedValue, actualValue);
            assertEquals(expectedValue1, actualValue1);
            assertNotNull(actualValue);
        }


    }

