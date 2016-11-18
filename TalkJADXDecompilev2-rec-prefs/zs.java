package p000;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class zs {
    final /* synthetic */ Toolbar f35922a;

    public boolean m41601a(MenuItem menuItem) {
        if (this.f35922a.f != null) {
            return this.f35922a.f.a(menuItem);
        }
        return false;
    }

    public zs(Toolbar toolbar) {
        this.f35922a = toolbar;
    }
}
