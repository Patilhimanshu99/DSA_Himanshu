public class duplicate{
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }

    }
    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
        //logic - no pairs(single) + no. of elements remained after pairing * pairing ways 
    }

    public static void binaryString(int n, String str, int lastPlace){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryString(n-1, str+0, 0);
        if(lastPlace==0){
            binaryString(n-1, str+1, 1);
        }
    }
    public static void main(String[] args) {//question will be asked for no consecutive ones or either zeros
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));
        binaryString(3, "", 0);
    }
}