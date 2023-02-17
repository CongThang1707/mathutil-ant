/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thangnc.mathutil.main;

import com.thangnc.mathutil.core.MathUtility;

/**
 *
 * @author Cong Thang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentThrowsException();
    }
    
    //Kiềm thử các tình huống n đưa vào kiểu cà chớn!
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #6: test getF() with n = -1;
        //Expected value: an Illegal Argument Exception is thrown
        //nếu đưa n = -1 thì hàm sẽ đập vào mặt user/người xài
        //hàm 1 ngoại lệ
        System.out.println("Test -1! | expected: Illegal Argument Exception is thrown!!!" + " | actual: ???");
        MathUtility.getFactorial(-1);
        
    }
    
    //Dân dev phải có trách nhiệm với những hàm/method mình viết
    //ra, tức là đảm bảo rằng hàm chạy đúng như thiết kế
    //hàm getFactorial() dc thiết kế rằng:
    //nếu đưa n < 0 hoặc n > 20 chửi, ném ra ngoại lệ 
    //nếu đưa n = 0..20 -> tính đúng n!
    //TA - DÂN DEV SẼ KIỂM THỬ HÀM ĐÚNG NHƯ THIẾT KẾ HAY KO
    //KIỂM THỬ - DÙNG THỬ - MÔ PHỎNG CÁC TÌNH HUỐNG - CASE
    //HÀM SẼ DC DÙNG TRONG TƯƠNG LAI 
    //hàm sẽ dc dùng theo 2 cách dựa theo thiết kế 
    //đưa data tử tế n từ 0..20
    //đưa data cà chớn n < 0 hoặc n > 20
    
    //tên hàm kiểm thử viết theo cú pháp con lạc đà - camel Case notation
    //và pải mang ý nghĩa/mục đích kiểm thử
    public static void testFactorialGivenRightArgumentReturnsWell() {
        //Case #1: Test getF() with n = 0
        //Expected value: 2;
        //Kiểm thử coi có đúng 0! = 1 hay ko? - 1 tình huống xài hàm
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); //gọi hàm tính giai thừa, xem kq trả về
        System.out.println("Test " + n + "! | expected: " + expectedValue
                                       + " | actual: " + actualValue);
        
        //Case #2: test getF() with n = 1;
        //Expected value = 1 luôn.
        //Kiểm tra xem 1! có đúng là 1 hem?
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "! | expected: " + expectedValue
                                       + " | actual: " + actualValue);
        
        //Case #3: test getF() with n = 2;
        System.out.println("Test 2! | expected: 2" 
                                       + " | actual: " + MathUtility.getFactorial(2));
        
        //Case #4: test getF() with n = 3;
        System.out.println("Test 3! | expected: 6" 
                                       + " | actual: " + MathUtility.getFactorial(3));
        
        //Case #5: test getF() with n = 5;
        System.out.println("Test 5! | expected: 120" 
                                       + " | actual: " + MathUtility.getFactorial(5));
    }
}
