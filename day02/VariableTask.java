
package day02;

public class VariableTask {
	public static void main(String[] args) {
		
		// -------- ȫ�浿 ���� ���� -------
		// �̸� : ȫ�浿
		// ���� : 10��
		// Ű : 170.24cm
		// ������  : 69.24kg
		// ���� : C
		// ----------------- \O/ -------------
		
		String name = "ȫ�浿";
		int age = 10;
		double height = 170.24;
		float weight = 69.24F;
		char grade = 'C';
		
		
		System.out.println("--------" + name + " ���� ���� -------");
		System.out.printf("�̸� : %s\n", name);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height + "cm");
		System.out.printf("������ : %.2fkg", weight);
		System.out.println("���� : " + grade);
		System.out.println(" ---------------- \\O/ -------------");
	}
}
