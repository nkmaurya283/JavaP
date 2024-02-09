package restassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonToPojo {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonObject = "{\r\n" + "  \"name\" : \"Amod\",\r\n" + "  \"age\" : 30\r\n" + "}";

        ObjectMapper objectMapper=new ObjectMapper();
        Person person= objectMapper.readValue(jsonObject,Person.class);
        System.out.println(person.getName()+""+person.getAge());


    }
}
