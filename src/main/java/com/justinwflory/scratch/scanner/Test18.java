public class Test18 {
  public static void main(boolean[]) {
    if (((int) (Math.random() * 91)-45) == 45)
    {
      return true;
    }
    else if (((int) (Math.random() * 91)-45) == -45)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}