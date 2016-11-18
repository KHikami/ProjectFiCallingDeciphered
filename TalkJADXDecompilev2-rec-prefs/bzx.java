package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.R$drawable;

final class bzx extends cbc implements bzl, jza {
    jca f4855a;
    byq f4856b;
    bmq f4857c;
    private ed f4858d;
    private drc f4859e;
    private iih f4860f;
    private gie f4861g;
    private bzy f4862i;

    protected bzx(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4855a = (jca) jyn.m25443a(jca.class);
        this.f4856b = (byq) jyn.m25443a(byq.class);
        this.f4857c = (bmq) jyn.m25443a(bmq.class);
        this.f4858d = (ed) jyn.m25443a(ed.class);
        this.f4859e = (drc) jyn.m25454b(drc.class);
        this.f4860f = (iih) jyn.m25443a(iih.class);
        this.f4861g = (gie) jyn.m25443a(gie.class);
        this.f4862i = new bzy(this, this.h, this.f4858d);
        this.f4861g.mo2274a(bow.class, this.f4862i, new bow(this.f4856b.m6921a(), this.f4855a.mo2317a(), box.GROUP_CONVERSATION_LINK).m6328a());
    }

    public String mo783b() {
        return this.h.getString(gwb.kD);
    }

    public int mo781f() {
        return R$drawable.cm;
    }

    void m7043a() {
        if (TextUtils.isEmpty(this.f4856b.m6953m())) {
            glk.m17982e("Babel_GroupLinkSharing", "Attempted to share a group conversation link without a valid URL", new Object[0]);
            return;
        }
        this.h.startActivity(Intent.createChooser(gwb.m2079c(this.h.getString(gwb.kB), this.f4856b.m6953m()), this.h.getString(gwb.kD)));
    }

    public boolean mo780e() {
        boolean z;
        if (!gwb.m2254i(this.f4856b.m6942e()) && this.f4856b.m6938d() == 2) {
            int n = this.f4856b.m6954n();
            z = n == 1 || n == 2;
            if (z) {
                z = true;
                if (z || this.f4856b.m6954n() != 1) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (z) {
        }
        return false;
    }

    public void mo782g() {
        if (this.f4856b.m6954n() != 1) {
            glk.m17982e("Babel_GroupLinkSharing", "Attempted to share a group conversation link while link sharing is not enabled", new Object[0]);
            return;
        }
        this.f4860f.mo1979a(this.f4855a.mo2317a()).mo1693b().mo1714c(3189);
        if (TextUtils.isEmpty(this.f4856b.m6953m())) {
            this.f4859e.mo1654a(this.f4855a.mo2317a(), this.f4856b.m6921a());
            this.f4862i.mo795a(this.h.getResources().getString(gwb.kA), "", "arg_task_tag", true);
            return;
        }
        m7043a();
    }
}
