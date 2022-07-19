package it.unikey;

import java.util.HashSet;
import java.util.Set;

/**
 * #########################
 * #  Subject o Publisher  #
 * #########################
 *
 * Il "Subject" è l'oggetto che viene osservato; viene anche chiamato "Publisher" perché è suo il compito di notificare
 * gli oggetti Observer
 */
public class FamousYoutuber {

    private String channelName;

    /**
     * Questo campo rappresenta, nel nostro esempio,
     * lo stato dell'oggetto il cui cambiamento va notificato ai Subscriber
     */
    private String lastVideoUploaded;

    /**
     * Questa collezione raccoglie i Subscriber che sono interessati a seguire lo stato dell'oggetto.
     * Ricordiamo che è compito del Publisher notificare i Subscriber, e per farlo dovrà pur sapere chi questi siano
     */
    private Set<Observer> subscribers = new HashSet<>();

    /**
     * Getter, setter e constructor, pro forma
     */
    public String getChannelName() { return channelName; }
    public void setChannelName(String channelName) { this.channelName = channelName; }

    public String getLastVideoUploaded() { return lastVideoUploaded; }

    public FamousYoutuber(String channelName) {
        this.channelName = channelName;
    }

    /**
     * Aggiungere e rimuovere Subscriber è compito del Publisher, per mantenere l'incapsulamento.
     * Quando un nuovo Subscriber viene aggiunto, esso viene immediatamente notificato dell'ultimo stato
     * registrato del Publisher, così che sia immediatamente up-to-date
     */
    public void addSubscriber(Observer subscriber) {
        subscriber.update(lastVideoUploaded);
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(Observer subscriber) {
        this.subscribers.remove(subscriber);
    }

    /**
     * Questo è il metodo che notifica i Subscriber del cambio di stato del Publisher,
     * precotto per essere chiamato ogni volta che l'oggetto cambia stato
     */
    public void notifySubscribers() {
        for(Observer observer : subscribers) {
            observer.update(lastVideoUploaded);
        }
    }

    public void postNewVideo(String videoTitle) {
        System.out.println(channelName + " posted a new video titled '" + videoTitle + "'!");
        lastVideoUploaded = videoTitle;     /* L'oggetto cambia stato */
        notifySubscribers();                /* I Subscriber vengono notificati */
    }
}
