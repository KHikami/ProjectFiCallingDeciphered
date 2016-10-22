import android.widget.TabHost.OnTabChangeListener;
import com.google.android.apps.hangouts.util.TabHostEx;

public final class gkz implements OnTabChangeListener {
    final /* synthetic */ TabHostEx a;

    public gkz(TabHostEx tabHostEx) {
        this.a = tabHostEx;
    }

    public void onTabChanged(String str) {
        goz h = this.a.a.h();
        int a = h.a(str);
        this.a.a.b(a);
        this.a.a(a);
        gwb.a(fde.e(this.a.b.a()), h.d(a).c);
    }
}
