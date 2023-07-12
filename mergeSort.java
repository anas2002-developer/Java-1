public class mergeSort {
    public static void conquer(int arr[], int L, int mid, int H) {
        int[] merge =new int[6];
        int i=L;
        int j=mid+1;
        int x=L;

        while (i<=mid && j<=H) {
            if (arr[i]<=arr[j]) {
                merge[x]=arr[i];
                x++;
                i++;
            }
            else {
                merge[x]=arr[j];
                x++;
                j++;
            }
        }

        while (i<=mid) {
            merge[x] = arr[i];
            x++;
            i++;
        }
        while (j<=H) {
            merge[x] = arr[j];
            x++;
            j++;
        }
        for(int f=L;f<=H;f++){
            arr[f]=merge[f];
        }

    }
    public static void divide(int arr[], int L, int H){
        if (L<H) {
            int mid = L+(H-L)/2;
            divide(arr, L, mid);
            divide(arr, mid + 1, H);
            conquer(arr, L, mid, H);
        }
    }
    public static void printarr(int arr[]){
        System.out.println("Merge Sort :");
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={8,5,6,2,4,1};
        divide(arr,0,arr.length-1);
        printarr(arr);
    }
}
