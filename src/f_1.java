class StringUtil{






    public static String reverse(String str){
        String reverseString="";
        for (int i = str.length()-1; i>=0; i--){
            reverseString = reverseString + str.charAt(i);
        }

        return reverseString;
    }
    public static String concat(String str1, String str2){
        return str1 + str2;
    }
    public static String concat(String str1, String str2, String str3){
        return str1 + str2 +str3;
    }
    public static boolean contains(String str ,char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;

    }
    public static boolean contains(String str ,String str2) {
       for (int i = 0; i < str2.length()-str.length(); i++) {
           boolean currentStringisEqual = true;
           for (int j = i; j < i + str.length(); j++) {
               if (str2.charAt(j) != str.charAt(j - 1)) {
                   currentStringisEqual = false;
               }
           }
           if (currentStringisEqual) return true;
       }
        return false;

    }
}
