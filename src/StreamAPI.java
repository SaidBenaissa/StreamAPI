import java.util.stream.IntStream;

public class StreamAPI {
    public static void main(String[] args) {
        int[] arr = {11, 22, 3, 34, 56};

//        int min = IntStream.of(arr).min().getAsInt();
//        System.out.println(min);

           IntStream.of(arr)
                    .min()
                    .ifPresent(System.out::print); // or .ifPresent(min -> System.out.println(min));


//        int min = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(min);

    }
}
