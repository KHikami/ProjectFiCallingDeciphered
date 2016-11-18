package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

final class dfw implements dft {
    int f9630a;
    Context f9631b;
    iih f9632c;
    private bbn f9633d;
    private jca f9634e;
    private bbm f9635f;
    private jcf f9636g;

    dfw() {
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f9631b = context;
        this.f9633d = (bbn) jyn.m25454b(bbn.class);
        this.f9632c = (iih) jyn.m25443a(iih.class);
        this.f9634e = (jca) jyn.m25443a(jca.class);
        this.f9635f = (bbm) jyn.m25443a(bbm.class);
        this.f9636g = (jcf) jyn.m25443a(jcf.class);
    }

    public void mo478a(int i, View view) {
        ViewStub viewStub = (ViewStub) view.getRootView().findViewById(i);
        viewStub.setLayoutResource(gwb.pV);
        View inflate = viewStub.inflate();
        TextView textView = (TextView) inflate.findViewById(gwb.pS);
        textView.setText(Html.fromHtml(this.f9631b.getResources().getString(gwb.pW, new Object[]{gwb.m1415K("fi_sms_integration")})));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) inflate.findViewById(gwb.pT)).setOnClickListener(new dfx(this, inflate));
        ((Button) inflate.findViewById(gwb.pU)).setOnClickListener(new dfy(this, inflate));
    }

    private boolean m11624c() {
        return this.f9636g.mo3456a(this.f9630a).mo3439a("gv_sms_promo_seen_status", false);
    }

    protected void m11628b() {
        this.f9636g.mo3464b(this.f9630a).m23881b("gv_sms_promo_seen_status", true).m23891d();
    }

    public boolean mo480a() {
        this.f9630a = this.f9634e.mo2317a();
        if (this.f9633d == null || this.f9630a == -1) {
            glk.m17970a("Babel_GvSmsPromo", "null device or account", new Object[0]);
            return false;
        } else if (!fde.m15028i()) {
            glk.m17970a("Babel_GvSmsPromo", "not carrier sms", new Object[0]);
            return false;
        } else if (this.f9630a != this.f9633d.mo2198a()) {
            glk.m17970a("Babel_GvSmsPromo", "not fi account", new Object[0]);
            return false;
        } else if (this.f9635f.mo445e(this.f9630a)) {
            glk.m17970a("Babel_GvSmsPromo", "integration already enabled", new Object[0]);
            return false;
        } else if (m11624c()) {
            glk.m17970a("Babel_GvSmsPromo", "already shown", new Object[0]);
            return false;
        } else {
            glk.m17970a("Babel_GvSmsPromo", "enabled", new Object[0]);
            return true;
        }
    }
}
