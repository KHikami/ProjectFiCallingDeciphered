import android.view.View;

public final class ccf extends ccv<ccg> {
    private bko e;

    public ccf(View view, ccg ccg, gai gai, int i) {
        super(view, ccg, gai);
        this.e = fde.e(i);
    }

    public void a(boolean z) {
        boolean z2 = !((ccg) this.c).b() && z;
        super.a(z2);
    }

    protected boolean a() {
        boolean i = gwb.i(((ccg) this.c).a());
        Object obj;
        if (((fzw) jyn.a(this.b, fzw.class)).b(this.e.g()) && this.e.s()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (!i || r0 == null || ((ccg) this.c).c()) {
            return false;
        }
        return true;
    }

    protected gag b() {
        int a = ((ccg) this.c).a();
        String str = null;
        if (gwb.l(a)) {
            if (this.e.M()) {
                return e().a(this.b.getResources().getString(bc.jC)).a();
            }
            str = this.e.t();
        } else if (gwb.h(a)) {
            str = bko.A();
        }
        return e().a(this.b.getString(bc.kf, new Object[]{glq.i(gwb.H(), str)})).a();
    }
}
