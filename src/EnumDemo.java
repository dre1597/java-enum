package src;

public class EnumDemo {
  public static void main(String[] args) {
    System.out.println("Level: " + getLevelValue(Level.UNKNOWN));
  }

  public static int getLevelValue(Level level) {
    return switch (level) {
      case INFO -> 1;
      case WARNING -> 2;
      case ERROR -> 3;
      default -> 0;
    };
  }

  enum Level {
    INFO,
    WARNING,
    ERROR,
    UNKNOWN
  }
}
