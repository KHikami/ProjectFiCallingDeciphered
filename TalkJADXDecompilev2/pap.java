package defpackage;

public enum pap implements nww {
    OTHER(0),
    REMOTE_NOTIFICATION(1),
    LOCAL_NOTIFICATION(2),
    LOCATION(3),
    BLUETOOTH_CENTRAL(4),
    BLUETOOTH_PERIPHERAL(5),
    URL(6);
    
    private static final nwx<pap> h = null;
    private final int i;

    static {
        h = new paq();
    }

    public final int a() {
        return this.i;
    }

    public static pap a(int i) {
        switch (i) {
            case 0:
                return OTHER;
            case 1:
                return REMOTE_NOTIFICATION;
            case 2:
                return LOCAL_NOTIFICATION;
            case 3:
                return LOCATION;
            case 4:
                return BLUETOOTH_CENTRAL;
            case 5:
                return BLUETOOTH_PERIPHERAL;
            case 6:
                return URL;
            default:
                return null;
        }
    }

    private pap(int i) {
        this.i = i;
    }
}
