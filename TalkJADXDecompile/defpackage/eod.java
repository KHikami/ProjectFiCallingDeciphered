package defpackage;

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

/* renamed from: eod */
public final class eod implements lhi {
    private static final gma c;
    final Context a;
    dex b;
    private final dth d;

    static {
        c = gma.a("HangoutsAppStartupListener");
    }

    eod(Context context, dti dti) {
        this.a = context;
        this.d = dti.a(17);
    }

    public void a() {
        c.b("onApplicationStartup");
        long b = glj.b();
        gwb.B(this.a);
        if (glk.a("Babel_strictmode")) {
            glk.c("Babel", "Enable strict logging early due to tag", new Object[0]);
            StrictMode.setThreadPolicy(new Builder().detectAll().penaltyLog().build());
        }
        if (Log.isLoggable("Babel_profile", 3)) {
            kae kae = glk.y;
        }
        try {
            NativeCrashHandler.a(this.a);
        } catch (Throwable e) {
            glk.d("Babel", "Error installing NativeCrashHandler", e);
        } catch (Throwable e2) {
            glk.d("Babel", "Failed to load NativeCrashHandler", e2);
        }
        iil.a();
        glq a = glq.a();
        glo.a();
        iio.a.a(a.a);
        iiq.j = ((long) gwb.a(this.a, "babel_server_request_timeout", 40000)) + 10000;
        jyn b2 = jyn.b(this.a);
        bcs bcs = (bcs) b2.a(bcs.class);
        bcs.a(new eog(this, this.a));
        ffh.a(this.a);
        boolean x = gwb.x(this.a);
        for (bcp a2 : b2.c(bcp.class)) {
            a2.a(this.a, x, bcs);
        }
        Context context = this.a;
        ajf.a = new fxt();
        new fxu(context).start();
        fxe.a();
        gwb.g(this.a).a(new eoe(this));
        b();
        ((bcu) b2.a(bcu.class)).a(x);
        if (!kag.a(this.a)) {
            SmsReceiver.a();
            for (ActivityLifecycleCallbacks registerActivityLifecycleCallbacks : b2.c(ActivityLifecycleCallbacks.class)) {
                ((Application) this.a).registerActivityLifecycleCallbacks(registerActivityLifecycleCallbacks);
            }
            gmp gmp = (gmp) b2.a(gmp.class);
            if (gmp.b() || gmp.a()) {
                Builder builder = new Builder();
                VmPolicy.Builder builder2 = new VmPolicy.Builder();
                builder.detectAll();
                builder2.detectAll();
                builder.penaltyLog();
                builder2.penaltyLog();
                if (gmp.a()) {
                    glk.c("Babel", "Enable strict mode dialog.", new Object[0]);
                    builder.penaltyDialog();
                } else {
                    glk.c("Babel", "Enable strict logging.", new Object[0]);
                }
                StrictMode.setThreadPolicy(builder.build());
                StrictMode.setVmPolicy(builder2.build());
            }
            b2.b(cpr.class);
            this.a.registerComponentCallbacks(new eof(this));
            context = this.a;
            if (dph.a(context)) {
                glk.c("Babel_Prime", "startMemoryMonitor", new Object[0]);
                ((ixk) jyn.a(context, ixk.class)).a();
            } else {
                glk.a("Babel_Prime", "startMemoryMonitor disabled", new Object[0]);
            }
            ((bcv) b2.a(bcv.class)).a(b, glj.b());
            c.c("onApplicationStartup");
        }
    }

    void b() {
        biw g = gwb.g(this.a);
        boolean a = ((gmp) jyn.a(this.a, gmp.class)).a();
        boolean a2 = g.a("babel_asserts", true);
        if (g.a("babel_expensive_asserts", false) || a) {
            a = true;
        } else {
            a = false;
        }
        iil.a = a2;
        iil.b = a;
        glk.a();
        DebugService.a(this.a);
    }
}
