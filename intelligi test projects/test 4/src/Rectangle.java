public class Rectangle
{
    private int width, length;

    public Rectangle(int width, int length)
    {
        if (width < 0 )width = 0;
        if (length  < 0) length = 0;
        this.width = width;
        this.length = length;
    }

    public int getWidht()
    {
        return width;
    }

    public int getLength()
    {
        return length;
    }
    public double getArea()
    {
        return width * length;
    }
}