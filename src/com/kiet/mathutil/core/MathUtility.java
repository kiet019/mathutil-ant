/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiet.mathutil.core;

/**
 *
 * @author kietl
 */
public class MathUtility {
    public static final double PI= 3.1415;
    
    // 21! vượt kiểu long
    // ta thí nghiệm hàm n! với n = 0..20 ->
    // n! =  1 x1 x2 x4 x.. xn;
    public static void main(String[] args) {
        MathUtility.testFactorialGivenRightArgumentReturnWell();
    }
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n must be between 0..20!");
        if (n==0 || n==1) return 1;
        long product = 1;
        for (int i = 2; i <= n; i++)  //make code wrong
            product *= i;             //if upload this, recieves green
        return product;
    }
    //dân dev phải có trách nhiệm với những hàm/method mình viết ra
    //tức đảm bảo rằng hàm chạy đúng như thiết kế
    //hàm getFactorial() được thiết kế rằng 
    //nếu đưa n < 0  hoặc n > 20 thì ném ra ngoại lệ
    //nếu đưa n = 0..20 thì tính n!
    //TA - DÂN DEV SẼ KIỂM THỬ THÌ HÀM ĐÚNG NHƯ THIẾT KẾ HAY KO
    //HÀM SẼ ĐƯỢC DỤNG TRONG TƯƠNG LAI
    //hàm dùng theo 2 cách thiết kế 
    //đưa data tử tế n từ 0..20
    //đưa data cà chớn n < 0 hoặc n > 20
    
    //tên hàm kiểm thử viết theo cú pháp con lạc đà -- camel case notation
    //và phải mang ý nghĩa/ mục đích kiểm thử
    public static void testFactorialGivenRightArgumentReturnWell() {
        //Case #1: Test getF() with n = 0 
        //Expected value: 1
        //Kiểm thử xem có đúng 0! = 1??
        int n = 0;
        long expectedValue= 1;
        long actualValue = MathUtility.getFactorial(n); // gỌi hàm tính giai thừa, xem data trả về
        System.out.println("Test " + n + "! Expected: " + expectedValue+ ", Actual: " + actualValue);
        
        //Case #2: Test getF() with n = 1
        //Expected value: 1
        //Kiểm thử xem có đúng 1! = 1??       
        n = 1;
        expectedValue= 1;
        actualValue = MathUtility.getFactorial(n); // gỌi hàm tính giai thừa, xem data trả về
        System.out.println("Test " + n + "! Expected: " + expectedValue+ ", Actual: " + actualValue);
        
        //Case #3
        n = 2;
        expectedValue= 2;
        actualValue = MathUtility.getFactorial(n); // gỌi hàm tính giai thừa, xem data trả về
        System.out.println("Test " + n + "! Expected: " + expectedValue+ ", Actual: " + actualValue);
        
        n = 3;
        expectedValue= 6;
        actualValue = MathUtility.getFactorial(n); // gỌi hàm tính giai thừa, xem data trả về
        System.out.println("Test " + n + "! Expected: " + expectedValue+ ", Actual: " + actualValue);
        
        n = 5;
        expectedValue= 120;
        actualValue = MathUtility.getFactorial(n); // gỌi hàm tính giai thừa, xem data trả về
        System.out.println("Test " + n + "! Expected: " + expectedValue+ ", Actual: " + actualValue);
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
        
    }
}
