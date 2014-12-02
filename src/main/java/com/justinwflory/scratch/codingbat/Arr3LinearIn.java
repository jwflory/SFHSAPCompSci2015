public class Arr3LinearIn {
  public static void main(String[] args) {
    int[] inner = {1, 2, 4, 4, 6};
    int[] outer = {2, 4};
    
    linearIn(outer, inner);
  }
  
  public static boolean linearIn(int[] outer, int[] inner) {
    int matchCount = 0;
    
    for (int i=0; i<outer.length; i++) {
      for (int j=0; j<inner.length; j++) {
        if (outer[i] == inner[j]) matchCount++;
      }
    }
    
    System.out.println(matchCount);
    if (matchCount == inner.length) return true;
    else return false;
  }
}