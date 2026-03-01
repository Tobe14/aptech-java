public class SwitchWork {
    static void main() {
        int choice = 2;
        // 1 = Coffee
        // 2 = Tea
        switch (choice){
            case 2:
                System.out.println("You ordered for Coffee");
                break;
            case 1:
                System.out.println("You ordered for Tea");
                break;
            default:
                System.out.println("Invalid Order");
        }
    }
}
