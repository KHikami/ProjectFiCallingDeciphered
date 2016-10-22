import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
public class dk extends di {
    final Activity a;
    final Context b;
    final Handler c;
    final dm d;
    ij e;
    boolean f;
    eg g;
    boolean h;
    boolean i;
    private int j;

    dk(de deVar) {
        this(deVar, deVar, deVar.b, 0);
    }

    private dk(Activity activity, Context context, Handler handler, int i) {
        this.d = new dm();
        this.a = activity;
        this.b = context;
        this.c = handler;
        this.j = 0;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean b() {
        return true;
    }

    public LayoutInflater c() {
        return (LayoutInflater) this.b.getSystemService("layout_inflater");
    }

    public void d() {
    }

    public void a(db dbVar, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.b.startActivity(intent);
    }

    public boolean e() {
        return true;
    }

    public int f() {
        return this.j;
    }

    public View a(int i) {
        return null;
    }

    public boolean a() {
        return true;
    }

    final void a(String str) {
        if (this.e != null) {
            eg egVar = (eg) this.e.get(str);
            if (egVar != null && !egVar.e) {
                egVar.g();
                this.e.remove(str);
            }
        }
    }

    final eg a(String str, boolean z, boolean z2) {
        if (this.e == null) {
            this.e = new ij();
        }
        eg egVar = (eg) this.e.get(str);
        if (egVar != null) {
            egVar.f = this;
        }
        return egVar;
    }
}
