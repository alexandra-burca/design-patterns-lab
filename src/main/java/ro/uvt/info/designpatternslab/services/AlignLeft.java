package ro.uvt.info.designpatternslab.services;


public class AlignLeft implements AlignStrategy{
    @Override
    public String render(String paragraph) {
        return String.format("%" + -20 + "s", paragraph);
    }
}