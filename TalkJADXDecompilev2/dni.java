package defpackage;

final class dni implements ijl<lys> {
    final /* synthetic */ lym a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dnh c;

    dni(dnh dnh, lym lym, boolean z) {
        this.c = dnh;
        this.a = lym;
        this.b = z;
    }

    public /* bridge */ /* synthetic */ void a(nzf nzf) {
        a();
    }

    public /* bridge */ /* synthetic */ void b(nzf nzf) {
        b();
    }

    private void b() {
        glk.e("Babel", String.format("Knock response failed... retrying in %d ms", new Object[]{Long.valueOf(dnh.b)}), new Object[0]);
        this.c.i.postDelayed(new dnj(this), dnh.b);
    }

    private void a() {
        if (dnh.a) {
            String.format("Successfully responded to knock (%s)", new Object[]{this.a.b});
        }
    }
}
