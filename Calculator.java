/**
 * class calculator
 *
 * @author Ridhatur Rahmah
 * @version 0.1
 */
public class Calculator
{
    // operand A dan B untuk aplikasi calculator
    public int opA=0, opB=0;
    
    //informasi tentang class
    public static final String info="Aplikasi Kalkulator By Ridhatur Rahmah";
    /**
     * Constructor untuk proyek calculator dengan parameter
     */
    public Calculator(int opA, int opB)
    {
        this.opA=opA;
        this.opB=opB;
        System.out.println("Obyek Calculator dengan parameter telah dibuat");
    }

    /**
     * Constructor untuk proyek calculator tanpa parameter
     */
    public Calculator()
    {
       System.out.println("Obyek Calculator tanpa parameter telah dibuat");
    }
    
    
    
    /**
     * penjumlahan
     *
     * @param int operan 1
             *int operan 2
     * 
     * @return int hasil penjulahan operan 1+ operan 2
     */
    public int penjumlahan(int opA,int opB)
    {
        return opA + opB;
        
    }
    /**
     * pengurangan
     *
     * @param int operan 1
             *int operan 2
     * 
     * @return int hasil pengurangan operan 1+ operan 2
     */
    public int pengurangan(int opA,int opB)
    {
        return opA - opB;
        
    }
     /**
     * Perkalian
     *
     * @param int operan 1
             *int operan 2
     * 
     * @return int hasil Perkalian operan 1+ operan 2
     */
    public int Perkalian(int opA,int opB)
    {
        return opA * opB;
        
    }
    /**pembagian
     *
     * @param int operan 1
             *int operan 2
     * 
     * @return int hasil pembagian operan 1+ operan 2
     */
    public double pembagian(double opA,double opB)
    {
        return opA / opB;
        
    }
    
    
    
}