package store_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {

  private int numStrings;
  private int buyPrice;
  private int sellPrice;
  private String type;

  public Guitar(String name, String colour, String material, int numStrings, int buyPrice, int sellPrice, String type) {
    super(name, colour, material);
    this.numStrings = numStrings;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.type = type;
  }

  public String play() {
    return "twang!";
  }

  public int calculateMarkup() {
    return this.sellPrice - this.buyPrice;
  }

  public int getNumStrings() {
    return this.numStrings;
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