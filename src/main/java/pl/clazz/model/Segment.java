package pl.clazz.model;

// would normally create separate implementation in a package scode, don't have time for it though
public class Segment {
    String text;

    boolean inTag;

    public Segment(String text, boolean inTag) {
        this.text = text;
        this.inTag = inTag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isInTag() {
        return inTag;
    }

    public void setInTag(boolean inTag) {
        this.inTag = inTag;
    }

}