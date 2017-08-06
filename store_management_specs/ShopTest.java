import static org.junit.Assert.*;
import org.junit.*;
import store_management.*;
import behaviours.*;

public class ShopTest {

  private Shop shop;
  private Sellable flute;
  private Sellable guitarstrings;

  @Before
  public void before() {
    shop = new Shop("Ray's Music Exchange");
    flute = new Flute("FluteMaster 5000", "Silver", "Silver", 16, 50, 100, "Flute");
    guitarstrings = new GuitarStrings("Strings by Shane", 1, 3, "Guitar Strings");
  }

  @Test
  public void canAddStock() {
    shop.addStock(flute);
    assertEquals(1, shop.countStock());
  }

  @Test
  public void canRemoveStock() {
    shop.addStock(flute);
    shop.removeStock(flute);
    assertEquals(0, shop.countStock());
  }


}