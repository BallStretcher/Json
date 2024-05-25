import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        data somesome = new data();
        anotherdata lmao = new anotherdata();
        somesome.setArray(somesome.getArray());
        lmao.setNum(5);
        lmao.setWord("success");
        somesome.setLmao(lmao);


        String jsonina = mapper.writeValueAsString(somesome);
        System.out.println(jsonina);
        data newData = mapper.readValue(jsonina,data.class);
        String jsonina2 = mapper.writeValueAsString(newData);
        System.out.println(jsonina2);

    }
}
