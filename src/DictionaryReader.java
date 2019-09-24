import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DictionaryReader {

	private static final String DIC_DATA_PATH = "data/dictionary-data.txt";

	public DictionaryReader() {
	}
	
	public void out() {
		// TODO ファイルから辞書を読み取る
		try (InputStream is = new FileInputStream(DIC_DATA_PATH);
				InputStreamReader iSReader = new InputStreamReader(is, "UTF-8")) {
			int data;
			while ((data = iSReader.read()) != -1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
