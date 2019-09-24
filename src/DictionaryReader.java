import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DictionaryReader {


	private final String DIC_DATA_PATH;

	public DictionaryReader(String dataPath) {
		this.DIC_DATA_PATH = dataPath;
	}

	public void out() {
		try (InputStream is = new FileInputStream(DIC_DATA_PATH);
				InputStreamReader iSReader = new InputStreamReader(is, "UTF-8");
				BufferedReader bReader = new BufferedReader(iSReader)) {
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
