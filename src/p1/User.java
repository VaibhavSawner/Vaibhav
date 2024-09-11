package p1;

import java.util.*;

public class User {
    private String username;
    private List<User> following;
    private List<String> posts;

    public User(String username) {
        this.username = username;
        this.following = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void follow(User user) {
        following.add(user);
    }

    public void unfollow(User user) {
        following.remove(user);
    }

    public void post(String message) {
        posts.add(message);
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<String> getPosts() {
        return posts;
    }

    public void postMessage(int username, String message) {
        List<User> users = null;
		User user = users.get(username);
        if (user != null) {
            user.post(message);
            System.out.println(username + " posted: " + message);
        } else {
            System.out.println("User does not exist.");
        }
    }
}

   

    
   
