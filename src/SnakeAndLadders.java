import java.util.*;
public class SnakeAndLadders {
    public static int ladder(int place, int score) {
        score = place;
        return score;
    }

    public static int snake(int place, int score) {
        score = place;
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int player = 0;            //Initial stage
        int score = 0;             //Score
        int dice, max = 6, min = 1;    //Valu of dice will lie between 1 and 6
        int ch;
        for (int i = 0; i <= 10; i++) {
            System.out.print("*\t");
        }
        System.out.print("Welcome to the SNAKES & LADDERS");
        for (int i = 0; i <= 10; i++) {
            System.out.print("*\t");
        }

        for (int i = 100; i >= 1; i--)     //Game Board
        {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("Press 1 to roll the dice \nPress 0 to exit");

        while (score <= 100) {    // gameplay starts here

            ch = sc.nextInt();
            if (ch == 1) {
                double random = Math.random() * ((max - min + 1) + min);     //generating a random decimal numbers
                dice = (int) random;//storing the integer part of decimal number for dice

                if (dice == 0) {
                    continue;
                }
                System.out.println("Dice : " + dice);


                //Extra chance for 6
                if (dice == 6) {
                    score = score + dice;
                    System.out.println("Score : " + score);
                    System.out.println("Take one more chance for getting a 6");
                    continue;

                }
                score = score + dice;
                // for ladders
                if (score == 4) {
                    System.out.println("Score : " + score);
                    System.out.println("Ladder at 4 climb to 14");
                    score = ladder(14, 4);

                }

                if (score == 8) {
                    System.out.println("Score : " + score);
                    System.out.println("Ladder at 8 climb to 30");
                    score = ladder(30, 8);

                }
                if (score == 21) {
                    System.out.println("Score : " + score);
                    System.out.println("Ladder at 21 climb to 42");
                    score = ladder(42, 21);
                }
                if (score == 50) {
                    System.out.println("Score : " + score);
                    System.out.println("Ladder at 50 climb to 67");
                    score = ladder(67, 50);
                }
                if (score == 71) {
                    System.out.println("Score : " + score);
                    System.out.println("Ladder at 71 climb to 92");
                    score = ladder(92, 71);
                }
                if (score == 80) {
                    System.out.println("Score : " + score);
                    System.out.println("Ladder at 80 climb to 99");
                    score = ladder(99, 80);
                }

                //Snakes

                if (score == 32) {
                    System.out.println("Score : " + score);
                    System.out.println("OOPS Snake bitten you at 32 FALL BACK to 10");
                    score = snake(10, 32);
                }
                if (score == 36) {
                    System.out.println("Score : " + score);
                    System.out.println("OOPS Snake bitten you at 36 FALL BACK to 6");
                    score = snake(6, 36);
                }
                if (score == 48) {
                    System.out.println("Score : " + score);
                    System.out.println("OOPS Snake bitten you at 48 FALL BACK to 26");
                    score = snake(26, 48);
                }
                if (score == 62) {
                    System.out.println("Score : " + score);
                    System.out.println("OOPS Snake bitten you at 62 FALL BACK to 18");
                    score = snake(18, 62);
                }
                if (score == 88) {
                    System.out.println("Score : " + score);
                    System.out.println("OOPS Snake bitten you at 88 FALL BACK to 24");
                    score = snake(24, 88);
                }
                if (score == 95) {
                    System.out.println("Score : " + score);
                    System.out.println("OOPS Snake bitten you at 95 FALL BACK to 56");
                    score = snake(56, 95);
                }
                if (score == 97) {
                    System.out.println("Score : " + score);
                    System.out.println("OOPS Snake bitten you at 97 FALL BACK to 78");
                    score = snake(78, 97);
                }


                System.out.println("Score : " + score);
            } else {
                System.out.println("Thank you for playing.\nYour Score : " + score);
                break;
            }

        }
        if (score >= 100) {
            System.out.println("WINNER WINNER !!!\n SNACK AND DINNER");
        }
    }
}
