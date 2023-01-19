public class MediumCheckStrategy implements ICheckerStrategy {
    public void check(user User) {
        System.out.print(User.getName() + "(" + User.getTrustFactor() + ")");
        if(User.getTrustFactor() < 4000) {
            member member = new member();
            MemberControl  control = new MemberControl();
            control.setCommand(new KickMemberCommand(member));
            control.action();
            User.setState(0);
        } else if (User.getTrustFactor() >= 4000 && User.getTrustFactor() < 8000) {
            member member = new member();
            MemberControl  control = new MemberControl();
            control.setCommand(new SuspectedMemberCommand(member));
            control.action();
            User.setState(1);
        } else if (User.getTrustFactor() >= 8000) {
            member member = new member();
            MemberControl  control = new MemberControl();
            control.setCommand(new ClearMemberCommand(member));
            control.action();
            User.setState(2);
        }
    }
}
