package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Map;
import onf;
import onm;
import onu;
import onv;
import oog;

/* renamed from: izn */
public final class izn {
    private static boolean a;
    private static Method b;

    private static Method a() {
        Throwable e;
        if (!a) {
            synchronized (izn.class) {
                if (!a) {
                    try {
                        b = MemoryInfo.class.getDeclaredMethod("getOtherPss", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e2) {
                    } catch (Exception e3) {
                        e = e3;
                        Log.e("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e);
                    } catch (Error e4) {
                        e = e4;
                        Log.e("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e);
                    }
                    a = true;
                }
            }
        }
        return b;
    }

    private static int a(MemoryInfo memoryInfo) {
        Throwable e;
        Method a = izn.a();
        if (a != null) {
            try {
                return ((Integer) a.invoke(memoryInfo, new Object[]{Integer.valueOf(14)})).intValue();
            } catch (Exception e2) {
                e = e2;
                b = null;
                Log.e("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e);
                return -1;
            } catch (Error e3) {
                e = e3;
                b = null;
                Log.e("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e);
                return -1;
            }
        }
        return -1;
    }

    private izn() {
    }

    public static onv a(int i, int i2, String str, Context context, String str2, boolean z) {
        gwb.aK();
        ba.a((Object) context);
        onv onv = new onv();
        onv.a = new onu();
        MemoryInfo[] processMemoryInfo = izr.a(context).getProcessMemoryInfo(new int[]{i2});
        onv.a.a = izn.a(processMemoryInfo[0], z);
        onv.b = new oog();
        onv.b.a = gwb.a(str, context);
        onv.d = new onm();
        onv.d.a = Boolean.valueOf(izr.c(context));
        onv.c = i;
        onv.e = str2;
        return onv;
    }

    private static onf a(MemoryInfo memoryInfo, boolean z) {
        onf onf = new onf();
        onf.a = Integer.valueOf(memoryInfo.dalvikPss);
        onf.b = Integer.valueOf(memoryInfo.nativePss);
        onf.c = Integer.valueOf(memoryInfo.otherPss);
        onf.d = Integer.valueOf(memoryInfo.dalvikPrivateDirty);
        onf.e = Integer.valueOf(memoryInfo.nativePrivateDirty);
        onf.f = Integer.valueOf(memoryInfo.otherPrivateDirty);
        if (VERSION.SDK_INT >= 19) {
            onf.g = Integer.valueOf(memoryInfo.getTotalPrivateClean());
            onf.i = Integer.valueOf(memoryInfo.getTotalSwappablePss());
        }
        onf.h = Integer.valueOf(memoryInfo.getTotalSharedDirty());
        if (VERSION.SDK_INT >= 19) {
            int a = izn.a(memoryInfo);
            if (a != -1) {
                onf.j = Integer.valueOf(a);
            }
        }
        if (VERSION.SDK_INT >= 23 && !z) {
            try {
                Map memoryStats = memoryInfo.getMemoryStats();
                onf.l = izn.a((String) memoryStats.get("summary.code"));
                onf.m = izn.a((String) memoryStats.get("summary.stack"));
                onf.n = izn.a((String) memoryStats.get("summary.graphics"));
                onf.p = izn.a((String) memoryStats.get("summary.system"));
                onf.k = izn.a((String) memoryStats.get("summary.java-heap"));
                onf.o = izn.a((String) memoryStats.get("summary.private-other"));
            } catch (NumberFormatException e) {
                Log.e("PrimesMemoryCapture", "failed to collect memory summary stats");
            }
        }
        return onf;
    }

    private static Integer a(String str) {
        return str == null ? null : Integer.valueOf(Integer.parseInt(str));
    }
}
