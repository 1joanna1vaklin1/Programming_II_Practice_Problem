public class ChocolateBar extends Candy
{
   public String typeOfChocolate; 
   public boolean nutContent; 

   
   public ChocolateBar(String type, int sugar, String typeOfChocolate, boolean nutContent)
   {
      super(type, sugar);
      this.typeOfChocolate = typeOfChocolate;
      this.nutContent = nutContent;   
   
   }
   
   
    @Override
   public void makeNoise()
   {
      System.out.println("chew, chew"); 
   }
   
   @Override
   public void printAllergyInfo()
   {
      if(this.nutContent == true)
         System.out.println("CONTAINS TREE NUTS");
      else
         super.printAllergyInfo();
   
   }
   
   public String getTypeOfChocolate()
   {
      return this.typeOfChocolate; 
   
   }
   
  
   
  
   
   


}