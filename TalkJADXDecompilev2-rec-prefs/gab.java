package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

final class gab implements fzy {
    static final Uri f14523a = Uri.parse("market://details?id=com.google.android.apps.messaging&referrer=utm_source%3Dhangouts_9_promo");
    Context f14524b;
    iih f14525c;
    private bbn f14526d;
    private jca f14527e;
    private biw f14528f;
    private fzw f14529g;
    private TelephonyManager f14530h;

    gab() {
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        glk.m17970a("Babel_SmsPromoBanner", "onAttachBinder", new Object[0]);
        this.f14524b = context;
        this.f14526d = (bbn) jyn.m25454b(bbn.class);
        this.f14525c = (iih) jyn.m25443a(iih.class);
        this.f14527e = (jca) jyn.m25443a(jca.class);
        this.f14528f = (biw) jyn.m25443a(biw.class);
        this.f14529g = (fzw) jyn.m25443a(fzw.class);
        this.f14530h = (TelephonyManager) context.getSystemService("phone");
    }

    public boolean mo480a() {
        glk.m17979c("Babel_SmsPromoBanner", "shouldShowPromo", new Object[0]);
        if (!this.f14529g.mo2161i()) {
            glk.m17970a("Babel_SmsPromoBanner", "no sms", new Object[0]);
            return false;
        } else if (!this.f14529g.mo2152c(this.f14527e.mo2317a())) {
            glk.m17970a("Babel_SmsPromoBanner", "not sms account", new Object[0]);
            return false;
        } else if (this.f14526d == null || !this.f14526d.mo2200b()) {
            String networkOperatorName = this.f14530h.getNetworkOperatorName();
            if (networkOperatorName != null && networkOperatorName.contains("Fi Network")) {
                glk.m17970a("Babel_SmsPromoBanner", "is nova network", new Object[0]);
                return false;
            } else if (!glq.m18010b(gwb.m1400H())) {
                glk.m17970a("Babel_SmsPromoBanner", "no sim", new Object[0]);
                return false;
            } else if (glq.m18006a(gwb.m1400H())) {
                glk.m17970a("Babel_SmsPromoBanner", "old: %d new: %d", Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(this.f14524b).getInt("messenger_banner_old_promo_number", 0)), Integer.valueOf(m16804b()));
                if (m16804b() > PreferenceManager.getDefaultSharedPreferences(this.f14524b).getInt("messenger_banner_old_promo_number", 0)) {
                    return true;
                }
                return false;
            } else {
                glk.m17970a("Babel_SmsPromoBanner", "tablet", new Object[0]);
                return false;
            }
        } else {
            glk.m17970a("Babel_SmsPromoBanner", "is nova", new Object[0]);
            return false;
        }
    }

    public void mo478a(int i, View view) {
        glk.m17979c("Babel_SmsPromoBanner", "addToView", new Object[0]);
        ViewStub viewStub = (ViewStub) view.getRootView().findViewById(i);
        viewStub.setLayoutResource(gwb.uN);
        View inflate = viewStub.inflate();
        int a = this.f14527e.mo2317a();
        ((Button) inflate.findViewById(gwb.uL)).setOnClickListener(new gac(this, inflate, a));
        ((Button) inflate.findViewById(gwb.uM)).setOnClickListener(new gad(this, inflate, a));
        this.f14525c.mo1979a(a).mo1693b().mo1714c(2807);
    }

    int m16804b() {
        return this.f14528f.mo560a("babel_messenger_promo_banner_old_attempt_number", 0);
    }
}
