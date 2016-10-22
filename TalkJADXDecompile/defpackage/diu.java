package defpackage;

import android.os.Vibrator;
import android.provider.Settings.System;
import com.google.android.apps.hangouts.hangout.IncomingRing;

/* renamed from: diu */
public final class diu extends iiq<Void, Void, dix> {
    final /* synthetic */ boolean a;
    final /* synthetic */ IncomingRing b;

    public diu(IncomingRing incomingRing, boolean z) {
        this.b = incomingRing;
        this.a = z;
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((dix) obj);
    }

    private dix a() {
        dix dix = new dix();
        dix.b = ((fuz) jyn.a(gwb.H(), fuz.class)).c(this.b.c.g());
        String str = "Babel_IncomingRing";
        String str2 = "shouldVibrate=%s silent=%s";
        Object[] objArr = new Object[2];
        objArr[0] = dix.b ? "yes" : "no";
        objArr[1] = this.a ? "yes" : "no";
        glk.a(str, str2, objArr);
        IncomingRing incomingRing = this.b;
        int i = (incomingRing.g || incomingRing.g()) ? 1 : 0;
        str2 = incomingRing.j();
        str = gwb.c(incomingRing.c);
        if (i != 0) {
            i = gwb.ir;
        } else {
            i = gwb.iw;
        }
        String b = gld.b(i);
        dix.a = gku.a(System.DEFAULT_RINGTONE_URI, str2, str, b);
        return dix;
    }

    private void a(dix dix) {
        if (this.b.f) {
            glk.a("Babel_IncomingRing", "ringing has been stopped", new Object[0]);
            return;
        }
        if (dix.a != null) {
            glk.a("Babel_IncomingRing", "play ringtone", new Object[0]);
            this.b.e.a(dix.a, true, 2, 1.0f);
        }
        if (dix.b && !this.a) {
            glk.a("Babel_IncomingRing", "start vibration", new Object[0]);
            this.b.d = (Vibrator) gwb.H().getSystemService("vibrator");
            this.b.d.vibrate(IncomingRing.a, 0);
        }
    }
}
