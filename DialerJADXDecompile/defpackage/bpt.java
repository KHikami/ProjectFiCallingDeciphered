package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;

/* renamed from: bpt */
public class bpt {
    public static final String a;
    public static final String b;
    static final ComponentName c;

    static {
        int i = VERSION.SDK_INT;
        a = "callerUid";
        i = VERSION.SDK_INT;
        b = "androidPackageName";
        c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        ComponentName componentName = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
    }

    static Object a(Context context, ComponentName componentName, bpu bpu) {
        Throwable e;
        ServiceConnection bwg = new bwg();
        but a = but.a(context);
        if (a.a(componentName, bwg, "GoogleAuthUtil")) {
            try {
                Object a2 = bpu.a(bwg.a());
                a.b(componentName, bwg, "GoogleAuthUtil");
                return a2;
            } catch (RemoteException e2) {
                e = e2;
                try {
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    a.b(componentName, bwg, "GoogleAuthUtil");
                }
            } catch (InterruptedException e3) {
                e = e3;
                throw new IOException("Error on service connection.", e);
            }
        }
        throw new IOException("Could not bind to service.");
    }

    static void a(Context context) {
        try {
            bqu.c(context.getApplicationContext());
        } catch (bqx e) {
            throw new bpv(e.a, e.getMessage(), new Intent(e.b));
        } catch (bqq e2) {
            throw new bpr(e2.getMessage());
        }
    }

    static /* synthetic */ Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }
}
