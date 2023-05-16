import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RownanieKwadratowe> Delty = new ArrayList<>();

        Delty.add(new RownanieKwadratowe(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
        Delty.add(new RownanieKwadratowe(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
        Delty.add(new RownanieKwadratowe(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
        Delty.add(new RownanieKwadratowe(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));

        System.out.println(Delty.get(0).delta());
        System.out.println(Delty.get(1).delta());
        System.out.println(Delty.get(2).delta());
        System.out.println(Delty.get(3).delta());

    }
}