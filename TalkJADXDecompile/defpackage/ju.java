package defpackage;

import android.view.MenuItem;
import android.view.View;
import ng;

/* renamed from: ju */
public interface ju extends MenuItem {
    ju a(mb mbVar);

    ju a(ng ngVar);

    mb a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
