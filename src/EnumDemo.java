package src;

public class EnumDemo {
  public static void main(String[] args) {
    for (Level level : Level.values()) {
      System.out.println("Level " + level.name()
      + "\n\tSeverity: " + level.getSeverity()
      + "\n\tLabel: " + level.getLabel()
      + "\n\tColor: " + level.getColor());
    }
  }


  enum Level {
    INFO(1, "INFO", 0x00AA00),
    WARNING(2, "WARNING", 0xFFA500),
    ERROR(3, "ERROR", 0xA30000);

    private final int severity;
    private final String label;
    private final int color;

    Level(int severity, String label, int color) {
      this.severity = severity;
      this.label = label;
      this.color = color;
    }

    public int getSeverity() {
      return severity;
    }

    public String getLabel() {
      return label;
    }

    public int getColor() {
      return color;
    }
  }
}
