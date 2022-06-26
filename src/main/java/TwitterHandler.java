import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwitterHandler {
    static String ConsumerKey = "2lVaEC0K6u3Umu3jRzOCyWlF0";
    static String ConsumerSecret ="IHmfLdllAIpPxRfmYBsmfRWrsMkhjCrnZaDyXgjOLwntcMFJxd";
    static String AccessToken = "1530207174643023873-gXcF3bD5HShnuzaM1hYnO8h1u7AVpd";
    static String AccessTokenSecret = "cpHAGbI1pIXy1yYKW2qnCI9zNiKXWUIpo0Os0PgRRjfgx";

//    static String ConsumerKey = "2lVaEC0K6u3Umu3jRzOCyWlF0";
//    static String ConsumerSecret = "IHmfLdllAIpPxRfmYBsmfRWrsMkhjCrnZaDyXgjOLwntcMFJxd";
//    static String AccessToken = "1530207174643023873-gXcF3bD5HShnuzaM1hYnO8h1u7AVpd";
//    static String AccessTokenSecret = "cpHAGbI1pIXy1yYKW2qnCI9zNiKXWUIpo0Os0PgRRjfgx";

    private Map<String, List<Status>> goodResMap = new HashMap<>();
    private Map<String, List<Status>> cafeMap = new HashMap<>();
    private Map<String, List<Status>> hotMap = new HashMap<>();

    public Twitter getTwitter() {

        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(ConsumerKey)
                .setOAuthConsumerSecret(ConsumerSecret)
                .setOAuthAccessToken(AccessToken)
                .setOAuthAccessTokenSecret(AccessTokenSecret);

        TwitterFactory fac = new TwitterFactory(cb.build());
        Twitter twitter = fac.getInstance();
        return twitter;
    }

    public List<Status> getTweetList(String keyword) throws TwitterException {
        Twitter twitter = getTwitter();

        List<Status> result = new ArrayList<>();

        Query queryMat = new Query(keyword + " 맛집");
        queryMat.setCount(20);

        Query queryCa = new Query(keyword + " 카페");
        queryCa.setCount(20);

        Query queryHo = new Query(keyword + " 핫플");
        queryHo.setCount(20);

        List<Status> goodRes = twitter.search(queryMat).getTweets();
        result.addAll(goodRes);
        goodResMap.put(keyword, goodRes);

        List<Status> cafe = twitter.search(queryCa).getTweets();
        result.addAll(cafe);
        cafeMap.put(keyword, cafe);

        List<Status> hot = twitter.search(queryHo).getTweets();
        result.addAll(hot);
        hotMap.put(keyword, hot);

        return result;
    }

    TwitterHandler() {
    }

    public Map<String, List<Status>> getGoodResMap() {
        return goodResMap;
    }

    public Map<String, List<Status>> getCafeMap() {
        return cafeMap;
    }

    public Map<String, List<Status>> getHotMap() {
        return hotMap;
    }
}