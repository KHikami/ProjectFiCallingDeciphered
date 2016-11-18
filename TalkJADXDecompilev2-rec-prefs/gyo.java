package p000;

import android.content.Context;
import android.os.IBinder;

public abstract class gyo<T> {
    private final String f16380a;
    private T f16381b;

    public gyo(String str) {
        this.f16380a = str;
    }

    public final T m18964a(Context context) {
        if (this.f16381b == null) {
            gwb.m1419L((Object) context);
            Context g = gtv.m18577g(context);
            if (g == null) {
                throw new gyp("Could not get remote context.");
            }
            try {
                this.f16381b = mo2541a((IBinder) g.getClassLoader().loadClass(this.f16380a).newInstance());
            } catch (Throwable e) {
                throw new gyp("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new gyp("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new gyp("Could not access creator.", e22);
            }
        }
        return this.f16381b;
    }

    public abstract T mo2541a(IBinder iBinder);
}
