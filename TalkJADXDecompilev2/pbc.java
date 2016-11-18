package defpackage;

public enum pbc implements nww {
    UNKNOWN(0),
    AUTO_BACKUP(1),
    MANUAL_BACKUP(2),
    SHARE_UPLOAD(3),
    ALBUM_UPLOAD(4),
    MOVIEMAKER_PREVIEW_UPLOAD(5),
    CREATION_UPLOAD(6),
    EDIT_UPLOAD(7);
    
    private static final nwx<pbc> i = null;
    private final int j;

    static {
        i = new pbd();
    }

    public final int a() {
        return this.j;
    }

    public static pbc a(int i) {
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
        this.j = i;
    }
}
