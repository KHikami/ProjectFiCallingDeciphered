package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Process;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class gxn {
    private static final Object f16330a = new Object();
    private static gxn f16331b;
    private static Integer f16332h;
    private final List<String> f16333c;
    private final List<String> f16334d;
    private final List<String> f16335e;
    private final List<String> f16336f;
    private gxr f16337g;
    private gxr f16338i;

    private gxn() {
        if (gxn.m18918b() == gxq.f16348b) {
            this.f16333c = Collections.EMPTY_LIST;
            this.f16334d = Collections.EMPTY_LIST;
            this.f16335e = Collections.EMPTY_LIST;
            this.f16336f = Collections.EMPTY_LIST;
            return;
        }
        String str = (String) gxp.f16342b.m19765a();
        this.f16333c = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) gxp.f16343c.m19765a();
        this.f16334d = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) gxp.f16344d.m19765a();
        this.f16335e = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) gxp.f16345e.m19765a();
        this.f16336f = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        this.f16337g = new gxr(1024, ((Long) gxp.f16346f.m19765a()).longValue());
        this.f16338i = new gxr(1024, ((Long) gxp.f16346f.m19765a()).longValue());
    }

    public static gxn m18916a() {
        synchronized (f16330a) {
            if (f16331b == null) {
                f16331b = new gxn();
            }
        }
        return f16331b;
    }

    private static String m18917a(ServiceConnection serviceConnection) {
        return String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(serviceConnection)));
    }

    private static int m18918b() {
        if (f16332h == null) {
            try {
                f16332h = Integer.valueOf(gxq.f16348b);
            } catch (SecurityException e) {
                f16332h = Integer.valueOf(gxq.f16348b);
            }
        }
        return f16332h.intValue();
    }

    public void m18919a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        gxn.m18917a(serviceConnection);
    }

    public void m18920a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
        gxn.m18917a(serviceConnection);
    }

    public void m18922b(Context context, ServiceConnection serviceConnection) {
        gxn.m18917a(serviceConnection);
    }

    public boolean m18921a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z = false;
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : gwb.m2268j(context, component.getPackageName()))) {
            z = context.bindService(intent, serviceConnection, 129);
            if (z) {
                gxn.m18917a(serviceConnection);
            }
        }
        return z;
    }
}
