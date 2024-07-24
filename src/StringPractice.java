public class StringPractice {
    String reverse(String r){
        String rev="";
        for(int i=r.length()-1;i>=0;i--){
            rev+=r.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        String one="helo";
        String two="hello world";
        one="heloo";

        String senetencerev="";
        System.out.println(one);
        System.out.println(two);
        StringPractice obj1=new StringPractice();
        String initial="";
        String[] arr=two.split(" ");
        for(int i=0;i<arr.length;i++) {

            senetencerev += obj1.reverse(arr[i]) + " ";


        }
//        for(int i=0;i<two.length();i++){
//            if(two.charAt(i)==' '){
//                senetencerev+=obj1.reverse(initial)+" ";
//                initial="";
//            }else {
//                initial+=two.charAt(i);
//            }
//
//        }
        System.out.println(senetencerev);
    }
}
