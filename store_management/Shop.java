package store_management;
import behaviours.*;
import java.util.*;

public class Shop {

  private String name;
  private ArrayList<Sellable> stock;

  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }

  public void addStock(Sellable item) {
    stock.add(item);
  }

  public void removeStock(Sellable item) {
    stock.remove(item);
  }

  public int countStock() {
    return stock.size();
  }

}