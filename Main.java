public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        int[] n = {1,3,5,4};
        Main obj = new Main();
        int k= obj.combinationSum(n);
        System.out.println(k);

    }


    //  public int combinationSum(int[]   num){
//            int total = 0;
//        for(int i=0; i<n.length-2;i++){
//            total= total +n[i];
//            System.out.println(n[i] + ", total" + total);
//            for(int j = i+1; j<n.length-1;j++){
//
//                    total = total + n[i] + n[j] ;
//               // total = total +  n[j] ;
//                System.out.println("from 2nd loop" +n[i]+" + "+  n[j]+ " total" + total);
//
//                for (int k =j+1;k<n.length;k++){
//                    total = total + n[i] + n[j] +n[k];
//                    System.out.println("from 2nd loop" +n[i]+" + "+  n[j]+ "+" + n[k] + "+ " + " total" + total);
//
//                }
//                }
//                }


    public int combinationSum(int[]   num){
        int total = 0;
        for(int i =0;i<=num.length;i++){
            int k = 0;
            // total= total+num[i];
            for(int j=i;j<num.length;j++){
                total = total+k+num[j];
                k = k +num[j];
                System.out.println("i is"  + num[i] + " , j is"  + +num[j] + "current total" + total);

            }

            System.out.println("total is " + total);
        }
        return total ;
    }





}