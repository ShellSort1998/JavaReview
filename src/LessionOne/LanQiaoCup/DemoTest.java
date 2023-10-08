package LessionOne.LanQiaoCup;

/*
 *给了一个单词后，帮助他找到出现最多的字母和这 个字母出现的次数。
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class DemoTest {
    static int count = 0;

    public static void main(String[] args) {
        int maxN = 0;
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        System.out.print("enter word:");
        String input = scan.nextLine();
        char[] temp = input.toCharArray();

        for (char c : temp) {
            for (char value : temp) {
                if (c == value) {
                    count++;
                }
            }
            m.put(c, count);
            count = 0;
        }
        Character flag = null;
        for (Character k : m.keySet()) {
            int v = m.get(k);
            if (v > maxN) {
                maxN = v;
                flag = k;
            }
        }

        System.out.println(m);
        System.out.println(String.format("单词中%c的出现次数最多，为：%d ", flag,maxN));
        scan.close();

    }
}