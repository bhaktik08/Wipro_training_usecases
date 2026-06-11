package utilities;

import java.io.*;
import java.util.*;

import org.testng.annotations.DataProvider;

public class CsvUtil {

    @DataProvider(name="csvData")
    public Object[][] getCSVData() throws Exception {

        List<Object[]> data = new ArrayList<>();

        BufferedReader br =
                new BufferedReader(
                        new FileReader(
                                "src/test/resources/LoginData.csv"));

        String line;

        br.readLine();

        while((line=br.readLine())!=null) {

            String[] value=line.split(",");

            data.add(new Object[] {
                    value[0],
                    value[1]
            });
        }

        br.close();

        return data.toArray(new Object[0][]);
    }
}
