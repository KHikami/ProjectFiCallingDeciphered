package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class gwj {
    private static final Object f16293a = new Object();
    private static gwj f16294b;

    public static gwj m18777a(Context context) {
        synchronized (f16293a) {
            if (f16294b == null) {
                f16294b = new gwk(context.getApplicationContext());
            }
        }
        return f16294b;
    }

    public abstract boolean mo2356a(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract boolean mo2357a(String str, String str2, ServiceConnection serviceConnection, String str3);

    public abstract void mo2358b(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract void mo2359b(String str, String str2, ServiceConnection serviceConnection, String str3);
}
