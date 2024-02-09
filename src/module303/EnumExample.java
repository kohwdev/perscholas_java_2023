package module303;

//list of constants

public class EnumExample {
    enum cards
    {
        spade, club, heart, diamond;
    }
    public static void main(String[] args) {
        /* stored each of the enumerators in the reference variables a1,a2,a3,a4 respectively.  note that the new keyword was not used here  */
        cards a1 = cards.spade;
        cards a2 = cards.club;
        cards a3 = cards.heart;
        cards a4 = cards.diamond;

        System.out.println("Enumerators are: "+ a1 + "," + a2 + "," +  a3 + "," + a4);
        System.out.println("----- printing using enhanced loop -----");
        for (cards index:cards.values()) {
            System.out.println(index);
        }
    }


    public enum MyDatabaseconnection {
        ORACLEDB("ORACLE DATABASE IS CONNECTION ..."),
        SQLDBB("SQL DATABASE IS CONNECTING..."),
        POSTGRESSQL("POSTGRES DATABASE IS CONNECTING");
        // Class variable
        private final String establishDatabaseConnection;
        // private enum constructor
        private MyDatabaseconnection(String establishDatabaseConnection) {
            this.establishDatabaseConnection = establishDatabaseConnection;
        }
        // getter
        public String getEstablishDatabaseConnection() {
            return establishDatabaseConnection;   }
    }

}

