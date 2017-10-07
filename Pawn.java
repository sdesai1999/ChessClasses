public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color);
    }

    public String algebraicName() {
        return "";
    }

    public String fenName() {
        if (color == Color.WHITE) {
            return "P";
        } else {
            return "p";
        }
    }

    public Square[] movesFrom(Square square) {
        String moveStr = "";
        char currentRank = square.getRank();
        char currentFile = square.getFile();
        int currentRankInt = currentRank - 0;
        int currentFileInt = currentFile - 0;
        char up1Rank = (char) (currentRankInt + 1);
        char up2Ranks = (char) (currentRankInt + 2);
        char down1Rank = (char) (currentRankInt - 1);
        char down2Ranks = (char) (currentRankInt - 2);
        String move1 = "", move2 = "";

        if (color == Color.WHITE) {
            move1 = "" + currentFile + up1Rank;
            if ((new Square(move1)).isValidSquare()) {
                moveStr = moveStr + move1 + " ";
            } else {
                Square[] toReturn = new Square[0];
                return toReturn;
            }

            if (currentRank == '2') {
                move2 = "" + currentFile + up2Ranks;
                moveStr = moveStr + move2 + " ";
            }
        } else {
            move1 = "" + currentFile + down1Rank;
            if ((new Square(move1)).isValidSquare()) {
                moveStr = moveStr + move1 + " ";
            } else {
                Square[] toReturn = new Square[0];
                return toReturn;
            }

            if (currentRank == '7') {
                move2 = "" + currentFile + down2Ranks;
                moveStr = moveStr + move2 + " ";
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





