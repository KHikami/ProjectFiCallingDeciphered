package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: dfw */
final class dfw implements dft {
    int a;
    Context b;
    iih c;
    private bbn d;
    private jca e;
    private bbm f;
    private jcf g;

    dfw() {
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = context;
        this.d = (bbn) jyn.b(bbn.class);
        this.c = (iih) jyn.a(iih.class);
        this.e = (jca) jyn.a(jca.class);
        this.f = (bbm) jyn.a(bbm.class);
        this.g = (jcf) jyn.a(jcf.class);
    }

    public void a(int i, View view) {
        ViewStub viewStub = (ViewStub) view.getRootView().findViewById(i);
        viewStub.setLayoutResource(gwb.pV);
        View inflate = viewStub.inflate();
        TextView textView = (TextView) inflate.findViewById(gwb.pS);
        textView.setText(Html.fromHtml(this.b.getResources().getString(gwb.pW, new Object[]{gwb.K("fi_sms_integration")})));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) inflate.findViewById(gwb.pT)).setOnClickListener(new dfx(this, inflate));
        ((Button) inflate.findViewById(gwb.pU)).setOnClickListener(new dfy(this, inflate));
    }

    private boolean c() {
        return this.g.a(this.a).a("gv_sms_promo_seen_status", false);
    }

    protected void b() {
        this.g.b(this.a).b("gv_sms_promo_seen_status", true).d();
    }

    public boolean a() {
        this.a = this.e.a();
        if (this.d == null || this.a == -1) {
            glk.a("Babel_GvSmsPromo", "null device or account", new Object[0]);
            return false;
        } else if (!fde.i()) {
            glk.a("Babel_GvSmsPromo", "not carrier sms", new Object[0]);
            return false;
        } else if (this.a != this.d.a()) {
            glk.a("Babel_GvSmsPromo", "not fi account", new Object[0]);
            return false;
        } else if (this.f.e(this.a)) {
            glk.a("Babel_GvSmsPromo", "integration already enabled", new Object[0]);
            return false;
        } else if (c()) {
            glk.a("Babel_GvSmsPromo", "already shown", new Object[0]);
            return false;
        } else {
            glk.a("Babel_GvSmsPromo", "enabled", new Object[0]);
            return true;
        }
    }
}
