
public class SudokuSolver {
	private int[][] sudokuBoard;
	private final static int SIZE = 9;

	public SudokuSolver() {
		sudokuBoard = new int[SIZE][SIZE];
	}

	public boolean fillBoard(int r, int c, int nbr) {
		sudokuBoard[r][c] = nbr;
		return true;
	}

	public int valueCheck(int r, int c) {
		return sudokuBoard[r][c];
	}

	public boolean solve() {
		return solve(0, 0);
	}

	private boolean solve(int r, int k) {
		System.out.println("kolumn " + k + "\n rad " + r);
		if (r == 9) {
			System.out.println("löst");
			return true;
		}
		if (k == 9) {
			return solve(r+1, 0);
		}
		if (sudokuBoard[r][k] != 0) {
			return solve(r, k+1);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (controlCheck(r, k, i)) {
					sudokuBoard[r][k] = i;
					if (solve(r, k+1)) {
						return true;
					} else {
						sudokuBoard[r][k] = 0;
					}
				}
			}
		}
		return false;

	}

	/**
	 * 
	 * @param r
	 * @param c
	 * @param nbr
	 * @return
	 */
	public boolean controlCheck(int r, int c, int nbr) {
		return checkColumnRows(r, c, nbr) && checkQuadrant(r, c, nbr);
	}

	/**
	 * kollar kolumner & rader
	 * 
	 * @param r
	 * @param c
	 * @param nbr
	 * @return
	 */
	private boolean checkColumnRows(int r, int c, int nbr) {
		for (int i = 0; i < SIZE; i++) {
				if (sudokuBoard[i][c] == nbr && i != r || sudokuBoard[r][i] == nbr && i !=c) {
					return false;
				}
		}
		return true;
	}

	/**
	 * Det här med att hitta övre höger hörn i varje kvadrant (dividera med 3
	 * och multiplicera med 3). hitta även rätt rad och kolumn.
	 * 
	 * @param r
	 * @param c
	 * @param nbr
	 * @return
	 */
	private boolean checkQuadrant(int r, int c, int nbr) {
		int upperRow = (r / 3) * 3;
		int upperCol = (c / 3) * 3;
		for (int i = upperRow; i < upperRow + 3; i++) {
			for (int j = upperCol; j < upperCol + 3; j++) {
				if (sudokuBoard[i][j] == nbr && i != r && j != c) {
					return false;
				}
			}
		}
		return true;
	}

}
