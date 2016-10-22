package defpackage;

/* renamed from: kdk */
public enum kdk {
    TERABYTES(1099511627776L),
    GIGABYTES(1073741824),
    MEGABYTES(1048576),
    KILOBYTES(1024),
    BYTES(1);
    
    long f;

    private kdk(long j) {
        this.f = j;
    }

    public long a(long j) {
        return this.f * j;
    }
}
