package store_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable {

  private int numStrings;
  private Playable play;

  public Guitar(String name, String colour, String material, int numStrings) {
    super(name, colour, material);
    this.numStrings = numStrings;
  }

  public String play() {
    return "twang!";
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

}