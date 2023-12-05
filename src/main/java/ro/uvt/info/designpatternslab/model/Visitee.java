package ro.uvt.info.designpatternslab.model;


public interface Visitee {
    void accept(Visitor v);
}