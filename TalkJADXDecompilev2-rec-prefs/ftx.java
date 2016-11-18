package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.settings.RichStatusSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class ftx extends jzn implements jwg {
    bko f13994a;
    ftu f13995b;
    private jca f13996c;
    private fvv f13997d;

    public ftx() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f13996c = (jca) this.binder.m25443a(jca.class);
        this.f13997d = (fvv) this.binder.m25443a(fvv.class);
        this.lifecycle.m25514a(new fub(this));
        this.f13994a = fde.m15018e(this.f13996c.mo2317a());
    }

    AlertDialog m16236b() {
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int round = Math.round(10.0f * (((float) this.context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
        int round2 = Math.round(25.0f * (((float) this.context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
        layoutParams.setMargins(round2, round, round2, 0);
        View linearLayout = new LinearLayout(this.context);
        TextView textView = new TextView(this.context);
        Uri h = gwb.m2231h("https://support.google.com/hangouts/?p=profile_photo", "profile_photo");
        gwb.m1819a(textView, this.context, this.context.getString(bc.f2935S, new Object[]{h.toString()}));
        linearLayout.addView(textView, layoutParams);
        return new Builder(this.context).setTitle(bc.f2937U).setView(linearLayout).setNegativeButton(bc.f2934R, new ftz(this)).setPositiveButton(bc.f2936T, new fty(this)).create();
    }

    public void mo495a() {
        jwo jwo = new jwo(this.context);
        PreferenceCategory a = jwo.m25341a(bc.cQ);
        if (gwb.m1923a(this.f13994a, bnc.GOOGLE_PLUS)) {
            this.f13995b = new ftu(this.context);
            this.f13995b.m5148g(bc.f2937U);
            this.f13995b.m5122a(new fua(this));
            this.f13995b.m16218a(this.f13994a.m5647p(), this.f13994a);
            a.m10483c(this.f13995b);
            this.f13995b.m5107B().m25366a(new fub(this));
        }
        fzw fzw = (fzw) this.binder.m25443a(fzw.class);
        int a2 = this.f13996c.mo2317a();
        if (gwb.m1906a(this.context, "babel_richstatus", true) && !fzw.mo2146a(a2)) {
            CharSequence string;
            Intent intent = new Intent(this.context, RichStatusSettingsActivity.class);
            intent.putExtra("account_id", this.f13996c.mo2317a());
            CharSequence string2 = getString(bc.jY);
            if (this.f13997d.m16339b(a2) || this.f13997d.m16340c(a2)) {
                string = getString(bc.ld);
            } else {
                string = getString(bc.lc);
            }
            a.m10483c(jwo.m25344a(string2, string, intent));
        }
    }
}
