import java.nio.charset.Charset;
import java.util.Scanner;

public final class Controller {

    private static Controller controller;

    private Controller() {
    }

    public static Controller getProcessor() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    private final InputProcessor processor = new InputProcessor();

    public void launch() {
        final Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        String input;
        while (true) {
            System.out.println("Введите 4 цифры от 0 до 9 без пробелов (Q для выхода)");
            input = scanner.nextLine();
            if ("q".equalsIgnoreCase(input)) {
                break;
            } else {
                System.out.println(processor.processInput(input));
                System.out.println("------------");
            }
        }
        scanner.close();
    }
}
