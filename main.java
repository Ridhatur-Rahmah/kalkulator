/**
 * Class Main
 *
 * @author Ridhatur Rahmah
 * @version 0.1
 */
public class main
{
   public static void main(String args[])
   {
       int hasil ;
    
   Calculator calculator1 = new Calculator();
   System.out.println(calculator1.opA);
   System.out.println(calculator1.opB);
   System.out.println(calculator1.info);
   
   Calculator calculator2 = new Calculator(4,5);
   System.out.println(calculator2.opA);
   System.out.println(calculator2.opB);
   System.out.println(calculator2.info);
    System.out.println(calculator2.pengurangan(6,3));
    System.out.println(calculator2.penjumlahan(6,3));
    System.out.println(calculator2.Perkalian(6,3));
    System.out.println(calculator2.pembagian(6,3));
    }
}
