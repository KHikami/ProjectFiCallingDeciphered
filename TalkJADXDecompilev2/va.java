package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Window;
import android.view.Window.Callback;

class va extends uz {
    private boolean A = true;
    private vc B;
    private int y = -100;
    private boolean z;

    va(Context context, Window window, ur urVar) {
        super(context, window, urVar);
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null && this.y == -100) {
            this.y = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    Callback a(Callback callback) {
        return new vb(this, callback);
    }

    public boolean n() {
        return this.A;
    }

    public void d() {
        super.d();
        k();
    }

    public void e() {
        super.e();
        if (this.B != null) {
            this.B.a();
        }
    }

    int f(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                s();
                return this.B.b ? 2 : 1;
            default:
                return i;
        }
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        if (this.y != -100) {
            bundle.putInt("appcompat:local_night_mode", this.y);
        }
    }

    public void h() {
        super.h();
        if (this.B != null) {
            this.B.a();
        }
    }

    private void s() {
        if (this.B == null) {
            Context context = this.c;
            if (wc.a == null) {
                Context applicationContext = context.getApplicationContext();
                wc.a = new wc(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.B = new vc(this, wc.a);
        }
    }

    private boolean t() {
        if (!this.z || !(this.c instanceof Activity)) {
            return false;
        }
        try {
            if ((this.c.getPackageManager().getActivityInfo(new ComponentName(this.c, this.c.getClass()), 0).configChanges & 512) == 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return true;
        }
    }

    public boolean k() {
        int i;
        boolean z;
        if (this.y != -100) {
            i = this.y;
        } else {
            i = us.a;
        }
        int f = f(i);
        if (f != -1) {
            Resources resources = this.c.getResources();
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            f = f == 2 ? 32 : 16;
            if (i2 != f) {
                if (t()) {
                    ((Activity) this.c).recreate();
                } else {
                    Configuration configuration2 = new Configuration(configuration);
                    configuration2.uiMode = f | (configuration2.uiMode & -49);
                    resources.updateConfiguration(configuration2, null);
                }
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (i == 0) {
            s();
            vc vcVar = this.B;
            vcVar.a();
            if (vcVar.c == null) {
                vcVar.c = new vd(vcVar);
            }
            if (vcVar.d == null) {
                vcVar.d = new IntentFilter();
                vcVar.d.addAction("android.intent.action.TIME_SET");
                vcVar.d.addAction("android.intent.action.TIMEZONE_CHANGED");
                vcVar.d.addAction("android.intent.action.TIME_TICK");
            }
            vcVar.e.c.registerReceiver(vcVar.c, vcVar.d);
        }
        this.z = true;
        return z;
    }
}
