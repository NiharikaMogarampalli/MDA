package com.example.mda;

import android.widget.ImageView;

public class RvModel {

    private int image;
    private String text;
    private int next;

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public int getNext() {
        return next;
    }

    public RvModel(int image, String text, int next) {
        this.image = image;
        this.text = text;
        this.next = next;
    }
}
