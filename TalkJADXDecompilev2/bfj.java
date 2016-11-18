package defpackage;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class bfj implements beo, kcg, kcq {
    String a;
    Context b;
    int c;
    bet d;
    bgb e;
    BroadcastReceiver f;
    ProgressDialog g;
    NetworkInfo h;
    bgc i;

    bfj() {
    }

    public void a(dw dwVar, kbu kbu, PreferenceCategory preferenceCategory, int i) {
        if (gwb.g((Context) dwVar, i)) {
            this.b = dwVar;
            this.e = new bgb(this.b);
            this.e.c(this.b.getString(ba.gR));
            preferenceCategory.c(this.e);
            this.h = ((ConnectivityManager) dwVar.getSystemService("connectivity")).getActiveNetworkInfo();
            this.i = new bgc(this.b, i);
            this.a = glq.f(this.b);
            this.c = i;
            this.d = new bfk(this, dwVar);
            dwVar.f().b(1, null, new bfq(this)).v();
            kbu.a((kcq) this);
        }
    }

    public void o_() {
        bes.a(this.c, this.d);
        if (this.f != null) {
            ik.a(this.b).a(this.f);
        }
    }

    void a(String str) {
        this.i.a(2246);
        this.g = ProgressDialog.show(this.b, "", this.b.getString(ba.gD), true);
        this.f = new bfp(this);
        ik.a(this.b).a(this.f, new IntentFilter("set_callerid_outcome"));
        ((bem) jyn.b(this.b, bem.class)).a(this.c, false, str);
    }
}
