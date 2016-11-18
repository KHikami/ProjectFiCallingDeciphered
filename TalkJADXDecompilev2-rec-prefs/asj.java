package p000;

public final class asj {
    private final ban<anv, String> f2282a = new ban(1000);
    private final ll<asl> f2283b = bas.m4695b(10, new ask(this));

    public String m3937a(anv anv) {
        String str;
        synchronized (this.f2282a) {
            str = (String) this.f2282a.m3912b((Object) anv);
        }
        if (str == null) {
            str = m3936b(anv);
        }
        synchronized (this.f2282a) {
            this.f2282a.m3913b(anv, str);
        }
        return str;
    }

    private String m3936b(anv anv) {
        asl asl = (asl) this.f2283b.mo436a();
        try {
            anv.mo308a(asl.f2285a);
            String a = baq.m4682a(asl.f2285a.digest());
            return a;
        } finally {
            this.f2283b.mo437a(asl);
        }
    }
}
