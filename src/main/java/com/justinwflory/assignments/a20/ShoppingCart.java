// **********************************************************************
//   ShoppingCart.java
//
//   Represents a shopping cart as an array of items
//   Use "Listing 6.8" in your textbook as an example to follow to
//   help with completing this class.
//
//   Going ahead and reading Chapter 4 will also give you more
//   background information to help you understand what is going on.
//
// **********************************************************************

import java.text.NumberFormat;

public class ShoppingCart
{
    // instance fields: these variables are the "attributes" of a ShoppingCart
    // these variables are global with the ShoppingCart class

    private int itemCount;      // total number of items in the cart
    private double totalPrice;  // total price of items in the cart
    private int capacity;       // current cart capacity

    // -----------------------------------------------------------
    //  Creates an empty shopping cart with a capacity of 5 items.
    //
    //  the instance fields declared above get initialized in
    //  the constructor method
    //
    // -----------------------------------------------------------
    public ShoppingCart()
    {
	capacity = 5;
	itemCount = 0;
	totalPrice = 0.0;
    }

    // -------------------------------------------------------
    //  Adds an item to the shopping cart.
    //  see addCD method in Listing 6.8 for help
    // -------------------------------------------------------
    public void addToCart(String itemName, double price, int quantity)
    {
    // determine if the cart needs to be increased in size

    // create a new Item and assign it to the proper position in the cart

    // adjust the itemCount and the totalPrice appropriately
 
    }

    // -------------------------------------------------------
    //  Returns the contents of the cart together with
    //  summary information.
    //  This method is COMPLETE.  You do not need to add
    //  or change anything.
    // -------------------------------------------------------
    public String toString()
    {
	NumberFormat fmt = NumberFormat.getCurrencyInstance();

	String contents = "\nShopping Cart\n";
	contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

	for (int i = 0; i < itemCount; i++)
	    contents += cart[i].toString() + "\n";

	contents += "\nTotal Price: " + fmt.format(totalPrice);
	contents += "\n";

	return contents;
    }

    // ---------------------------------------------------------
    //  Increases the capacity of the shopping cart by 3
    //  see Listing 6.8 for help
    // ---------------------------------------------------------
    private void increaseSize()
    {
    }
}