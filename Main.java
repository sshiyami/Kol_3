public class Main {
    public static void main(String[] args) {
        CheckerContext context = new CheckerContext();
        user Bob = new user("Bob", 5467);
        user Yana = new user("Yana", 9193);
        user Tom = new user("Tom", 2981);
        System.out.println("Strict Checking.....");
        System.out.println("-----------------------------------------------");
        context.setCheckerStrategy(new StrictCheckStrategy());
        context.check(Bob);
        context.check(Yana);
        context.check(Tom);
        System.out.println("-----------------------------------------------");
        System.out.println("Medium Checking.....");
        System.out.println("-----------------------------------------------");
        context.setCheckerStrategy(new MediumCheckStrategy());
        context.check(Bob);
        context.check(Yana);
        context.check(Tom);
        System.out.println("-----------------------------------------------");
        System.out.println("Light Checking.....");
        System.out.println("-----------------------------------------------");
        context.setCheckerStrategy(new LightCheckStrategy());
        context.check(Bob);
        context.check(Yana);
        context.check(Tom);
    }
}