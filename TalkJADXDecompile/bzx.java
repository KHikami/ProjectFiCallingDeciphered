import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.R$drawable;

final class bzx extends cbc implements bzl, jza {
    jca a;
    byq b;
    bmq c;
    private ed d;
    private drc e;
    private iih f;
    private gie g;
    private bzy i;

    protected bzx(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (jca) jyn.a(jca.class);
        this.b = (byq) jyn.a(byq.class);
        this.c = (bmq) jyn.a(bmq.class);
        this.d = (ed) jyn.a(ed.class);
        this.e = (drc) jyn.b(drc.class);
        this.f = (iih) jyn.a(iih.class);
        this.g = (gie) jyn.a(gie.class);
        this.i = new bzy(this, this.h, this.d);
        this.g.a(bow.class, this.i, new bow(this.b.a(), this.a.a(), box.GROUP_CONVERSATION_LINK).a());
    }

    public String b() {
        return this.h.getString(gwb.kD);
    }

    public int f() {
        return R$drawable.cm;
    }

    void a() {
        if (TextUtils.isEmpty(this.b.m())) {
            glk.e("Babel_GroupLinkSharing", "Attempted to share a group conversation link without a valid URL", new Object[0]);
            return;
        }
        this.h.startActivity(Intent.createChooser(gwb.c(this.h.getString(gwb.kB), this.b.m()), this.h.getString(gwb.kD)));
    }

    public boolean e() {
        boolean z;
        if (!gwb.i(this.b.e()) && this.b.d() == 2) {
            int n = this.b.n();
            z = n == 1 || n == 2;
            if (z) {
                z = true;
                if (z || this.b.n() != 1) {
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

    public void g() {
        if (this.b.n() != 1) {
            glk.e("Babel_GroupLinkSharing", "Attempted to share a group conversation link while link sharing is not enabled", new Object[0]);
            return;
        }
        this.f.a(this.a.a()).b().c(3189);
        if (TextUtils.isEmpty(this.b.m())) {
            this.e.a(this.a.a(), this.b.a());
            this.i.a(this.h.getResources().getString(gwb.kA), "", "arg_task_tag", true);
            return;
        }
        a();
    }
}
