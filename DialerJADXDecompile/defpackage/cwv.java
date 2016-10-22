package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: cwv */
public final class cwv {
    private static boolean a;
    private static Method b;

    private static Method a() {
        Throwable e;
        if (!a) {
            synchronized (cwv.class) {
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
        Method a = cwv.a();
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

    private cwv() {
    }

    public static dld a(int i, int i2, String str, Context context) {
        buf.G();
        buf.B((Object) context);
        dld dld = new dld();
        dld.a = new dlc();
        MemoryInfo[] processMemoryInfo = cwz.a(context).getProcessMemoryInfo(new int[]{i2});
        dlc dlc = dld.a;
        MemoryInfo memoryInfo = processMemoryInfo[0];
        dkp dkp = new dkp();
        dkp.a = Integer.valueOf(memoryInfo.dalvikPss);
        dkp.b = Integer.valueOf(memoryInfo.nativePss);
        dkp.c = Integer.valueOf(memoryInfo.otherPss);
        dkp.d = Integer.valueOf(memoryInfo.dalvikPrivateDirty);
        dkp.e = Integer.valueOf(memoryInfo.nativePrivateDirty);
        dkp.f = Integer.valueOf(memoryInfo.otherPrivateDirty);
        if (VERSION.SDK_INT >= 19) {
            dkp.g = Integer.valueOf(memoryInfo.getTotalPrivateClean());
            dkp.i = Integer.valueOf(memoryInfo.getTotalSwappablePss());
        }
        dkp.h = Integer.valueOf(memoryInfo.getTotalSharedDirty());
        if (VERSION.SDK_INT >= 19) {
            int a = cwv.a(memoryInfo);
            if (a != -1) {
                dkp.j = Integer.valueOf(a);
            }
        }
        dlc.a = dkp;
        dld.b = new dlk();
        dld.b.a = buf.a(str, context);
        dld.d = new dkv();
        dld.d.a = Boolean.valueOf(cwz.c(context));
        dld.c = i;
        return dld;
    }
}
