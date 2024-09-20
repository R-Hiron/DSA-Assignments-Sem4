package src.Assignment_2_Double_Dimension_Array;

public class DoubleDimensionArrayTest {
    public static void main(String[] args) {

        DoubleDimensionArray dda = new DoubleDimensionArray(3, 3);

        dda.insert(0, 0, 10);
        dda.insert(0, 1, 20);
        dda.insert(0, 2, 30);
        dda.insert(1, 0, 40);
        dda.insert(1, 1, 50);
        dda.insert(1, 2, 60);
        dda.insert(2, 0, 70);
        dda.insert(2, 1, 80);
        dda.insert(2, 2, 90);
        dda.insert(0, 0, 100);
        dda.insert(3, 3, 100);
        dda.traverse();
        dda.search(50);
        dda.search(100);
        dda.delete(1, 1);
        dda.delete(1, 1);
        dda.delete(3, 3);
        dda.traverse();
    }
}
