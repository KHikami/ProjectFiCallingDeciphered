package defpackage;

import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* renamed from: hq */
public interface hq extends MenuItem {
    hq a(iv ivVar);

    hq a(jv jvVar);

    iv a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
