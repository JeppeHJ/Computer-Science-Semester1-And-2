package Materiale.rekursion;

public class MazeSolver {
	private Maze maze;

	public MazeSolver(Maze maze) {
		this.maze = maze;
	}

	// Denne metode forsøger at løse labyrinten ved at bruge rekursion.
	public boolean traverse(int row, int column) {
		boolean done = false;

		if (maze.validPosistion(row, column)) {
			maze.tryPosition(row, column);

			if (row == maze.getRows() - 1 && column == maze.getCols() - 1) {
				done = true; // Hvis slutpositionen nås, er labyrinten blevet løst.
			} else {
				// Rekursive kald til traverse-metoden for at bevæge sig i forskellige retninger.
				done = traverse(row + 1, column); // ned
				if (!done) {
					done = traverse(row, column + 1); // højre
				}
				if (!done) {
					done = traverse(row - 1, column); // op
				}
				if (!done) {
					done = traverse(row, column - 1); // venstre
				}
			}

			if (done) {
				maze.markParth(row, column); // Markér den valgte sti, hvis labyrinten er løst.
			}
		}

		return done;
	}
}
