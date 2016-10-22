package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;

/* renamed from: bzq */
final class bzq extends cbb implements bzk, jza {
    jca a;
    byq b;
    bmq c;
    drc d;
    iih e;
    private ed f;
    private gie g;
    private bzt i;

    protected bzq(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (jca) jyn.a(jca.class);
        this.b = (byq) jyn.a(byq.class);
        this.c = (bmq) jyn.a(bmq.class);
        this.f = (ed) jyn.a(ed.class);
        this.d = (drc) jyn.b(drc.class);
        this.e = (iih) jyn.a(iih.class);
        this.g = (gie) jyn.a(gie.class);
        this.i = new bzt(this, this.h, this.f);
        this.g.a(bow.class, this.i, new bow(this.b.a(), this.a.a(), box.GROUP_LINK_SHARING_STATUS).a());
    }

    public String b() {
        return this.h.getString(gwb.kH);
    }

    public boolean a() {
        return this.b.n() == 1;
    }

    void h() {
        this.i.a(this.h.getResources().getString(bc.V), "", "arg_task_tag", true);
    }

    public boolean e() {
        if (!gwb.i(this.b.e()) && this.b.d() == 2) {
            boolean z;
            int n = this.b.n();
            if (n == 1 || n == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void g() {
        if (this.d == null) {
            return;
        }
        if (this.b.n() == 1) {
            h();
            for (String a : this.b.b()) {
                this.d.a(this.a.a(), a, 2);
            }
            this.e.a(this.a.a()).b().c(3188);
            this.b.d(2);
            return;
        }
        new Builder(this.h).setTitle(this.h.getResources().getString(gwb.kG)).setMessage(this.h.getResources().getString(gwb.kF)).setNegativeButton(this.h.getResources().getString(bc.O), new bzs(this)).setPositiveButton(this.h.getResources().getString(gwb.kE), new bzr(this)).create().show();
    }
}
