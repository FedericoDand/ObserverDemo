package it.unikey;

public class Main {

    public static void main(String[] args) {

        FamousYoutuber pewDiePie = new FamousYoutuber("PewDiePie");
        FamousYoutuber ciccioGamer = new FamousYoutuber("CiccioGamer");

        YoutubeUser xxDarkRibellino99xx = new YoutubeUser("XxDarkRibellino99xX");
        YoutubeUser strawberryJellyAngel = new YoutubeUser("Strawberry_Jelly_Angel");
        YoutubeUser eddie = new YoutubeUser("Eddie");

        xxDarkRibellino99xx.subscribe(pewDiePie);
        xxDarkRibellino99xx.subscribe(ciccioGamer);

        strawberryJellyAngel.subscribe(pewDiePie);

        eddie.subscribe(pewDiePie);

        pewDiePie.postNewVideo("Look how flippin' good is Elden Ring!!!1!");
        ciccioGamer.postNewVideo("Ho Venduto L'anima sulle Waifu di Genshin Impact");

        System.out.println();

        System.out.println("Last video posted by " + pewDiePie.getChannelName() + ": "
                + pewDiePie.getLastVideoUploaded());
        System.out.println("Last video posted by " + ciccioGamer.getChannelName() + ": "
                + ciccioGamer.getLastVideoUploaded());

        System.out.println();

        System.out.println("Last video notified to " + xxDarkRibellino99xx.getUsername() + ": "
                + xxDarkRibellino99xx.getLastNotificationRecieved());
        System.out.println("Last video notified to " + strawberryJellyAngel.getUsername() + ": "
                + strawberryJellyAngel.getLastNotificationRecieved());
        System.out.println("Last video notified to " + eddie.getUsername() + ": "
                + eddie.getLastNotificationRecieved());
    }
}
