public class Mouse {
    private final String brand;
    private final String model;
    private final String sensor;
    private final int dpi;
    private final int buttons;
    private final boolean isWireless;
    private final double weight;

    public Mouse(String brand, String model, String sensor, int dpi, int buttons, boolean isWireless, double weight) {
        this.brand = brand;
        this.model = model;
        this.sensor = sensor;
        this.dpi = dpi;
        this.buttons = buttons;
        this.isWireless = isWireless;
        this.weight = weight;
    }


    public boolean isWireless() {
        return isWireless;
    }

    public double getWeight() {
        return weight;
    }

    public String getDetails() {
        return String.format("""
                Mouse Details:
                - Brand: %s
                - Model: %s
                - Sensor: %s
                - DPI: %d
                - Buttons: %d
                - Wireless: %s
                - Weight: %.1fg
                """, brand, model, sensor, dpi, buttons, (isWireless ? "Yes" : "No"), weight);
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s, %d DPI)", brand, model, sensor, dpi);
    }
}
