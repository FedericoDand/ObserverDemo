package it.unikey;

public class Main {

    public static void main(String[] args) {

            /** Su YouTube ci sono canali di superstar */
        FamousYoutuber pewDiePie = new FamousYoutuber("PewDiePie");
        FamousYoutuber ciccioGamer = new FamousYoutuber("CiccioGamer");
            /** E utenti poracci */
        YoutubeUser xxDarkRibellino99xx = new YoutubeUser("XxDarkRibellino99xX");
        YoutubeUser strawberryJellyAngel = new YoutubeUser("Strawberry_Jelly_Angel");
        YoutubeUser eddie = new YoutubeUser("Eddie");

            /** Gli utenti poracci seguono le loro superstar preferite */
        xxDarkRibellino99xx.subscribe(pewDiePie);
        xxDarkRibellino99xx.subscribe(ciccioGamer);

        strawberryJellyAngel.subscribe(pewDiePie);

        eddie.subscribe(pewDiePie);

        System.out.println();

            /** Quando le superstar aggiungono nuovi contenti ai loro canali,
                i loro federli poracci vengono notificati */
        pewDiePie.postNewVideo("Look How Flippin' Good Elden Ring Is!!!1!");
        ciccioGamer.postNewVideo("Perché Ho Venduto L'Anima sulle Waifu di Genshin Impact");

        System.out.println();

            /** Qui vediamo qual è l'ultimo video di cui i poracci sono stati avvisati.
                CiccioGamer ha postato il suo video dopo PewDiePie, e dunque la sue dovrebbe essere
                l'ultima notifica ricevuta da XxDarkRibellino99xX */
        System.out.println("Last video notified to " + xxDarkRibellino99xx.getUsername() + ": "
                + xxDarkRibellino99xx.getLastNotificationRecieved());
        System.out.println("Last video notified to " + strawberryJellyAngel.getUsername() + ": "
                + strawberryJellyAngel.getLastNotificationRecieved());
        System.out.println("Last video notified to " + eddie.getUsername() + ": "
                + eddie.getLastNotificationRecieved());

            /** Innamoratosi delle waifu di Genshin Impact,
                XxDarkRibellino99xX cancella la sua iscrizione a PewDiePie */
        xxDarkRibellino99xx.unsubscribe(pewDiePie);
    }
}
