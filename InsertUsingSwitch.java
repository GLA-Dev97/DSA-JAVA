import java.util.Scanner;

public class InsertUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int count = 0;
        int choice;

        do {
            System.out.println("\n----- INSERT MENU -----");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at Middle (Index)");
            System.out.println("3. Insert at End");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:  // Beginning insertion
                    if (count == size) {
                        System.out.println("Array is full!");
                        break;
                    }
                    System.out.print("Enter element: ");
                    int eleBeg = sc.nextInt();

                    for (int i = count; i > 0; i--) {
                        arr[i] = arr[i - 1];  // shifting
                    }
                    arr[0] = eleBeg;
                    count++;
                    break;

                case 2:  // Middle using index
                    if (count == size) {
                        System.out.println("Array is full!");
                        break;
                    }
                    System.out.print("Enter element: ");
                    int eleMid = sc.nextInt();

                    System.out.print("Enter index (0 to " + count + "): ");
                    int index = sc.nextInt();

                    if (index < 0 || index > count) {
                        System.out.println("Invalid index!");
                        break;
                    }

                    for (int i = count; i > index; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[index] = eleMid;
                    count++;
                    break;

                case 3:  // End insertion
                    if (count == size) {
                        System.out.println("Array is full!");
                        break;
                    }
                    System.out.print("Enter element: ");
                    int eleEnd = sc.nextInt();
                    arr[count] = eleEnd;
                    count++;
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            // Print array after each operation
            System.out.print("Array elements: ");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        } while (choice != 4);
    }
}
