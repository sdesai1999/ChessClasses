public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
    }

    public String algebraicName() {
        return "B";
    }

    public String fenName() {
        if (super.getColor() == Color.WHITE) {
            return "B";
        } else {
            return "b";
        }
    }

    public Square[] movesFrom(Square square) {
        String moveStr = "";
        char pieceRank = square.getRank();
        char pieceFile = square.getFile();
        final int rankInt = pieceRank - 0;
        final int fileInt = pieceFile - 0;

        char rankToAdd, fileToAdd;

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