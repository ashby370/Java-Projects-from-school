public class Candle
{
    // Define the Candle class here
    private String color;
    private int height;
    public double price;
    public String getColor()
    {
        return color;
    }
    public int getHeight()
    {
        return height;
    }
    public double getPrice()
    {
        return price;
    }
    public void setColor(String candleColor)
    {
        color = candleColor;
    }
    public void setHeight(int candleHeight)
    {
        this.height = candleHeight;
        price = 2 * this.height;
    }
    
}
