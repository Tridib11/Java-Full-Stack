package Testing;

public class Remove_duplicates {
    static int removeDuplicates(int[] arr){
        int rightPointer=0;
        for(int i=1;i<arr.length;i++){
            if(arr[rightPointer]!=arr[i]){
                rightPointer++;
                arr[rightPointer]=arr[i];
            }

        }
        return rightPointer+1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,3,6,6};
        System.out.println("Actual Array");
        for(int i:arr){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        int position=removeDuplicates(arr);
        System.out.println("The removed duplication array ");
        for (int i=0;i<position;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Number of unique elements is "+position);


    }
}
