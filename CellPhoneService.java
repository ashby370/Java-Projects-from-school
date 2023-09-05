import java.util.Scanner;
public class CellPhoneService
{
    public static void main(String[] args)
	{
        int talk, text, data, price;
        String replan;
        final int TALK = 500, TEXT = 100, DATA = 2, PRICE_A = 49, PRICE_B = 55, PRICE_C = 61, PRICE_D = 70, PRICE_E = 79, PRICE_F = 87;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter talk minutes needed");
        talk = input.nextInt();
        System.out.println("Enter text messages needed");
        text = input.nextInt();
        System.out.println("Enter gigabytes of data needed");
        data = input.nextInt();
        if (data > 0)
        if (data <= DATA)
        {
            replan = "E";
            price = PRICE_E;
        }
        else
        {
            replan = "F";
            price = PRICE_F;
        }
        else if(talk < TALK)
        if(text == 0 && data == 0)
        {
            replan = "A";
            price = PRICE_A;
        }
        else
        {
            replan = "B";
            price = PRICE_B;
        }
        else if(text < TEXT)
        {
            replan = "C";
            price = PRICE_C;
        }
        else
        {
            replan = "D";
            price = PRICE_D;
        }
        System.out.println("Plan " + replan + " $" + price + " per month");
    }
}