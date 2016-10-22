import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
final class dg extends dk {
    private /* synthetic */ de j;

    public dg(de deVar) {
        this.j = deVar;
        super(deVar);
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.j.dump(str, null, printWriter, strArr);
    }

    public final boolean b() {
        return !this.j.isFinishing();
    }

    public final LayoutInflater c() {
        return this.j.getLayoutInflater().cloneInContext(this.j);
    }

    public final void d() {
        this.j.c();
    }

    public final void a(db dbVar, Intent intent, int i, Bundle bundle) {
        Activity activity = this.j;
        activity.a = true;
        if (i == -1) {
            try {
                ci.a(activity, intent, -1, bundle);
            } finally {
                activity.a = false;
            }
        } else {
            cx.b(i);
            if (activity.f.b() >= 65534) {
                throw new IllegalStateException("Too many pending Fragment activity results.");
            }
            while (true) {
                ik ikVar = activity.f;
                int i2 = activity.e;
                if (ikVar.b) {
                    ikVar.a();
                }
                if (hx.a(ikVar.c, ikVar.e, i2) >= 0) {
                    activity.e = (activity.e + 1) % 65534;
                } else {
                    int i3 = activity.e;
                    activity.f.a(i3, dbVar.i);
                    activity.e = (activity.e + 1) % 65534;
                    ci.a(activity, intent, ((i3 + 1) << 16) + (65535 & i), bundle);
                    activity.a = false;
                    return;
                }
            }
        }
    }

    public final boolean e() {
        return this.j.getWindow() != null;
    }

    public final int f() {
        Window window = this.j.getWindow();
        return window == null ? 0 : window.getAttributes().windowAnimations;
    }

    public final View a(int i) {
        return this.j.findViewById(i);
    }

    public final boolean a() {
        Window window = this.j.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
