package p000;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.VmPolicy;
import android.util.Log;
import com.google.android.apps.hangouts.realtimechat.DebugService;
import com.google.android.apps.hangouts.sms.SmsReceiver;
import com.google.android.libraries.social.jni.crashreporter.NativeCrashHandler;

public final class eod implements lhi {
    private static final gma f11916c = gma.m18073a("HangoutsAppStartupListener");
    final Context f11917a;
    dex f11918b;
    private final dth f11919d;

    eod(Context context, dti dti) {
        this.f11917a = context;
        this.f11919d = dti.mo1673a(17);
    }

    public void mo1922a() {
        f11916c.m18078b("onApplicationStartup");
        long b = glj.m17963b();
        gwb.m1372B(this.f11917a);
        if (glk.m17972a("Babel_strictmode")) {
            glk.m17979c("Babel", "Enable strict logging early due to tag", new Object[0]);
            StrictMode.setThreadPolicy(new Builder().detectAll().penaltyLog().build());
        }
        if (Log.isLoggable("Babel_profile", 3)) {
            kae kae = glk.f15578y;
        }
        try {
            NativeCrashHandler.m10461a(this.f11917a);
        } catch (Throwable e) {
            glk.m17980d("Babel", "Error installing NativeCrashHandler", e);
        } catch (Throwable e2) {
            glk.m17980d("Babel", "Failed to load NativeCrashHandler", e2);
        }
        iil.m21867a();
        glq a = glq.m18000a();
        glo.m17988a();
        iio.f17742a.m21894a(a.f15598a);
        iiq.f3070j = ((long) gwb.m1492a(this.f11917a, "babel_server_request_timeout", 40000)) + 10000;
        jyn b2 = jyn.m25435b(this.f11917a);
        bcs bcs = (bcs) b2.m25443a(bcs.class);
        bcs.mo469a(new eog(this, this.f11917a));
        ffh.m15194a(this.f11917a);
        boolean x = gwb.m2388x(this.f11917a);
        for (bcp a2 : b2.m25457c(bcp.class)) {
            a2.mo466a(this.f11917a, x, bcs);
        }
        Context context = this.f11917a;
        ajf.f1002a = new fxt();
        new fxu(context).start();
        fxe.m16458a();
        gwb.m2214g(this.f11917a).mo563a(new eoe(this));
        m14172b();
        ((bcu) b2.m25443a(bcu.class)).mo474a(x);
        if (!kag.m25500a(this.f11917a)) {
            SmsReceiver.m9184a();
            for (ActivityLifecycleCallbacks registerActivityLifecycleCallbacks : b2.m25457c(ActivityLifecycleCallbacks.class)) {
                ((Application) this.f11917a).registerActivityLifecycleCallbacks(registerActivityLifecycleCallbacks);
            }
            gmp gmp = (gmp) b2.m25443a(gmp.class);
            if (gmp.mo2299b() || gmp.mo2298a()) {
                Builder builder = new Builder();
                VmPolicy.Builder builder2 = new VmPolicy.Builder();
                builder.detectAll();
                builder2.detectAll();
                builder.penaltyLog();
                builder2.penaltyLog();
                if (gmp.mo2298a()) {
                    glk.m17979c("Babel", "Enable strict mode dialog.", new Object[0]);
                    builder.penaltyDialog();
                } else {
                    glk.m17979c("Babel", "Enable strict logging.", new Object[0]);
                }
                StrictMode.setThreadPolicy(builder.build());
                StrictMode.setVmPolicy(builder2.build());
            }
            b2.m25454b(cpr.class);
            this.f11917a.registerComponentCallbacks(new eof(this));
            context = this.f11917a;
            if (dph.m12416a(context)) {
                glk.m17979c("Babel_Prime", "startMemoryMonitor", new Object[0]);
                ((ixk) jyn.m25426a(context, ixk.class)).m23447a();
            } else {
                glk.m17970a("Babel_Prime", "startMemoryMonitor disabled", new Object[0]);
            }
            ((bcv) b2.m25443a(bcv.class)).mo476a(b, glj.m17963b());
            f11916c.m18079c("onApplicationStartup");
        }
    }

    void m14172b() {
        biw g = gwb.m2214g(this.f11917a);
        boolean a = ((gmp) jyn.m25426a(this.f11917a, gmp.class)).mo2298a();
        boolean a2 = g.mo564a("babel_asserts", true);
        if (g.mo564a("babel_expensive_asserts", false) || a) {
            a = true;
        } else {
            a = false;
        }
        iil.f17732a = a2;
        iil.f17733b = a;
        glk.m17968a();
        DebugService.m8972a(this.f11917a);
    }
}
