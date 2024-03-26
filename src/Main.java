public class Main {
    public static void main(String[] args) {
        double[] numbers = {5.0, 4.4, 2.6, -1.3, -6.5, -7.8, 8.0, -9.9, 5.5, -3.3, 6.8, -1.9, -4.8, 4.1, 2.0};
        boolean negativeNumber = false;
        double average = 0.0;
        int sum = 0;
        int count = 0;

        for (int i1 = 0; i1 < numbers.length; i1++) {



            if (numbers [i1] < 0) {

                for (int i2 = i1 + 1; i2 < numbers.length; i2++) {



                    if (numbers [i2] > 0) {

                        average = average + numbers [i2];


                        count++;

                    }

                }


                break;

            }

        }



        System.out.println("average  " + average);



        System.out.println("count  " + count);



        System.out.println("average/count " + average / count);

    }

}
