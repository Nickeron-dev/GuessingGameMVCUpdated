package game;

/*
 * Created by Koshkin Illia on 29.06.2021.
 */
public class Main {
	
	public static void main(String[] args) {
		Model model = new Model();
		View  view = new View();
		Controller controller = new Controller(model, view);
		
		controller.run();
	}
	
}
