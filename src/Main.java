import com.Zoo.Controller.ZooController;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static ZooController init(){
        return new ZooController();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        ZooController zooController = init();

        int option = 0;

        do {
            System.out.println("Choose an option: ");

            System.out.println("1. Create an animal: ");
            System.out.println("2. Read the animal list: ");
            System.out.println("3. Update an animal: ");
            System.out.println("4. Delete an animal: ");
            System.out.println("5. Exit: ");

            option = scanner.nextInt();


            switch (option){
                case 1:
                    zooController.create();
                    break;
                case 2:
                    zooController.readZooArrayList();
                    break;
                case 3:
                    zooController.update();
                    break;
                case 4:
                    zooController.delete();
                    break;
                case 5:
                    System.out.print("Goodbye!!...");
                    option = 0;
                    break;
                default:
                    System.out.println("Choose a correct option");
                    break;
            }
        }while (option != 0);
    }
}