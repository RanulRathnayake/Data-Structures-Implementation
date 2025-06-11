import java.util.Scanner;

public class ArrayImp {

    public static void main(String[] arg){
        int[] arr = new int[10];
        int size = 5;

        createArray(arr, size);

        addElement(arr, size);

        deleteElement(arr, size);

        searchElement(arr, size);

        updateElement(arr, size);
    }

    public static void showArray(int[] arr, int size) {
        System.out.println("Output of Array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void createArray(int[] arr, int size){
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter data");
        for (int j=0; j<size; j++){
            arr[j]=userIn.nextInt();
        }
        showArray(arr, size);
    }
    public static void addElement(int[] arr, int size){
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the index where you want to add");
        int ind = userIn.nextInt();

        System.out.println("Enter the element that you want to add");
        int ele = userIn.nextInt();

        //size = ((ind == null && ele == null)? size : size+1);
        size++;
        for (int k=size; k>ind ;k--){
            arr[k]=arr[k-1];
        }
        arr[ind]=ele;

        showArray(arr, size);
    }

    public static void deleteElement(int[] arr, int size){
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the element index that you want to delete");
        int ind = userIn.nextInt();

        for (int k=ind; k<size ;k++){
            arr[k]=arr[k+1];
        }

        showArray(arr, size);
    }

    public static void searchElement(int[] arr, int size){
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the element that you want to search");
        int data = userIn.nextInt();

        for (int k=0; k<size; k++){
            if(arr[k] == data){
                System.out.println(k+" is the index of the "+data+" that you entered");
                break;
            }else {
                if(k==size-1){
                    System.out.println("There is no index for "+data+" that you entered");
                }
            }
        }
    }

    public static void updateElement(int[] arr, int size){
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the element index that you want to update");
        int ind = userIn.nextInt();

        System.out.println("Enter the element that you want to update");
        int ele = userIn.nextInt();

        arr[ind-1] = ele;

        showArray(arr, size);
    }

}
