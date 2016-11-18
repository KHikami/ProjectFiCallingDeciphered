package defpackage;

import java.util.List;

final class juw {
    String a;
    long b;
    long c;
    long d;
    long e;
    long f;
    long g;
    final ky<String, Long> h = new ky();
    String i;
    public List<String> j;
    public String k;

    juw() {
    }

    public String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.b - this.c;
        long j3 = this.g;
        long j4 = this.c;
        long j5 = this.d;
        long j6 = this.f;
        long j7 = this.e;
        String str2 = this.i;
        return new StringBuilder((String.valueOf(str).length() + 240) + String.valueOf(str2).length()).append("[").append(str).append("], duration: ").append(j).append("ms, network: ").append(j2).append("ms, server: ").append(j3).append("ms, processing: ").append(j4).append("ms, requests: ").append(j5).append(", sent: ").append(j6).append(", received: ").append(j7).append(", protocol:").append(str2).toString();
    }
}
