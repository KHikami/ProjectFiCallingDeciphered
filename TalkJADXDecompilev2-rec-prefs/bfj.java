package p000;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class bfj implements beo, kcg, kcq {
    String f3202a;
    Context f3203b;
    int f3204c;
    bet f3205d;
    bgb f3206e;
    BroadcastReceiver f3207f;
    ProgressDialog f3208g;
    NetworkInfo f3209h;
    bgc f3210i;

    bfj() {
    }

    public void mo515a(dw dwVar, kbu kbu, PreferenceCategory preferenceCategory, int i) {
        if (gwb.m2222g((Context) dwVar, i)) {
            this.f3203b = dwVar;
            this.f3206e = new bgb(this.f3203b);
            this.f3206e.m5131c(this.f3203b.getString(ba.gR));
            preferenceCategory.m10483c(this.f3206e);
            this.f3209h = ((ConnectivityManager) dwVar.getSystemService("connectivity")).getActiveNetworkInfo();
            this.f3210i = new bgc(this.f3203b, i);
            this.f3202a = glq.m18025f(this.f3203b);
            this.f3204c = i;
            this.f3205d = new bfk(this, dwVar);
            dwVar.m1095f().mo1998b(1, null, new bfq(this)).m1293v();
            kbu.m25514a((kcq) this);
        }
    }

    public void o_() {
        bes.m5028a(this.f3204c, this.f3205d);
        if (this.f3207f != null) {
            ik.m22097a(this.f3203b).m22099a(this.f3207f);
        }
    }

    void m5072a(String str) {
        this.f3210i.m5185a(2246);
        this.f3208g = ProgressDialog.show(this.f3203b, "", this.f3203b.getString(ba.gD), true);
        this.f3207f = new bfp(this);
        ik.m22097a(this.f3203b).m22100a(this.f3207f, new IntentFilter("set_callerid_outcome"));
        ((bem) jyn.m25433b(this.f3203b, bem.class)).mo506a(this.f3204c, false, str);
    }
}
