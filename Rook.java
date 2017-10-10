public class Rook extends Piece {

    public Rook(Color color) {
        super(color);
    }

    public String algebraicName() {
        return "R";
    }

    public String fenName() {
        if (super.getColor() == Color.WHITE) {
            return "R";
        } else {
            return "r";
        }
    }

    public Square[] movesFrom(Square square) {
        String moveStr = "";
        char pieceRank = square.getRank();
        char pieceFile = square.getFile();

        char fileToAdd = ' ';
        for (int i = 0; i < 8; i++) {
            fileToAdd = (char) (97 + i);
            if (fileToAdd != pieceFile) {
                moveStr = moveStr + fileToAdd + pieceRank + " ";
            }
        }

        char rankToAdd = ' ';
        for (int i = 0; i < 8; i++) {
            rankToAdd = (char) (49 + i);
            if (rankToAdd != pieceRank) {
                moveStr = moveStr + pieceFile + rankToAdd + " ";
            }
        }

        String[] possibleMoves = moveStr.split("\\s+");
        Square[] squareArr = new Square[possibleMoves.length];
        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square(possibleMoves[i]);
        }

        return squareArr;
    }
}