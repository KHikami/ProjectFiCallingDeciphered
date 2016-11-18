package p000;

public enum ozv implements nww {
    ACTOR_UNKNOWN(0),
    USER(1),
    MIGRATION(2);
    
    private static final nwx<ozv> f34729d = null;
    private final int f34731e;

    static {
        f34729d = new ozw();
    }

    public final int mo4132a() {
        return this.f34731e;
    }

    public static ozv m40072a(int i) {
        switch (i) {
            case 0:
                return ACTOR_UNKNOWN;
            case 1:
                return USER;
            case 2:
                return MIGRATION;
            default:
                return null;
        }
    }

    private ozv(int i) {
        this.f34731e = i;
    }
}
