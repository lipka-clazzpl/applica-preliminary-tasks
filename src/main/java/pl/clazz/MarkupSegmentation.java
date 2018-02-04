package pl.clazz;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import pl.clazz.grammar.ABCLexer;
import pl.clazz.grammar.ABCParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.FALSE;

public class MarkupSegmentation {

    List<Segment> separate(String text) throws IOException {
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

        InputStream stream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));

        ABCLexer lexer = new ABCLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ABCParser parser = new ABCParser(tokens);
        ParseTree tree = parser.text();

        ABCVisitor visitor = new ABCVisitor();
        visitor.visit(tree);

        return visitor.getSegments();

    }

}

