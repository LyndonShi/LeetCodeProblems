public class Solution {
    public String toGoatLatin(String S) {

        String[] temp = S.split(" ");
        String As = "";
        String result ="";
        for (int i = 0; i < temp.length; i++) {

            As = As + "a";
            switch (temp[i].charAt(0)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    break;
                default:
                    temp[i] = temp[i] + temp[i].charAt(0);
                    temp[i] = temp[i].substring(1);
                    break;
            }
            temp[i] = temp[i] + "ma"+As;

            result=result+temp[i]+" ";

        }
        return result.substring(0,result.length()-2);
    }
}
