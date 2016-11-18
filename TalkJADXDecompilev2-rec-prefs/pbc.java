package p000;

public enum pbc implements nww {
    UNKNOWN(0),
    AUTO_BACKUP(1),
    MANUAL_BACKUP(2),
    SHARE_UPLOAD(3),
    ALBUM_UPLOAD(4),
    MOVIEMAKER_PREVIEW_UPLOAD(5),
    CREATION_UPLOAD(6),
    EDIT_UPLOAD(7);
    
    private static final nwx<pbc> f34897i = null;
    private final int f34899j;

    static {
        f34897i = new pbd();
    }

    public final int mo4132a() {
        return this.f34899j;
    }

    public static pbc m40162a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return AUTO_BACKUP;
            case 2:
                return MANUAL_BACKUP;
            case 3:
                return SHARE_UPLOAD;
            case 4:
                return ALBUM_UPLOAD;
            case 5:
                return MOVIEMAKER_PREVIEW_UPLOAD;
            case 6:
                return CREATION_UPLOAD;
            case 7:
                return EDIT_UPLOAD;
            default:
                return null;
        }
    }

    private pbc(int i) {
        this.f34899j = i;
    }
}
