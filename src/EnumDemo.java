package src;

public class EnumDemo {
  public static void main(String[] args) {
    System.out.println("Level: " + Level.UNKNOWN.getValue());
  }


  enum Level {
    INFO(1),
    WARNING(2),
    ERROR(3),
    UNKNOWN(0);

    private final int value;

    Level(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }
}
