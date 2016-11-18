package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public class hmu {
    private static Context f17091a;
    private static hmy f17092b;

    public static hmy m20360a(Context context) {
        gwb.m1419L((Object) context);
        if (f17092b != null) {
            return f17092b;
        }
        int a = gtt.m18579a(context);
        switch (a) {
            case 0:
                hmy hmy;
                hmu.class.getSimpleName();
                IBinder iBinder = (IBinder) hmu.m20362a(hmu.m20363b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
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
                f17092b = hmy;
                try {
                    f17092b.mo2779a(gym.m18961a(hmu.m20363b(context).getResources()), gtt.f16145a);
                    return f17092b;
                } catch (RemoteException e) {
                    throw new dt(e);
                }
            default:
                throw new gtr(a);
        }
    }

    private static <T> T m20361a(Class<?> cls) {
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

    private static <T> T m20362a(ClassLoader classLoader, String str) {
        try {
            return hmu.m20361a(((ClassLoader) gwb.m1419L((Object) classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    private static Context m20363b(Context context) {
        if (f17091a == null) {
            f17091a = gtt.m18588b(context);
        }
        return f17091a;
    }
}
