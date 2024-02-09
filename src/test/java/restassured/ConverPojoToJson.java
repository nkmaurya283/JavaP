package restassured;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ConverPojoToJson {

    public static void main(String[] args) throws  JsonProcessingException{

        Person person=new Person();
        person.setName("Navneet");
        person.setAge(12);

        ObjectMapper objectMapper=new ObjectMapper();
        String jsonPaylosd=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(jsonPaylosd);


    }
}
