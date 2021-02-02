import java.lang.Math;
public class Die
{
    private int die1;
    private int die2;
    private int tot;
    public Die()
    {
        die1 = 0;
        die2 = 0; 
    }
    public void roll()
    {
        die1 = (int) (Math.random()*(6) +1);
        die2 = (int) (Math.random()*(6) +1);
    }
    public int getRoll()
    {
        tot = (die1 + die2);
        return tot;
    }
}
