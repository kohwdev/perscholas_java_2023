
package module303;
//This program prints Welcome to Java!


import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Welcome {
    public static void main(String[] args) {
        //gross margin of 50% chai blend
        //sold $4.00 / packet

        //original price $2.00

        //inflation > profit $0.50 per packet. cost of blend is $3.50
        //raise the price to keep gross margin of 50%

        //$7.00 to keep the 50% gross margin

        // shirt full price $35.00
        // free shipping - $15.00 shipping fee
        // 35 - 15 = 20

        //gross margin of 75%

        //Cost of Tee = Full price - (Full price * gross margin)

//        double CostOfTee;
//
//        double fullPrice = 35.00;
//
//        CostOfTee = fullPrice - (fullPrice * 0.75);
//
//        System.out.println(CostOfTee);

        //slime box = 6 units long, 3 units wide, 4 units high

        //shipping boxes
        //large = 20, 10, 10
        //medium = 10, 6, 5
        //small = 8, 5, 5

        /*StringBuffer sb = new StringBuffer("135");
        sb.replace(0, 5, "6789").insert(0, "12345");
        System.out.println(sb.reverse().delete(0, 5));*/

        /*int x = 2;
        int y = 0;
        for (; y < 10; ++y) {
            if (y % x == 0)
                continue;
            else if (y == 8)
                break;
            else
                System.out.print(y + " ");
        }*/

        StringJoiner sj1 = new StringJoiner(":", "{", "}");
        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj1.add("Name").add("Tony");
        sj2.add("LastName").add("Strak");
        System.out.println(sj1.merge(sj2).toString());

        /*class A{
            String E = "extraction";
            String T = "transformation";
            String L = "loading";

            final void ETL() {
                System.out.println(L + T + E);
            };
        }

        class B extends A {
            void ETL() {
                System.out.println(E + T + L);
            }
        }

        A obj = new B();
        obj.ETL();*/


        //n pairs of strings (a, b)
        // (a,b) (c,d) are identical a = c, b = d










    }

}
