import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Square h6 = new Square("h6");
        Square d3 = new Square('d', '3');
        Square newSq = new Square("d3");
        assert newSq.equals(d3);
        assert !newSq.equals(h6);

        Piece king = new King(Color.BLACK);
        assert king.algebraicName().equals("K");
        assert king.fenName().equals("k");
        Square[] kingSquares = king.movesFrom(new Square("a5"));
        System.out.printf("Black King: %s%n", Arrays.toString(kingSquares));

        Piece wPawn = new Pawn(Color.WHITE);
        assert wPawn.algebraicName().equals("");
        assert wPawn.fenName().equals("P");
        Square[] wPawnSquares = wPawn.movesFrom(new Square("a7"));
        System.out.printf("White Pawn: %s%n", Arrays.toString(wPawnSquares));

        Piece bPawn = new Pawn(Color.BLACK);
        assert bPawn.algebraicName().equals("");
        assert !bPawn.fenName().equals("P");
        Square[] bPawnSquares = bPawn.movesFrom(new Square("h7"));
        System.out.printf("Black Pawn: %s%n", Arrays.toString(bPawnSquares));

        Piece knight = new Knight(Color.WHITE);
        assert knight.algebraicName().equals("N");
        assert !knight.fenName().equals("n");
        Square[] knightSquares = knight.movesFrom(new Square("g1"));
        System.out.printf("White Knight: %s%n", Arrays.toString(knightSquares));

        Piece rook = new Rook(Color.BLACK);
        assert rook.algebraicName().equals("R");
        assert rook.fenName().equals("r");
        Square[] rookSquares = rook.movesFrom(new Square("a8"));
        System.out.printf("Black Rook: %s%n", Arrays.toString(rookSquares));

        System.out.println();
    }
}