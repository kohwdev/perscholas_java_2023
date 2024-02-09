package hackerrank.building;

import java.util.Arrays;
import java.util.Scanner;

interface Sport {
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);

}

class Cricket implements Sport {
    int[] playerIDs; //the 1-based index of a player is the player's id

    Cricket(){
        //initialize the empty array playerIDs to store 11 int values
        //assign 1 to each element in playerIDs
        playerIDs = new int[11];

        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = 1;
        }
        System.out.println("A new cricket team has been formed");

    }

    public void calculateAvgAge(int[] age) {
        //age contains the age of every player
        //print average age of the team with 2 digits after the decimal "The average age of the team is {avgAge}"
        double sum = 0;

        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }

        double average = sum / age.length;

        System.out.printf("The average age of the team is %.2f\n", average);

    }

    public void retirePlayer(int id) {
        //Assign -1 to playerIds[id]
        if (id < 1 || id > playerIDs.length) {
            return;
        }

        if (playerIDs[id-1] == -1) {
            System.out.println("Player has already retired");
        }  else {
            playerIDs[id-1] = -1;
            System.out.println("Player with id: " + id + " has retired");
        }
    }

}

class Football implements Sport {
    int[] playerIDs;

    Football() {
        playerIDs = new int[11];
        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = 1;
        }
        System.out.println("A new football team has been formed");

    }

    public void calculateAvgAge(int[] age) {
        //age contains the age of every player
        //print average age of the team with 2 digits after the decimal "The average age of the team is {avgAge}"
        double sum = 0;

        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }

        double average = sum / age.length;

        System.out.printf("The average age of the team is %.2f\n", average);

    }

    public void retirePlayer(int id) {
        //Assign -1 to playerIds[id]
        if (id < 1 || id > playerIDs.length) {
            return;
        }

        if (playerIDs[id - 1] == -1) {
            System.out.println("Player has already retired");
        }  else {
            playerIDs[id - 1] = -1;
            System.out.println("Player with id: "+ id + " had retired");
        }
    }

    void playerTransfer(int fee, int id) {
        if (id < 1 || id > playerIDs.length) {
            return;
        }

        if (playerIDs[id - 1] == -1) {
            System.out.println("Player with id: " + id + " has already retired");
        } else {
            System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
        }


    }

}

class Solutions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cricket c = new Cricket();
        Football f = new Football();

        int[] age1 = new int[11];
        int[] age2 = new int[11];

        for(int i = 0; i < 2; i++)
        {
            String[] age = sc.nextLine().split(" ");
            if(i == 0){
                int j = 0;
                for(String s : age)
                    age1[j++] = Integer.parseInt(s);
            }
            else{
                int j = 0;
                for(String s : age)
                    age2[j++] = Integer.parseInt(s);
            }
        }
        c.calculateAvgAge(age1);
        f.calculateAvgAge(age2);

        for(int i = 0; i < 6; i++){

            if(i < 3){
                int x = Integer.parseInt(sc.nextLine());

                c.retirePlayer(x);
            }
            else if(i < 5){
                int x = Integer.parseInt(sc.nextLine());
                f.retirePlayer(x);
            }
            else {
                String[] temp = sc.nextLine().split(" ");
                f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
        }
    }
}

