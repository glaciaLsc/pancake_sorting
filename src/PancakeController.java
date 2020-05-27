public class PancakeController 
{
	
	public static void main(String[] args)
	{
		new PancakeController();
	}
	
	public PancakeController()
	{
		int pancakeSizes[] = {24, 4, 16, 32, 8, 18, 10, 12, 14, 14, 28, 26, 30}; // Sizes of pancakes
		PancakeModel model = new PancakeModel(pancakeSizes);
		
		/* Print */
		System.out.println("Original stack:");
		PancakeView.update(model.getPancakes());
		
		model.sort(pancakeSizes.length-1); // Literally the one important call in this entire class
		
		/* Print */
		System.out.println("Final stack:");
		PancakeView.update(model.getPancakes());
	}

}
