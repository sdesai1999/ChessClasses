import java.util.Arrays;

/**
 * Tests the classes created for hw2
 *
 * @author sdesai88
 * @version 10/11/17
*/
public class Tester {

    /**
     * main method for Tester class
     *
     * @param args : command line arguments
    */
    public static void main(String[] args) {
        Square h6 = new Square("h6");
        Square d3 = new Square('d', '3');
        Square newSq = new Square("d3");
        assert newSq.equals(d3);
        assert !newSq.equals(h6);

        Square a1 = new Square('a', '1');
        Square newA1 = new Square("a1");
        Square b1 = new Square("b1");
        assert !a1.equals(b1);
        assert newA1.equals(a1);

        // CREATING A KING
        Piece king = new King(Color.WHITE);
        assert king.algebraicName().equals("K");
        assert king.fenName().equals("K");
        Square[] kingSquares = king.movesFrom(new Square('a', '5'));
        System.out.printf("Black King: %s%n", Arrays.toString(kingSquares));

        // CREATING A WHITE PAWN
        Piece wPawn = new Pawn(Color.WHITE);
        assert wPawn.algebraicName().equals("");
        assert wPawn.fenName().equals("P");
        Square[] wPawnSquares = wPawn.movesFrom(new Square("e2"));
        System.out.printf("White Pawn: %s%n", Arrays.toString(wPawnSquares));

        // CREATING A BLACK PAWN
        Piece bPawn = new Pawn(Color.BLACK);
        assert bPawn.algebraicName().equals("");
        assert !bPawn.fenName().equals("P");
        Square[] bPawnSquares = bPawn.movesFrom(new Square("h7"));
        System.out.printf("Black Pawn: %s%n", Arrays.toString(bPawnSquares));

        // CREATING A KNIGHT
        Piece knight = new Knight(Color.WHITE);
        assert knight.algebraicName().equals("N");
        assert !knight.fenName().equals("n");
        Square[] knightSquares = knight.movesFrom(new Square("d4"));
        System.out.printf("White Knight: %s%n", Arrays.toString(knightSquares));

        // CREATING A ROOK
        Piece rook = new Rook(Color.BLACK);
        assert rook.algebraicName().equals("R");
        assert rook.fenName().equals("r");
        Square[] rookSquares = rook.movesFrom(new Square("a8"));
        System.out.printf("Black Rook: %s%n", Arrays.toString(rookSquares));

        // CREATING A BISHOP
        Piece bishop = new Bishop(Color.WHITE);
        assert bishop.algebraicName().equals("B");
        assert !bishop.fenName().equals("b");
        Square[] bishopSquares = bishop.movesFrom(new Square('g', '3'));
        System.out.printf("White Bishop: %s%n", Arrays.toString(bishopSquares));

        // CREATING A QUEEN
        Piece queen = new Queen(Color.BLACK);
        assert !queen.algebraicName().equals("q");
        assert queen.fenName().equals("q");
        Square[] queenSquares = queen.movesFrom(new Square('b', '1'));
        System.out.printf("Black Queen: %s%n", Arrays.toString(queenSquares));

        System.out.println();
    }
}
