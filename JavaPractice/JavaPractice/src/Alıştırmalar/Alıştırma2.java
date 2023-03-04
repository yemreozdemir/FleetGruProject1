package Alıştırmalar;

public class Alıştırma2 {
    public static void main(String[] args) {
        int timeOfDayInSedonds = 24 * 60 * 60;

        int hour = 18, minute = 58, second = 10;
        int timeSincemidnightInSeconds = hour * 3600 + minute * 60 + second;

        int timeLeftInSeconds = timeOfDayInSedonds - timeSincemidnightInSeconds;

        int startHour = 18, startMinute = 45, startSecond = 36;
        int startTimeSinceMidnightInSeconds = startHour * 3600 + startMinute * 60 + startSecond; //in seconds

        int timeInterval = startTimeSinceMidnightInSeconds - startTimeSinceMidnightInSeconds;

        System.out.println("Time since midnight: " + timeSincemidnightInSeconds + " seconds");
        System.out.println("Time remaining today: " + timeLeftInSeconds + " seconds");
        System.out.println("Percentage of day passed: " + (double) startTimeSinceMidnightInSeconds / (double) (24 * 60 * 60) + "%");
        System.out.println("Elapsed time: " + timeInterval + " seconds");

    }
}
/*
int timeOfDayInSeconds = 24 * 60 * 60;

      int hour = 18, minute = 58, second = 10;
      int timeSinceMidnightInSeconds = hour * 3600 + minute * 60 + second;

      int timeLeftInSeconds = timeOfDayInSeconds - timeSinceMidnightInSeconds;

      int startHour = 18, startMinute = 45, startSecond = 36;
      int startTimeSinceMidnightInSeconds = startHour * 3600 + startMinute * 60 + startSecond; //in seconds

      int timeInterval = timeSinceMidnightInSeconds - startTimeSinceMidnightInSeconds;

      System.out.println("Time since midnight: " + timeSinceMidnightInSeconds + " seconds");
      System.out.println("Time remaining today: " + timeLeftInSeconds + " seconds");
      System.out.println("Percentage of day passed: " + (double)timeSinceMidnightInSeconds / (double)(24 * 60 *60) +"%");
      System.out.println("Elapsed time: " + timeInterval + " seconds");

 */