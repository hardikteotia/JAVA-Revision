public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";
        switch (role) {
            case "Moderator":
                System.out.println("u'r a mod");
                break;
            case "admin":
                System.out.println("u'r an admin");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
