public class ClearMemberCommand implements ICommand {
    member member;
    public ClearMemberCommand(member member) {
        super();
        this.member = member;
    }

    public void execute() {
        System.out.println(" is checking....");
        member.clear();
    }
}
