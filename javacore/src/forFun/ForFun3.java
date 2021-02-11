package forFun;

import java.util.Arrays;
import java.util.List;

public class ForFun3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "f", "g");
        for (String str : strings) {
            strings.remove(str);
        }
    }
}
