import java.lang.Math;
/**
 *class CalculatorTriDeg
 *
 * @author Ridhatur Rahmah
 * @version 0.1
 */
public class CalculatorTriDeg extends CalculatorTrigonometri
{
        public void konversi(double deg)
        {
            super.op = Math.toRadians(deg);
    }
}
