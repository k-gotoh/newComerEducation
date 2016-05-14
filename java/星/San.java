public class San {
	
	public static final String MARK = "*";
	public static final String SPACE = " ";
	public static final String PROMPT_MESSAGE = "please input number>";
	
	
	public static void main(String[] args) {
		//数値の入力
	    System.out.print(PROMPT_MESSAGE);
		int number = new java.util.Scanner(System.in).nextInt();
		
		//初期値の設定
	  	int pX = 0;  // 右肩下がりのライン
	  	int pY = number - 1; //右肩上がりのライン
	  	
		String ans[] = new String[number]; //1行分のデータ確保
	  	
		//入力数分ループ　Xを描く
	  	for (int i = 0; i < number; i++) {
	  		//全てがスペースの１行を作成
	  		for (int j = 0; j < number; j++) {
	  		  ans[j] = SPACE;
	  		}
	  		//２箇所（場合によっては１箇所）を"*"に書き換える
	  		ans[pX] = MARK; //右肩下がりライン
	  		ans[pY] = MARK; //右肩上がりライン

	  		//１行分表示
	  		for (int j = 0; j < number; j++) {
	  		  System.out.print(ans[j]);
	  		}
	  		System.out.println(""); //改行
	  		
	  		pX++; //インクリメント
	  		pY--; //デクリメント
	  	}
	}
}