class freq{
    int count = 0;
    void count(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                count++;
            }
        }
        System.out.println(key+" : "+count);
    }
}
public class Main{
    Public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 10, 20};
        Freq fs =new Freq();
        fs.count(arr,10);
    }
}