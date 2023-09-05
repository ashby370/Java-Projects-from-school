public class TeeShirt
{
   private int orderNumber;
   private String size;
   private String color;
   private double price;
   public void setOrderNumber(int num)
   {
       // write your code here
       orderNumber = num;
   }
   public void setSize(String sz)
   {
       // write your code here
       size = sz;
   }
   public void setColor(String clr)
   {
       // write your code here
       color = clr;
   }
   public int getOrderNumber()
   {
       // write your code here
       return orderNumber;
   }
   public String getSize()
   {
       // write your code here
       return size;
   }
   public String getColor()
   {
       // write your code here
       return color;
   }
   public double getPrice()
   {
       // write your code here
       if(size.equals("XXL") || size.equals("XXXL"))
       {
           return 22.99;
       }
       else
       {
           return 19.99;
       }
   }
}
