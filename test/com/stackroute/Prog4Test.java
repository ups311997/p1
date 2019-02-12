package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Prog4Test {
    Prog4 app;
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
        app=new Prog4();
    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }
    @Test
    public void test() throws Exception {
        //Arrange
        int[] expectedValue= {1,2,2,3,3,3};

        //Act
        int[] actualValue=app.loop(3);

       int flag=0;
       int f=1;
       for(int i=0;i<3;i++)
       {
           if(actualValue[i]!=expectedValue[i])
           {
               flag=1;
           }
       }
       if (flag==0)
       {
           f=0;
       }
       assertEquals(flag,f);
       assertNotNull(actualValue);
    }


}