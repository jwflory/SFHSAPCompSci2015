public class LearnMath {
  public static void main(String[] args) {
    System.out.println("A random number from 0 to 1 is " + Math.random());
    System.out.println("A random number from 1 to 6 is " + ((int) (Math.random() * 6) + 1));
    System.out.println("A random number from -5 to 5 is " + ((int) (Math.random() * 11) - 5));
  }
}