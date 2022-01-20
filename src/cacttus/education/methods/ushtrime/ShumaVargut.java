package cacttus.education.methods.ushtrime;

public class ShumaVargut {
    public static void main(String[] args) {
        int[] array = {40, 2, 32, 69};
        System.out.printf("SHUMA = %d %n", sumArray(array));
        int minElement = minArrayElement(array);
        System.out.println("MIN = " + minElement);
    }

    private static int minArrayElement(int[] array) {
        //supozojme se elementi i pare eshte me i vogel
        int min = array[0];
        //shko prej elementit te dyte deri ne fund
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) { //nese elementi vijues eshte me i vogel se supozimi
                min = array[i];//atehere u gjet nje element me i vogel
                //ndro supozimin
            }
        }
        //kthe elementin me te vogel qe u gjet
        return min;
    }


    static int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
