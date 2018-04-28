package com.jaemzware;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        previousResult = result;

        result = result * 10;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        previousResult = result;

        result = result / 5;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        previousResult = result;
        result = result % 3;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        previousResult = result;
        result = result + 1;
        result++;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        result--;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        result += 2;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        result *= 10;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        result -= 10;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        result /= 10;
        System.out.println("previousresult:" + previousResult + " result:" + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("you got the high score");

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("one of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("this is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("was car is true");

        double first = 20d;
        double second = 80d;
        double equation = 25d*(first + second);
        System.out.println("equation:" + equation);
        double remainder = equation % 40;
        System.out.println("remainder:" + remainder);
        if(remainder <= 20)
            System.out.println("total "+remainder+ " was over the limit");
    }
}
