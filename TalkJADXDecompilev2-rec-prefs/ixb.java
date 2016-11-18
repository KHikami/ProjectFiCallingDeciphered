package p000;

public final class ixb {
    private final izu f19315a;
    private final izw f19316b;
    private final iyr<ixe> f19317c;
    private final int f19318d;

    ixb(izw izw, iyr<ixe> iyr_ixe, Integer num, int i) {
        this.f19316b = (izw) ba.m4536a((Object) izw);
        this.f19317c = (iyr) ba.m4536a((Object) iyr_ixe);
        this.f19318d = num;
        this.f19315a = new izu(i);
    }

    public boolean m23425a() {
        return !this.f19315a.m23609a();
    }

    public void m23424a(ook ook) {
        m23423a(null, ook, null);
    }

    void m23423a(String str, ook ook, onw onw) {
        if (this.f19318d == ixd.f19323a) {
            m23426b(str, ook, onw);
            return;
        }
        ixx ixx = ixx.f19383c;
        ixx.m23473b().submit(new ixc(this, str, ook, onw));
    }

    void m23426b(String str, ook ook, onw onw) {
        if (ook == null) {
            String str2 = "metric is null, skipping recorded metric for event: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
                return;
            } else {
                valueOf = new String(str2);
                return;
            }
        }
        ook a = ((ixe) this.f19317c.mo3325a()).m23430a(ook);
        if (str != null) {
            a.c = str;
        }
        if (onw != null) {
            a.n = onw;
        }
        this.f19316b.mo3417a(a);
        this.f19315a.m23610b();
    }
}
