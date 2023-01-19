public class CheckerContext {
    ICheckerStrategy cStrategy;

    public void setCheckerStrategy(ICheckerStrategy cStrategy) {
        this.cStrategy = cStrategy;
    }

    public void check(user User) {
        cStrategy.check(User);
    }
}
