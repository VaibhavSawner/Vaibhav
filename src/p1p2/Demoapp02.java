package p1p2;

import p1.SocialMediaApp;
import java.util.*;
import p1.User;
public class Demoapp02{
public static void  main(String[] args) {
    SocialMediaApp app = new SocialMediaApp();
    
    {   // Register users
    app.registerUser("Alice");
    app.registerUser("Bob");
    app.registerUser("Charlie");

    // Alice follows Bob and Charlie
    app.followUser("Alice", "Bob");
    app.followUser("Alice", "Charlie");

    // Alice and Charlie post messages
    app.postMessage("Alice", "Hello, world!");
    app.postMessage("Charlie", "Good morning, everyone!");

    // Display posts of users followed by Alice
    User alice = app.users.get("Alice");
    for (User followedUser : alice.getFollowing()) {
        System.out.println("Posts by " + followedUser.getUsername() + ": " + followedUser.getPosts());
    }
}
}
}