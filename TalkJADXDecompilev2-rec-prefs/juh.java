package p000;

import java.io.Serializable;
import java.util.List;

public class juh implements Serializable {
    private static final long serialVersionUID = 3145206267302890026L;
    public List<bcn> f21060a;
    public List<bcg> f21061b;
    private final String f21062c;
    private final String f21063d;
    private final String f21064e;
    private final String f21065f;
    private final String f21066g;
    private final juh f21067h;

    public String m25215a() {
        return this.f21062c;
    }

    public String m25217b() {
        return this.f21063d;
    }

    public String m25218c() {
        return this.f21064e;
    }

    public String m25219d() {
        return this.f21065f;
    }

    public juh m25220e() {
        return this.f21067h;
    }

    public String m25221f() {
        return this.f21066g;
    }

    public juh(bcf bcf) {
        this.f21060a = bcf.f3000a;
        this.f21061b = bcf.f3001b;
    }

    public static bcf newBuilder() {
        return new bcf();
    }

    public List<bcn> m25222g() {
        return this.f21060a;
    }

    public int m25223h() {
        return this.f21060a.size();
    }

    public bcn m25214a(int i) {
        if (i < 0 || i >= this.f21060a.size()) {
            return null;
        }
        return (bcn) this.f21060a.get(i);
    }

    public List<bcg> m25224i() {
        return this.f21061b;
    }

    public int m25225j() {
        return this.f21061b.size();
    }

    public bcg m25216b(int i) {
        if (i < 0 || i >= this.f21061b.size()) {
            return null;
        }
        return (bcg) this.f21061b.get(i);
    }
}
