// Program to execute break in JAVA.
class Break{
    public static void main(String args[]){
        int arr[] = {2, 5, 6, 7, 10};
        for(int i = 0; i <= arr.length; i++){
            System.out.println(arr[i]);
            break;
        }
    }
}

//It will execute only the first element of array because break will exit the loop.