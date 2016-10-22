package defpackage;

/* renamed from: bph */
final class bph implements bpe {
    private final bnp a;
    private final bpi b;

    public bph(bnp bnp) {
        this.a = bnp;
        this.b = new bpi();
    }

    public final void a(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.b.d = i;
        } else {
            this.a.a().d("Int xml configuration name not recognized", str);
        }
    }

    public final void a(String str, String str2) {
    }

    public final void a(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.b.e = z ? 1 : 0;
            return;
        }
        this.a.a().d("Bool xml configuration name not recognized", str);
    }

    public final void b(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.b.a = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.b.b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.b.c = str2;
        } else {
            this.a.a().d("String xml configuration name not recognized", str);
        }
    }

    public final /* synthetic */ fr a() {
        return this.b;
    }
}
