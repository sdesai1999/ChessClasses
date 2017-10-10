public class Knight extends Piece {

    public Knight(Color color) {
        super(color);
    }

    public String algebraicName() {
        return "N";
    }

    public String fenName() {
        if (super.getColor() == Color.WHITE) {
            return "N";
        } else {
            return "n";
        }
    }

    public Square[] movesFrom(Square square) {
        String moveStr = "";
        char currentRank = square.getRank();
        char currentFile = square.getFile();
        int currentRankInt = currentRank - 0;
        int currentFileInt = currentFile - 0;
        char up1Rank = (char) (currentRankInt + 1);
        char down1Rank = (char) (currentRankInt - 1);
        char left1File = (char) (currentFileInt - 1);
        char right1File = (char) (currentFileInt + 1);
        char up2Rank = (char) (currentRankInt + 2);
        char down2Rank = (char) (currentRankInt - 2);
        char left2File = (char) (currentFileInt - 2);
        char right2File = (char) (currentFileInt + 2);

        String move1 = "" + left2File + up1Rank;
        String move2 = "" + left2File + down1Rank;
        String move3 = "" + left1File + up2Rank;
        String move4 = "" + left1File + down2Rank;
        String move5 = "" + right1File + up2Rank;
        String move6 = "" + right1File + down2Rank;
        String move7 = "" + right2File + up1Rank;
        String move8 = "" + right2File + down1Rank;

        String[] tmpMovesArr = {move1, move2, move3, move4, move5, move6, move7,
                                move8};

        for (int i = 0; i < tmpMovesArr.length; i++) {
            if ((new Square(tmpMovesArr[i])).isValidSquare()) {
                moveStr = moveStr + tmpMovesArr[i] + " ";
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