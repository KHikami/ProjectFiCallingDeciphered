package defpackage;

/* renamed from: fjs */
public final class fjs {
    public final long a;
    final String b;
    final String c;
    String[] d;
    String e;
    String f;
    String g;
    String h;
    int i;
    int j;
    int k;
    String l;
    int m;
    long n;

    public fjs(String str, String str2, long j) {
        this.n = -1;
        this.c = str;
        this.b = str2;
        this.a = j;
    }

    public fjs a(String[] strArr) {
        this.d = strArr;
        return this;
    }

    public fjs a(String str) {
        this.e = str;
        return this;
    }

    public fjs b(String str) {
        this.f = str;
        return this;
    }

    public fjs c(String str) {
        this.g = str;
        return this;
    }

    public fjs d(String str) {
        this.h = str;
        return this;
    }

    public fjs a(int i) {
        this.i = i;
        return this;
    }

    public fjs b(int i) {
        this.j = i;
        return this;
    }

    public fjs c(int i) {
        this.k = i;
        return this;
    }

    public fjs e(String str) {
        this.l = str;
        return this;
    }

    public fjs d(int i) {
        this.m = i;
        return this;
    }

    public fjs a(long j) {
        this.n = j;
        return this;
    }

    public fjr a() {
        ba.a(this.d, (Object) "must specify recipients");
        return new fjr(this);
    }
}
