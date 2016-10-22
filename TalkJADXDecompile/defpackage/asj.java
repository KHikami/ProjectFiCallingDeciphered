package defpackage;

/* renamed from: asj */
public final class asj {
    private final ban<anv, String> a;
    private final ll<asl> b;

    public asj() {
        this.a = new ban(1000);
        this.b = bas.b(10, new ask(this));
    }

    public String a(anv anv) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.b((Object) anv);
        }
        if (str == null) {
            str = b(anv);
        }
        synchronized (this.a) {
            this.a.b(anv, str);
        }
        return str;
    }

    private String b(anv anv) {
        asl asl = (asl) this.b.a();
        try {
            anv.a(asl.a);
            String a = baq.a(asl.a.digest());
            return a;
        } finally {
            this.b.a(asl);
        }
    }
}
