public class King extends Piece {

    public King(Color color) {
        super(color);
    }

    public String algebraicName() {
        return "K";
    }

    public String fenName() {
        if (color == Color.WHITE) {
            return "K";
        } else {
            return "k";
        }
    }

    public Square[] movesFrom(Square square) {
        String moveStr = "";
        char currentRank = square.getRank();
        char currentFile = square.getFile();
        int currentRankInt = currentRank - 0;
        int currentFileInt = currentFile - 0;
        char upRank = (char) (currentRankInt + 1);
        char downRank = (char) (currentRankInt - 1);
        char leftFile = (char) (currentFileInt - 1);
        char rightFile = (char) (currentFileInt + 1);
        if (currentFile != 'a') {
            moveStr = moveStr + leftFile + currentRank + " ";
            if (currentRank != '8') {
                moveStr = moveStr + leftFile + upRank + " ";
            }

            if (currentRank != '1') {
                moveStr = moveStr + leftFile + downRank + " ";
            }
        }

        if (currentRank != '8') {
            moveStr  = moveStr +  currentFile + upRank + " ";
        }

        if (currentRank != '1') {
            moveStr = moveStr + currentFile + downRank + " ";
        }

        if (currentFile != 'h') {
            moveStr = moveStr + rightFile + currentRank + " ";
            if (currentRank != '8') {
                moveStr = moveStr + rightFile + upRank + " ";
            }

            if (currentRank != '1') {
                moveStr = moveStr + rightFile + downRank + " ";
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





















