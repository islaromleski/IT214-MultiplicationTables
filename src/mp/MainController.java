package mp;

public class MainController {

	public static void main(String[] args) {
		ConsoleView aView = new ConsoleView();
		Table myTable = new Table();

		aView.print(myTable.getTable12By12());
	}

}
