/*
 * A stopwatch class that you can use to measure the time of a running program.
 */
public class StopWatch
{
  /*
   * instance fields
   */
  private long elapsedTime;
  private long startTime;
  private boolean isRunning;
  
  /*
   * construct a StopWatch that is in stopped state and has no time accumulated
   */
  public StopWatch()
  {
    reset();
  }
  
  /*
   * start the stopwatch
   */
  public void start()
  {
    if (isRunning) return;  // was already started
    isRunning = true;
    startTime = System.currentTimeMillis();
  }
  
  /*
   * stop the stopwatch; add accumulated time since last start to the elapsed time
   */
  public void stop()
  {
    if (!isRunning) return;  // was already stopped
    elapsedTime = elapsedTime + (System.currentTimeMillis() - startTime);
    isRunning = false;
  }
  
  /*
   * returns the total elapsed time; you can get the elapsed time without having to stop
   * the stopwatch first
   */
  public long getElapsedTime()
  {
    if (isRunning)
      return elapsedTime + (System.currentTimeMillis() - startTime);
    else
      return elapsedTime;
  }
  
  /*
   * stops the watch and resets elapsed time to 0
   */
  public void reset()
  {
    elapsedTime = 0;
    isRunning = false;
  }
  
}