class Solution {
    public boolean isPalindrome(final String potentialPalindrome) {
        final String strippedString = potentialPalindrome.replaceAll("[^A-Za-z0-9]","")
                                                         .toLowerCase();

        if (strippedString.isEmpty())
            return false;

        return isPalindrome(strippedString, strippedString.length(), 0);
    }

    private boolean isPalindrome(final String potentialPalindrome,
                                 final int totalLength,
                                 int index) {
        

        if (index == (totalLength / 2))
            return true;


        final boolean equals = potentialPalindrome.charAt(index) == potentialPalindrome.charAt(totalLength - index - 1);

        if (equals)
            return isPalindrome(potentialPalindrome, totalLength, index += 1);
        
        return false;
    }
}
