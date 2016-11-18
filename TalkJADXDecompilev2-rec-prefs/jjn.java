package p000;

import java.util.HashMap;
import java.util.Map;

final class jjn {
    static final int[] f20296a = new int[]{0, 1, 2, 3, 4};
    private final int f20297b;
    private final Map<Short, jjm> f20298c = new HashMap();
    private int f20299d = 0;

    jjn(int i) {
        this.f20297b = i;
    }

    protected jjm[] m24491a() {
        return (jjm[]) this.f20298c.values().toArray(new jjm[this.f20298c.size()]);
    }

    protected int m24492b() {
        return this.f20297b;
    }

    protected jjm m24489a(short s) {
        return (jjm) this.f20298c.get(Short.valueOf(s));
    }

    protected jjm m24488a(jjm jjm) {
        jjm.m24472b(this.f20297b);
        return (jjm) this.f20298c.put(Short.valueOf(jjm.m24471b()), jjm);
    }

    protected void m24493b(short s) {
        this.f20298c.remove(Short.valueOf(s));
    }

    protected int m24494c() {
        return this.f20298c.size();
    }

    protected void m24490a(int i) {
        this.f20299d = i;
    }

    protected int m24495d() {
        return this.f20299d;
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
            if (jjn.m24492b() == this.f20297b && jjn.m24494c() == m24494c()) {
                for (jjm jjm : jjn.m24491a()) {
                    if (!jjb.m24370a(jjm.m24471b()) && !jjm.equals((jjm) this.f20298c.get(Short.valueOf(jjm.m24471b())))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20297b + 527) * 31) + this.f20298c.hashCode();
    }
}
