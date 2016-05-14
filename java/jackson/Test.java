import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		try {

			br = new BufferedReader(new FileReader(new File("c:\\edu\\listdata.json")));

			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} catch (Exception e) {


		} finally {

			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}


        ObjectMapper mapper = new ObjectMapper();
        DengerousSea info = null;
		try {
			info = mapper.readValue(sb.toString(), DengerousSea.class);
		} catch (IOException e) {

			e.printStackTrace();
		}

        System.out.println(info.result.fishList.get(0).fishNameList.get(0));
        System.out.println(info.result.fishList.get(1).talent.poison);


	}
}