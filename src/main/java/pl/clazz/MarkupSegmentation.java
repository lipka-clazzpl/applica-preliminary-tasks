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

        // Assuming UTF-16 code points in BMP (https://en.wikipedia.org/wiki/Plane_(Unicode)#Basic_Multilingual_Plane)
        // Assuming short strings that fit (otherwise StringBuffer/StringBuilder would be used)
        // Assuming there is no check made for non-conforming markup, ie. not opened or closed, see test cases


        return null;
    }

}

