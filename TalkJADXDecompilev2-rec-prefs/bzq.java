package p000;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;

final class bzq extends cbb implements bzk, jza {
    jca f4834a;
    byq f4835b;
    bmq f4836c;
    drc f4837d;
    iih f4838e;
    private ed f4839f;
    private gie f4840g;
    private bzt f4841i;

    protected bzq(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4834a = (jca) jyn.m25443a(jca.class);
        this.f4835b = (byq) jyn.m25443a(byq.class);
        this.f4836c = (bmq) jyn.m25443a(bmq.class);
        this.f4839f = (ed) jyn.m25443a(ed.class);
        this.f4837d = (drc) jyn.m25454b(drc.class);
        this.f4838e = (iih) jyn.m25443a(iih.class);
        this.f4840g = (gie) jyn.m25443a(gie.class);
        this.f4841i = new bzt(this, this.h, this.f4839f);
        this.f4840g.mo2274a(bow.class, this.f4841i, new bow(this.f4835b.m6921a(), this.f4834a.mo2317a(), box.GROUP_LINK_SHARING_STATUS).m6328a());
    }

    public String mo783b() {
        return this.h.getString(gwb.kH);
    }

    public boolean mo793a() {
        return this.f4835b.m6954n() == 1;
    }

    void m7026h() {
        this.f4841i.mo795a(this.h.getResources().getString(bc.f2938V), "", "arg_task_tag", true);
    }

    public boolean mo780e() {
        if (!gwb.m2254i(this.f4835b.m6942e()) && this.f4835b.m6938d() == 2) {
            boolean z;
            int n = this.f4835b.m6954n();
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

    public void mo782g() {
        if (this.f4837d == null) {
            return;
        }
        if (this.f4835b.m6954n() == 1) {
            m7026h();
            for (String a : this.f4835b.m6933b()) {
                this.f4837d.mo1655a(this.f4834a.mo2317a(), a, 2);
            }
            this.f4838e.mo1979a(this.f4834a.mo2317a()).mo1693b().mo1714c(3188);
            this.f4835b.m6939d(2);
            return;
        }
        new Builder(this.h).setTitle(this.h.getResources().getString(gwb.kG)).setMessage(this.h.getResources().getString(gwb.kF)).setNegativeButton(this.h.getResources().getString(bc.f2931O), new bzs(this)).setPositiveButton(this.h.getResources().getString(gwb.kE), new bzr(this)).create().show();
    }
}
