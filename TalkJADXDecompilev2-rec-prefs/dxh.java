package p000;

import java.util.Map;

final class dxh {
    long f10733a;
    String f10734b;
    String f10735c;
    Long f10736d;
    Long f10737e;
    String f10738f;
    String f10739g;
    boolean f10740h;
    int f10741i;
    bjh f10742j;
    String f10743k;
    float f10744l;
    final Map<String, dxm> f10745m = new ky();
    final Map<String, dxj> f10746n = new ky();

    dxh() {
    }

    boolean m12973a() {
        for (dxi dxi : this.f10745m.values()) {
            if (dxi.f10752f) {
                return true;
            }
        }
        for (dxi dxi2 : this.f10746n.values()) {
            if (dxi2.f10752f) {
                return true;
            }
        }
        return false;
    }

    private Object[] m12972b() {
        return new Object[]{Boolean.valueOf(this.f10740h), Integer.valueOf(this.f10741i), this.f10734b, this.f10735c, this.f10736d, this.f10737e, this.f10738f, this.f10739g, this.f10742j, this.f10745m, this.f10746n, this.f10743k, Float.valueOf(this.f10744l)};
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof dxh) && gwb.m2240h(m12972b(), ((dxh) obj).m12972b());
    }

    public int hashCode() {
        return gwb.m2074c(m12972b());
    }
}
