package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: hmu */
public class hmu {
    private static Context a;
    private static hmy b;

    public static hmy a(Context context) {
        gwb.L((Object) context);
        if (b != null) {
            return b;
        }
        int a = gtt.a(context);
        switch (a) {
            case wi.w /*0*/:
                hmy hmy;
                hmu.class.getSimpleName();
                IBinder iBinder = (IBinder) hmu.a(hmu.b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
                if (iBinder == null) {
                    hmy = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof hmy)) {
                        Object hna = new hna(iBinder);
                    } else {
                        hmy = (hmy) queryLocalInterface;
                    }
                }
                b = hmy;
                try {
                    b.a(gym.a(hmu.b(context).getResources()), gtt.a);
                    return b;
                } catch (RemoteException e) {
                    throw new dt(e);
                }
            default:
                throw new gtr(a);
        }
    }

    private static <T> T a(Class<?> cls) {
        String str;
        String valueOf;
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            str = "Unable to instantiate the dynamic class ";
            valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } catch (IllegalAccessException e2) {
            str = "Unable to call the default constructor of ";
            valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    private static <T> T a(ClassLoader classLoader, String str) {
        try {
            return hmu.a(((ClassLoader) gwb.L((Object) classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    private static Context b(Context context) {
        if (a == null) {
            a = gtt.b(context);
        }
        return a;
    }
}
