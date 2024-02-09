package module303.functional_programming;

public class Hello implements Greetings {

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }

    public void functionalImplementation() {
        Greetings functionalGreeting = new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Hello World Functional");
            }
        };

        functionalGreeting.sayHello();
    }

    public static void main(String[] args) {

        //Works with regular interfaces
        Greetings greetings = new Hello();
        greetings.sayHello();

        Hello functionalHello = new Hello();
        functionalHello.functionalImplementation();

        //Functional interface implementation
        GreetingsFunctionalImpl greetingsFunctional = new GreetingsFunctionalImpl();
        greetingsFunctional.greetings.sayHello();




    }
}

