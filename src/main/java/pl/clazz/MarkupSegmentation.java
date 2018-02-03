package pl.clazz;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;

public class MarkupSegmentation {

    List<Segment> separate(String text) {
        if(text == null) {
            throw new IllegalArgumentException("First input parameter text of type String should not be null");
        }

        if("".equals(text)) {
            return new ArrayList<Segment>() {
                {
                    add(new Segment("", FALSE));
                }
            };
        }

        return null;
    }

}

