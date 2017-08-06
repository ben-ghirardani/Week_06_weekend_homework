package store_management;
import behaviours.*;

public class Trumpet extends Instrument implements Playable, Sellable {

  private String howShiny;
  private int buyPrice;
  private int sellPrice;
  private String type;

  public Trumpet(String name, String colour, String material, String howShiny, int buyPrice, int sellPrice, String type) {
    super(name, colour, material);
    this.howShiny = howShiny;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.type = type;
  }

  public String play() {
    return "honk!";
  }

  public int calculateMarkup() {
    return this.sellPrice - this.buyPrice;
  }

  public String getHowShiny() {
    return this.howShiny;
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