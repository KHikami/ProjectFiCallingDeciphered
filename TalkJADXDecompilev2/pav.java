package defpackage;

public enum pav implements nww {
    LOCAL_BACKGROUND_FETCH(0),
    AUTO_BACKUP_ALARM(1),
    REMOTE_NOTIFICATION_OPPORTUNISTIC(2);
    
    private static final nwx<pav> d = null;
    private final int e;

    static {
        d = new paw();
    }

    public final int a() {
        return this.e;
    }

    public static pav a(int i) {
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
        this.e = i;
    }
}
