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
   
   Calculator calculator2 = new Calculator(6,3);
    System.out.println(calculator2.info);
    System.out.println(calculator2.opA);
    System.out.println(calculator2.opB);
    System.out.println(calculator2.pengurangan(6,3));
    System.out.println(calculator2.penjumlahan(6,3));
    System.out.println(calculator2.Perkalian(6,3));
    System.out.println(calculator2.pembagian(6,3));
    
    calculatorAdvanced calculator3 = new calculatorAdvanced();
    System.out.println(calculator3.info);
    System.out.println(calculator3.opA);
    System.out.println(calculator3.opB);
    System.out.println(calculator3.pengurangan(6,3));
    System.out.println(calculator3.penjumlahan(6,3));
    System.out.println(calculator3.Perkalian(6,3));
    System.out.println(calculator3.pembagian(6,3));
    hasil= calculator3.Faktorial(3);
    System.out.println(hasil);
    
        double hasilSin = 0;
        double hasilCos = 0;
        double hasilTan = 0;
        int hasiljumlah=0;
        double der = 60;
        double rad = 0.5235987755982988;
        
        CalculatorTrigonometri ct1 = new CalculatorTriDeg();
        //CalculatorTrigonometri ct1 = new CalculatorTrigonometri();
        hasiljumlah = ct1.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct1.op);
        ct1.konversi(der);
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilSin = ct1.menghitungSin();
        System.out.println("Nilai sin = "+der+ " derajat adalah = "+ hasilSin);
        
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilCos = ct1.menghitungCos();
        System.out.println("Nilai Cos = "+der+ " derajat adalah = "+ hasilCos);
        
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilTan = ct1 .menghitungTan();
        System.out.println("Nilai Tan = "+der+ " derajat adalah = "+ hasilTan);
        
        System.out.println("");
        System.out.println("");
        
        CalculatorTrigonometri ct2 = new CalculatorTriRad();
        //CalculatorTrigonometri ct1 = new CalculatorTrigonometri();
        hasiljumlah = ct2.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct2.op);
        ct2.konversi(rad);
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilSin = ct2.menghitungSin();
        System.out.println("Nilai sin = "+rad+ " radian  adalah = "+ hasilSin);
        
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilCos = ct2.menghitungCos();
        System.out.println("Nilai Cos = "+rad+ " radian  adalah = "+ hasilCos);
        
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilTan = ct2.menghitungTan();
        System.out.println("Nilai Tan = "+rad+ " radian  adalah = "+ hasilTan);
        
        
        
    }
}