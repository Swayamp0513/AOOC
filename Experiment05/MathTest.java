import MathOperations.MyMath;

public class MathTest {
    public static void main(String[] args) {
        double num = 5.67;

        System.out.println("Floor: " + MyMath.myFloor(num));
        System.out.println("Ceil: " + MyMath.myCeil(num));
        System.out.println("Round: " + MyMath.myRound(num));
    }
}