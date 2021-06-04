public class Candy 
{

   public String type; 
   public int sugar; 
   
   public Candy(String type, int sugar)
   {
      this.type = type;
      this.sugar = sugar;
   
   }

   public void makeNoise()
   {
      System.out.println("Crunch!"); 
   }
   
   public int getSugar()
   {
      return sugar; 
   }
   
   
   public void printAllergyInfo()
   {
      System.out.println("Does not contain nuts!");
   
   }
   
  


}