public class Square {

    private char file;
    private char rank;
    private String name;

    public Square(char file, char rank) {
        this.file = file;
        this.rank = rank;
        this.name = "" + this.file + this.rank;
    }

    public Square(String name) {
        this(name.charAt(0), name.charAt(1));
    }

    public String toString() {
        return this.name;
    }

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

    public char getFile() {
        return this.file;
    }

    public char getRank() {
        return this.rank;
    }

}