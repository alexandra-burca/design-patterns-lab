package ro.uvt.info.designpatternslab.difexemple.commands;


public interface Command<T> {
    public T execute();
}