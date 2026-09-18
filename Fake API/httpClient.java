
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class httpClient {
    static final String BASE_URL = "http://jsonplaceholder.typicode.com";
    public static void main(String[] args) throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        // Get request
        HttpRequest getRequest = HttpRequest.newBuilder()
        .uri(URI.create(BASE_URL + "/posts/1"))
        .GET().build();

        HttpResponse<String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println("GET status: " + getResponse.statusCode());
        System.out.println("GET response: ");
        System.out.println(getResponse.body());

        // post request
        String jsonBody = """
        {
        "title": "Learning HTTP",
        "body": "I am learning REST APIs with JAVA",
        "userId": 1
        }
        """;

        HttpRequest postRequest = HttpRequest.newBuilder()
        .uri(URI.create(BASE_URL + "/posts"))
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
        .build();

        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println("\nPOST Status: " + postResponse.statusCode());
        System.out.println("POST Response: ");
        System.out.println(postResponse.body());

        
    }
}
