package thinkingInJava.learning.exception_.exer4;

public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int divide = divide(i, j);
            System.out.println("结果为 = " + divide);
        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("数据格式不对");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("分母为0");
        } finally {
            System.out.println("programEnd");
        }
    }

    //得抛出才能catch到
    public static int divide(int a, int b) throws BelowZeroException {
        if (a < 0 || b < 0) {
            //手动抛出异常对象
            throw new BelowZeroException("输入负数了");
        }
        return a / b;
    }
}
