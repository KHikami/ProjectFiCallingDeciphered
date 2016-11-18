package p000;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;

public class dyy implements Comparable<dyy> {
    public bko f10301a;
    public TextView f10302b;
    public TextView f10303c;
    public ImageView f10304d;
    public ImageView f10305e;

    public /* synthetic */ int compareTo(Object obj) {
        dyy dyy = (dyy) obj;
        if (mo1644e() > dyy.mo1644e()) {
            return 1;
        }
        if (mo1644e() < dyy.mo1644e()) {
            return -1;
        }
        throw new IllegalStateException("Two navigation items cannot have the same sort index.");
    }

    public void mo2178a(bko bko) {
        this.f10301a = bko;
    }

    public void mo2179a(boolean z) {
    }

    public int mo1639a() {
        return 0;
    }

    public int mo1641b() {
        return 0;
    }

    public int mo1642c() {
        return 0;
    }

    public CharSequence mo2180f() {
        return null;
    }

    public boolean m12443g() {
        return mo1785h();
    }

    public boolean mo1785h() {
        return true;
    }

    public void mo1640a(Activity activity) {
    }

    public int mo1643d() {
        return 0;
    }

    public int mo1644e() {
        return 0;
    }

    public int m12445i() {
        return R$drawable.cv;
    }
}
