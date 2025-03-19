public class LongestCommonPrefix{
    public static void main(String[] args) {
        String[] names = {"flower", "flow", "flight"};
        
        if (names == null || names.length == 0) {
            System.out.println("");
            return;
        }
        
        String prefix = names[0];
        
        for (int i = 1; i < names.length; i++) {
            while (names[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }
        
        System.out.println(prefix);
    }
}