package p000;

import java.io.Serializable;

public final class eso implements Serializable {
    private final String f12166a;
    private final int f12167b;
    private Boolean f12168c;
    private Long f12169d;
    private Float f12170e;
    private boolean f12171f = false;
    private boolean f12172g;
    private long f12173h;
    private float f12174i;

    public eso(String str, boolean z) {
        this.f12166a = str;
        this.f12168c = Boolean.valueOf(z);
        this.f12167b = 1;
    }

    public eso(String str, long j) {
        this.f12166a = str;
        this.f12169d = Long.valueOf(j);
        this.f12167b = 2;
    }

    public eso(lqq lqq) {
        boolean z = true;
        this.f12166a = lqq.f26158a;
        int a = gwb.m1507a(lqq.f26159b);
        if (a == 1) {
            this.f12167b = 1;
            this.f12172g = gwb.m2061b(lqq.f26160c.f26165d);
        } else if (a == 2) {
            this.f12167b = 2;
            this.f12173h = gwb.m1523a(lqq.f26160c.f26162a);
        } else if (a == 3) {
            this.f12167b = 3;
            this.f12174i = (float) gwb.m1473a(lqq.f26160c.f26163b);
        } else {
            glk.m17982e("Babel", String.format("Invalid server experiment type %s for %s", new Object[]{Integer.valueOf(a), toString()}), new Object[0]);
            this.f12167b = -1;
        }
        if (gwb.m1507a(lqq.f26161d) != 2) {
            z = false;
        }
        this.f12171f = z;
    }

    public int m14365a() {
        boolean z = true;
        String str = "Invalid experiment type. " + this.f12167b;
        if (!(this.f12167b == 1 || this.f12167b == 2 || this.f12167b == 3)) {
            z = false;
        }
        iil.m21874a(str, z);
        return this.f12167b;
    }

    public String m14369b() {
        return this.f12166a;
    }

    public boolean m14372c() {
        return this.f12171f;
    }

    public void m14368a(boolean z) {
        this.f12171f = z;
    }

    public Boolean m14373d() {
        return this.f12168c;
    }

    public Boolean m14366a(int i) {
        iil.m21875b("Expected non-null", this.f12168c);
        if (((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3467c(i)) {
            boolean b = gwb.m2061b(this.f12168c);
            jci f = eso.m14364d(i).m23894f("babel_exp");
            return f.mo3438a(this.f12166a) ? Boolean.valueOf(f.mo3439a(this.f12166a, b)) : null;
        } else {
            glk.m17981d("Babel", "Invalid account getting server boolean experiment " + i, new Object[0]);
            return null;
        }
    }

    public void m14367a(jck jck, eso eso) {
        iil.m21869a(eso.m14369b(), m14369b());
        iil.m21869a(Integer.valueOf(eso.m14365a()), Integer.valueOf(m14365a()));
        if (eso.m14365a() == 1) {
            jck.mo3450h("babel_exp").mo3447c(this.f12166a, eso.f12172g);
        } else if (eso.m14365a() == 2) {
            jck.mo3450h("babel_exp").mo3444c(this.f12166a, eso.f12173h);
        } else if (eso.m14365a() == 3) {
            jck.mo3450h("babel_exp").mo3441b(this.f12166a, eso.f12174i);
        }
    }

    public boolean m14370b(int i) {
        iil.m21875b("Expected non-null", this.f12168c);
        boolean b = gwb.m2061b(this.f12168c);
        if (((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3467c(i)) {
            Boolean a = eso.m14362a(i, this.f12166a, b);
            if (a != null) {
                return gwb.m2061b(a);
            }
            return eso.m14364d(i).m23894f("babel_exp").mo3439a(this.f12166a, b);
        }
        glk.m17981d("Babel", "Invalid account getting boolean experiment " + i, new Object[0]);
        return b;
    }

    public long m14371c(int i) {
        iil.m21875b("Expected non-null", this.f12169d);
        long a = gwb.m1523a(this.f12169d);
        if (((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3467c(i)) {
            Long a2 = eso.m14363a(i, this.f12166a, a);
            if (a2 != null) {
                return gwb.m1523a(a2);
            }
            return eso.m14364d(i).m23894f("babel_exp").mo3434a(this.f12166a, a);
        }
        glk.m17981d("Babel", "Invalid account getting long experiment " + i, new Object[0]);
        return a;
    }

    private static Boolean m14362a(int i, String str, boolean z) {
        for (fdp fdp : jyn.m25438c(gwb.m1400H(), fdp.class)) {
            if (fdp.m15085a()) {
                return Boolean.valueOf(fdp.m15086b());
            }
        }
        return null;
    }

    private static Long m14363a(int i, String str, long j) {
        for (fdp fdp : jyn.m25438c(gwb.m1400H(), fdp.class)) {
            if (fdp.m15085a()) {
                return Long.valueOf(fdp.m15087c());
            }
        }
        return null;
    }

    private static jci m14364d(int i) {
        return ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(i);
    }

    public String toString() {
        String str = this.f12166a;
        int i = this.f12167b;
        String valueOf = String.valueOf(this.f12168c);
        String valueOf2 = String.valueOf(this.f12169d);
        String valueOf3 = String.valueOf(this.f12170e);
        return new StringBuilder((((String.valueOf(str).length() + 96) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("BabelExperiment{id='").append(str).append("', experimentType=").append(i).append(", defaultBoolean=").append(valueOf).append(", defaultLong=").append(valueOf2).append(", defaultFloat=").append(valueOf3).append("}").toString();
    }
}
