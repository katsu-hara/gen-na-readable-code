import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DictionaryReader {

	private static final String DATA_PATH = "/Users/katsuhah/project/_temp/20190924_natori/";
	private static final String DIC_DATA_PATH = "data/dictionary-data.txt";

	public DictionaryReader() {
	}

	public void out() {
		// TODO ファイルから辞書を読み取る
		try (InputStream is = new FileInputStream(DATA_PATH + DIC_DATA_PATH);
				InputStreamReader iSReader = new InputStreamReader(is, "UTF-8");
					BufferedReader bReader = new BufferedReader(iSReader) ) {
			String data;
			while ((data = bReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
