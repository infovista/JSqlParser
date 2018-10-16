package net.sf.jsqlparser.parser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.sf.jsqlparser.expression.Expression;

/**
 * Test "==" operator as alternate to "=".
 * 
 * @author Denis Fulachier
 *
 */
public class EqualsEqualsOperatorTest {

    public EqualsEqualsOperatorTest() {}
    
    @Test
    public void testParseCondExpression() throws Exception {
        Expression result = CCJSqlParserUtil.parseCondExpression("a=b and c==3");
        assertEquals("a = b AND c == 3", result.toString());
    }

    @Test
    public void testParseOpEqualEqual() throws Exception {
        Expression result = CCJSqlParserUtil.parseExpression("if(a==b, c, d)");
        assertEquals("if(a == b, c, d)", result.toString());
    }
}
