public class San {
	
	public static final String MARK = "*";
	public static final String SPACE = " ";
	public static final String PROMPT_MESSAGE = "please input number>";
	
	
	public static void main(String[] args) {
		//���l�̓���
	    System.out.print(PROMPT_MESSAGE);
		int number = new java.util.Scanner(System.in).nextInt();
		
		//�����l�̐ݒ�
	  	int pX = 0;  // �E��������̃��C��
	  	int pY = number - 1; //�E���オ��̃��C��
	  	
		String ans[] = new String[number]; //1�s���̃f�[�^�m��
	  	
		//���͐������[�v�@X��`��
	  	for (int i = 0; i < number; i++) {
	  		//�S�Ă��X�y�[�X�̂P�s���쐬
	  		for (int j = 0; j < number; j++) {
	  		  ans[j] = SPACE;
	  		}
	  		//�Q�ӏ��i�ꍇ�ɂ���Ă͂P�ӏ��j��"*"�ɏ���������
	  		ans[pX] = MARK; //�E�������胉�C��
	  		ans[pY] = MARK; //�E���オ�胉�C��

	  		//�P�s���\��
	  		for (int j = 0; j < number; j++) {
	  		  System.out.print(ans[j]);
	  		}
	  		System.out.println(""); //���s
	  		
	  		pX++; //�C���N�������g
	  		pY--; //�f�N�������g
	  	}
	}
}