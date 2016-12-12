import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class StartSudoku extends Application{
	private SudokuSolver sudoku;
	
	
		public static void main(String[] args) {
			Application.launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			sudoku = new SudokuSolver();
			Graphics drawer = new Graphics(sudoku);
			Scene scene = new Scene(drawer.getRoot(),495, 565);
			
			
			primaryStage.setTitle("Sudoku");
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();

		}

		@Override
		public void stop() {
			try {

			} catch (Exception e) {

			}
		}
	
	
}
