import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class LC989 {
    public static void main(String[] args) {
        // 989. Add to Array-Form of Integer
        // int[] num = { 2, 1, 5 };
        // int k = 806;
        int[] num = { 2, 7, 4 };
        int k = 181;
        List<Integer> list = addToArrayForm(num, k);
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<Integer>();

        int number = 0;
        int count = 0;

        while (count < num.length) {
            number += num[num.length - (count + 1)] * Math.pow(10, count);
            count++;
        }

        int finalNum = number + k;
        int temp = finalNum;

        while (temp != 0) {
            list.add(temp % 10);
            temp /= 10;
        }

        Collections.reverse(list);

        return list;
    }

    // ============== Alternate Solution =================
    // long number = 0;
    // int idx = 0;

    // while (idx < num.length) {
    // number = number * 10 + num[idx];
    // idx++;
    // }

    // long newNum = number + k;
    // long finalNum = number + k;

    // if (number == 0) {
    // finalNum = newNum = 0;
    // }
    // // counting digits in new num(num + k)
    // // int newIdx = 0;
    // int count = 0;

    // while (newNum != 0) {
    // newNum /= 10;
    // count++;
    // }

    // int[] outputArr = new int[count];
    // int newIdx = count - 1;

    // while (newIdx >= 0) {
    // long rem = finalNum % 10;
    // int newRem = (int) rem;
    // outputArr[newIdx] = newRem;
    // finalNum /= 10;
    // newIdx--;
    // }

    // List<Integer> intList = new ArrayList<Integer>(outputArr.length);
    // for (int i : outputArr)
    // {
    // intList.add(i);
    // }

    // return intList;
}
