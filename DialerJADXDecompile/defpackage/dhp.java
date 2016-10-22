package defpackage;

/* compiled from: PG */
/* renamed from: dhp */
public enum dhp {
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
    
    public final int r;
    final String s;

    private dhp(int i) {
        this.r = i;
        this.s = Integer.toString(i);
    }

    public final dhn a() {
        return (dhn) dhn.a.get(this.r);
    }
}
