import java.util.ArrayList;
import java.util.List;

public class CBElevensBoard extends CBBoard
{
  private static final int BOARD_SIZE = 9;
  private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };

  private static final String[] SUITS = { "spades", "hearts", "diamonds", "clubs" };

  private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0 };

  public CBElevensBoard()
  {
    super(9, RANKS, SUITS, POINT_VALUES);
  }

  public boolean isLegal(List<Integer> paramList)
  {
    if (paramList.size() < 2)
      return false;
    if (paramList.size() > 3)
      return false;
    if (paramList.size() == 2) {
      int i = ((Integer)paramList.get(0)).intValue();
      int j = ((Integer)paramList.get(1)).intValue();
      return cardAt(i).pointValue() + cardAt(j).pointValue() == 11;
    }
    return containsJQK(paramList);
  }

  public boolean anotherPlayIsPossible()
  {
    return (containsPairSum11()) || (containsJQK());
  }

  public boolean containsPairSum11()
  {
    for (int i = 0; i < 9; i++) {
      if (cardAt(i) != null) {
        for (int j = i + 1; j < 9; j++) {
          if ((cardAt(j) != null) && (cardAt(i).pointValue() + cardAt(j).pointValue() == 11))
          {
            return true;
          }
        }
      }
    }
    return false;
  }

  public boolean containsJQK()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < 9; i++) {
      if (cardAt(i) != null) {
        localArrayList.add(new Integer(i));
      }
    }
    return containsJQK(localArrayList);
  }

  public boolean containsJQK(List<Integer> paramList)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    for (Integer localInteger : paramList) {
      int m = localInteger.intValue();
      if (cardAt(m).rank().equals("jack"))
        i = 1;
      else if (cardAt(m).rank().equals("queen"))
        j = 1;
      else if (cardAt(m).rank().equals("king")) {
        k = 1;
      }
    }
    return (i != 0) && (j != 0) && (k != 0);
  }

  public void processPairSum11()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < 9; i++)
      if (cardAt(i) != null)
        for (int j = i + 1; j < 9; j++)
          if ((cardAt(j) != null) && 
            (cardAt(i).pointValue() + cardAt(j).pointValue() == 11)) {
            localArrayList.add(new Integer(i));
            localArrayList.add(new Integer(j));
            replaceSelectedCards(localArrayList);
            return;
          }
  }

  public void processJQK()
  {
    int i = -1;
    int j = -1;
    int k = -1;

    for (int m = 0; m < 9; m++) {
      if (cardAt(m) != null) {
        if (cardAt(m).rank().equals("jack"))
          i = m;
        else if (cardAt(m).rank().equals("queen"))
          j = m;
        else if (cardAt(m).rank().equals("king")) {
          k = m;
        }
      }
    }

    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new Integer(i));
    localArrayList.add(new Integer(j));
    localArrayList.add(new Integer(k));
    replaceSelectedCards(localArrayList);
  }
}