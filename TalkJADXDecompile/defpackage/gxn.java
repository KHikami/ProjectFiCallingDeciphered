package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Process;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: gxn */
public final class gxn {
    private static final Object a;
    private static gxn b;
    private static Integer h;
    private final List<String> c;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private gxr g;
    private gxr i;

    static {
        a = new Object();
    }

    private gxn() {
        if (gxn.b() == gxq.b) {
            this.c = Collections.EMPTY_LIST;
            this.d = Collections.EMPTY_LIST;
            this.e = Collections.EMPTY_LIST;
            this.f = Collections.EMPTY_LIST;
            return;
        }
        String str = (String) gxp.b.a();
        this.c = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) gxp.c.a();
        this.d = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) gxp.d.a();
        this.e = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) gxp.e.a();
        this.f = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        this.g = new gxr(1024, ((Long) gxp.f.a()).longValue());
        this.i = new gxr(1024, ((Long) gxp.f.a()).longValue());
    }

    public static gxn a() {
        synchronized (a) {
            if (b == null) {
                b = new gxn();
            }
        }
        return b;
    }

    private static String a(ServiceConnection serviceConnection) {
        return String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(serviceConnection)));
    }

    private static int b() {
        if (h == null) {
            try {
                h = Integer.valueOf(gxq.b);
            } catch (SecurityException e) {
                h = Integer.valueOf(gxq.b);
            }
        }
        return h.intValue();
    }

    public void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        gxn.a(serviceConnection);
    }

    public void a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
        gxn.a(serviceConnection);
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        gxn.a(serviceConnection);
    }

    public boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z = false;
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : gwb.j(context, component.getPackageName()))) {
            z = context.bindService(intent, serviceConnection, 129);
            if (z) {
                gxn.a(serviceConnection);
            }
        }
        return z;
    }
}
