package ch06_command_object.party;

public class HottubOffCommand implements Command {

    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
