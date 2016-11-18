package p000;

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
    private boolean f35350A = true;
    private vc f35351B;
    private int f35352y = -100;
    private boolean f35353z;

    va(Context context, Window window, ur urVar) {
        super(context, window, urVar);
    }

    public void mo4413a(Bundle bundle) {
        super.mo4413a(bundle);
        if (bundle != null && this.f35352y == -100) {
            this.f35352y = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    Callback mo4433a(Callback callback) {
        return new vb(this, callback);
    }

    public boolean mo4435n() {
        return this.f35350A;
    }

    public void mo4398d() {
        super.mo4398d();
        mo4402k();
    }

    public void mo4399e() {
        super.mo4399e();
        if (this.f35351B != null) {
            this.f35351B.m41031a();
        }
    }

    int mo4434f(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                m41016s();
                return this.f35351B.f35362b ? 2 : 1;
            default:
                return i;
        }
    }

    public void mo4397b(Bundle bundle) {
        super.mo4397b(bundle);
        if (this.f35352y != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f35352y);
        }
    }

    public void mo4400h() {
        super.mo4400h();
        if (this.f35351B != null) {
            this.f35351B.m41031a();
        }
    }

    private void m41016s() {
        if (this.f35351B == null) {
            Context context = this.c;
            if (wc.f35427a == null) {
                Context applicationContext = context.getApplicationContext();
                wc.f35427a = new wc(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f35351B = new vc(this, wc.f35427a);
        }
    }

    private boolean m41017t() {
        if (!this.f35353z || !(this.c instanceof Activity)) {
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

    public boolean mo4402k() {
        int i;
        boolean z;
        if (this.f35352y != -100) {
            i = this.f35352y;
        } else {
            i = us.f35301a;
        }
        int f = mo4434f(i);
        if (f != -1) {
            Resources resources = this.c.getResources();
            Configuration configuration = resources.getConfiguration();
            int i2 = configuration.uiMode & 48;
            f = f == 2 ? 32 : 16;
            if (i2 != f) {
                if (m41017t()) {
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
            m41016s();
            vc vcVar = this.f35351B;
            vcVar.m41031a();
            if (vcVar.f35363c == null) {
                vcVar.f35363c = new vd(vcVar);
            }
            if (vcVar.f35364d == null) {
                vcVar.f35364d = new IntentFilter();
                vcVar.f35364d.addAction("android.intent.action.TIME_SET");
                vcVar.f35364d.addAction("android.intent.action.TIMEZONE_CHANGED");
                vcVar.f35364d.addAction("android.intent.action.TIME_TICK");
            }
            vcVar.f35365e.c.registerReceiver(vcVar.f35363c, vcVar.f35364d);
        }
        this.f35353z = true;
        return z;
    }
}
