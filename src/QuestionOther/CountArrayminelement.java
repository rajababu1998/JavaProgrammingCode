package QuestionOther;

public class CountArrayminelement {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4,4,4,4};
        int current = arr[0];
        for (int i=1;i<arr.length;i++){
            int count=1;
            if (current==arr[i]){
                count++;
            }
            else {
                current=arr[i];
            }
            System.out.println(count);
        }

    }
}
