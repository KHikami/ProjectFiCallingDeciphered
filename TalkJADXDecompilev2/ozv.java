package defpackage;

public enum ozv implements nww {
    ACTOR_UNKNOWN(0),
    USER(1),
    MIGRATION(2);
    
    private static final nwx<ozv> d = null;
    private final int e;

    static {
        d = new ozw();
    }

    public final int a() {
        return this.e;
    }

    public static ozv a(int i) {
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
        this.e = i;
    }
}
