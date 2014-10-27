public class ArrayAnalyzer {
  public static void main (String[] args) {
    
    ArrayUtil au = new ArrayUtil();
    StopWatch sw = new StopWatch();
    
    int min = 20001;
    int max = 0;
    int average = 0;
    
    int[] mainArray = au.randomIntArray(20, 20001);
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
}