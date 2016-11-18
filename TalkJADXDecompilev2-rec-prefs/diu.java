package p000;

import android.os.Vibrator;
import android.provider.Settings.System;
import com.google.android.apps.hangouts.hangout.IncomingRing;

public final class diu extends iiq<Void, Void, dix> {
    final /* synthetic */ boolean f9899a;
    final /* synthetic */ IncomingRing f9900b;

    public diu(IncomingRing incomingRing, boolean z) {
        this.f9900b = incomingRing;
        this.f9899a = z;
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m12025a((dix) obj);
    }

    private dix m12024a() {
        dix dix = new dix();
        dix.f9903b = ((fuz) jyn.m25426a(gwb.m1400H(), fuz.class)).m16295c(this.f9900b.f6364c.m5638g());
        String str = "Babel_IncomingRing";
        String str2 = "shouldVibrate=%s silent=%s";
        Object[] objArr = new Object[2];
        objArr[0] = dix.f9903b ? "yes" : "no";
        objArr[1] = this.f9899a ? "yes" : "no";
        glk.m17970a(str, str2, objArr);
        IncomingRing incomingRing = this.f9900b;
        int i = (incomingRing.f6368g || incomingRing.m8638g()) ? 1 : 0;
        str2 = incomingRing.m8641j();
        str = gwb.m2084c(incomingRing.f6364c);
        if (i != 0) {
            i = gwb.ir;
        } else {
            i = gwb.iw;
        }
        String b = gld.m17942b(i);
        dix.f9902a = gku.m17905a(System.DEFAULT_RINGTONE_URI, str2, str, b);
        return dix;
    }

    private void m12025a(dix dix) {
        if (this.f9900b.f6367f) {
            glk.m17970a("Babel_IncomingRing", "ringing has been stopped", new Object[0]);
            return;
        }
        if (dix.f9902a != null) {
            glk.m17970a("Babel_IncomingRing", "play ringtone", new Object[0]);
            this.f9900b.f6366e.m17886a(dix.f9902a, true, 2, 1.0f);
        }
        if (dix.f9903b && !this.f9899a) {
            glk.m17970a("Babel_IncomingRing", "start vibration", new Object[0]);
            this.f9900b.f6365d = (Vibrator) gwb.m1400H().getSystemService("vibrator");
            this.f9900b.f6365d.vibrate(IncomingRing.f6354a, 0);
        }
    }
}
