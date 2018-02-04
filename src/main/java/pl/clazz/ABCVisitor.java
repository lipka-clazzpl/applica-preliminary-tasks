package pl.clazz;


import pl.clazz.grammar.ABCParser;
import pl.clazz.grammar.ABCParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class ABCVisitor extends ABCParserBaseVisitor {

    private List<Segment> segments = new ArrayList<>();

    @Override
    public Object visitLvl0_elem_chardata(ABCParser.Lvl0_elem_chardataContext ctx) {
        for(ABCParser.ElementContext element : ctx.element() ) {
            segments.add( new Segment(element.getText(), Boolean.TRUE));
        }

        for(ABCParser.ChardataContext chardata : ctx.chardata() ) {
            segments.add( new Segment(chardata.getText(), Boolean.FALSE));
        }

        return super.visitLvl0_elem_chardata(ctx);
    }

    @Override
    public Object visitLvl0_chardata(ABCParser.Lvl0_chardataContext ctx) {
        for(ABCParser.ChardataContext chardata : ctx.chardata() ) {
            segments.add( new Segment(chardata.getText(), Boolean.FALSE));
        }

        return super.visitLvl0_chardata(ctx);
    }

    public List<Segment> getSegments() {
        return segments;
    }

}
