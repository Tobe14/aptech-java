public class LogicalOperators {
    static void main() {
        boolean isLogged = true;
        boolean isAdmin = false;
        int security = 3;

        if (isLogged && (isAdmin || security <=2)) {
            System.out.println("You have access");
        }else{
            System.out.println("You've been denied access");
        }
    }
}
