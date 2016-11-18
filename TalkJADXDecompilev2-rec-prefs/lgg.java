package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class lgg extends Service {
    private mti<?> f24947a = msy.m32868T(null);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if ((i & 2) == 0 && intent != null) {
            this.f24947a = ((lgi) gwb.m1635a(getApplicationContext(), lgi.class)).mo1910p().m29009a(intent);
        }
        this.f24947a.mo3706a(new lgh(this, i2), gwb.aT());
        return 2;
    }
}
