package it.unikey;

/**
 * Concrete Observer o Subscriber
 */
public class YoutubeUser implements Observer{

    private static int idCounter = 0;

    private int id;
    private String username;
    private String lastNotificationRecieved;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public int getId() { return id; }

    public String getLastNotificationRecieved() { return lastNotificationRecieved; }

    public YoutubeUser(String username) {
        this.username = username;
        id = idCounter++;
    }

    public void subscribe(FamousYoutuber youtuber) {
        youtuber.addSubscriber(this);
    }

    public void unsubscribe(FamousYoutuber youtuber) {
        youtuber.removeSubscriber(this);
    }

    @Override
    public void update(String context) {
        lastNotificationRecieved = context;
    }
}
