package defpackage;

/* compiled from: PG */
/* renamed from: cvm */
public final class cvm {
    public static volatile cvm a;
    private static final cvm c;
    public final cvn b;

    static {
        cvm cvm = new cvm(new cvi());
        c = cvm;
        a = cvm;
    }

    private cvm(cvn cvn) {
        this.b = (cvn) buf.B((Object) cvn);
    }

    public static synchronized cvm a(ctv ctv) {
        cvm cvm;
        synchronized (cvm.class) {
            Object obj;
            if (a != c) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                cvm = a;
            } else {
                cvm = new cvm(ctv.a());
                a = cvm;
            }
        }
        return cvm;
    }

    public final synchronized void a() {
        this.b.a();
    }

    public final synchronized void a(cwn cwn, String str) {
        this.b.a(cwn, str);
    }
}
