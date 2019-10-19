package com.company;

import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void hey() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;






        for(i = 0; i < 9; i++) {
        n1 = rng.nextInt(9);
        n2 = rng.nextInt(9);
        n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + "times" + n2 + "?");
            //while (a == 0) {
                int answer = scnr.nextInt();

                if (answer == n1 * n2) {
                    switch (n3) {
                        case 0:
                            System.out.println("Excellent!");
                            n3 = rng.nextInt(3);
                            right += 1;
                            continue;
                        case 1:
                            System.out.println("Nice work!");
                            n3 = rng.nextInt(3);
                            right += 1;
                            continue;
                        case 2:
                            System.out.println("Awesome work!");
                            n3 = rng.nextInt(3);
                            right += 1;
                            continue;
                        case 3:
                            System.out.println("Congratulations!");
                            n3 = rng.nextInt(3);
                            right += 1;
                            continue;
                    }
                    a = 1;
                } else {
                    switch (n3) {
                        case 0:
                            System.out.println("No sorry, please try again!");
                            n3 = rng.nextInt(3);
                            wrong += 1;
                            break;
                        case 1:
                            System.out.println("Nope sorry, not correct!");
                            n3 = rng.nextInt(3);
                            wrong += 1;
                            break;
                        case 2:
                            System.out.println("No. Keep trying.");
                            n3 = rng.nextInt(3);
                            wrong += 1;
                            break;
                        case 3:
                            System.out.println("Don’t give up!");
                            n3 = rng.nextInt(3);
                            wrong += 1;
                            break;
                    }
                    a = 0;
                }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void heyadd() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;






        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(9);
            n2 = rng.nextInt(9);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + "plus" + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 + n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void heysub() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;






        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(9);
            n2 = rng.nextInt(9);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + "minus" + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 - n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void heydivide() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;






        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(9);
            n2 = rng.nextInt(9);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + "divided by" + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 / n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey1() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(99);
            n2 = rng.nextInt(99);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " times " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 * n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey1add() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(99);
            n2 = rng.nextInt(99);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " plus " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 + n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey1sub() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(99);
            n2 = rng.nextInt(99);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " minus " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 - n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey1divide() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(99);
            n2 = rng.nextInt(99);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " divided by " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 / n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey2() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(999);
            n2 = rng.nextInt(999);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " times " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 * n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey2add() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(999);
            n2 = rng.nextInt(999);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " plus " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 + n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey2sub() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(999);
            n2 = rng.nextInt(999);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " minus " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 - n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey2divide() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(999);
            n2 = rng.nextInt(999);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " divided by " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 / n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey3() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(9999);
            n2 = rng.nextInt(9999);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " times " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 * n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey3add() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(9999);
            n2 = rng.nextInt(9999);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " plus " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 + n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey3sub() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(9999);
            n2 = rng.nextInt(9999);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " minus " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 - n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }
    public static void hey3divide() {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();


        int n1, n2, n3, i;
        int a = 0;
        int right = 0;
        int wrong = 0;

        for(i = 0; i < 9; i++) {
            n1 = rng.nextInt(9999);
            n2 = rng.nextInt(9999);
            n3 = rng.nextInt(3);


            System.out.println("What is " + n1 + " divided by " + n2 + "?");
            //while (a == 0) {
            int answer = scnr.nextInt();

            if (answer == n1 / n2) {
                switch (n3) {
                    case 0:
                        System.out.println("Excellent!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 1:
                        System.out.println("Nice work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 2:
                        System.out.println("Awesome work!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                    case 3:
                        System.out.println("Congratulations!");
                        n3 = rng.nextInt(3);
                        right += 1;
                        continue;
                }
                a = 1;
            } else {
                switch (n3) {
                    case 0:
                        System.out.println("No sorry, please try again!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 1:
                        System.out.println("Nope sorry, not correct!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 2:
                        System.out.println("No. Keep trying.");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                    case 3:
                        System.out.println("Don’t give up!");
                        n3 = rng.nextInt(3);
                        wrong += 1;
                        break;
                }
                a = 0;
            }

            //}
        }

        if (right >= 8){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else{
            System.out.println("Please ask your teacher for extra help.");
        }


    }


    public static void questions(){

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
       while(true) {
           System.out.println("Select a difficulty 1-4:");
           int choice = scnr.nextInt();

           switch (choice) {
               case 1:
                   System.out.println("Select an arithmatic: 1 addition  2 subtraction  3 multiplication  4 division  5 random");
                   int choice1 = scnr.nextInt();
                   if(choice1 == 1){
                       heyadd();
                   }
                   else if(choice1 == 2){
                       heysub();
                   }
                   else if(choice1 == 3){
                       hey();
                   }
                   else if(choice1 == 4){
                       heydivide();
                   }
                   else if(choice == 5){
                       heydivide();
                   }
                   break;
               case 2:
                   System.out.println("Select an arithmatic: 1 addition  2 subtraction  3 multiplication  4 division  5 random");
                   choice1 = scnr.nextInt();
                   if(choice1 == 1){
                       hey1add();
                   }
                   else if(choice1 == 2){
                       hey1sub();
                   }
                   else if(choice1 == 3){
                       hey1();
                   }
                   else if(choice1 == 4){
                       hey1divide();
                   }
                   else if(choice == 5){
                       hey1add();
                   }
                   break;
               case 3:
                   System.out.println("Select an arithmatic: 1 addition  2 subtraction  3 multiplication  4 division  5 random");
                    choice1 = scnr.nextInt();
                   if(choice1 == 1){
                       hey2add();
                   }
                   else if(choice1 == 2){
                       hey2sub();
                   }
                   else if(choice1 == 3){
                       hey2();
                   }
                   else if(choice1 == 4){
                       hey2divide();
                   }
                   else if(choice == 5){
                       hey2sub();
                   }
                   break;
               case 4:
                   System.out.println("Select an arithmatic: 1 addition  2 subtraction  3 multiplication  4 division  5 random");
                   choice1 = scnr.nextInt();
                   if(choice1 == 1){
                       hey3add();
                   }
                   else if(choice1 == 2){
                       hey3sub();
                   }
                   else if(choice1 == 3){
                       hey3();
                   }
                   else if(choice1 == 4){
                       hey3divide();
                   }
                   else if(choice == 5){
                       hey3sub();
                   }
                   break;
               default:
                   System.out.println("Not a valid option. Goodbye!");
           }
       }


    }


}