package defpackage;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: bvr */
public final class bvr {
    private static final Object a;
    private static bvr b;
    private static Integer h;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private bvw g;

    static {
        a = new Object();
    }

    private bvr() {
        if (bvr.b() == bvv.b) {
            this.c = Collections.EMPTY_LIST;
            this.d = Collections.EMPTY_LIST;
            this.e = Collections.EMPTY_LIST;
            this.f = Collections.EMPTY_LIST;
            return;
        }
        String str = (String) bvt.b.b();
        this.c = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) bvt.c.b();
        this.d = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) bvt.d.b();
        this.e = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) bvt.e.b();
        this.f = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        this.g = new bvw(1024, ((Long) bvt.f.b()).longValue());
        bvw bvw = new bvw(1024, ((Long) bvt.f.b()).longValue());
    }

    public static bvr a() {
        synchronized (a) {
            if (b == null) {
                b = new bvr();
            }
        }
        return b;
    }

    public static String a(ServiceConnection serviceConnection) {
        return String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(serviceConnection)));
    }

    private static int b() {
        if (h == null) {
            try {
                h = Integer.valueOf(buf.r() ? ((Integer) bvt.a.b()).intValue() : bvv.b);
            } catch (SecurityException e) {
                h = Integer.valueOf(bvv.b);
            }
        }
        return h.intValue();
    }

    @SuppressLint({"UntrackedBindService"})
    public final void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        a(context, bvr.a(serviceConnection), null, null, 1);
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    public final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        boolean j = (component == null || (btq.a && "com.google.android.gms".equals(component.getPackageName()))) ? false : buf.j(context, component.getPackageName());
        if (j) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        boolean bindService = context.bindService(intent, serviceConnection, i);
        if (bindService) {
            a(context, bvr.a(serviceConnection), str, intent, 2);
        }
        return bindService;
    }

    public final void a(Context context, String str, String str2, Intent intent, int i) {
        Object obj = !btq.a ? null : bvr.b() == bvv.b ? null : 1;
        if (obj != null && this.g != null) {
            String str3;
            String str4;
            String W;
            Parcelable connectionEvent;
            if (i != 4 && i != 1) {
                ServiceInfo serviceInfo;
                List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
                if (queryIntentServices == null || queryIntentServices.size() == 0) {
                    Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), buf.e(3, 20)}));
                    serviceInfo = null;
                } else {
                    if (queryIntentServices.size() > 1) {
                        Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), buf.e(3, 20)}));
                        Iterator it = queryIntentServices.iterator();
                        if (it.hasNext()) {
                            Log.w("ConnectionTracker", ((ResolveInfo) it.next()).serviceInfo.name);
                            serviceInfo = null;
                        }
                    }
                    serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
                }
                if (serviceInfo == null) {
                    Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[]{str2, intent.toUri(0)}));
                    return;
                }
                str3 = serviceInfo.processName;
                str4 = serviceInfo.name;
                W = buf.W(context);
                obj = (this.c.contains(W) || this.d.contains(str2) || this.e.contains(str3) || this.f.contains(str4) || (str3.equals(W) && (bvr.b() & bvv.d) != 0)) ? null : 1;
                if (obj != null) {
                    this.g.a(str);
                } else {
                    return;
                }
            } else if (this.g.b(str)) {
                str3 = null;
                str4 = null;
                W = null;
            } else {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String str5 = null;
            if (!((bvr.b() & bvv.c) == 0 || i == 13)) {
                str5 = buf.e(3, 5);
            }
            long j = 0;
            if ((bvr.b() & bvv.e) != 0) {
                j = Debug.getNativeHeapAllocatedSize();
            }
            if (i == 1 || i == 4 || i == 14) {
                connectionEvent = new ConnectionEvent(currentTimeMillis, i, null, null, null, null, str5, str, SystemClock.elapsedRealtime(), j);
            } else {
                connectionEvent = new ConnectionEvent(currentTimeMillis, i, W, str2, str3, str4, str5, str, SystemClock.elapsedRealtime(), j);
            }
            context.startService(new Intent().setComponent(bvv.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", connectionEvent));
        }
    }
}
