package defpackage;

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
    static int a = -1;
    public static boolean b = false;

    public abstract View a(int i);

    public abstract tp a();

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(int i);

    public abstract void b(Bundle bundle);

    public abstract void b(View view, LayoutParams layoutParams);

    public abstract void c();

    public abstract boolean c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract tu i();

    public abstract void j();

    public abstract boolean k();

    static us a(Context context, Window window, ur urVar) {
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
