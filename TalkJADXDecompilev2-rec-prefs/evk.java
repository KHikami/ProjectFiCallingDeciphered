package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public class evk extends esw {
    private static final long serialVersionUID = 1;
    public final String f12366c;
    public final boolean f12367d;
    public final int f12368e;
    public final boolean f12369f = true;

    public evk(String str, boolean z, int i, boolean z2) {
        this.f12366c = str;
        this.f12367d = z;
        this.f12368e = i;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lvc = new lvc();
        lvc.requestHeader = euk.m14556a(str, i, i2, this.i);
        lvc.f26575b = this.f12366c;
        lvc.f26574a = Boolean.valueOf(this.f12367d);
        lvc.f26576c = Integer.valueOf(this.f12368e);
        lvc.f26577d = Boolean.valueOf(this.f12369f);
        return lvc;
    }

    public String mo1947g() {
        return "clients/setactiveclient";
    }

    public long mo1017b() {
        return TimeUnit.SECONDS.toMillis(120);
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        String str = "BabelClient";
        String str2 = "SetActiveClientPeriodicTask failed: ";
        String valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
        glk.m17981d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (fdo.m15084c() == 111) {
            ((fnc) jyn.m25426a(context, fnc.class)).mo2044a(bko.m5638g());
        }
    }

    public String K_() {
        return "background_queue";
    }

    public boolean mo1015a(ead ead) {
        iil.m21869a(getClass(), ead.getClass());
        return true;
    }

    public boolean mo1022a(int i) {
        return true;
    }
}
