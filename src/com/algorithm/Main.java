package com.algorithm;
import static java.lang.Integer.valueOf;

class algorithm{
    public static void main (String[] args) {
        //database db= new database();



        /*0-100素数方法二*/
        //isPrime1();

        /*0-100素数方法二*/
        //isPrime(101,200);

        /*水仙花数*/
        //ppdi(100,9999);

        /*正整数分解质因数*/
        primeFactorization(90);

        /*学生成绩判断*/
        //System.out.println(grade(90));

        /*分别统计空格、字母、数字和符号数量*/
        //typeOfString("sjoifj   140j,keahfgj,.khsadr3jfd9182");

        /*递增相加*/
        //System.out.println(increasingAdditive(5, 10));

        /*因数*/
        //System.out.println(factor(28));

        /*完数*/
        //perfectNumber(6, 1000);

        /*下落的小球*/
        //fallingBall(10);

    }


    /*0-100素数方法一*/
    private static void isPrime1() {
        int min = 101;
        int max = 200;
        int circleNum = 0;
        int primeNum = 0;
        for (int i = min; i <= max; i++) {
            for (int n = 2; n <= i; n++) {
                if (i % n == 0) {
                    circleNum++;
                    if (circleNum >= 2) {
                        break;
                    }
                }
            }
            if (circleNum < 2) {
                primeNum++;
                System.out.println("质数：" + i);
            }
            circleNum = 0;
        }
        System.out.println(primeNum);
    }

    /*0-100素数方法二*/
    private static boolean isPrime(int number){
        int circleNum = 0;
        for(int i = 2; i <= number; i++){
            if(number % i == 0){
                circleNum++;
                if(circleNum >= 2){
                    break;
                }
            }
        }
        if(circleNum >= 2){
            return false;
        }
        else{
            return true;
        }
    }
    private static void isPrime(int min, int max){
        for(int i = min; i < max; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }

    /*水仙花数*/
    private static void ppdi(int min, int max){
        for(int i = min; i <= max; i++){
            Integer numToString = i;
            String stringNum = numToString.toString();
            int numLength = stringNum.length();
            Integer single;
            int pow = 1;
            int powNum = 0;
            for(int n = 0; n < numLength; n++){
                single = valueOf(stringNum.substring(n, n + 1));
                for(int mul = 0; mul < numLength; mul++){
                    pow = pow * single;
                }
                powNum = pow + powNum;
                pow = 1;
            }
            if(powNum == i){
                System.out.println(powNum);
            }
        }
    }

    /*正整数分解质因数*/
    private static void primeFactorization(int num){
        System.out.print(num + " = ");
        for(int i = 2; i <= num; i++){
            if (num % i ==0 && isPrime(i)) {
                System.out.print(i);
                if (num != i){
                    System.out.print(" * ");
                }
                num /= i;
                i = 2;
            }
        }
    }

    /*学生成绩判断*/
    private static String grade(int grade){
        if(grade >= 90){
            return "A";
        }
        else if(grade >= 60 && grade < 90){
            return "B";
        }
        else{
            return "C";
        }
    }

    /*分别统计空格、字母、数字和符号数量*/
    private static void typeOfString(String content){
        int letter = 0, number = 0, space = 0, other = 0;
        /*int letter , number, space;
        letter = number = space = 0;*/
        for(int i = 0; i < content.length(); i++){
            char singleChar = content.substring(i, i + 1).charAt(0);
            if(Character.isLetter(singleChar)){
                letter++;
            }
            else if(Character.isDigit(singleChar)){
                number++;
            }
            else if(Character.isSpaceChar(singleChar)){
                space++;
            }
            else{
                other++;
            }

        }
        System.out.println("letter: " + letter + " number: " + number + " space: " + space + " other: " + other);

    }

    /*递增相加*/
    private static int increasingAdditive(int num, int fre){
        int result = 0;
        StringBuilder iAN = new StringBuilder();
        for(int i = 1; i <= fre; i++){
            iAN.append(num);
            result += Long.parseLong(iAN.toString());
        }
        return result;
    }

    /*因数*/
    private static String factor(int num){
        StringBuilder s = new StringBuilder();
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                s.append(i + " ");
            }
        }
        return s.toString();
    }

    /*完数*/
    private static void perfectNumber(int min, int max) {
        for (int i = min; i <= max; i++) {
            int add = 0;
            for (int n = 1; n < i; n++) {
                if (i % n == 0) {
                    add += n;
                }
            }
            if (add == i) {
                System.out.println(i);
            }
        }
    }

    /*下落的小球*/
    private static void fallingBall(int num) {
        int meter = 0;
        int heigh = 0;
        for (int i = num; i > 0; i --) {
            num /= 2;
            meter += num;
            heigh = i;
        }
        System.out.println("第十次一共经过：" + meter + "米，反弹：" + heigh + "米。");
    }

}