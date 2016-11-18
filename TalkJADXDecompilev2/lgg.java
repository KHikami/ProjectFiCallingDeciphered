package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class lgg extends Service {
    private mti<?> a = msy.T(null);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if ((i & 2) == 0 && intent != null) {
            this.a = ((lgi) gwb.a(getApplicationContext(), lgi.class)).p().a(intent);
        }
        this.a.a(new lgh(this, i2), gwb.aT());
        return 2;
    }
}
