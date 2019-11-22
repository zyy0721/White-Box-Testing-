package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}

    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
    		 x = 1;
    	}
    	try {
			e = 1/x;
		}catch (Exception ee){
    		ee.printStackTrace();
		}

    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
    	if (a+b>c && a+c>b && b+c>a)
    		return true;
    	else
    		return false;
    }
    public boolean isBirthday(int year, int month, int day) {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
    	//闰年月份天数
		int[] mon_of_leapyear = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		//正常年月份天数
		int[] mon_of_normalyear = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		//判断输入年份是否合法
		if (year<=2019 && year >= 1990){
    		//判断是否为闰年
			if (year%4 == 0 && year%100!=0 || year%400 ==0){//是闰年
				//判断输入月份是否合法
				if (month>=1 && month <=12){
					//判断天数是否合法
					if (day>=1 && day<=mon_of_leapyear[month]){
						return true;
					}
					else
						return false;
				}
				else
					return false;
			}
			else{
				//不是闰年
				//判断输入月份是否合法
				if (year==2019){
					if (month>=1 && month<=10){
						//判断天数是否合法
						if (day>=1 && day<=mon_of_normalyear[month]){
							return true;
						}
						else
							return false;
					}
					else
						return false;
				}
				else
				{
					if (month>=1 && month<=12){
						//判断天数是否合法
						if (day>=1 && day<=mon_of_normalyear[month]){
							return true;
						}
						else
							return false;
					}
					else
						return false;
				}
			}
		}
    	else
    		return false;
    }
    public Double miniCalculator(double a, double b, char op) {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
    	double result = 0.0;
    	switch (op){
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				result = a / b;
				break;
				default:
					System.out.println("Unknown operation...");
					break;

		}
    	return result;
    }
    
}
