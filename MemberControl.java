public class MemberControl {
    ICommand command;
    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
