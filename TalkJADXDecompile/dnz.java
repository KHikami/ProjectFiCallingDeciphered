final class dnz implements ijl<lyl> {
    final /* synthetic */ boolean a;
    final /* synthetic */ dny b;

    dnz(dny dny, boolean z) {
        this.b = dny;
        this.a = z;
    }

    public /* bridge */ /* synthetic */ void a(nzf nzf) {
        a();
    }

    public /* bridge */ /* synthetic */ void b(nzf nzf) {
        b();
    }

    private void b() {
        glk.e("Babel", "Failed to change knockable state to " + this.a, new Object[0]);
    }

    private void a() {
        if (dny.a) {
            new StringBuilder(45).append("Successfully changed knockable state to ").append(this.a);
        }
    }
}
