
public class TestControl {

	public static void main(String[] args) {
		SudokuSolver ss = new SudokuSolver();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				ss.fillBoard(i, j, 0);
			}
		}
		ss.fillBoard(0, 2, 8);
		ss.fillBoard(0, 5, 9);
		ss.fillBoard(0, 7, 6);
		ss.fillBoard(0, 8, 2);
		ss.fillBoard(1, 8, 5);
		ss.fillBoard(2, 0, 1);
		ss.fillBoard(2, 2, 2);
		ss.fillBoard(2, 3, 5);
		ss.fillBoard(3, 3, 2);
		ss.fillBoard(3, 4, 1);
		ss.fillBoard(3, 7, 9);
		ss.fillBoard(4, 1, 5);
		ss.fillBoard(4, 6, 6);
		ss.fillBoard(5, 0, 6);
		ss.fillBoard(5, 7, 2);
		ss.fillBoard(5, 8, 8);
		ss.fillBoard(6, 0, 4);
		ss.fillBoard(6, 1, 1);
		ss.fillBoard(6, 3, 6);
		ss.fillBoard(6, 5, 8);
		ss.fillBoard(7, 0, 8);
		ss.fillBoard(7, 1, 6);
		ss.fillBoard(7, 4, 3);
		ss.fillBoard(7, 6, 1);
		ss.fillBoard(8, 7, 4);

		// for(int i = 0; i < 9; i++){
		// for(int j = 0; j < 9; j++){
		// System.out.print(ss.valueCheck(i, j) + " ");
		// }
		// System.out.println();
		// }
		//
		// if(ss.controlCheck(0, 0, 0)){
		// System.out.println("success");
		// }
		// else{System.out.println("testfel");}
		//
		// if(ss.solve()){
		// System.out.println("hallu");
		// for(int i = 0; i < 9; i++){
		// for(int j = 0; j < 9; j++){
		// System.out.print(ss.valueCheck(i, j) + " ");
		// }
		// System.out.println();
		// }
		// }else{
		// System.out.println("fel");
		// for(int i = 0; i < 9; i++){
		// for(int j = 0; j < 9; j++){
		// System.out.print(ss.valueCheck(i, j) + " ");
		// }
		// System.out.println();
		// }
		// }
		//
		//
		//
		// }
	}
}
