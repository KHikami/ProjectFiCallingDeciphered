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
    bko a;
    ftu b;
    private jca c;
    private fvv d;

    public ftx() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.c = (jca) this.binder.a(jca.class);
        this.d = (fvv) this.binder.a(fvv.class);
        this.lifecycle.a(new fub(this));
        this.a = fde.e(this.c.a());
    }

    AlertDialog b() {
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int round = Math.round(10.0f * (((float) this.context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
        int round2 = Math.round(25.0f * (((float) this.context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
        layoutParams.setMargins(round2, round, round2, 0);
        View linearLayout = new LinearLayout(this.context);
        TextView textView = new TextView(this.context);
        Uri h = gwb.h("https://support.google.com/hangouts/?p=profile_photo", "profile_photo");
        gwb.a(textView, this.context, this.context.getString(bc.S, new Object[]{h.toString()}));
        linearLayout.addView(textView, layoutParams);
        return new Builder(this.context).setTitle(bc.U).setView(linearLayout).setNegativeButton(bc.R, new ftz(this)).setPositiveButton(bc.T, new fty(this)).create();
    }

    public void a() {
        jwo jwo = new jwo(this.context);
        PreferenceCategory a = jwo.a(bc.cQ);
        if (gwb.a(this.a, bnc.GOOGLE_PLUS)) {
            this.b = new ftu(this.context);
            this.b.g(bc.U);
            this.b.a(new fua(this));
            this.b.a(this.a.p(), this.a);
            a.c(this.b);
            this.b.B().a(new fub(this));
        }
        fzw fzw = (fzw) this.binder.a(fzw.class);
        int a2 = this.c.a();
        if (gwb.a(this.context, "babel_richstatus", true) && !fzw.a(a2)) {
            CharSequence string;
            Intent intent = new Intent(this.context, RichStatusSettingsActivity.class);
            intent.putExtra("account_id", this.c.a());
            CharSequence string2 = getString(bc.jY);
            if (this.d.b(a2) || this.d.c(a2)) {
                string = getString(bc.ld);
            } else {
                string = getString(bc.lc);
            }
            a.c(jwo.a(string2, string, intent));
        }
    }
}
