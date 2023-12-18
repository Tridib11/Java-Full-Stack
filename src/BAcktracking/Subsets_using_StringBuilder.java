package BAcktracking;
public class Subsets_using_StringBuilder {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, new StringBuilder(), 0);
    }
    static void findSubsets(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // yes

        findSubsets(str, ans.append(str.charAt(i)), i + 1);
        ans.deleteCharAt(ans.length() - 1); // backtrack

        // no
        findSubsets(str, ans, i + 1);
    }

}
