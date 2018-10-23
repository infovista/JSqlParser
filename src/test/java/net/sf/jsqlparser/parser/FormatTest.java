package net.sf.jsqlparser.parser;

import static net.sf.jsqlparser.test.TestUtils.assertStatementCanBeDeparsedAs;

import java.io.StringReader;

import org.junit.Test;

import net.sf.jsqlparser.statement.select.Select;

public class FormatTest {

    private final CCJSqlParserManager parserManager = new CCJSqlParserManager();

    @Test
    public void testParseFormat() throws Exception {
        final String statement = "SELECT col1, col2 FROM tableName FORMAT JSON";
        Select select = (Select) parserManager.parse(new StringReader(statement));

        assertStatementCanBeDeparsedAs(select, statement);
    }
}
