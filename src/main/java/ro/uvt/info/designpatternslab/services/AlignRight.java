package ro.uvt.info.designpatternslab.services;

import ro.uvt.info.designpatternslab.model.Context;
import ro.uvt.info.designpatternslab.model.Paragraph;
import ro.uvt.info.designpatternslab.services.AlignStrategy;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int length = text.length();
        int pageWidth = context.getPageWidth();

        int spacesNeeded = pageWidth - length;

        for (int i = 0; i < spacesNeeded; i++) {
            System.out.print(" ");
        }

        System.out.println(text);
    }
}