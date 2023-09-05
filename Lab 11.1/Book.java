public abstract class Book
{
   // attributes
   String title;
   double price;
   // constructor
   public Book(String t)
   {
       title = t;
   }  
   // get and set methods
   public String getTitle()
   {
       return title;
   }
   public double getPrice()
   {
       return price;
   }
   public abstract void setPrice();
   
}
