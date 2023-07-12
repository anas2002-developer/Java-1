public class insertionSort{
    public static void printarr(int arr[]){
        System.out.println("Insertion Sort :");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,1,8,3,4,2};
        for (int i=1;i<arr.length;i++) {
            int current = arr[i];       //1st index to last index
            int j=i-1;                  //sorted array storing 0th element = 3
            while(j>=0 && current<arr[j]) {
                arr[j + 1] = arr[j];

                j = j - 1;
            }
            arr[j+1]=current;
        }
        printarr(arr);
    }
}

