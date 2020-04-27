package CodingBlocks;

import java.util.*;

public class N_queen {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queencombinationbox1(new boolean[n][n], 0, 0, 0, n, "");
		System.out.println();
		System.out.println(count);
	}

	public static void Queencombinationbox1(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			count++;
			System.out.print(ans + " ");
			return;
		}
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return;
		}
		// yes
		if (isitsafe(board, row, col)) {
			board[row][col] = true;
			int r = row + 1;
			int c = col + 1;
			Queencombinationbox1(board, row, col + 1, qpsf + 1, tq, ans + "{" + r + "-" + c + "}" + " ");
			board[row][col] = false;
		}
		Queencombinationbox1(board, row, col + 1, qpsf, tq, ans);

	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
//vertical
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c])
				return false;
			r--;
		}
//		diagonally left

		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r--;
			c--;
		}
//		horizontal
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c])
				return false;
			c--;
		}
//		diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;
			r--;
			c++;
		}
		return true;

	}

}