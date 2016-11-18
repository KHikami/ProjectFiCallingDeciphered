package p000;

public enum pah implements nww {
    UNKNOWN(0),
    INVALID_SERVER_RESPONSE(1),
    INVALID_CONTENT_URI(2),
    INVALID_CONTENT_TYPE(3),
    SERVER_THROTTLED(4),
    SERVER_TRANSIENT_ERROR(5),
    STORAGE_UNAVAILABLE(6),
    FILE_UPLOAD_INCONSISTENT(7),
    UPLOAD_ABORTED(8),
    UNAUTHORIZED_RESPONSE(9),
    CONNECTIVITY_INELIGIBLE(10),
    CONTENT_MISSING(11);
    
    private static final nwx<pah> f34800m = null;
    private final int f34802n;

    static {
        f34800m = new pai();
    }

    public final int mo4132a() {
        return this.f34802n;
    }

    public static pah m40102a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return INVALID_SERVER_RESPONSE;
            case 2:
                return INVALID_CONTENT_URI;
            case 3:
                return INVALID_CONTENT_TYPE;
            case 4:
                return SERVER_THROTTLED;
            case 5:
                return SERVER_TRANSIENT_ERROR;
            case 6:
                return STORAGE_UNAVAILABLE;
            case 7:
                return FILE_UPLOAD_INCONSISTENT;
            case 8:
                return UPLOAD_ABORTED;
            case 9:
                return UNAUTHORIZED_RESPONSE;
            case 10:
                return CONNECTIVITY_INELIGIBLE;
            case 11:
                return CONTENT_MISSING;
            default:
                return null;
        }
    }

    private pah(int i) {
        this.f34802n = i;
    }
}
