package p000;

import java.io.Serializable;

public final class gmh implements Serializable {
    private final String f15646a;
    private final String f15647b;
    private final String f15648c;
    private final int f15649d;
    private final boolean f15650e;
    private final Serializable f15651f;

    public gmh(String str, String str2, String str3, Serializable serializable) {
        this(str, str2, str3, 0, true, serializable);
    }

    public gmh(String str, String str2, int i, Serializable serializable) {
        this(str, str2, null, i, false, serializable);
    }

    private gmh(String str, String str2, String str3, int i, boolean z, Serializable serializable) {
        this.f15646a = str;
        this.f15647b = str2;
        this.f15648c = str3;
        this.f15649d = i;
        this.f15650e = z;
        this.f15651f = serializable;
    }

    public String m18087a() {
        return this.f15646a;
    }

    public String m18088b() {
        return this.f15647b;
    }

    public String m18089c() {
        return this.f15648c;
    }

    public boolean m18090d() {
        return this.f15650e;
    }

    public int m18091e() {
        return this.f15649d;
    }

    public Serializable m18092f() {
        return this.f15651f;
    }
}
