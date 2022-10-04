package at.ac.fhcampuswien;

import com.sun.tools.sjavac.server.SysInfo;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");System.lineSeparator();
        System.out.println("         __" + System.lineSeparator() +
                " _(\\    |@@|" +System.lineSeparator() +
                "(__/\\__ \\--/ __" +System.lineSeparator() +
                "   \\___|----|  |   __" +System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" +System.lineSeparator() +
                "       /\\__/\\ \\__O (__" +System.lineSeparator() +
                "      (--/\\--)    \\__/" +System.lineSeparator() +
                "      _)(  )(_" +System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int a ='Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e= 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int sum = a+b+c+(int)d+(int)e+(int)f+(int)g+(int)h;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner= new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        System.out.println(input1+input2);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");System.lineSeparator();
        Scanner scanner= new Scanner(System.in);
        System.out.println("x: " + "y: "+ "After Swap:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x: " + x);System.lineSeparator();
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner num = new Scanner(System.in);
        System.out.print("n1: " + "n2: ");
        int x= num.nextInt();
        int y = num.nextInt();
        if(x == y)System.out.println("n1 == n2");
        else if (x > y) System.out.println("n1 > n2");
        else if (x < y) System.out.println("n2 > n1");
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int x = sc.nextInt();
        if(x<0 || x>=100000) System.out.println("Invalid Revenue");
        else if (x >= 0 && x < 20000) System.out.println("Poor Sales Revenue");
        else if (x >= 20000 && x < 50000) System.out.println("Average Sales Revenue");
        else if (x >= 50000 && x < 80000) System.out.println("Good Sales Revenue");
        else if (x >= 80000 && x < 100000) System.out.println("Excellent Sales Revenue");

    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int x = sc.nextInt();

        switch(x) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
                case 2:
                    System.out.println("Your Commission Rate was set to 0.02");
                    break;
                    case 3:
                        System.out.println("Your Commission Rate was set to 0.03");
                        break;
                        case 4:
                            System.out.println("Your Commission Rate was set to 0.04");
                            break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;


        }

    }

    //todo Task 9
    public void leapyear(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        int x = sc.nextInt();
        if(x % 4 == 0 && x % 100 !=0 || x % 400==0) {
            System.out.println("Leapyear");
        }
        else if (x % 100 == 0 && x % 400!=0 || x % 4!=0) {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int c = sc.nextInt();
        while(c > 0) {
            int b = c%10;
            c = c/10;
            a= (a*10)+b;
        }
        System.out.println(a);
    }




    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}