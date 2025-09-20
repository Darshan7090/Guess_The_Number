
import java.util.InputMismatchException;
import java.util.Scanner;

class RandomNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------------------------");
        System.out.println("         Welcome to Number Guess Game");
        System.out.println("----------------------------------------------");

        System.out.println(" --> Find out if you are lucky or Unlucky <--");
        System.out.println("     --> A Number Has been Generated <--");
        System.out.println("--> Just Guess the Number and then type it <--");
        

        System.out.println("----------------------------------------------");


        double dnum = Math.random();
        dnum = dnum * 100;

        int num = (int) dnum;

        int i=0;

        char choice = 'c';

        while(true) {
            System.out.println("          1) Type 'c' to Continue.");
            System.out.println("            2) Type 'x' to Exit.");
            System.out.print("Choose --> : ");

            try {
                choice = scan.next().charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("Invalid Choice");
            }
            
            if(choice == 'x') {
                System.out.println("Thank You for Playing.");
                System.exit(0);
            }

            if(choice == 'c') {
                System.out.print("Guess the Number and then Enter: ");
                int guessNum = scan.nextInt();

                i++;

                System.out.println("----------------------------------------------");

                if(guessNum > num) {
                    System.out.println("Your guess is too High.");
                    System.out.println("----------------------------------------------");
                } else if(guessNum < num) {
                    System.out.println("Your guess is too low.");
                    System.out.println("----------------------------------------------");
                } else if(guessNum == num) {
                    System.out.println("            --> Perfect Guess <--");
                    System.out.println("You have taken " +i+ " attempts to guess the Number.");
                    if(i==1) {
                        System.out.println("               Luck Score : 100%");
                        System.out.println("--> You Hit Jackpot. you are the most Luckiest Person on this Planet <--");
                    } else if(i==2) {
                        System.out.println("               Luck Score : 85%");
                        System.out.println("            --> You are Lucky <--");
                    } else if (i==3) {
                        System.out.println("               Luck Score : 75%");
                    } else if(i>=4 && i<=6) {
                        System.out.println("               Luck Score : 50%");
                    } else if(i>=7 && i<=8) {
                        System.out.println("               Luck Score : 35%");
                    } else if(i>=9 && i<=10) {
                        System.out.println("               Luck Score : 10%");
                    } else if(i>10) {
                        System.out.println("               Luck Score : 0%");
                        System.out.println("        --> Better Luck Next Time <--");
                    }
                    System.out.println("----------------------------------------------");
                    System.exit(0);
                }
            }
        }
    }
}