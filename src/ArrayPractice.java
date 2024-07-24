public class ArrayPractice {
    public static void main(String[] args){
//        int[] arr=new  int[5];
//        arr[0]=0;
//        arr[1]=1;
//        arr[2]=2;
//        arr[3]=3;
//        arr[4]=4;
//        for(int i=0;i<5;i++){
//            System.out.println(arr[i]);
//        }
//        int [] even = new int[5];
//        int [] odd = new int[5];
//        int eveni=0,oddi=0;
//        for(int a:arr){
//            if(a%2==0){
//                even[eveni]=a;
//                eveni++;
//            }else{
//                odd[oddi]=a;
//                oddi++;
//            }
//        }
//        for(int i=0;i<eveni;i++){
//            System.out.println(even[i]);
//        }
//        for(int i=0;i<oddi;i++){
//            System.out.println(odd[i]);
//        }
        int[] first={1,2,3,4,5};
        int[] second={2,4,6};
        int index=0;
        int[] common=new int[Math.max(first.length, second.length)];
        for(int f:first){
            for(int s:second){
                if(f==s){
                    common[index++]=f;
                }

            }
        }
        for(int i=0;i< common.length;i++){
            System.out.println(common[i]);
        }
    }
}
