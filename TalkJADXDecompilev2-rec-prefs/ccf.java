package p000;

import android.view.View;

public final class ccf extends ccv<ccg> {
    private bko f4997e;

    public ccf(View view, ccg ccg, gai gai, int i) {
        super(view, ccg, gai);
        this.f4997e = fde.m15018e(i);
    }

    public void mo806a(boolean z) {
        boolean z2 = !((ccg) this.c).m7197b() && z;
        super.mo806a(z2);
    }

    protected boolean mo809a() {
        boolean i = gwb.m2254i(((ccg) this.c).m7196a());
        Object obj;
        if (((fzw) jyn.m25426a(this.b, fzw.class)).mo2148b(this.f4997e.m5638g()) && this.f4997e.m5650s()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (!i || r0 == null || ((ccg) this.c).m7198c()) {
            return false;
        }
        return true;
    }

    protected gag mo810b() {
        int a = ((ccg) this.c).m7196a();
        String str = null;
        if (gwb.m2291l(a)) {
            if (this.f4997e.m5626M()) {
                return m7186e().m16814a(this.b.getResources().getString(bc.jC)).m16811a();
            }
            str = this.f4997e.m5651t();
        } else if (gwb.m2237h(a)) {
            str = bko.m5608A();
        }
        return m7186e().m16814a(this.b.getString(bc.kf, new Object[]{glq.m18038i(gwb.m1400H(), str)})).m16811a();
    }
}
