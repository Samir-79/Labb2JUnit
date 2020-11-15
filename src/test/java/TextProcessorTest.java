import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TextProcessorTest {

@Test
@DisplayName("Nu testas returnVers-metoden i TextProcessor-klassen")
    void testreturnVers(){

    TextProcessor textProcessor= new TextProcessor();
    assertEquals("JAVAUTVECKLARE",textProcessor.returnVers("javautvecklare"));
    assertTrue("C#-UTVECKLARE".equals(textProcessor.returnVers("c#-utvecklare")));
    }

@Test
    @DisplayName("Nu testas returnGem-metoden i TestProcessor-klassen")
    void testreturnGem(){
    TextProcessor textProcessor = new TextProcessor();
    assertTrue( "javautvecklare".equals( textProcessor.returnGem("JAVAUTVECKLARE")));
    assertNotEquals(textProcessor.returnGem("MAS"), "Mas");

}


@Test
    @DisplayName("Nu testas reverse-metoden i TestProcessor-klassen")
    void testreverse(){
    TextProcessor textProcessor = new TextProcessor();
    assertEquals((textProcessor.reverse("samir")), "rimas");
    assertNotNull(textProcessor.reverse("hej"));

}
}
