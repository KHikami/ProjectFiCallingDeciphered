package p000;

final class ckb extends ckg {
    final /* synthetic */ cjv f5491a;

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7838a((Void) obj);
    }

    public ckb(cjv cjv) {
        this.f5491a = cjv;
        super(cjv.getContext(), cjv.f5476h, cjv.f5474f, cjv.f5475g);
    }

    private void m7838a(Void voidR) {
        super.onPostExecute(voidR);
        if (this.f5491a.isAdded() && this == this.f5491a.f5477i && this.f5491a.f5476h.a() == 0) {
            this.f5491a.f5472d.setVisibility(8);
            this.f5491a.f5473e.setVisibility(0);
            this.f5491a.f5470b.setVisibility(8);
            this.f5491a.f5477i = null;
        }
    }
}
