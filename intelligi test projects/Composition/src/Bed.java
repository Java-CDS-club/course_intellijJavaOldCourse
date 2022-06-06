public class Bed
{
    private String style ;
    private int height , sheets , pillows , quilt;

    public Bed(String style, int height, int sheets, int pillows, int quilt) {
        this.style = style;
        this.height = height;
        this.sheets = sheets;
        this.pillows = pillows;
        this.quilt = quilt;
    }
    public void make()
    {
        System.out.println("Bed-> Making ");
    }
    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }
}
