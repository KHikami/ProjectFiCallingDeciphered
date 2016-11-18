package defpackage;

import java.io.Serializable;
import java.util.List;

public class juh implements Serializable {
    private static final long serialVersionUID = 3145206267302890026L;
    public List<bcn> a;
    public List<bcg> b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final juh h;

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public juh e() {
        return this.h;
    }

    public String f() {
        return this.g;
    }

    public juh(bcf bcf) {
        this.a = bcf.a;
        this.b = bcf.b;
    }

    public static bcf newBuilder() {
        return new bcf();
    }

    public List<bcn> g() {
        return this.a;
    }

    public int h() {
        return this.a.size();
    }

    public bcn a(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return (bcn) this.a.get(i);
    }

    public List<bcg> i() {
        return this.b;
    }

    public int j() {
        return this.b.size();
    }

    public bcg b(int i) {
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return (bcg) this.b.get(i);
    }
}
