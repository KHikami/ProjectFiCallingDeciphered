package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

/* renamed from: gab */
final class gab implements fzy {
    static final Uri a;
    Context b;
    iih c;
    private bbn d;
    private jca e;
    private biw f;
    private fzw g;
    private TelephonyManager h;

    gab() {
    }

    static {
        a = Uri.parse("market://details?id=com.google.android.apps.messaging&referrer=utm_source%3Dhangouts_9_promo");
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        glk.a("Babel_SmsPromoBanner", "onAttachBinder", new Object[0]);
        this.b = context;
        this.d = (bbn) jyn.b(bbn.class);
        this.c = (iih) jyn.a(iih.class);
        this.e = (jca) jyn.a(jca.class);
        this.f = (biw) jyn.a(biw.class);
        this.g = (fzw) jyn.a(fzw.class);
        this.h = (TelephonyManager) context.getSystemService("phone");
    }

    public boolean a() {
        glk.c("Babel_SmsPromoBanner", "shouldShowPromo", new Object[0]);
        if (!this.g.i()) {
            glk.a("Babel_SmsPromoBanner", "no sms", new Object[0]);
            return false;
        } else if (!this.g.c(this.e.a())) {
            glk.a("Babel_SmsPromoBanner", "not sms account", new Object[0]);
            return false;
        } else if (this.d == null || !this.d.b()) {
            String networkOperatorName = this.h.getNetworkOperatorName();
            if (networkOperatorName != null && networkOperatorName.contains("Fi Network")) {
                glk.a("Babel_SmsPromoBanner", "is nova network", new Object[0]);
                return false;
            } else if (!glq.b(gwb.H())) {
                glk.a("Babel_SmsPromoBanner", "no sim", new Object[0]);
                return false;
            } else if (glq.a(gwb.H())) {
                glk.a("Babel_SmsPromoBanner", "old: %d new: %d", Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(this.b).getInt("messenger_banner_old_promo_number", 0)), Integer.valueOf(b()));
                if (b() > PreferenceManager.getDefaultSharedPreferences(this.b).getInt("messenger_banner_old_promo_number", 0)) {
                    return true;
                }
                return false;
            } else {
                glk.a("Babel_SmsPromoBanner", "tablet", new Object[0]);
                return false;
            }
        } else {
            glk.a("Babel_SmsPromoBanner", "is nova", new Object[0]);
            return false;
        }
    }

    public void a(int i, View view) {
        glk.c("Babel_SmsPromoBanner", "addToView", new Object[0]);
        ViewStub viewStub = (ViewStub) view.getRootView().findViewById(i);
        viewStub.setLayoutResource(gwb.uN);
        View inflate = viewStub.inflate();
        int a = this.e.a();
        ((Button) inflate.findViewById(gwb.uL)).setOnClickListener(new gac(this, inflate, a));
        ((Button) inflate.findViewById(gwb.uM)).setOnClickListener(new gad(this, inflate, a));
        this.c.a(a).b().c(2807);
    }

    int b() {
        return this.f.a("babel_messenger_promo_banner_old_attempt_number", 0);
    }
}
