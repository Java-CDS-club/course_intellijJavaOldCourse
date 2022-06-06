public class Main
{
    public static void main(String[] args) {
        SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("Three");

        int ps = 674312;
        Password password = new ExtendedPassword(ps);
        password.storePassword();

        password.letMeIn(674312);
        password.letMeIn(545);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is "+SIBTest.owner);
    }
}
