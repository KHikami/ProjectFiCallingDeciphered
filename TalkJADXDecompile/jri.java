public final class jri {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public jri(long j, long j2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
    }

    public String toString() {
        long j = this.a;
        long j2 = this.b;
        boolean z = this.c;
        return "[QuotaInfo; limit: " + j + ", used: " + j2 + ", unlimited quota? " + z + ", low quota? " + this.d + "]";
    }
}
