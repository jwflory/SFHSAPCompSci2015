public class ArrayAnalyzerLarge {
  public static void main(String[] args) {
    
    ArrayUtil au = new ArrayUtil();
    StopWatch sw = new StopWatch();
    
    int min = 999999999;
    int max = 0;
    int average = 0;
    
    int[] mainArray = createArray(10, 10000000);
    au.print(mainArray);
    
    sw.reset();
    sw.start();
    
    for (int i=0; i<mainArray.length; i++) {
      if (mainArray[i] < min) {
        min = mainArray[i];
      }
      
      if (mainArray[i] > max) {
        max = mainArray[i];
      }
      
      average += mainArray[i];
    }
    average = average / mainArray.length;
    
    sw.stop();
    
    System.out.println("The minimum value is " + min + ".");
    System.out.println("The maximum value is " + max + ".");
    System.out.println("The average is " + average + ".");
    System.out.println("Elapsed Time: " + sw.getElapsedTime() + " milliseconds");
  }
  
  private static int[] createArray(int size, int increment) {
    int[] returnArray = new int[size];
    
    for (int i=0; i < size; i++) {
      returnArray[i] = (int)((Math.random() * increment));
      increment += increment;
    }
    return returnArray;
  }
  
}