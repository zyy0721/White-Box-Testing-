# junit + jacoco  白盒测试训练

## HTML报告结果截图如下

![result](D:\Studying\NJU\2019-2020 Fall Semester One\SoftwareAnalysis&Testing\Homework\White-Box-Testing-\IMG\result.png)

本次实验中主要实现了```isTriangle```、```isBirthday```、```miniCalculator```函数功能，其中为了实现```Method4```函数中分支测试的全覆盖，适当修改了代码加入了```try catch```语句。 具体添加和修改的代码如下：

```java
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
```

同时本次实验还需要自己给出测试用例，具体如下：

```java
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
```



