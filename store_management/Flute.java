package store_management;
import behaviours.*;

public class Flute extends Instrument implements Playable {

  private int numButtons;
  private Playable play;

  public Flute (String name, String colour, String material, int numButtons) {
    super(name, colour, material);
    this.numButtons = numButtons;
  }

  public String play() {
    return "toot!";
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

}