package day02;

public class VariableTest {
	public static void main(String[] args) {
		int data = 10;
        char ch = 'A';
        String msg = "Hello";
        float num = 10.24F;
        double dnum = 10.24;
        
        System.out.println("data�� �� : " + data);
        System.out.println("ch�� �� : " + ch);
        // %.3f : �Ҽ��� �Ʒ��� ���ڸ����� ��� ���� ����
        System.out.printf("num�� �� : %.3f\n", num);
        System.out.println("dnum�� �� : " + dnum);
	}

}