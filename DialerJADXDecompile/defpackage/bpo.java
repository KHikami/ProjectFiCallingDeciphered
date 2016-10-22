package defpackage;

/* renamed from: bpo */
final class bpo extends bno implements bpe {
    private final bpp a;

    public bpo(bnp bnp) {
        super(bnp);
        this.a = new bpp();
    }

    public final void a(String str, int i) {
        if ("ga_sessionTimeout".equals(str)) {
            this.a.c = i;
        } else {
            d("int configuration name not recognized", str);
        }
    }

    public final void a(String str, String str2) {
        this.a.g.put(str, str2);
    }

    public final void a(String str, boolean z) {
        int i = 1;
        bpp bpp;
        if ("ga_autoActivityTracking".equals(str)) {
            bpp = this.a;
            if (!z) {
                i = 0;
            }
            bpp.d = i;
        } else if ("ga_anonymizeIp".equals(str)) {
            bpp = this.a;
            if (!z) {
                i = 0;
            }
            bpp.e = i;
        } else if ("ga_reportUncaughtExceptions".equals(str)) {
            bpp = this.a;
            if (!z) {
                i = 0;
            }
            bpp.f = i;
        } else {
            d("bool configuration name not recognized", str);
        }
    }

    public final void b(String str, String str2) {
        if ("ga_trackingId".equals(str)) {
            this.a.a = str2;
        } else if ("ga_sampleFrequency".equals(str)) {
            try {
                this.a.b = Double.parseDouble(str2);
            } catch (NumberFormatException e) {
                c("Error parsing ga_sampleFrequency value", str2, e);
            }
        } else {
            d("string configuration name not recognized", str);
        }
    }

    public final /* synthetic */ fr a() {
        return this.a;
    }
}
