public abstract class Piece {

    private Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public abstract String algebraicName();

    public abstract String fenName();

    public abstract Square[] movesFrom(Square square);

}