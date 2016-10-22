import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Field;

public final class hhh {
    public static final hhq a;
    public static final hhq b;
    public static final hhq c;
    public static final hhq d;
    public static final hhq e;
    private static hht f;
    private static final hhr g;
    private final Context h;

    static {
        g = new hhi();
        a = new hhj();
        b = new hhk();
        c = new hhl();
        d = new hhm();
        e = new hhn();
    }

    private hhh(Context context) {
        this.h = (Context) gwb.L((Object) context);
    }

    public static int a(Context context, String str) {
        String valueOf;
        String valueOf2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            valueOf2 = String.valueOf("com.google.android.gms.dynamite.descriptors.");
            valueOf = String.valueOf("ModuleDescriptor");
            Class loadClass = classLoader.loadClass(new StringBuilder(((String.valueOf(valueOf2).length() + 1) + String.valueOf(str).length()) + String.valueOf(valueOf).length()).append(valueOf2).append(str).append(".").append(valueOf).toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            valueOf2 = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", new StringBuilder((String.valueOf(valueOf2).length() + 51) + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf2).append("' didn't match expected id '").append(str).append("'").toString());
            return 0;
        } catch (Exception e) {
            valueOf2 = "DynamiteModule";
            valueOf = "Failed to load module descriptor class: ";
            String valueOf3 = String.valueOf(e.getMessage());
            Log.e(valueOf2, valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
            return 0;
        }
    }

    public static int a(Context context, String str, boolean z) {
        int i = 0;
        hht a = a(context);
        if (a != null) {
            try {
                i = a.a(gym.a((Object) context), str, z);
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

    public static hhh a(Context context, hhq hhq, String str) {
        hhs a = hhq.a(context, str, g);
        int i = a.a;
        new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(i).append(" and remote module ").append(str).append(":").append(a.b);
        if (a.c == 0 || ((a.c == -1 && a.a == 0) || (a.c == 1 && a.b == 0))) {
            int i2 = a.a;
            throw new hhp("No acceptable module found. Local version is " + i2 + " and remote version is " + a.b + ".");
        } else if (a.c == -1) {
            return b(context, str);
        } else {
            if (a.c == 1) {
                try {
                    return a(context, str, a.b);
                } catch (Throwable e) {
                    String str2 = "Failed to load remote module: ";
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    if (a.a != 0 && hhq.a(context, str, new hho(a.a)).c == -1) {
                        return b(context, str);
                    }
                    throw new hhp("Remote load failed. No local fallback found.", e);
                }
            }
            throw new hhp("VersionPolicy returned invalid code:" + a.c);
        }
    }

    private static hhh a(Context context, String str, int i) {
        new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i);
        hht a = a(context);
        if (a == null) {
            throw new hhp("Failed to create IDynamiteLoader.");
        }
        try {
            gyj a2 = a.a(gym.a((Object) context), str, i);
            if (gym.a(a2) != null) {
                return new hhh((Context) gym.a(a2));
            }
            throw new hhp("Failed to load remote module.");
        } catch (Throwable e) {
            throw new hhp("Failed to load remote module.", e);
        }
    }

    private static hht a(Context context) {
        synchronized (hhh.class) {
            hht hht;
            if (f != null) {
                hht = f;
                return hht;
            } else if (gtq.d.a(context) != 0) {
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
                        f = hht;
                        return hht;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
                return null;
            }
        }
    }

    private static hhh b(Context context, String str) {
        String str2 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        return new hhh(context.getApplicationContext());
    }

    public IBinder a(String str) {
        Throwable e;
        String str2;
        String valueOf;
        try {
            return (IBinder) this.h.getClassLoader().loadClass(str).newInstance();
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
