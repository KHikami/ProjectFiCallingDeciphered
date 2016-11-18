package defpackage;

import java.util.HashMap;
import java.util.Map;

final class jjn {
    static final int[] a = new int[]{0, 1, 2, 3, 4};
    private final int b;
    private final Map<Short, jjm> c = new HashMap();
    private int d = 0;

    jjn(int i) {
        this.b = i;
    }

    protected jjm[] a() {
        return (jjm[]) this.c.values().toArray(new jjm[this.c.size()]);
    }

    protected int b() {
        return this.b;
    }

    protected jjm a(short s) {
        return (jjm) this.c.get(Short.valueOf(s));
    }

    protected jjm a(jjm jjm) {
        jjm.b(this.b);
        return (jjm) this.c.put(Short.valueOf(jjm.b()), jjm);
    }

    protected void b(short s) {
        this.c.remove(Short.valueOf(s));
    }

    protected int c() {
        return this.c.size();
    }

    protected void a(int i) {
        this.d = i;
    }

    protected int d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof jjn) {
            jjn jjn = (jjn) obj;
            if (jjn.b() == this.b && jjn.c() == c()) {
                for (jjm jjm : jjn.a()) {
                    if (!jjb.a(jjm.b()) && !jjm.equals((jjm) this.c.get(Short.valueOf(jjm.b())))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.b + 527) * 31) + this.c.hashCode();
    }
}
