package defpackage;

/* renamed from: jln */
public final class jln {
    String a;
    long b;
    long c;
    float d;
    float e;

    public jln a(String str) {
        this.a = str;
        return this;
    }

    public jln a(long j) {
        this.b = j;
        return this;
    }

    public jln b(long j) {
        this.c = j;
        return this;
    }

    public jln a(float f) {
        this.d = f;
        return this;
    }

    public jlm a() {
        return new jlm(this);
    }
}
