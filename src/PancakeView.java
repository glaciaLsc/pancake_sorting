import java.util.Stack;

public class PancakeView
{
	
	public static void update(Stack<Integer> pancakes)
	{
		for (int i : pancakes)
		{
			for (int j=0; j < 30 - i / 2; j++)
				System.out.print(' ');
			for (int k=0; k < i; k++)
				System.out.print('-'); // Prints dashes according to pancake size
			System.out.println();
		}
		System.out.println();
	}

}
