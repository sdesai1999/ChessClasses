public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
    }

    public String algebraicName() {
        return "B";
    }

    public String fenName() {
        if (color == Color.WHITE) {
            return "B";
        } else {
            return "b";
        }
    }

    public Square[] movesFrom(Square Square) {
        // STUBBED
        Square[] toReturn = {new Square("a1")};
        return toReturn;
    }
}