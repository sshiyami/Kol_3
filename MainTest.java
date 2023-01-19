import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    @Test
    public void test1()  {
        CheckerContext context = new CheckerContext();
        user Bob = new user("Bob", 5467);
        user Yana = new user("Yana", 9193);
        user Tom = new user("Tom", 2981);
        context.setCheckerStrategy(new StrictCheckStrategy());
        context.check(Bob);
        context.check(Yana);
        context.check(Tom);
        Assert.assertEquals(0, Bob.getState());
        Assert.assertEquals(2, Yana.getState());
        Assert.assertEquals(0, Tom.getState());
    }

    @Test
    public void test2()  {
        CheckerContext context = new CheckerContext();
        user Bob = new user("Bob", 5467);
        user Yana = new user("Yana", 9193);
        user Tom = new user("Tom", 2981);
        context.setCheckerStrategy(new MediumCheckStrategy());
        context.check(Bob);
        context.check(Yana);
        context.check(Tom);
        Assert.assertEquals(1, Bob.getState());
        Assert.assertEquals(2, Yana.getState());
        Assert.assertEquals(0, Tom.getState());
    }

    @Test
    public void test3()  {
        CheckerContext context = new CheckerContext();
        user Bob = new user("Bob", 5467);
        user Yana = new user("Yana", 9193);
        user Tom = new user("Tom", 2981);
        context.setCheckerStrategy(new LightCheckStrategy());
        context.check(Bob);
        context.check(Yana);
        context.check(Tom);
        Assert.assertEquals(2, Bob.getState());
        Assert.assertEquals(2, Yana.getState());
        Assert.assertEquals(1, Tom.getState());
    }
}