public class Pepero {
    public int length;
    public String firstBody;
    public String secondBody;
    public String firstTopping;
    public String secondTopping;
    public int stickLength;

    public Pepero
            (int length, String firstBody,String secondBody, String firstTopping, String secondTopping, int stickLength) {
        this.length = length;
        this.firstBody = firstBody;
        this.secondBody = secondBody;
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
        this.stickLength = stickLength;
    }
    public Pepero
            (int length, String firstBody, String firstTopping, int stickLength) {
        this.length = length;
        this.firstBody = firstBody;
        this.firstTopping = firstTopping;
        this.stickLength = stickLength;
    }
}
