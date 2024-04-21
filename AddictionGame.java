import java.util.*;
class AddictionGame {


    public static void main(String args[])
    {
        int sum, r1, a = 0;
        int zero;
        System.out.print("Enter Player Name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);


        System.out.println("Lets Start!");
        do {
            do {

                Random rand = new Random();
                int ran1 = rand.nextInt(10);
                int ran2 = rand.nextInt(10);
                sum = ran1 + ran2;

                a++;
                System.out.print(a + " ->   " + ran1 + " + " + ran2 + " = ");
                Scanner scan = new Scanner(System.in);
                r1 = scan.nextInt();
                if (sum == r1) {
                    System.out.println("Correct");
                } else
                    System.out.println("wrong");
            }
            while (r1 == sum);
            System.out.println("==->  " + a + "  Points!   <-==                     *****WELL DONE*****");
            System.out.println("");

            System.out.println("PRESS --0-- TO PLAY AGAIN || PRESS --1-- TO LEAVE ");
            Scanner Sc = new Scanner(System.in);
            int ip = Sc.nextInt();

            if (ip == 0) {
                zero = 0;
            } else {
                zero = 1;
            }
        }while(zero == 0);

    }
}