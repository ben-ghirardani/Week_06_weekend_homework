import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("The Ax", "Black and Red", "Wood", 6);
  }

  @Test
  public void canPlay() {
    assertEquals("twang!", guitar.play());
  }

  @Test
  public void canGetNumStrings() {
    assertEquals(6, guitar.getNumStrings());
  }

  @Test
  public void canGetName() {
    assertEquals("The Ax", guitar.getName());
  }

  @Test
  public void canGetColour() {
    assertEquals("Black and Red", guitar.getColour());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Wood", guitar.getMaterial());
  }

}