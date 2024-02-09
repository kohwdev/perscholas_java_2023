package module303;
import java.util.*;

interface MyList {
    void convert(String[]a);
    void replace(int idx);
    ArrayList<String> compact();
}

class InvalidStringException extends Exception {
    InvalidStringException(String message){
        //calls the constructor of the parent class
        Exception ex = new Exception();
        System.out.println(ex);
    };
}

class ArrayToList implements MyList {
    ArrayList<String> arrayToList;

    ArrayToList(){
        //initializes the empty list arrayToList
        arrayToList = new ArrayList<>();
    };

    public void convert(String[] a) {
        //adds the strings in the array a, to the list arrayToList
        //prints "I have added the string: {string} at the index: {index}"
        //ex."adcd" at index 0

        //arrayToList.add(Arrays.asList(a[0]));
        arrayToList.addAll(Arrays.asList(a));

        for (String s : arrayToList) {
            System.out.println("I have added the string: " + s + " at the index: " + arrayToList.indexOf(s));
        }


    }

    public void replace(int idx) {
        //replaces the string at the index idx of arrayToList with an empty string
        //prints "I have replaced the string: {string} with a null string"
        arrayToList.set(idx, "");

    }
    public ArrayList<String> compact(){
        //remove all the empty string from the list and return result list
       // arrayToList.removeAll("");
        ArrayList<String> result = new ArrayList<>();

        for (String s : arrayToList) {
            if (s != "") {
                arrayToList.add(s);
            }
        }

        return result;
    }
}

class Solution{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);

        int n = Integer.parseInt(sc.nextLine());
        String[] a = new String[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextLine();

        MyList obj = new ArrayToList();

        obj.convert(a);
        int x = rand.nextInt(n);
        for(int i = 0; i < x; i++)
            obj.replace(rand.nextInt(n));


        ArrayList<String> s = obj.compact();



        for (int i = 0; i < s.size(); i++){
            if(s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122){
                try{
                    throw new InvalidStringException("This is an invalid string");
                }
                catch(InvalidStringException e){System.out.println(e.getMessage());}
            }
        }


    }
}

