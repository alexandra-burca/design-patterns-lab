package ro.uvt.info.designpatternslab.difexemple.commands;


public class SynchronousCommandExecutor implements CommandExecutor {
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}