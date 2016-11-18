package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class us {
    static int f35301a = -1;
    public static boolean f35302b = false;

    public abstract View mo4410a(int i);

    public abstract tp mo4394a();

    public abstract void mo4412a(Configuration configuration);

    public abstract void mo4413a(Bundle bundle);

    public abstract void mo4414a(Toolbar toolbar);

    public abstract void mo4415a(View view);

    public abstract void mo4416a(View view, LayoutParams layoutParams);

    public abstract void mo4395a(CharSequence charSequence);

    public abstract MenuInflater mo4396b();

    public abstract void mo4421b(int i);

    public abstract void mo4397b(Bundle bundle);

    public abstract void mo4422b(View view, LayoutParams layoutParams);

    public abstract void mo4424c();

    public abstract boolean mo4425c(int i);

    public abstract void mo4398d();

    public abstract void mo4399e();

    public abstract void mo4428f();

    public abstract void mo4429g();

    public abstract void mo4400h();

    public abstract tu mo4401i();

    public abstract void mo4430j();

    public abstract boolean mo4402k();

    static us m40920a(Context context, Window window, ur urVar) {
        int i = VERSION.SDK_INT;
        if (gwb.c()) {
            return new ux(context, window, urVar);
        }
        if (i >= 23) {
            return new ve(context, window, urVar);
        }
        if (i >= 14) {
            return new va(context, window, urVar);
        }
        if (i >= 11) {
            return new uz(context, window, urVar);
        }
        return new vg(context, window, urVar);
    }

    us() {
    }
}
