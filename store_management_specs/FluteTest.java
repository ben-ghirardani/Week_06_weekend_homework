import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class FluteTest {

  Flute flute;

  @Before
  public void before() {
    flute = new Flute("CuteFlute", "Silver", "Silver", 16);
  }

  @Test 
  public void canPlay() {
    assertEquals("toot!", flute.play());
  }

  @Test
  public void canGetNumberOfButtons() {
    assertEquals(16, flute.getNumberOfButtons());
  }

  @Test
  public void canGetName() {
    assertEquals("CuteFlute", flute.getName());
  }

  @Test
  public void canGetColour() {
    assertEquals("Silver", flute.getColour());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Silver", flute.getMaterial());
  }

}