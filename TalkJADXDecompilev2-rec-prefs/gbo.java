package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;

public final class gbo extends dyy {
    private static final int f14605f = etx.STATUS_MESSAGE.f12271l;
    private final fzw f14606g;
    private final ero f14607h;
    private String f14608i;
    private Spannable f14609j;
    private final erl f14610k = new gbp(this);

    gbo(Context context) {
        this.f14606g = (fzw) jyn.m25426a(context, fzw.class);
        this.f14607h = (ero) jyn.m25426a(context, ero.class);
    }

    public boolean mo1785h() {
        return (this.a == null || this.f14606g.mo2146a(this.a.m5638g())) ? false : true;
    }

    public void mo2178a(bko bko) {
        if (this.a == null || !this.a.equals(bko)) {
            m16864a(null);
        }
        super.mo2178a(bko);
    }

    public void mo2179a(boolean z) {
        if (!z || this.a == null || this.f14606g.mo2146a(this.a.m5638g())) {
            this.f14607h.m14333a(this.f14610k);
            return;
        }
        this.f14607h.m14331a(this.a.m5638g(), this.a.m5632b().f11244a, this.f14610k, f14605f);
    }

    public int mo1639a() {
        return bc.gi;
    }

    public CharSequence mo2180f() {
        return this.f14609j;
    }

    public int mo1641b() {
        return R$drawable.co;
    }

    public int mo1642c() {
        return 3;
    }

    public void mo1640a(Activity activity) {
        gwb.m1823a(this.a, 1921);
        int g = this.a.m5638g();
        String str = this.f14608i;
        Intent intent = new Intent(activity, StatusMessageSettingsActivity.class);
        intent.putExtra("account_id", g);
        intent.putExtra("status_message", str);
        activity.startActivity(intent);
    }

    public int mo1643d() {
        return 1;
    }

    public int mo1644e() {
        return 3;
    }

    void m16864a(String str) {
        this.f14608i = str;
        this.f14609j = this.f14608i != null ? gld.m17922a(Html.fromHtml(str)) : null;
        if (this.c != null) {
            this.c.setText(this.f14609j);
            if (TextUtils.isEmpty(this.f14609j)) {
                this.c.setVisibility(8);
                return;
            }
            gob.m18199a(this.c.getContext()).mo2308a(this.f14609j, null, this.c);
            this.c.setVisibility(0);
        }
    }
}
