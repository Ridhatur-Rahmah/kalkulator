
import java.lang.Math;
/**
 * class CalculatorTrigonometri 
 *
 * @author Ridhatur Rahmah
 * @version 0.1
 */
public abstract class CalculatorTrigonometri extends Calculator
{
    // instance variables - replace the example below with your own
    public double op=0;
    public abstract void konversi(double op);
    public double menghitungSin()
    {
        return Math.sin(this.op);
    }
    
    public double menghitungCos()
    {
        return Math.cos(this.op);
    }
    
    public double menghitungTan()
    {
        return Math.tan(this.op);
    }
}
