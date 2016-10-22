import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* compiled from: PG */
public abstract class qb {
    static int a;
    private static boolean b;

    public abstract View a(int i);

    public abstract pl a();

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

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

    public abstract boolean i();

    static {
        a = -1;
        b = false;
    }

    public static qb a(Activity activity, qa qaVar) {
        return a(activity, activity.getWindow(), qaVar);
    }

    static qb a(Context context, Window window, qa qaVar) {
        int i = VERSION.SDK_INT;
        if (buf.c()) {
            return new qe(context, window, qaVar);
        }
        if (i >= 23) {
            return new qj(context, window, qaVar);
        }
        if (i >= 14) {
            return new qh(context, window, qaVar);
        }
        if (i >= 11) {
            return new qg(context, window, qaVar);
        }
        return new ql(context, window, qaVar);
    }

    qb() {
    }
}
