public class Queen extends Piece {

    public Queen(Color color) {
        super(color);
    }

    public String algebraicName() {
        return "Q";
    }

    public String fenName() {
        if (super.getColor() == Color.WHITE) {
            return "Q";
        } else {
            return "q";
        }
    }

    public Square[] movesFrom(Square square) {
        String moveStr = "";
        char pieceRank = square.getRank();
        char pieceFile = square.getFile();

        // horizontal
        char fileToAdd = ' ';
        for (int i = 0; i < 8; i++) {
            fileToAdd = (char) (97 + i);
            if (fileToAdd != pieceFile) {
                moveStr = moveStr + fileToAdd + pieceRank + " ";
            }
        }

        // vertical
        char rankToAdd = ' ';
        for (int i = 0; i < 8; i++) {
            rankToAdd = (char) (49 + i);
            if (rankToAdd != pieceRank) {
                moveStr = moveStr + pieceFile + rankToAdd + " ";
            }
        }

        final int rankInt = pieceRank - 0;
        final int fileInt = pieceFile - 0;

        // down left diagonal
        int rankPointer = rankInt - 1;
        int filePointer = fileInt - 1;
        while ((rankPointer >= 49) && (filePointer >= 97)) {
            rankToAdd = (char) (rankPointer);
            fileToAdd = (char) (filePointer);
            moveStr = moveStr + fileToAdd + rankToAdd + " ";
            rankPointer--;
            filePointer--;
        }

        // up right diagonal
        rankPointer = rankInt + 1;
        filePointer = fileInt + 1;
        while ((rankPointer <= 56) && (filePointer <= 104)) {
            rankToAdd = (char) (rankPointer);
            fileToAdd = (char) (filePointer);
            moveStr = moveStr + fileToAdd + rankToAdd + " ";
            rankPointer++;
            filePointer++;
        }

        // up left diagonal
        rankPointer = rankInt + 1;
        filePointer = fileInt - 1;
        while ((rankPointer <= 56) && (filePointer >= 97)) {
            rankToAdd = (char) (rankPointer);
            fileToAdd = (char) (filePointer);
            moveStr = moveStr + fileToAdd + rankToAdd + " ";
            rankPointer++;
            filePointer--;
        }

        // down right diagonal
        rankPointer = rankInt - 1;
        filePointer = fileInt + 1;
        while ((rankPointer >= 49) && (filePointer <= 104)) {
            rankToAdd = (char) (rankPointer);
            fileToAdd = (char) (filePointer);
            moveStr = moveStr + fileToAdd + rankToAdd + " ";
            rankPointer--;
            filePointer++;
        }

        String[] possibleMoves = moveStr.split("\\s+");
        Square[] squareArr = new Square[possibleMoves.length];
        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square(possibleMoves[i]);
        }

        return squareArr;
    }
}