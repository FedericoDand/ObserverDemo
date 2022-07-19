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

    /**
     * Questo campo tiene traccia dello stato del Publisher che il Subscriber sta seguendo
     */
    private String lastNotificationRecieved;

    /**
     * Getter, setter e constructor, pro forma
     */
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public int getId() { return id; }

    public String getLastNotificationRecieved() { return lastNotificationRecieved; }

    public YoutubeUser(String username) {
        this.username = username;
        id = idCounter++;
    }

    /**
     * Questo metodo verrà chiamato dal Publisher per notificare il Subscriber
     * del nuovo stato
     */
    @Override
    public void update(String context) {
        lastNotificationRecieved = context;
    }

    /**
     * "Ma su YouTube è l'utente che decide di iscriversi a un canale!
     *  Perché dovrebbe essere il Publisher ad aggiungere e rimuovere Subscriber?"
     *
     * Come direbbe l'Architetto di Matrix Reloaded, è per mantenere l'illusione del controllo:
     * se così non fosse cadrebbe il principio di incapsulamento sulla lista dei Subscriber.
     *
     * Questi metodi esistono quindi a questo scopo, a illudere l'utente di avere controllo.
     */
    public void subscribe(FamousYoutuber youtuber) {
        youtuber.addSubscriber(this);
    }

    public void unsubscribe(FamousYoutuber youtuber) {
        youtuber.removeSubscriber(this);
    }
}
