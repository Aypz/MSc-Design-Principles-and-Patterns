package lab1;

public class MediaPlayer {

	public MediaPlayer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Basic Version Media Player");

		String mediaClassName = args[0];
		
		try {
			IPlay m = (IPlay) Class.forName("lab1."+mediaClassName).newInstance();
			m.play();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
