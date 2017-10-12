/**
 * Represents a square on an 8x8 chessboard.
 *
 * @author sdesai88
 * @version 10/11/17
*/
public class Square {

    private char file;
    private char rank;
    private String name;

    /**
     * Creates a Square with a file and a rank.
     *
     * @param file : the file (column) of the Square
     * @param rank : the rank (row) of the Square
    */
    public Square(char file, char rank) {
        this(new String("" + file + rank));
    }

    /**
     * Creates a Square with a name.
     *
     * @param name : the full name of the Square (file and rank)
    */
    public Square(String name) {
        this.name = name;
        this.file = name.charAt(0);
        this.rank = name.charAt(1);
    }

    /**
     * @return the name of the Square
    */
    @Override
    public String toString() {
        return this.name;
    }

    /**
     * Checks if two Squares are the same; they are the same if their files and
     * ranks are the same.
     *
     * @param other : any Object
     * @return true if the Squares are the same, false otherwise
    */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (!(other instanceof Square)) {
            return false;
        }

        Square newSq = (Square) other;
        if (this.file == newSq.getFile() && this.rank == newSq.getRank()) {
            return true;
        }

        return false;
    }

    /**
     * Checks if the Square is a proper one that can be found on a chessboard.
     * i.e. file is between a-h and rank is between 1-8.
     *
     * @return true if the Square is valid, false otherwise
    */
    public boolean isValidSquare() {
        if (this.name.length() > 2) {
            return false;
        }

        int aFile = this.file - 0;
        int aRank = this.rank - 0;
        // int val of 'a' is 97, int val of 'h' is 104
        // int val of '1' is 49, int val of '8' is 56
        if ((aFile < 97) || (aFile > 104) || (aRank < 49) || (aRank > 56)) {
            return false;
        }

        return true;
    }

    /**
     * @return the file of the Square
    */
    public char getFile() {
        return this.file;
    }

    /**
     * @return the rank of the Square
    */
    public char getRank() {
        return this.rank;
    }
}