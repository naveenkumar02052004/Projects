import java.util.*;
class Lovecalculator
{
    public static int yes(){
        Random rand = new Random();
        int r = rand.nextInt(17);
        return r;
}
    public static int no(){
        Random rand = new Random();
        int r = rand.nextInt(20);
        return r;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to love Calcultor!");
        int sum;

        do {
            System.out.print("Enter your name : ");
            String bf = scan.nextLine();
            System.out.print("Enter your pair name : ");
            String gf = scan.nextLine();

            char l1 = bf.charAt(0);
            char l2 = bf.charAt(1);
            char l3 = bf.charAt(2);
            char l4 = bf.charAt(3);
            char l5 = bf.charAt(4);
            char l6 = bf.charAt(5);
            char l7 = bf.charAt(6);
            char l8 = bf.charAt(7);
            char l9 = bf.charAt(8);
            char l10 = bf.charAt(9);
            char l11 = gf.charAt(0);
            char l22 = gf.charAt(1);
            char l33 = gf.charAt(2);
            char l44 = gf.charAt(3);
            char l55 = gf.charAt(4);
            char l66 = gf.charAt(5);
            char l77 = gf.charAt(6);
            char l88 = gf.charAt(7);
            char l99 = gf.charAt(8);
            char l100 = gf.charAt(9);

            int tot1, tot2, tot3, tot4, tot5, tot6, tot7, tot8, tot9, tot10;
            if (l1 == l11) {
                tot1 = yes();
            } else {
                tot1 = no();
            }
            if (l2 == l22) {
                tot2 = yes();
            } else {
                tot2 = no();
            }
            if (l3 == l33) {
                tot3 = yes();
            } else {
                tot3 = no();
            }

            if (l4 == l44) {
                tot4 = yes();
            } else {
                tot4 = no();
            }
            if (l5 == l55) {
                tot5 = yes();
            } else {
                tot5 = no();
            }
            if (l6 == l66) {
                tot6 = yes();
            } else {
                tot6 = no();
            }
            if (l7 == l77) {
                tot7 = yes();
            } else {
                tot7 = no();
            }
            if (l8 == l88) {
                tot8 = yes();
            } else {
                tot8 = no();
            }
            if (l9 == l99) {
                tot9 = yes();
            } else {
                tot9 = no();
            }
            if (l10 == l100) {
                tot10 = yes();
            } else {
                tot10 = no();
            }
            sum = (tot1 + tot2 + tot3 + tot4 + tot5 + tot6 + tot7 + tot8 + tot9 + tot10);
            System.out.println("Your love percentege is " + sum + "%");
            System.out.println("----------------------------------------------------");
        }while(sum == sum);


    }
}
