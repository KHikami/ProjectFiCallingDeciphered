package p000;

public enum olx {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);
    
    final String f28792r;
    private final int f28793s;

    private olx(int i) {
        this.f28793s = i;
        this.f28792r = Integer.toString(i);
    }

    public int m33508a() {
        return this.f28793s;
    }

    public olv m33509b() {
        return (olv) olv.f28750a.get(this.f28793s);
    }
}
