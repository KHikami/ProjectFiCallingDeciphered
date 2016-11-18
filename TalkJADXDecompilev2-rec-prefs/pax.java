package p000;

public enum pax implements nww {
    APP_LAUNCHED(0),
    APP_FOREGROUNDED(1),
    APP_BACKGROUNDED(2),
    APP_TERMINATED(3),
    BACKGROUND_FETCH_STARTED(4),
    BACKGROUND_FETCH_COMPLETED(5),
    BACKGROUND_URL_SESSION_HANDLER_STARTED(6),
    BACKGROUND_URL_SESSION_HANDLER_COMPLETED(7),
    BACKGROUND_FETCH_INTERVAL_REQUESTED(8),
    APP_OPEN_URL(9),
    MEMORY_WARNING_RECEIVED(10),
    BACKGROUND_FETCH_AVAILABLE(11),
    BACKUP_NOT_WORKING_SYSTEM_NOTIFICATION_SCHEDULED(12),
    BACKUP_NOT_WORKING_SYSTEM_NOTIFICATION_CANCELLED(13),
    BACKUP_NOT_WORKING_SYSTEM_NOTIFICATION_OPENED(14);
    
    private static final nwx<pax> f34873p = null;
    private final int f34875q;

    static {
        f34873p = new pay();
    }

    public final int mo4132a() {
        return this.f34875q;
    }

    public static pax m40143a(int i) {
        switch (i) {
            case 0:
                return APP_LAUNCHED;
            case 1:
                return APP_FOREGROUNDED;
            case 2:
                return APP_BACKGROUNDED;
            case 3:
                return APP_TERMINATED;
            case 4:
                return BACKGROUND_FETCH_STARTED;
            case 5:
                return BACKGROUND_FETCH_COMPLETED;
            case 6:
                return BACKGROUND_URL_SESSION_HANDLER_STARTED;
            case 7:
                return BACKGROUND_URL_SESSION_HANDLER_COMPLETED;
            case 8:
                return BACKGROUND_FETCH_INTERVAL_REQUESTED;
            case 9:
                return APP_OPEN_URL;
            case 10:
                return MEMORY_WARNING_RECEIVED;
            case 11:
                return BACKGROUND_FETCH_AVAILABLE;
            case 12:
                return BACKUP_NOT_WORKING_SYSTEM_NOTIFICATION_SCHEDULED;
            case 13:
                return BACKUP_NOT_WORKING_SYSTEM_NOTIFICATION_CANCELLED;
            case 14:
                return BACKUP_NOT_WORKING_SYSTEM_NOTIFICATION_OPENED;
            default:
                return null;
        }
    }

    private pax(int i) {
        this.f34875q = i;
    }
}
