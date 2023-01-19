public class SuspectedMemberCommand implements ICommand {
    member member;
    public SuspectedMemberCommand(member member) {
        super();
        this.member = member;
    }

    public void execute() {
        System.out.println(" is checking....");
        member.suspected();
    }
}
