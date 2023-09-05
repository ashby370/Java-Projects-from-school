public class Poem
{
    // Define the Poem class here
    private String title;
    private int lines;
    public Poem(String poemName, int numberLines)
    {
        title = poemName;
        lines = numberLines;
    }
    public String getTitle()
    {
        return title;
    }
    public int getLines()
    {
        return lines;
    }
}
