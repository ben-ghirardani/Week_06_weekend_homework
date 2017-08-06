package store_management;
import behaviours.*;

public class GuitarStrings implements Sellable {

  private String name;
  private int buyPrice;
  private int sellPrice;
  private String type;

  public GuitarStrings(String name, int buyPrice, int sellPrice, String type) {
    this.name = name;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
    this.type = type;
  } 

  public int calculateMarkup() {
    return this.sellPrice - this.buyPrice; 
  }

  public String getType() {
    return this.type;
  }

}