package p000;

import java.util.List;

final class juw {
    String f21090a;
    long f21091b;
    long f21092c;
    long f21093d;
    long f21094e;
    long f21095f;
    long f21096g;
    final ky<String, Long> f21097h = new ky();
    String f21098i;
    public List<String> f21099j;
    public String f21100k;

    juw() {
    }

    public String toString() {
        String str = this.f21090a;
        long j = this.f21091b;
        long j2 = this.f21091b - this.f21092c;
        long j3 = this.f21096g;
        long j4 = this.f21092c;
        long j5 = this.f21093d;
        long j6 = this.f21095f;
        long j7 = this.f21094e;
        String str2 = this.f21098i;
        return new StringBuilder((String.valueOf(str).length() + 240) + String.valueOf(str2).length()).append("[").append(str).append("], duration: ").append(j).append("ms, network: ").append(j2).append("ms, server: ").append(j3).append("ms, processing: ").append(j4).append("ms, requests: ").append(j5).append(", sent: ").append(j6).append(", received: ").append(j7).append(", protocol:").append(str2).toString();
    }
}
