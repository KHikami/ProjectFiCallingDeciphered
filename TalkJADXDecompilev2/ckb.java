package defpackage;

final class ckb extends ckg {
    final /* synthetic */ cjv a;

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Void) obj);
    }

    public ckb(cjv cjv) {
        this.a = cjv;
        super(cjv.getContext(), cjv.h, cjv.f, cjv.g);
    }

    private void a(Void voidR) {
        super.onPostExecute(voidR);
        if (this.a.isAdded() && this == this.a.i && this.a.h.a() == 0) {
            this.a.d.setVisibility(8);
            this.a.e.setVisibility(0);
            this.a.b.setVisibility(8);
            this.a.i = null;
        }
    }
}
