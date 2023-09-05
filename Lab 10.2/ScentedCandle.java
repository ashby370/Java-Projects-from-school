public class ScentedCandle extends Candle
{
    // Define the ScentedCandle class here
    private String scent;
    public String getScent()
    {
        return scent;
    }
    public void setScent(String candleScent)
    {
        scent = candleScent;
    }
    @Override
    public void setHeight(int height)
    {
        super.setHeight(height);
        price = 3 * height;
    }
}
