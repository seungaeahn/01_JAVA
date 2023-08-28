/*
����������(public, protected, private, default)
	public: ��� ������ ���� ����
	protected: ���� ��Ű�� �ȿ��� ���� + ��� Ŭ���������� ���� ����
	private: Ŭ���� �������� ���� ����
	default: ���� ��Ű�� �ȿ��� ����

	public�� ���� ����: main�� ���α׷����� �⺻�̱� ������ public�� ����Ѵ�.
	��� Ŭ�������� ���� ������ �޼ҵ����� �����ϰ� �����ϴ� ��.
	�޼ҵ�(method) � Ư�� �۾��� �����ϱ� ���� ���ɹ��� ����

	static / heap :������ �޼ҵ带 �޸𸮿� �Ҵ��Ҷ�, ����Ǵ� ����
		static: ���α׷��� ����� �� �����. GC(Garbage Collector)�� �������� ���� 
		heap: �޼ҵ忡�� ����� �� �����. GC(Garbage Collector)�� ���� ����
		main���� static�� ����ϴ� ������ ���α׷��� �⺻�� �Ǿ���ϴ� �Լ��� �����Ǹ� �ȵǱ� ������ static������ �޸� �Ҵ��� �����ִ� ��
	void: ��ȯ�� ���ٴ� �ǹ� (return�� ����). ������ ������ ���� �ܰ谡 ���� ���α׷� ��ü�� ����ǹǷ�, return�� ���� �� ����
	main: �ڹٰ� �����ϴ� ���� ��Ģ class�� ������ ��Ÿ��
	
	String[] args: 
		String���ڿ�, [] �迭�� ���ϰ�, args��� �̸��� ���ڿ� �迭�� ����Ѵ�.
		���� �Լ����� String[] args ������ �� ���� ������ ���α׷��� ���۵Ǵ� 
**/
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("helloworld");
		System.out.println("�ݰ����ϴ�");
		System.out.println("����"); 
		
		System.out.print("�ٹٲ� ���� ����Ʈ!");
		System.out.print("��¥�� ���� �ȹٲߴϴ�.");
	}
}