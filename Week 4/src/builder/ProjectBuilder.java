package builder;

public class ProjectBuilder implements IDissertationBuilder {

	public ProjectBuilder(){
		System.out.println("Builder for project created");

	}
	
	@Override
	public void createTitle() {
		// TODO Auto-generated method stub
		System.out.println("Printing project title");
	}

	@Override
	public void createContents() {
		// TODO Auto-generated method stub
		System.out.println("Printing project contents");
	}

	@Override
	public void createSummary() {
		// TODO Auto-generated method stub
		System.out.println("Printing project summary");
	}

	@Override
	public void createChapters() {
		// TODO Auto-generated method stub
		System.out.println("Printing project chapters");
	}

	@Override
	public void createBibliography() {
		// TODO Auto-generated method stub
		System.out.println("Printing project bibliography");
	}

}
