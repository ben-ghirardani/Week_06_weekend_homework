import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class GuitarStringsTest {

  GuitarStrings guitarstrings;

  @Before
  public void before() {
    guitarstrings = new GuitarStrings("Strings by Shane", 1, 3, "Guitar Strings");    
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(2, guitarstrings.calculateMarkup());
  }

  @Test
  public void canGetType() {
    assertEquals("Guitar Strings", guitarstrings.getType());
  }

}