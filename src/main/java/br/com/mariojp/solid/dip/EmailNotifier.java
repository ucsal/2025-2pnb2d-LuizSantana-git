package br.com.mariojp.solid.dip;

public class EmailNotifier {
    private final MailSender sender;

    public EmailNotifier() {
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            this.sender = new NoopMailSender();
        } else {
            this.sender = new SmtpMailSender();
        }
    }

    public void welcome(User user) {
        sender.send(user.email(), "Bem-vindo", "Olá " + user.name());
    }
}
