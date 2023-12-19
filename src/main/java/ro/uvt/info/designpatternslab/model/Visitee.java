package ro.uvt.info.designpatternslab.model;


import java.io.IOException;

public interface Visitee {
    public void accept(Visitor visitor) throws IOException;
}