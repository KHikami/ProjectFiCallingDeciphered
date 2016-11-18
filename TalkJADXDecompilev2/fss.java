package defpackage;

final class fss {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public String g;
    public String h;

    fss() {
    }

    public String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.e;
        long j6 = this.f;
        String str = this.g;
        String str2 = this.h;
        return new StringBuilder((String.valueOf(str).length() + 224) + String.valueOf(str2).length()).append("loadTimeMs=").append(j).append(" loadTimeNs=").append(j2).append(" waitStartTimeNs=").append(j3).append(" activeStartTimeNs=").append(j4).append(" decodeStartTimeNs=").append(j5).append(" deliverTimeNs=").append(j6).append(" key").append(str).append(" extra=").append(str2).toString();
    }
}
