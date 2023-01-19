public class KickMemberCommand implements ICommand {
    member member;
    public KickMemberCommand(member member) {
        super();
        this.member = member;
    }

    public void execute() {
        System.out.println(" is checking....");
        member.kick();
    }
}
