import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before() {
    trumpet = new Trumpet("The One", "Gold", "Brass", "Very", 250, 255, "Trumpet");
  }

  @Test
  public void canPlay() {
    assertEquals("honk!", trumpet.play());
  }

  @Test
  public void canGetHowShiny() {
    assertEquals("Very", trumpet.getHowShiny());
  }

  @Test
  public void canGetName() {
    assertEquals("The One", trumpet.getName());
  }

  @Test
  public void canGetColour() {
    assertEquals("Gold", trumpet.getColour());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Brass", trumpet.getMaterial());
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(5, trumpet.calculateMarkup());
  }

  @Test
  public void canGetType() {
    assertEquals("Trumpet", trumpet.getType());
  }

}