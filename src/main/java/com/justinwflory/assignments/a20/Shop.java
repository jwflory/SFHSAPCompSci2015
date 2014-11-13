// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Shop {
  public static void main (String[] args) {
    Item item;
    String itemName;
    double itemPrice;
    double totalPrice = 0.0;
    int quantity;
    
    // create an ArrayList of Items to be used as the shopping cart
    // see Listings 6.19 and 6.20 for assistance
    
    ArrayList<Item> cart = new ArrayList<Item>();
    
    Scanner scan = new Scanner(System.in);
    
    String keepShopping = "y";
    
    do {
      System.out.print ("Enter the name of the item: "); 
      itemName = scan.nextLine();
      
      System.out.print ("Enter the unit price: ");
      itemPrice = scan.nextDouble();
      totalPrice += itemPrice;
      
      System.out.print ("Enter the quantity: ");
      quantity = scan.nextInt();
      scan.nextLine();
      
      // *** create a new item and add it to the cart
      item = new Item(itemName, itemPrice, quantity);
      cart.add(item);
      
      // *** print the contents of the cart object using println
      ListIterator cartContents = cart.listIterator();
      while (cartContents.hasNext()) {
        System.out.println(cartContents.next());
      }
      
      System.out.print ("Continue shopping (y/n)? ");
      keepShopping = scan.nextLine();
    }
    while (keepShopping.equals("y"));
    
  }
}