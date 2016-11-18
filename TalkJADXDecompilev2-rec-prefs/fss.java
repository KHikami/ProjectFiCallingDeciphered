package p000;

final class fss {
    public long f13922a;
    public long f13923b;
    public long f13924c;
    public long f13925d;
    public long f13926e;
    public long f13927f;
    public String f13928g;
    public String f13929h;

    fss() {
    }

    public String toString() {
        long j = this.f13922a;
        long j2 = this.f13923b;
        long j3 = this.f13924c;
        long j4 = this.f13925d;
        long j5 = this.f13926e;
        long j6 = this.f13927f;
        String str = this.f13928g;
        String str2 = this.f13929h;
        return new StringBuilder((String.valueOf(str).length() + 224) + String.valueOf(str2).length()).append("loadTimeMs=").append(j).append(" loadTimeNs=").append(j2).append(" waitStartTimeNs=").append(j3).append(" activeStartTimeNs=").append(j4).append(" decodeStartTimeNs=").append(j5).append(" deliverTimeNs=").append(j6).append(" key").append(str).append(" extra=").append(str2).toString();
    }
}
