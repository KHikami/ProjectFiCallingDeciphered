package p000;

final class dni implements ijl<lys> {
    final /* synthetic */ lym f10167a;
    final /* synthetic */ boolean f10168b;
    final /* synthetic */ dnh f10169c;

    dni(dnh dnh, lym lym, boolean z) {
        this.f10169c = dnh;
        this.f10167a = lym;
        this.f10168b = z;
    }

    public /* bridge */ /* synthetic */ void mo1431a(nzf nzf) {
        m12291a();
    }

    public /* bridge */ /* synthetic */ void mo1432b(nzf nzf) {
        m12292b();
    }

    private void m12292b() {
        glk.m17982e("Babel", String.format("Knock response failed... retrying in %d ms", new Object[]{Long.valueOf(dnh.f10152b)}), new Object[0]);
        this.f10169c.f10159i.postDelayed(new dnj(this), dnh.f10152b);
    }

    private void m12291a() {
        if (dnh.f10151a) {
            String.format("Successfully responded to knock (%s)", new Object[]{this.f10167a.f26907b});
        }
    }
}
