package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public class g implements ServiceConnection {
    public final /* synthetic */ cpl a;

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l lVar;
        if (iBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof l)) {
                lVar = new n(iBinder);
            } else {
                lVar = (l) queryLocalInterface;
            }
        }
        a(new h(this, lVar, componentName));
    }

    public void a(tz tzVar) {
        this.a.b = tzVar;
        this.a.b.a(0);
        this.a.a = this.a.b.a(null);
        if (!this.a.d()) {
            this.a.c();
        }
    }

    public g(cpl cpl) {
        this.a = cpl;
        this();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.a.c();
    }
}
