import java.util.Stack;

public class PancakeModel 
{	
	Stack<Integer> pancakes;
	
	public PancakeModel()
	{
		pancakes = new Stack<Integer>();
	}
	public PancakeModel(int sizes[])
	{
		pancakes = new Stack<Integer>();
		for (int i=0; i < sizes.length; i++)
			pancakes.push(sizes[i]);
	}
	
	/* Methods */
	public void flip(int bot)
	{
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i=0; i <= bot; i++)
			s.add(0, pancakes.remove(0)); // Pop pancakes into new stack

		for (int i=bot; i >= 0; i--)
			pancakes.add(0, s.remove(i)); // Push new stack into original
		
	}

	public void sort(int bot)
	{
		if (0 >= bot)
			return; // Base case
		
		int largest = 0;
		for (int i=1; i <= bot; i++)
		{
			if (pancakes.elementAt(i) > pancakes.elementAt(largest))
				largest = i;
		}
		
		flip(largest); // Flip largest pancake on top
		flip(bot); // Flip entire stack, moving largest pancake to bottom of stack
		sort(bot-1); // Recursive call without bottom pancake
	}
	
	/* Accessors */
	public int getTop()
	{
		return pancakes.peek();
	}
	public Stack<Integer> getPancakes()
	{
		return pancakes;
	}

}
