package ro.uvt.info.designpatternslab.difexemple.commands;


import ro.uvt.info.designpatternslab.model.Book;

public class CommandInvoker {
    private Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}