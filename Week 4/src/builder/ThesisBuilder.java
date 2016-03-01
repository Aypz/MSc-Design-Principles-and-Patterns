package builder;

public class ThesisBuilder implements IDissertationBuilder {
	

	public ThesisBuilder(){
		System.out.println("Builder for thesis created");

	}

	@Override
	public void createTitle() {
		// TODO Auto-generated method stub
		System.out.println("Printing thesis title");
		
	}

	@Override
	public void createContents() {
		// TODO Auto-generated method stub
		System.out.println("Printing thesis contents");
	}

	@Override
	public void createSummary() {
		// TODO Auto-generated method stub
		System.out.println("Printing thesis summary");
	}

	@Override
	public void createChapters() {
		// TODO Auto-generated method stub
		System.out.println("Printing thesis chapters");
	}

	@Override
	public void createBibliography() {
		// TODO Auto-generated method stub
		System.out.println("Printing thesis biblopgraphy");
	}
	
	

	
	
}



