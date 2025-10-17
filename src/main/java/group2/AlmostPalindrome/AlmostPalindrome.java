package group2.AlmostPalindrome;

public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        // s = s.toLowerCase(); // make case-insensitive
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Allow one removal
                if (isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1)) {
                    return true;
                }
            }
            left++;
            right--;
        }

        // If it's already a perfect palindrome, then it's not "almost"
        return false;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

}

//koigepealt teha sona mis sisse tuleb case sensitive'iks (toLowerCase)
//siis teha kaks indexit, üks sona algusest ja teine lõpust
//teha while tsükkel, mis jookseb seni, kuni vasak index on väiksem kui parem index
//tsükli sees kontrollida, kas vasaku ja parema indexi tähed on erinevad
//kui on erinevad, siis lubada ühe tähe eemaldamist ja kontrollida, kas sõna on palindroom, kui eemaldada kas vasak või parem täht