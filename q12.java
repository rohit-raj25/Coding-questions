import java.util.Scanner;

public class q12 {
    private int tableSize;
    private Integer[] table;
    private int keysize;
    Scanner sc = new Scanner(System.in);

    public q12(int size) {
        this.tableSize = size;
        this.table = new Integer[tableSize];
        System.out.print("Enter the number of keys to add: ");
        keysize = sc.nextInt();
        for (int i = 0; i < keysize; i++) {
            add(sc.nextInt());
        }
    }

    public void add(Integer key) {
        int tableIndex = key % tableSize;
        int i = tableIndex;
        do {
            if (table[i] == null) {
                table[i] = key;
                return;
            }
            i = (i + 1) % tableSize;
        } while (i != tableIndex);
    }

    public void display() {
        for (int i = 0; i < tableSize; i++) {
            if (table[i] != null) {
                System.out.print(table[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        q12 LPHT = new q12(5);
        LPHT.display();
    }
}
