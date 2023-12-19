package ro.uvt.info.designpatternslab.services;

import java.io.IOException;

public interface ImageLoader {
    public String loadImage(String url) throws IOException;
}