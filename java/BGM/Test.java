import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class Test {

	public static void main(String[] args) {

		Test t = new Test();
		
		
		for (;;) {
			Thread thread = t.getSound();
			t.play(thread);
		}
		


	}
	
	private void play(Thread thread) {
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

	private Thread getSound() {
		 Thread thread;
		thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					AudioInputStream ais = AudioSystem.getAudioInputStream(new File(
							"c:\\edu\\loop1.wav"));
					// オーディオ入力ストリームからデータを読む
					byte[] data = new byte[ais.available()];
					ais.read(data);
					ais.close();
					// ファイルのフォーマットを調べる
					AudioFormat af = ais.getFormat();
					// 再生する
					DataLine.Info info = new DataLine.Info(SourceDataLine.class, af);
					SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
					line.open(af);
					line.start();
					line.write(data, 0, data.length);
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
				}
				
			}
		});
		return thread;
		
	
	}
}
