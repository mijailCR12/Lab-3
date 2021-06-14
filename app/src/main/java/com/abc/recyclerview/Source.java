package com.abc.recyclerview;

public class Source {
    private final String title;
    private final int image;

    /**
     * @param title
     * @param image
     */
    public Source(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
