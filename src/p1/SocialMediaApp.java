package p1;

import java.util.HashMap;
import java.util.Map;

public class SocialMediaApp {
    private Map<String, User> users;

    public SocialMediaApp() {
        users = new HashMap<>();
    }
    public void followUser(String follower, String followee) {
        User followerUser = users.get(follower);
        User followeeUser = users.get(followee);
        if (followerUser != null && followeeUser != null) {
            followerUser.follow(followeeUser);
            System.out.println(follower + " is now following " + followee);
        } else {
            System.out.println("User does not exist.");
        }
    }

    public void registerUser(String username) {
        if (!users.containsKey(username)) {
            users.put(username, new User(username));
            System.out.println("User '" + username + "' registered successfully.");
        } else {
            System.out.println("User '" + username + "' already exists.");
        }
    }
}
