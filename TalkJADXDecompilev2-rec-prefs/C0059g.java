package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public class C0059g implements ServiceConnection {
    public final /* synthetic */ cpl f14518a;

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0217l c0217l;
        if (iBinder == null) {
            c0217l = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0217l)) {
                c0217l = new n(iBinder);
            } else {
                c0217l = (C0217l) queryLocalInterface;
            }
        }
        m16796a(new C0187h(this, c0217l, componentName));
    }

    public void m16796a(tz tzVar) {
        this.f14518a.f8789b = tzVar;
        this.f14518a.f8789b.a(0);
        this.f14518a.f8788a = this.f14518a.f8789b.a(null);
        if (!this.f14518a.m10646d()) {
            this.f14518a.m10645c();
        }
    }

    public C0059g(cpl cpl) {
        this.f14518a = cpl;
        this();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f14518a.m10645c();
    }
}
