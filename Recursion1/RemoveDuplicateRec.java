public class RemoveDuplicateRec {
    public static void removeDuplicate(String org, int[] arr, int n, String newStr) {
        if (n == org.length()) {
            System.out.println(newStr);
            return;
        }
        char cur = org.charAt(n);
        if (arr[cur - 'a'] == 0) {
            arr[cur - 'a'] = 1;
            newStr += cur;
        }
        removeDuplicate(org, arr, n + 1, newStr);
    }

    public static void main(String[] args) {
        String org = "abbccdeabcdee";
        int arr[] = new int[26];
        removeDuplicate(org, arr, 0, "");
    }
}