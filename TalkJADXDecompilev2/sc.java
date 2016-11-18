package defpackage;

import android.support.v4.widget.DrawerLayout;
import android.view.View;

public final class sc extends lt {
    final /* synthetic */ DrawerLayout a;

    public sc(DrawerLayout drawerLayout) {
        this.a = drawerLayout;
    }

    public void a(View view, ql qlVar) {
        super.a(view, qlVar);
        if (!DrawerLayout.l(view)) {
            qlVar.c(null);
        }
    }
}
