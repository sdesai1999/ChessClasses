public class Tester {
    public static void main(String[] args) {
        Piece king = new King(Color.WHITE);
        assert king.algebraicName().equals("K");
        assert !king.fenName().equals("k");
        Square[] attackedSquares = king.movesFrom(new Square("a1"));
        for (int i = 0; i < attackedSquares.length; i++) {
            System.out.print(attackedSquares[i] + " ");
        }
        System.out.println();
        Square h6 = new Square("h6");
        Square d3 = new Square('d', '3');
        Square newSq = new Square("d3");
        assert newSq.equals(d3);
        assert !newSq.equals(h6);
    }
}