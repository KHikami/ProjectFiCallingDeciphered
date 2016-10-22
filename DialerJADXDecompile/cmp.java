final class cmp implements cjy {
    private boolean a;
    private /* synthetic */ cjy b;

    cmp(cmo cmo, cjy cjy) {
        this.b = cjy;
        this.a = false;
    }

    public final void a(String str) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b.a(str);
        }
    }
}
