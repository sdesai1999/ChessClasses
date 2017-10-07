public class Tester {
    public static void main(String[] args) {
        Piece king = new King(Color.BLACK);
        assert king.algebraicName().equals("K");
        assert king.fenName().equals("k");
        Square[] kingSquares = king.movesFrom(new Square("a5"));
        System.out.print("King: ");
        for (int i = 0; i < kingSquares.length; i++) {
            System.out.print(kingSquares[i] + " ");
        }
        System.out.println();
        Square h6 = new Square("h6");
        Square d3 = new Square('d', '3');
        Square newSq = new Square("d3");
        assert newSq.equals(d3);
        assert !newSq.equals(h6);

        Piece wPawn = new Pawn(Color.WHITE);
        assert wPawn.algebraicName().equals("");
        assert wPawn.fenName().equals("P");
        Square[] wPawnSquares = wPawn.movesFrom(new Square("a7"));
        System.out.print("White Pawn: ");
        for (int i = 0; i < wPawnSquares.length; i++) {
            System.out.print(wPawnSquares[i] + " ");
        }
        System.out.println();

        Piece bPawn = new Pawn(Color.BLACK);
        assert bPawn.algebraicName().equals("");
        assert !bPawn.fenName().equals("P");
        Square[] bPawnSquares = bPawn.movesFrom(new Square("h7"));
        System.out.print("Black Pawn: ");
        for (int i = 0; i < bPawnSquares.length; i++) {
            System.out.print(bPawnSquares[i] + " ");
        }
        System.out.println();
    }
}