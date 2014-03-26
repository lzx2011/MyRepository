
/**
 * 输入字符串a + b 计算结果
 * @author Administrator
 *
 */
public class StringCompute {
    public static int ope(String str){
        int result = 0;
        String[] strs = str.split(" ");
        if (strs.length==3) {
            try {
                int number1 = Integer.valueOf(strs[0]);
                int number2 = Integer.valueOf(strs[2]);
                if (number1>0 && number1<100 && number2>0 && number2<100 ) {
                    if (strs[1].equals("+")) {
                        result = number1+number2;
                    }else if (strs[1].equals("-")){
                        result=number1-number2;
                    }
                }
            } catch (Exception e) {
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String string = "12 + 12";
        int result = ope(string);
        System.out.println(result);
        string = "1 ++ 12";
        result = ope(string);
        System.out.println(result);
    }
}
