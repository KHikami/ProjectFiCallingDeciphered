package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Field;

public final class hhh {
    public static final hhq f16970a = new hhj();
    public static final hhq f16971b = new hhk();
    public static final hhq f16972c = new hhl();
    public static final hhq f16973d = new hhm();
    public static final hhq f16974e = new hhn();
    private static hht f16975f;
    private static final hhr f16976g = new hhi();
    private final Context f16977h;

    private hhh(Context context) {
        this.f16977h = (Context) gwb.m1419L((Object) context);
    }

    public static int m19795a(Context context, String str) {
        String valueOf;
        String valueOf2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            valueOf = String.valueOf("com.google.android.gms.dynamite.descriptors.");
            valueOf2 = String.valueOf("ModuleDescriptor");
            Class loadClass = classLoader.loadClass(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(".").append(valueOf2).toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            valueOf = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf).append("' didn't match expected id '").append(str).append("'").toString());
            return 0;
        } catch (Exception e) {
            valueOf = "DynamiteModule";
            valueOf2 = "Failed to load module descriptor class: ";
            String valueOf3 = String.valueOf(e.getMessage());
            Log.e(valueOf, valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
            return 0;
        }
    }

    public static int m19796a(Context context, String str, boolean z) {
        int i = 0;
        hht a = hhh.m19799a(context);
        if (a != null) {
            try {
                i = a.mo2546a(gym.m18961a((Object) context), str, z);
            } catch (RemoteException e) {
                String str2 = "Failed to retrieve remote module version: ";
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
            }
        }
        return i;
    }

    public static hhh m19797a(Context context, hhq hhq, String str) {
        hhs a = hhq.mo2544a(context, str, f16976g);
        int i = a.f16979a;
        new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(i).append(" and remote module ").append(str).append(":").append(a.f16980b);
        if (a.f16981c == 0 || ((a.f16981c == -1 && a.f16979a == 0) || (a.f16981c == 1 && a.f16980b == 0))) {
            int i2 = a.f16979a;
            throw new hhp("No acceptable module found. Local version is " + i2 + " and remote version is " + a.f16980b + ".");
        } else if (a.f16981c == -1) {
            return hhh.m19800b(context, str);
        } else {
            if (a.f16981c == 1) {
                try {
                    return hhh.m19798a(context, str, a.f16980b);
                } catch (Throwable e) {
                    String str2 = "Failed to load remote module: ";
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    if (a.f16979a != 0 && hhq.mo2544a(context, str, new hho(a.f16979a)).f16981c == -1) {
                        return hhh.m19800b(context, str);
                    }
                    throw new hhp("Remote load failed. No local fallback found.", e);
                }
            }
            throw new hhp("VersionPolicy returned invalid code:" + a.f16981c);
        }
    }

    private static hhh m19798a(Context context, String str, int i) {
        new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i);
        hht a = hhh.m19799a(context);
        if (a == null) {
            throw new hhp("Failed to create IDynamiteLoader.");
        }
        try {
            gyj a2 = a.mo2547a(gym.m18961a((Object) context), str, i);
            if (gym.m18962a(a2) != null) {
                return new hhh((Context) gym.m18962a(a2));
            }
            throw new hhp("Failed to load remote module.");
        } catch (Throwable e) {
            throw new hhp("Failed to load remote module.", e);
        }
    }

    private static hht m19799a(Context context) {
        synchronized (hhh.class) {
            hht hht;
            if (f16975f != null) {
                hht = f16975f;
                return hht;
            } else if (gtq.f16130d.mo2334a(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        hht = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof hht)) {
                            Object hhv = new hhv(iBinder);
                        } else {
                            hht = (hht) queryLocalInterface;
                        }
                    }
                    if (hht != null) {
                        f16975f = hht;
                        return hht;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return null;
                }
            }
        }
    }

    private static hhh m19800b(Context context, String str) {
        String str2 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        return new hhh(context.getApplicationContext());
    }

    public IBinder m19801a(String str) {
        Throwable e;
        String str2;
        String valueOf;
        try {
            return (IBinder) this.f16977h.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException e2) {
            e = e2;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            throw new hhp(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (InstantiationException e3) {
            e = e3;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new hhp(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (IllegalAccessException e4) {
            e = e4;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new hhp(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
    }
}
