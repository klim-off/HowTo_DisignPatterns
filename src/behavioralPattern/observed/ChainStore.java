package behavioralPattern.observed;

import behavioralPattern.observed.publisher.NotificationManager;

import static behavioralPattern.observed.listeners.NotificationType.*;

public class ChainStore {

    private final String name;
    public NotificationManager notifications;

    public ChainStore(String name) {
        this.name = name;
        notifications = new NotificationManager(PERSONAL_OFFER, SALE, PROMO, EVENT);
    }

    public void launchPersonalOffer() {
        notifications.notify(PERSONAL_OFFER,name);
        System.out.println(name + " запускает соблазнительные персональные скидки!");
    }

    public void launchSale() {
        notifications.notify(SALE,name);
        System.out.println(name + " запускает горячую распродажу!");
    }

    public void launchPromo() {
        notifications.notify(PROMO,name);
        System.out.println("В " + name + " стартует супер промо акция!");
    }

    public void launchEvent() {
        notifications.notify(EVENT,name);
        System.out.println("В " + name + " состоится грандиозное мероприятие!");
    }
}
