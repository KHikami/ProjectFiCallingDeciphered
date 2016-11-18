package p000;

public enum kdk {
    TERABYTES(1099511627776L),
    GIGABYTES(1073741824),
    MEGABYTES(1048576),
    KILOBYTES(1024),
    BYTES(1);
    
    long f21420f;

    private kdk(long j) {
        this.f21420f = j;
    }

    public long m25595a(long j) {
        return this.f21420f * j;
    }
}
