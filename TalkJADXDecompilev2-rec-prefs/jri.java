package p000;

public final class jri {
    public final long f20839a;
    public final long f20840b;
    public final boolean f20841c;
    public final boolean f20842d;

    public jri(long j, long j2, boolean z, boolean z2) {
        this.f20839a = j;
        this.f20840b = j2;
        this.f20841c = z;
        this.f20842d = z2;
    }

    public String toString() {
        long j = this.f20839a;
        long j2 = this.f20840b;
        boolean z = this.f20841c;
        return "[QuotaInfo; limit: " + j + ", used: " + j2 + ", unlimited quota? " + z + ", low quota? " + this.f20842d + "]";
    }
}
