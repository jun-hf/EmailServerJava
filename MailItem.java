public class MailItem {
    
    private String from;
    private String to;
    private String message;

    public MailItem(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public void printMessage() {
        System.out.print(from + " " + to + " " + message);
    }

    public static void main(String[] args) {
        MailItem mail1 = new MailItem("Ali", "Emily", "Hello emily");
        mail1.printMessage();
    }
}
