import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class Graphics {
	private BorderPane root;
	private SudokuSolver sudoku;

	public Graphics(SudokuSolver ss) {
		sudoku = ss;
		TilePane tp = addTilePane();
		HBox hb = addButtons();

		root = new BorderPane();
		root.setCenter(tp);
		root.setBottom(hb);

	}

	public TilePane addTilePane() {
		TilePane centerRoot = new TilePane();
		centerRoot.setPrefColumns(9);
		centerRoot.setPrefRows(9);
		final int SIZE = 55;
		for (int i = 1; i <= 9; i++) {
			for (int k = 1; k <= 9; k++) {
				TextField tf = new TextField("0");
				tf.setPrefSize(SIZE, SIZE);
				
				if (i % 2 != 0 && k % 2 != 0 || i % 2 == 0 && k % 2 == 0) {
					tf.setStyle("-fx-background-color: #FFB732;");
				}
				centerRoot.getChildren().add(tf);
			}
		}
		return centerRoot;
	}
	public HBox addButtons(){
		HBox hb = new HBox(15);//spacing between boxes;
		hb.setPrefHeight(70);//height of hbox;
		hb.setPrefWidth(495);//width of hbox;
		hb.setPadding(new Insets(10,0,10,325));//padding of hbox;
		
		Button solveButton = new Button();
		Button clearButton = new Button();
		
		solveButton.setPrefSize(70, 50);
		clearButton.setPrefSize(70, 50);
		
		solveButton.setText("Solve");
		clearButton.setText("Clear");
	
		
		hb.getChildren().addAll(solveButton,clearButton);
		
		return hb;
		
	}

	public Parent getRoot() {
		return root;
	}
	
	

//	private TextField[] addTextField() {
//
//		TextField[] tf = new TextField[81];
//		for (int i = 0; i < 81; i++) {
//			tf[i] = new TextField("0");
//		}
//		return tf;

	}
