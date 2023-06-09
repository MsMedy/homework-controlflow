
import java.util.*;

public class Main {
    public static void main(String[] args) {


        AsciiChars exm = new AsciiChars();
        exm.printUpperCase();
        System.out.println(" ");
        exm.printLowerCase();
        System.out.println(" ");
        exm.printNumbers();
        System.out.println(" ");


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String input2 = input.next();
        System.out.println("Hello " + input2);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Would you like to continue to the interactive portion?");
        String input4 = input3.next();

        if(!input4.equals("y") && !input4.equals("yes")){
            System.out.println("Ok. Please come back later to complete the survey.");
        }

        String q1 = "What is the name of your favorite pet?";
        String q2 = "What is the age of your favorite pet?";
        String q3 = "What is your lucky number";
        String q4 = "Do you have a favorite quarterback? (y/n) ";
        String q5 = "What is your favorite quarterback's jersey number?";
        String q6 = "What is the two digit model year of your car?";
        String q7 = "What is the first name of your favorite actress/actor?";

        int jerseynum1 = 0;
        int luckynum1 = 0;
        int petage1 = 0;
        int car1 = 0;

        for(int j = 1; j < 7; j++){
            switch (j){
                case 1:
                    Scanner petname = new Scanner(System.in);
                    System.out.println(q1);
                    String petname1 = petname.next();
                break;

                case 2:
                    Scanner petage = new Scanner(System.in);
                    System.out.println(q2);
                    petage1 = petage.nextInt();
                    break;
                case 3:
                    Scanner luckynum = new Scanner(System.in);
                    System.out.println(q3);
                    luckynum1 = luckynum.nextInt();
                    break;
                case 4:
                    Scanner quarterb = new Scanner(System.in);
                    System.out.println(q4);
                    String quarterb1 = quarterb.next();
                     if(quarterb1.equals("n") || quarterb1.equals("N")){
                         break;
                     }
                     else{
                         Scanner jerseynum = new Scanner(System.in);
                         System.out.println(q5);
                         jerseynum1 = jerseynum.nextInt();
                         break;
                     }
                case 6:
                    Scanner car = new Scanner(System.in);
                    System.out.println(q6);
                    car1 = car.nextInt();
                    break;
                case 7:
                    Scanner actress = new Scanner(System.in);
                    System.out.println(q7);
                    String actress1 = actress.next();
                    break;
            }
        }

        //THREE RANDOM INTEGERS

        int min = 1;
        int max = 10; // for reference
        int range = 9;

        int[] randomnums = new int[3];

        for(int i = 0; i < 3; i++){
            randomnums[i] = (int)(Math.random() * range) + min;
        }

        //MAGIC BALL NUMBERS

        int magicballnum = 0;

        if (jerseynum1 != 0){ // if a jersey number is available, set magicbalnum to value
            magicballnum = jerseynum1;
        }
        else if(jerseynum1 == 0) { // if no jersey number available, generate one
            magicballnum = randomnums[2] * luckynum1;
        }

        if(magicballnum > 75){ // caps magic number ball at 75
            do{
                magicballnum = magicballnum - 75;
            }while (magicballnum > 75 && magicballnum !=75 );
        }

        // NON-MAGIC NUMBERS

        int randnum1 = 0;
        int randnum2 = 42;
        int randnum3 = petage1 + car1;
        int randnum4 = jerseynum1 + petage1 + luckynum1;
        int randnum5 = car1 + luckynum1;

        // to calculate randomnum1
        int min2 = 1;
        int max2 = 50; // for reference again
        int range2 = 49;

        int val2 = (int)(Math.random() * range2) + min2;
        randnum1 = val2 - randomnums[0];

        System.out.println("Lottery numbers: " + randnum1 + "," + randnum2 + "," + randnum3 + "," + randnum4 + "," + randnum5 + " Magic Number: " + magicballnum);


        
        /* instructions:

        *
        generate lottery numbers
        - there will be 5 random numbers
        - one magic ball number between 1 and 75 (6 numbers total)


        To start...
        - generate 3 random integers

        generate MAGIC BALL number first
        - be jersey number OR users lucky number multiplied by one the referenced random numbers
            - answer needs to be less than max magic number of 75
            - if greater than 75? then subtract 75 from the value and that value is now the magic ball number

        generate 5 NON-MAGIC numbers next using following methods...
          randnum1 - find a random number between 1 and 50, then subtract one of the generated random numbers
          randnum2 - use the value 42
          randnum3 - use the age of their favorite pet + fav car model
          randnum4 - fave quarterback number + age of pet + lucky number
          randnum5 - two digit model of car + lucky number


        */


    }
}
