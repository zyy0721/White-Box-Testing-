package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	int if_1 = hw.Method3(6,1,1);
    	int if_2 = hw.Method3(4,-1,-3);
    	int if_3 = hw.Method3(4,-1,-1);
    	int if_4 = hw.Method3(6,-1,-3);
    	int if_5 = hw.Method3(6,1,-1);

    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int hw_1 = hw.Method4(0,1,1,1,1);
        int hw_2 = hw.Method4(5,5,2,2,1);
        int hw_6 = hw.Method4(4,4,2,2,1);
        int hw_5 = hw.Method4(5,5,2,3,1);
        int hw_4 = hw.Method4(4,4,2,3,1);
        int hw_3 = hw.Method4(5,2,3,3,1);
        int hw_7 = hw.Method4(4,2,3,3,1);
        int hw_8 = hw.Method4(4,2,2,3,1);
    }

    @Test
    public void testbug() {
        HelloWorld hw = new HelloWorld();
        boolean flag_t = hw.bug(5);
        boolean flag_f = hw.bug(4);
    }

    @Test
    public void testisTriangle() {
        HelloWorld hw = new HelloWorld();
        boolean tri_1 = hw.isTriangle(3,4,5);
        boolean tri_2 = hw.isTriangle(1,1,2);
        boolean tri_3 = hw.isTriangle(1,1,0);
        boolean tri_4 = hw.isTriangle(3,1,1);
    }

    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();

        boolean bri_10 = hw.isBirthday(1000,1,1);
        boolean bri_12 = hw.isBirthday(2020,1,1);

        boolean bri_6 = hw.isBirthday(2000,1,1);
        boolean bri_7 = hw.isBirthday(2000,2,29);
        boolean bri_8 = hw.isBirthday(2000,2,30);
        boolean bri_9 = hw.isBirthday(2000,13,1);
        boolean bri_15 = hw.isBirthday(2004,0,1);
        boolean bri_16 = hw.isBirthday(2000,1,0);
        boolean bri_17 = hw.isBirthday(2004,1,32);


        boolean bri_2 = hw.isBirthday(2019,10,1);
        boolean bri_3 = hw.isBirthday(2019,11,1);
        boolean bri_4 = hw.isBirthday(2019,0,2);
        boolean bri_5 = hw.isBirthday(2019,2,29);
        boolean bri_18 = hw.isBirthday(2019,2,0);

        boolean bri_1 = hw.isBirthday(1990,1,1);
        boolean bri_11 = hw.isBirthday(1990,4,31);
        boolean bri_13 = hw.isBirthday(2001,13,1);
        boolean bri_14 = hw.isBirthday(2001,0,1);
        boolean bri_19 = hw.isBirthday(2001,1,32);
        boolean bri_20 = hw.isBirthday(2001,1,0);

    }

    @Test
    public void  testminiCaculator() {
        HelloWorld hw = new HelloWorld();
        double d_1 = hw.miniCalculator(11,22,'+');
        double d_2 = hw.miniCalculator(11,22,'-');
        double d_3 = hw.miniCalculator(11,22,'*');
        double d_4 = hw.miniCalculator(11,22,'/');
        double d_5 = hw.miniCalculator(11,22,'!');
    }

}
