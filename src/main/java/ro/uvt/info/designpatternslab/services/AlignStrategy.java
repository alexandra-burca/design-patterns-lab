package ro.uvt.info.designpatternslab.services;


import ro.uvt.info.designpatternslab.model.Context;
import ro.uvt.info.designpatternslab.model.Paragraph;

public interface AlignStrategy {
    public void render(Paragraph paragraph, Context context);
}