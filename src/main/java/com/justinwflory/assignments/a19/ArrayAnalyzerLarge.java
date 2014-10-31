public class ArrayAnalyzerLarge {
  public static void main (String[] args) {
    
    ArrayUtil au = new ArrayUtil();
    //StopWatch sw = new StopWatch();
    
    int size = 10000000;
    int valueSize = 250000001;
    
    for (int i=0; i<11; i++) {
      int[] array = au.randomIntArray(size, valueSize);
      size += 10000000;
      
      evalArray(array, i);
    }
  }
  
  private static void evalArray(int[] array, int count) {
    StopWatch sw = new StopWatch();
    
    int min = array[0];
    int max = array[0];
    long average = 0;
    
    sw.reset();
    sw.start();
    
    for (int i=0; i<array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
      
      if (array[i] > max) {
        max = array[i];
      }
      
      average += array[i];
    }
    average = average / array.length;
    
    sw.stop();
    
    System.out.println("[ARRAY #" + count + "] " + "Min: " + min + "; Max: " + max + "; Average: " + average +
                       "; Elapsed Time: " + sw.getElapsedTime() + " milliseconds");
  }
}