package utilities;

import java.io.File;
import java.util.*;

import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    @DataProvider(name="jsonData")
    public Object[][] getJsonData() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        List<Map<String,String>> data =
                mapper.readValue(
                        new File("src/test/resources/LoginData.json"),
                        new TypeReference<List<Map<String,String>>>(){});

        Object[][] testData =
                new Object[data.size()][2];

        for(int i=0;i<data.size();i++) {

            testData[i][0]=data.get(i).get("username");
            testData[i][1]=data.get(i).get("password");
        }

        return testData;
    }
}
