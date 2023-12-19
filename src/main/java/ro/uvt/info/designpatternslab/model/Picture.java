package ro.uvt.info.designpatternslab.model;

import java.awt.*;

public interface Picture {
    public String url() throws Exception;
    public Dimension dim() throws Exception;
    public String content() throws Exception;
}