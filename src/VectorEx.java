import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<Integer>(); 

		v.add(5); // 5 ����
		v.add(4); // 4 ����
		v.add(-1); // -1 ����
		
		// ���� �߰��� �����ϱ�
		v.add(2, 100); // 4�� -1 ���̿� ���� 100 ����

		System.out.println("���� ���� ��� ��ü �� : " + v.size()); 
		System.out.println("������ ���� �뷮 : " + v.capacity()); 
		
		// ��� ��� ���� ����ϱ�
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}		
	}
}