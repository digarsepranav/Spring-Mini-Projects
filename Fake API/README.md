Flow :
1. I need Http Client
2. I need to create a request
3. I need a URL
4. I need to send request
5. I need to read the response

Create client : HttpClient client = HttpClient.newHttpClient();

Create request : HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://example.com"))
        .GET()
        .build();

Create response - Send to client : HttpResponse<String> response =
        client.send(request, HttpResponse.BodyHandlers.ofString());

Client
  ↓
Request
  ↓
URL + Method + Headers + Body
  ↓
Send
  ↓
Response
  ↓
Status + Body

Here client is our JAVA program and the server from which we are fetching the data is JSONPlaceholder server

we send getrequest by creating a URL
then using httpClient and getResponse we fetch the response from the server


PostRequest needs additional features like send the body and headers :
HttpRequest postRequest = HttpRequest.newBuilder()
        .uri(URI.create(BASE_URL + "/posts"))
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
        .build();

To get postResponse we can use the same constructor like the getResponse one