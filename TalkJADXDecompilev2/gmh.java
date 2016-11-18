package defpackage;

import java.io.Serializable;

public final class gmh implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final boolean e;
    private final Serializable f;

    public gmh(String str, String str2, String str3, Serializable serializable) {
        this(str, str2, str3, 0, true, serializable);
    }

    public gmh(String str, String str2, int i, Serializable serializable) {
        this(str, str2, null, i, false, serializable);
    }

    private gmh(String str, String str2, String str3, int i, boolean z, Serializable serializable) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = serializable;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    public int e() {
        return this.d;
    }

    public Serializable f() {
        return this.f;
    }
}
