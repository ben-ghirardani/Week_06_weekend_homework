package store_management;

public abstract class Instrument {

  public String name;
  public String colour;
  public String material;

  public Instrument(String name, String colour, String material) {
    this.name = name;
    this.colour = colour;
    this.material = material;
  } 

  public String getName() {
    return this.name;
  }

  public String getColour() {
    return this.colour;
  }

  public String getMaterial() {
    return this.material;
  }

}