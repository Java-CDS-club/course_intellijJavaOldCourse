public class Bed {
    private int pillows , height , sheets , quilt;
    private String style;

    public Bed(int pillows, int height, int sheets, int quilt, String style) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
        this.style = style;
    }
    public void make()
    {
        System.out.println("Bed -> Making |");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public String getStyle() {
        return style;
    }
}