public class ArrayPatikaOdev{
    public static void main(String[] args) {
        double[] liste = {1, 2, 3, 4, 5, 6, 7};

        double sum = 0.0;
        for (int i = 0; i < liste.length; i++) {
            sum = sum + (1/liste[i]);
        }

        double average = liste.length / sum;

        System.out.println("Harmonik Ortalama: " + average);
    }
    }


