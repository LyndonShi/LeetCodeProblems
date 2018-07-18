import java.util.Stack;

public class Solution {


    public String reverseString(String s) {


        char[]input=s.toCharArray();
        char temp;
        for(int i=0,j=input.length-1;i<j; i++,j--){
            temp=input[i];
            input[i]=input[j];
            input[j]=temp;

        }
        return new String(input);
    }
}
