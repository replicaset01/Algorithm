package algorithm.json;

public class Json_Example {


    // 잘못된 예시
    Map<String, String> message = new HashMap<>() {{
        put("sender", "김코딩");
        put("receiver", "박해커");
        put("message", "밥먹을래?");
        put("createdAt", "2021-01-12,10:10:10");
    }};

    // {createdAt=2021-01-12,10:10:10, receiver=박해커, sender=김코딩, message=밥먹을래?}


    // 바른 발신 예시
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(message);

    System.out.println(json);

    // {"createdAt":"2021-01-12,10:10:10","receiver":"박해커","sender":"김코딩","message":"밥먹을래?"}


    // 바른 수신 예시
    ObjectMapper mapper = new ObjectMapper();
    String json = "{\"createdAt\":\"2021-01-12,10:10:10\",\"receiver\":\"박해커\",\"sender\":\"김코딩\",\"message\":\"밥먹을래?\"}";

    Map<String, String> deserializedData = mapper.readValue(json, Map.class);
    System.out.println(deserializedData);

    // {createdAt=2021-01-12,10:10:10, receiver=박해커, sender=김코딩, message=밥먹을래?}


}
