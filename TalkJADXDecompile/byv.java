import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

final class byv extends cbc implements byu, jza {
    jca a;
    byq b;
    dw c;
    iih d;
    fit e;
    fmf f;
    bko g;
    private ed i;
    private jxz j;

    protected byv(Context context, kbu kbu) {
        super(context, kbu);
        this.j = new byw(this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (jca) jyn.a(jca.class);
        this.b = (byq) jyn.a(byq.class);
        this.c = (dw) jyn.a(dw.class);
        this.i = (ed) jyn.a(ed.class);
        this.d = (iih) jyn.a(iih.class);
        this.e = (fit) jyn.a(fit.class);
        this.f = (fmf) jyn.a(fmf.class);
        this.g = fde.e(this.a.a());
    }

    public String b() {
        if (h() == null) {
            return "";
        }
        if (this.b.s()) {
            return this.h.getString(gwb.kt, new Object[]{r0});
        }
        return this.h.getString(gwb.ks, new Object[]{r0});
    }

    public boolean e() {
        if (this.b.d() != 1 || this.b.h()) {
            return false;
        }
        return true;
    }

    public void g() {
        if (!a()) {
            glk.e("Babel_BlockConversation", "Not able to block/unblock when clicking on block/unblock option", new Object[0]);
        } else if (this.b.s()) {
            this.d.a(this.a.a()).b().c(3300);
            this.e.a(this.f.a(-1), this.a.a(), this.b.q().b.a, this.b.q().b.b, this.b.q().e, false, true);
            Toast.makeText(this.h, this.h.getString(bc.jJ, new Object[]{h()}), 0).show();
            this.b.c(false);
            this.b.u();
        } else {
            CharSequence string;
            this.d.a(this.a.a()).b().c(3299);
            String h = h();
            String string2 = this.h.getString(bc.iG, new Object[]{h});
            if (this.b.t()) {
                string = this.h.getString(bc.iC);
            } else if (gwb.i(this.b.e())) {
                string = this.h.getString(bc.iD);
            } else {
                string = this.h.getString(bc.iF);
            }
            jxy a = jxy.a(string2, string, this.h.getString(bc.iE), this.h.getString(bc.O), 0, 0, gwb.iE);
            a.a(this.j);
            a.a(this.i, null);
            this.d.a(this.a.a()).b().c(1818);
        }
    }

    boolean a() {
        if (this.b.d() != 1 || this.b.q() == null) {
            return false;
        }
        return true;
    }

    private String h() {
        if (this.b.q() != null) {
            return gld.d(this.b.q().e);
        }
        return null;
    }
}
