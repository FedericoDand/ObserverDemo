package it.unikey;

/**
 * ####################################
 * #  Concrete Observer o Subscriber  #
 * ####################################
 *
 * Il "Concrete Observer" è l'oggetto che implementa l'interfaccia Observer, e viene notificato dal Publisher quando
 * quest'ultimo cambia stato. Essendo un oggetto interessato allo stato di un altro, viene chiamato anche "Subscriber"
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

    @Override
    public void update(String context) {
        lastNotificationRecieved = context;
    }

    public void subscribe(FamousYoutuber youtuber) {
        youtuber.addSubscriber(this);
    }

    public void unsubscribe(FamousYoutuber youtuber) {
        youtuber.removeSubscriber(this);
    }
}
