import br.com.mariojp.solid.dip.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("DRY_RUN", "true");
        EmailNotifier notifier = new EmailNotifier();
        notifier.welcome(new User("Ana", "ana@example.com"));
        System.out.println("Email enviado (simulado em DRY_RUN).");
    }
}
