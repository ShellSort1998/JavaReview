package thinkingInJava.learning.exception_.exer4;

public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int divide = divide(i, j);
            System.out.println("���Ϊ = " + divide);
        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("���ݸ�ʽ����");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ȱ�������в���");
        } catch (ArithmeticException e) {
            System.out.println("��ĸΪ0");
        } finally {
            System.out.println("programEnd");
        }
    }

    //���׳�����catch��
    public static int divide(int a, int b) throws BelowZeroException {
        if (a < 0 || b < 0) {
            //�ֶ��׳��쳣����
            throw new BelowZeroException("���븺����");
        }
        return a / b;
    }
}
