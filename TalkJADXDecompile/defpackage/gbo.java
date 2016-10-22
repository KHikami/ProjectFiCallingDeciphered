package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;

/* renamed from: gbo */
public final class gbo extends dyy {
    private static final int f;
    private final fzw g;
    private final ero h;
    private String i;
    private Spannable j;
    private final erl k;

    static {
        f = etx.STATUS_MESSAGE.l;
    }

    gbo(Context context) {
        this.k = new gbp(this);
        this.g = (fzw) jyn.a(context, fzw.class);
        this.h = (ero) jyn.a(context, ero.class);
    }

    public boolean h() {
        return (this.a == null || this.g.a(this.a.g())) ? false : true;
    }

    public void a(bko bko) {
        if (this.a == null || !this.a.equals(bko)) {
            a(null);
        }
        super.a(bko);
    }

    public void a(boolean z) {
        if (!z || this.a == null || this.g.a(this.a.g())) {
            this.h.a(this.k);
            return;
        }
        this.h.a(this.a.g(), this.a.b().a, this.k, f);
    }

    public int a() {
        return bc.gi;
    }

    public CharSequence f() {
        return this.j;
    }

    public int b() {
        return R$drawable.co;
    }

    public int c() {
        return 3;
    }

    public void a(Activity activity) {
        gwb.a(this.a, 1921);
        int g = this.a.g();
        String str = this.i;
        Intent intent = new Intent(activity, StatusMessageSettingsActivity.class);
        intent.putExtra("account_id", g);
        intent.putExtra("status_message", str);
        activity.startActivity(intent);
    }

    public int d() {
        return 1;
    }

    public int e() {
        return 3;
    }

    void a(String str) {
        this.i = str;
        this.j = this.i != null ? gld.a(Html.fromHtml(str)) : null;
        if (this.c != null) {
            this.c.setText(this.j);
            if (TextUtils.isEmpty(this.j)) {
                this.c.setVisibility(8);
                return;
            }
            gob.a(this.c.getContext()).a(this.j, null, this.c);
            this.c.setVisibility(0);
        }
    }
}
