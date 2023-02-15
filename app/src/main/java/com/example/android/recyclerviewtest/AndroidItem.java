package com.example.android.recyclerviewtest;

import android.graphics.drawable.Drawable;

class AndroidItem {
    private int image;
    private String name;
    private String version;


    public AndroidItem(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public AndroidItem(int image, String name, String version) {
        this.image = image;
        this.name = name;
        this.version = version;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
