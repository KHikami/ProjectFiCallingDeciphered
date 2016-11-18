package p000;

public enum pav implements nww {
    LOCAL_BACKGROUND_FETCH(0),
    AUTO_BACKUP_ALARM(1),
    REMOTE_NOTIFICATION_OPPORTUNISTIC(2);
    
    private static final nwx<pav> f34855d = null;
    private final int f34857e;

    static {
        f34855d = new paw();
    }

    public final int mo4132a() {
        return this.f34857e;
    }

    public static pav m40140a(int i) {
        switch (i) {
            case 0:
                return LOCAL_BACKGROUND_FETCH;
            case 1:
                return AUTO_BACKUP_ALARM;
            case 2:
                return REMOTE_NOTIFICATION_OPPORTUNISTIC;
            default:
                return null;
        }
    }

    private pav(int i) {
        this.f34857e = i;
    }
}
