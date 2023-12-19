package ro.uvt.info.designpatternslab.services;
public class AlignRight implements AlignStrategy{
    @Override
    public String render(String paragraph) {
        return String.format("%" + 40 + "s", paragraph);
    }
}