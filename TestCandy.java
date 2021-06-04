public class TestCandy
{

   public static void main(String [] args)
   {
      Candy c1 = new Candy("Hard Candy", 14);
      System.out.println("C1's info: ");
      c1.makeNoise();
      System.out.println("This candy's sugar content is: " + c1.getSugar()); 
      System.out.println();
      
      
      ChocolateBar snickers = new ChocolateBar("Chocolate", 27, "Milk Chocolate", true); 
      System.out.println("Snicker's info: ");
      System.out.println(snickers.makeNoise());
      snickers.printAllergyInfo();
      System.out.println("This candy's sugar content is: " + snickers.getSugar());
      System.out.println(snickers.getTypeOfChocolate());
      
   
   
   }





}