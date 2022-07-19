package it.unikey;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject o Publisher
 */
public class FamousYoutuber {

    private String channelName;
    private List<Observer> subscribers = new ArrayList<>();
    private String lastVideoUploaded;

    public String getChannelName() { return channelName; }
    public void setChannelName(String channelName) { this.channelName = channelName; }

    public String getLastVideoUploaded() { return lastVideoUploaded; }

    public FamousYoutuber(String channelName) {
        this.channelName = channelName;
    }

    public void addSubscriber(Observer subscriber) {
        subscriber.update(lastVideoUploaded);
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(Observer subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for(Observer observer : subscribers) {
            observer.update(lastVideoUploaded);
        }
    }

    public void postNewVideo(String videoTitle) {
        System.out.println(channelName + " posted a new video titled '" + videoTitle + "'!");
        lastVideoUploaded = videoTitle;
        notifySubscribers();
    }
}
