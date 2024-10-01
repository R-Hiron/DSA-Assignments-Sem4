package src.Assignment_4_Delete_Method_Single;

public class MainApp {
    public static void main(String[] args) {
        LinkedList sda = new LinkedList();
        sda.insertInLinkedList(1, 0);
        sda.insertInLinkedList(2, 1);
        sda.insertInLinkedList(3, 2);
        sda.insertInLinkedList(4, 3);
        sda.insertInLinkedList(5, 4);
        sda.insertInLinkedList(6, 5);

        System.out.println("Original List:");
        sda.traverseLinkedList();

        // Deleting from the beginning
        sda.deleteNode(0);
        System.out.println("After deleting at the beginning:");
        sda.traverseLinkedList();

        // Deleting from the end
        sda.deleteNode(sda.size - 1);
        System.out.println("After deleting at the end:");
        sda.traverseLinkedList();

        // Deleting from anywhere in the list
        sda.deleteNode(2);
        System.out.println("After deleting at location 2:");
        sda.traverseLinkedList();

        // Attempting to delete at invalid location
        sda.deleteNode(10);

        // Deleting the entire list
        sda.deleteLinkedList();
        sda.traverseLinkedList();
    }
}

