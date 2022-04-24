import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1773 {
    // 1773. Count Items Matching a Rule
    public static void main(String[] args) {
        String[][] items = { { "phone", "blue", "pixel" },
                { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" } };
        List<String> item1 = new ArrayList<String>(Arrays.asList(items[0]));
        List<String> item2 = new ArrayList<String>(Arrays.asList(items[1]));
        List<String> item3 = new ArrayList<String>(Arrays.asList(items[2]));
        List<List<String>> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        String ruleKey = "color";
        String ruleValue = "silver";

        // String ruleKey = "type";
        // String ruleValue = "phone";
        // countMatches(list, ruleKey, ruleValue);
        System.out.println(countMatches(list, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey,
            String ruleValue) {
        int count = 0;
        int idx = 0;
        if (ruleKey == "type") {
            idx = 0;
        } else if (ruleKey == "color") {
            idx = 1;
        } else if (ruleKey == "name") {
            idx = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(idx).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    // public static void countMatches(List<List<String>> items, String ruleKey,
    // String ruleValue) {
    // // int count = 0;
    // int idx = 0;
    // if (ruleKey == "type") {
    // idx = 0;
    // } else if (ruleKey == "color") {
    // idx = 1;
    // } else if (ruleKey == "name") {
    // idx = 2;
    // }

    // for (int i = 0; i < items.size(); i++) {
    // System.out.println(items.get(i).get(idx));
    // System.out.println(ruleValue);
    // }

    // // return count;
    // }
}
