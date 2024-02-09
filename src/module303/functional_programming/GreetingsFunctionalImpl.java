package module303.functional_programming;

public class GreetingsFunctionalImpl {

    Greetings greetings = new Greetings() {
        @Override
        public void sayHello() {
            System.out.println("Hello Class");
        }
    };
}
