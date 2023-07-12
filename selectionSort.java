public class selectionSort{
    public static void printarr(int arr[]){
        System.out.println("Selection Sort :");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={32,51,27,85,66,23,13,57};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){          //arr[smallest]<arr[j] for descending
                    smallest=j;
                }
            }
            arr[smallest]=arr[smallest]+arr[i];
            arr[i]=arr[smallest]-arr[i];
            arr[smallest]=arr[smallest]-arr[i];
        }
        printarr(arr);
    }
}
