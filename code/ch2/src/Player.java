public class Player {

    private int _number;

    public int getNumber() {
        return _number;
    }

    public void guess(){
        _number = (int)( Math.random() * 10);
        System.out.println("I'm guessing " + _number);
    }
}
