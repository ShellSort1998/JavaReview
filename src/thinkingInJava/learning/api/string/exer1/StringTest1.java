package thinkingInJava.learning.api.string.exer1;

public class StringTest1 {
    String str = "good";
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest1 st = new StringTest1();

        st.change(st.str, st.ch);

        System.out.println(st.str); //good
        System.out.println(st.ch);  //best
    }
}
