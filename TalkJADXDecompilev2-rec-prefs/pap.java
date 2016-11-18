package p000;

public enum pap implements nww {
    OTHER(0),
    REMOTE_NOTIFICATION(1),
    LOCAL_NOTIFICATION(2),
    LOCATION(3),
    BLUETOOTH_CENTRAL(4),
    BLUETOOTH_PERIPHERAL(5),
    URL(6);
    
    private static final nwx<pap> f34835h = null;
    private final int f34837i;

    static {
        f34835h = new paq();
    }

    public final int mo4132a() {
        return this.f34837i;
    }

    public static pap m40126a(int i) {
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
        this.f34837i = i;
    }
}
