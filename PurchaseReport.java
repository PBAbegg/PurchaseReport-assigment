// Code reviewed by @professorgordon
/*Parker Abegg*/

public class PurchaseReport {
    public static void main(String[] args) {
      System.out.println("=======================");
      System.out.println("Purchase Report");
      System.out.println("=======================");
      double Shirt=21.99;
      String blank="";
      System.out.printf("Shirt %10s $%.2f\n",blank,Shirt);
      double Pants=49.97; 
      System.out.printf("Pants %10s $%.2f\n",blank,Pants);
      double Shoes=89.50;
      System.out.printf("Shoes %10s $%.2f\n",blank,Shoes);
      double Belt=19.99;
      System.out.printf("Belt  %10s $%.2f\n",blank,Belt);
      double Coat=129.95;
      System.out.printf("Coat %10s $%.2f\n",blank,Coat);
      System.out.println("=======================");
      double Total=311.40;
      
      System.out.printf("Total %9s $%.2f",blank,Total);
      }}

