public class Lamp {
    private int globRating;
    private String style;
    private  boolean battery;

    public Lamp(int globRating, String style, boolean battery) {
        this.globRating = globRating;
        this.style = style;
        this.battery = battery;
    }
    public void turnOn()
    {
        System.out.println("Lamp -> Turning on |");
    }

    public int getGlobRating() {
        return globRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }
}

