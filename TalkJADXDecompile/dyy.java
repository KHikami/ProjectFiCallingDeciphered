import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;

public class dyy implements Comparable<dyy> {
    public bko a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public ImageView e;

    public /* synthetic */ int compareTo(Object obj) {
        dyy dyy = (dyy) obj;
        if (e() > dyy.e()) {
            return 1;
        }
        if (e() < dyy.e()) {
            return -1;
        }
        throw new IllegalStateException("Two navigation items cannot have the same sort index.");
    }

    public void a(bko bko) {
        this.a = bko;
    }

    public void a(boolean z) {
    }

    public int a() {
        return 0;
    }

    public int b() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public CharSequence f() {
        return null;
    }

    public boolean g() {
        return h();
    }

    public boolean h() {
        return true;
    }

    public void a(Activity activity) {
    }

    public int d() {
        return 0;
    }

    public int e() {
        return 0;
    }

    public int i() {
        return R$drawable.cv;
    }
}
