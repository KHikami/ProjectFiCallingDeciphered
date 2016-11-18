package p000;

import android.content.Context;
import android.content.res.Configuration;

public final class fxu extends Thread {
    final /* synthetic */ Context f14334a;

    public fxu(Context context) {
        this.f14334a = context;
    }

    public void run() {
        Configuration configuration = this.f14334a.getResources().getConfiguration();
        int i = configuration.mcc;
        glk.m17979c("Babel_SMS", "MmsConfig: mnc/mcc: " + i + "/" + configuration.mnc, new Object[0]);
        fxt.m16511a(this.f14334a);
    }
}
