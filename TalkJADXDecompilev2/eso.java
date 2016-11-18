package defpackage;

import java.io.Serializable;

public final class eso implements Serializable {
    private final String a;
    private final int b;
    private Boolean c;
    private Long d;
    private Float e;
    private boolean f = false;
    private boolean g;
    private long h;
    private float i;

    public eso(String str, boolean z) {
        this.a = str;
        this.c = Boolean.valueOf(z);
        this.b = 1;
    }

    public eso(String str, long j) {
        this.a = str;
        this.d = Long.valueOf(j);
        this.b = 2;
    }

    public eso(lqq lqq) {
        boolean z = true;
        this.a = lqq.a;
        int a = gwb.a(lqq.b);
        if (a == 1) {
            this.b = 1;
            this.g = gwb.b(lqq.c.d);
        } else if (a == 2) {
            this.b = 2;
            this.h = gwb.a(lqq.c.a);
        } else if (a == 3) {
            this.b = 3;
            this.i = (float) gwb.a(lqq.c.b);
        } else {
            glk.e("Babel", String.format("Invalid server experiment type %s for %s", new Object[]{Integer.valueOf(a), toString()}), new Object[0]);
            this.b = -1;
        }
        if (gwb.a(lqq.d) != 2) {
            z = false;
        }
        this.f = z;
    }

    public int a() {
        boolean z = true;
        String str = "Invalid experiment type. " + this.b;
        if (!(this.b == 1 || this.b == 2 || this.b == 3)) {
            z = false;
        }
        iil.a(str, z);
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.f;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public Boolean d() {
        return this.c;
    }

    public Boolean a(int i) {
        iil.b("Expected non-null", this.c);
        if (((jcf) jyn.a(gwb.H(), jcf.class)).c(i)) {
            boolean b = gwb.b(this.c);
            jci f = eso.d(i).f("babel_exp");
            return f.a(this.a) ? Boolean.valueOf(f.a(this.a, b)) : null;
        } else {
            glk.d("Babel", "Invalid account getting server boolean experiment " + i, new Object[0]);
            return null;
        }
    }

    public void a(jck jck, eso eso) {
        iil.a(eso.b(), b());
        iil.a(Integer.valueOf(eso.a()), Integer.valueOf(a()));
        if (eso.a() == 1) {
            jck.h("babel_exp").c(this.a, eso.g);
        } else if (eso.a() == 2) {
            jck.h("babel_exp").c(this.a, eso.h);
        } else if (eso.a() == 3) {
            jck.h("babel_exp").b(this.a, eso.i);
        }
    }

    public boolean b(int i) {
        iil.b("Expected non-null", this.c);
        boolean b = gwb.b(this.c);
        if (((jcf) jyn.a(gwb.H(), jcf.class)).c(i)) {
            Boolean a = eso.a(i, this.a, b);
            if (a != null) {
                return gwb.b(a);
            }
            return eso.d(i).f("babel_exp").a(this.a, b);
        }
        glk.d("Babel", "Invalid account getting boolean experiment " + i, new Object[0]);
        return b;
    }

    public long c(int i) {
        iil.b("Expected non-null", this.d);
        long a = gwb.a(this.d);
        if (((jcf) jyn.a(gwb.H(), jcf.class)).c(i)) {
            Long a2 = eso.a(i, this.a, a);
            if (a2 != null) {
                return gwb.a(a2);
            }
            return eso.d(i).f("babel_exp").a(this.a, a);
        }
        glk.d("Babel", "Invalid account getting long experiment " + i, new Object[0]);
        return a;
    }

    private static Boolean a(int i, String str, boolean z) {
        for (fdp fdp : jyn.c(gwb.H(), fdp.class)) {
            if (fdp.a()) {
                return Boolean.valueOf(fdp.b());
            }
        }
        return null;
    }

    private static Long a(int i, String str, long j) {
        for (fdp fdp : jyn.c(gwb.H(), fdp.class)) {
            if (fdp.a()) {
                return Long.valueOf(fdp.c());
            }
        }
        return null;
    }

    private static jci d(int i) {
        return ((jcf) jyn.a(gwb.H(), jcf.class)).b(i);
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        return new StringBuilder((((String.valueOf(str).length() + 96) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("BabelExperiment{id='").append(str).append("', experimentType=").append(i).append(", defaultBoolean=").append(valueOf).append(", defaultLong=").append(valueOf2).append(", defaultFloat=").append(valueOf3).append("}").toString();
    }
}
