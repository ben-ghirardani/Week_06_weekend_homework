package store_management;
import behaviours.*;

public class Flute extends Instrument implements Playable, Sellable {

  private int numButtons;
  private int buyPrice;
  private int sellPrice;
  private String type;
  // do I need Playable play? What was it for?!
  // private Playable play;

  public Flute (String name, String colour, String material, int numButtons, int buyPrice, int sellPrice, String type) {
    super(name, colour, material);
    this.numButtons = numButtons;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.type = type;
  }

  public String play() {
    return "toot!";
  }

  public int calculateMarkup() {
    return this.sellPrice - this.buyPrice;
  }

  public int getNumberOfButtons() {
    return this.numButtons;
  } 

  public String getName() {
    return super.getName();
  }

  public String getColour() {
    return super.getColour();
  }

  public String getMaterial() {
    return super.getMaterial();
  }

  public String getType() {
    return this.type;
  }

}