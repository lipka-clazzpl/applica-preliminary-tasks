package pl.clazz;

import java.util.Objects;

class Segment {
    private String text;

    private boolean inTag;

    Segment(String text, boolean inTag) {
        this.text = text;
        this.inTag = inTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return isInTag() == segment.isInTag() &&
                Objects.equals(getText(), segment.getText());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getText(), isInTag());
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