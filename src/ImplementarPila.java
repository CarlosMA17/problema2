import java.util.Arrays;

public class ImplementarPila {
    private static int length = 3;
    private static Object data[] = new Object[length];

    public ImplementarPila(Object[] data, int length) {
        this.data = data;
        this.length = length;
    }


    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void insert(Object element, int i) {

        data[i] = element;
        length++;
    }


    public static void push(int num) {
        for (int j = length - 1; j >= length; j--) {
            if (j == 0){
                data[j] = num;
            }
            data[j + 1] = data[j];
            insert(num, j);
        }

    }

    public Object pop(int i){
        Object aux = data[i];

        for (int j = i; j < length - 1; j++) {
            data[j] = data[j + 1];
        }

        length--;
        return aux;

    }

    public static void crear() {
        for (int j = 0; j < length; j++) {
            data[j] = 0;
        }
    }

    public static String impresion() {
        return "ImplementarPila{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
