import static org.junit.Assert.*;
import org.junit.Test;
public class Main
{

	@Test
    public void TestToString()
    {
        Fraction f = new Fraction (-7,2);
        assertEquals(f.toString(), "-7 / 2");
    }

	public static void main(String[] args)
	{	
	    System.out.println("Simple affichage");
	}	
}