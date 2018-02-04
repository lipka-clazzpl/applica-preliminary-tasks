package pl.clazz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MarkupSegmentationTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldThrowExceptionOnMalformedInput() throws IOException {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("First input parameter text of type String should not be null");

        MarkupSegmentation ms = new MarkupSegmentation();
        ms.separate(null);
    }

    @Parameter(0)
    public String markup;

    @Parameter(1)
    public List<Segment> segments;

    @Parameters
    public static Collection<Object[]> data() {
        List<Segment> resultForEmptyMarkup = new ArrayList<Segment>() {
            {
                add(new Segment("", FALSE));
            }
        };

        List<Segment> resultForSingleSegmentNotInTag = new ArrayList<Segment>() {
            {
                add(new Segment(" ma ", FALSE));
            }
        };

        List<Segment> resultForSingleSegmentInTag = new ArrayList<Segment>() {
            {
                add(new Segment("<ABC> a</ABC>", TRUE));
            }
        };

        List<Segment> resultForNotClosedSegment = new ArrayList<Segment>() {
            {
                add(new Segment("<ABC>", FALSE));
            }
        };

        List<Segment> resultForNotOpenedSegment = new ArrayList<Segment>() {
            {
                add(new Segment("</ABC>", FALSE));
            }
        };

        List<Segment> resultForDiverseMarkup = new ArrayList<Segment>() {
            {
                add(new Segment("<ABC>Ala</ABC>", FALSE));
                add(new Segment(" ma ",FALSE));
                add(new Segment("<ABC> kota<ABC> a</ABC> kot </ABC>",TRUE));
                add(new Segment(" ma Ale",FALSE));
            }
        };

        Object[][] data = new Object[][] {
                { "" , resultForEmptyMarkup },
                { "<ABC> a</ABC>", resultForSingleSegmentInTag},
                { " ma ", resultForSingleSegmentNotInTag},
                { "<ABC>Ala</ABC> ma <ABC> kota<ABC> a</ABC> kot </ABC> ma Ale" , resultForDiverseMarkup }
        };

        return Arrays.asList(data);
    }

    @Test
    public void shouldProvideSegments() throws IOException {
        MarkupSegmentation ms = new MarkupSegmentation();

        assertEquals(String.format("Segments differ for markup '%s'", markup), segments, ms.separate(markup));
    }
}
