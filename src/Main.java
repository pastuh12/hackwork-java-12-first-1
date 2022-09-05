import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Logger.input();
        try {
            Numeral numeral = new Numeral(in.nextInt());
            Zukerman zukerman = new Zukerman(numeral.splitToDigits());
            zukerman.isVerify();
        }
        catch (Exception e) {
            Logger.error(e);
        }

    }
}