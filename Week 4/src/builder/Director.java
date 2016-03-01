package builder;

public class Director {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDissertationBuilder pb = new ProjectBuilder();
		pb.createTitle();
		pb.createContents();
		pb.createSummary();
		pb.createChapters();
		pb.createBibliography();
		
		pb = new ThesisBuilder();
		pb.createTitle();
		pb.createContents();
		pb.createSummary();
		pb.createChapters();
		pb.createBibliography();

		}
}
