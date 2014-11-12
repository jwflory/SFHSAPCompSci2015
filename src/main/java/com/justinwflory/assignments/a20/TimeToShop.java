/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Justin W. Flory
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// **********************************************************************
//   TimeToShop.java
//
//   Virtualizes a shopping experience using other classes from
//   the assignment
//
// **********************************************************************

import java.util.Scanner;

public class TimeToShop {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean continueToShop = true;
    ShoppingCart.intializeArray();
    
    while (continueToShop) {
      System.out.println("What item are you buying next?");
      String itemName = scan.next();
      
      System.out.println("How much does " + itemName + " cost? Please enter the EXACT cost.");
      System.out.print("$");
      double price = scan.nextDouble();
      
      System.out.println("How much of this item would you like to purchase?");
      int quantity = scan.nextInt();
      
      System.out.println("DEBUG: " + itemName + " " + price + " " + quantity);
      System.out.println("DEBUG: Array size is " + ShoppingCart.cart.length);
      
      ShoppingCart.addToCart(itemName, price, quantity);
      System.out.println("Your cart's current contents are:");
      for (int i=0; i < ShoppingCart.cart.length; i++) {
        System.out.println(ShoppingCart.cart[i]);
      }
    }
  }
}