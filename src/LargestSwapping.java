 class LargestSwapping {
    static void swapping(int arr[]){
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("FINAL RESULT AFTER SWAPPING LARGEST TO SMALLEST NUMBER IS : ");
        int ans =0;
        ans = arr[0];
        arr[0] = arr[arr.length -1];
        arr[arr.length - 1] = ans;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
