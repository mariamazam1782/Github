public class TwoSum {
    public void findtarget(){
        int[] num = {5, 2, 8, 1, 7, 4, 6, 3};
        int target = 11;
        for(int i = 0;i< num.length-1;i++){
            for(int j =i+1;j< num.length;j++){
                if(num[i]+num[j]==target){
                    System.out.print(i+" ");
                    System.out.println(j);
                }
            }
        }
    }
}