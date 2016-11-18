package defpackage;

public enum pbh implements nww {
    UPLOAD_SUCCEEDED(0),
    UPLOAD_FAILED(1),
    BACKUP_STALLED(2),
    UPLOAD_STARTED(3),
    UPLOAD_WRITTEN(4),
    ASSET_DISCOVERED(5),
    CONNECTIVITY_INELIGIBLE(6),
    CONNECTIVITY_ELIGIBLE(7),
    BACKUP_STARTED(8),
    BACKUP_COMPLETE(9),
    UPLOAD_TRANSIENT_FAILURE(10);
    
    private static final nwx<pbh> l = null;
    private final int m;

    static {
        l = new pbi();
    }

    public final int a() {
        return this.m;
    }

    public static pbh a(int i) {
        switch (i) {
            case 0:
                return UPLOAD_SUCCEEDED;
            case 1:
                return UPLOAD_FAILED;
            case 2:
                return BACKUP_STALLED;
            case 3:
                return UPLOAD_STARTED;
            case 4:
                return UPLOAD_WRITTEN;
            case 5:
                return ASSET_DISCOVERED;
            case 6:
                return CONNECTIVITY_INELIGIBLE;
            case 7:
                return CONNECTIVITY_ELIGIBLE;
            case 8:
                return BACKUP_STARTED;
            case 9:
                return BACKUP_COMPLETE;
            case 10:
                return UPLOAD_TRANSIENT_FAILURE;
            default:
                return null;
        }
    }

    private pbh(int i) {
        this.m = i;
    }
}
