package p000;

public enum ozz implements nww {
    PREFERENCE_UNKNOWN(0),
    BACKUP(1),
    PHOTO_BACKUP_OVER_CELLULAR_DATA(2),
    VIDEO_BACKUP_OVER_CELLULAR_DATA(3),
    BACKUP_WHILE_CHARGING_ONLY(4),
    BACKUP_WHILE_ROAMING(5),
    BACKUP_ORIGINAL_SIZE(6);
    
    private static final nwx<ozz> f34745h = null;
    private final int f34747i;

    static {
        f34745h = new paa();
    }

    public final int mo4132a() {
        return this.f34747i;
    }

    public static ozz m40078a(int i) {
        switch (i) {
            case 0:
                return PREFERENCE_UNKNOWN;
            case 1:
                return BACKUP;
            case 2:
                return PHOTO_BACKUP_OVER_CELLULAR_DATA;
            case 3:
                return VIDEO_BACKUP_OVER_CELLULAR_DATA;
            case 4:
                return BACKUP_WHILE_CHARGING_ONLY;
            case 5:
                return BACKUP_WHILE_ROAMING;
            case 6:
                return BACKUP_ORIGINAL_SIZE;
            default:
                return null;
        }
    }

    private ozz(int i) {
        this.f34747i = i;
    }
}
