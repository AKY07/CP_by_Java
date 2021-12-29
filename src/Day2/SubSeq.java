package Day2;

public class SubSeq {

    public static void main(String[] args) {

        String str="abc";

        Subsequnce(str,"");

    }
    public static void Subsequnce(String ques,String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }


        char ch = ques.charAt(0);
        Subsequnce(ques.substring(1), ans);
        Subsequnce(ques.substring(1), ans+ch);


    }

}
