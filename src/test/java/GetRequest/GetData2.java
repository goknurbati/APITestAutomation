package GetRequest;

import static io.restassured.RestAssured.*; //import all the methods of Rest Assured static
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetData2 {

    @Test
    public void testResponseCode(){

        int code= get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
        System.out.println("Status code is :" + code);

    }

    @Test
    public void testBody(){

        String data=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").toString();
        System.out.println("Data is :"+data);

        long time=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
        System.out.println("Response time :"+ time);
    }
}
