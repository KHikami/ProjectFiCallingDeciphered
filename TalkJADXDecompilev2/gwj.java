package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class gwj {
    private static final Object a = new Object();
    private static gwj b;

    public static gwj a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new gwk(context.getApplicationContext());
            }
        }
        return b;
    }

    public abstract boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract boolean a(String str, String str2, ServiceConnection serviceConnection, String str3);

    public abstract void b(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract void b(String str, String str2, ServiceConnection serviceConnection, String str3);
}
