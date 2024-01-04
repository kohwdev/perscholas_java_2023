package module303;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        //Given a string matching the regular expression [A-Za-z !,?._'@]+,
        // split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
        // Then, print the number of tokens, followed by each token on a new line.
        // use String.split method

        /*
        Constraints
        s is composed of any of the following: English alphabetic letters, blank spaces,
        exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('),
        and at symbols (@).
        Output Format
        On the first line, print an integer, , denoting the number of tokens in string
        (they do not need to be unique). Next, print each of the  tokens on a new line in the same order
        as they appear in input string .
         */

        //Program should be able to scan the user input
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim(); //trim the string to remove extra spaces
        scan.close();

        //token is defined as consecutive English alphabetic letters
        // declare an array to store split tokens
        // use regular expression to filter alphabetic letters from the string
        String tokens[] = s.split("[^A-Za-z]+");
        // print out number of tokens in the array
        System.out.println(tokens.length);
        // iterate through an array and print each token on a new line
//        for (int i = 0; i < tokens.length; i++) {
//            System.out.println(tokens[i]);
//        }

        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }







    }
}
