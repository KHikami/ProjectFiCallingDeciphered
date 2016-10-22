public final class ixb {
    private final izu a;
    private final izw b;
    private final iyr<ixe> c;
    private final int d;

    ixb(izw izw, iyr<ixe> iyr_ixe, Integer num, int i) {
        this.b = (izw) ba.a((Object) izw);
        this.c = (iyr) ba.a((Object) iyr_ixe);
        this.d = num;
        this.a = new izu(i);
    }

    public boolean a() {
        return !this.a.a();
    }

    public void a(ook ook) {
        a(null, ook, null);
    }

    void a(String str, ook ook, onw onw) {
        if (this.d == ixd.a) {
            b(str, ook, onw);
            return;
        }
        ixx ixx = ixx.c;
        ixx.b().submit(new ixc(this, str, ook, onw));
    }

    void b(String str, ook ook, onw onw) {
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
        ook a = ((ixe) this.c.a()).a(ook);
        if (str != null) {
            a.c = str;
        }
        if (onw != null) {
            a.n = onw;
        }
        this.b.a(a);
        this.a.b();
    }
}
