/**
 * Class calculator advanced
 *
 * @author Ridhatur Rahmah
 * @version 0.1
 */
public class calculatorAdvanced extends Calculator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class calculatorAdvanced
     */
    public calculatorAdvanced()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * hitung faktorial
     *
     * @param opA
     * @return hasil faktorial
     */
    public int Faktorial(int opA)
    {

        int hasil = 1;
        for (int i=opA; i>0; i--){
            hasil *=i;
        }
        return hasil;
    }
}