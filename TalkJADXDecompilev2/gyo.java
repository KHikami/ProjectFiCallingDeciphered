package defpackage;

import android.content.Context;
import android.os.IBinder;

public abstract class gyo<T> {
    private final String a;
    private T b;

    public gyo(String str) {
        this.a = str;
    }

    public final T a(Context context) {
        if (this.b == null) {
            gwb.L((Object) context);
            Context g = gtv.g(context);
            if (g == null) {
                throw new gyp("Could not get remote context.");
            }
            try {
                this.b = a((IBinder) g.getClassLoader().loadClass(this.a).newInstance());
            } catch (Throwable e) {
                throw new gyp("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new gyp("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new gyp("Could not access creator.", e22);
            }
        }
        return this.b;
    }

    public abstract T a(IBinder iBinder);
}
