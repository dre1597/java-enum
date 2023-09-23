package src;

public class EnumDemo {
  public static void main(String[] args) {
    System.out.println("Level: " + Level.INFO);
  }

  enum Level {
    INFO,
    WARNING,
    ERROR,
    UNKNOWN
  }
}
