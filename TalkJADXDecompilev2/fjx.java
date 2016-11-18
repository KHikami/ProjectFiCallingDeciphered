package defpackage;

public final class fjx {
    public final long a;
    final String b;
    final String c;
    String d;
    String e;
    long f;
    String g;
    long h;

    public fjx(String str, String str2, long j) {
        this.c = str;
        this.b = str2;
        this.a = j;
    }

    public fjx a(String str) {
        this.d = str;
        return this;
    }

    public fjx b(String str) {
        this.e = str;
        return this;
    }

    public fjx a(long j) {
        this.f = j;
        return this;
    }

    public fjx c(String str) {
        this.g = str;
        return this;
    }

    public fjx b(long j) {
        this.h = j;
        return this;
    }

    public fjw a() {
        return new fjw(this);
    }
}
