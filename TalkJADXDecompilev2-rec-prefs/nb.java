package p000;

import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;

public final class nb {
    static final nf f28703a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            f28703a = new ne();
        } else if (i >= 11) {
            f28703a = new nd();
        } else {
            f28703a = new nc();
        }
    }

    public static void m33371a(MenuItem menuItem, int i) {
        if (menuItem instanceof ju) {
            ((ju) menuItem).setShowAsAction(i);
        } else {
            f28703a.a(menuItem, i);
        }
    }

    public static MenuItem m33368a(MenuItem menuItem, View view) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).setActionView(view);
        }
        return f28703a.a(menuItem, view);
    }

    public static MenuItem m33372b(MenuItem menuItem, int i) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).setActionView(i);
        }
        return f28703a.b(menuItem, i);
    }

    public static View m33370a(MenuItem menuItem) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).getActionView();
        }
        return f28703a.a(menuItem);
    }

    public static MenuItem m33369a(MenuItem menuItem, mb mbVar) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).m25208a(mbVar);
        }
        return menuItem;
    }

    public static boolean m33373b(MenuItem menuItem) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).expandActionView();
        }
        return f28703a.b(menuItem);
    }

    public static boolean m33374c(MenuItem menuItem) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).isActionViewExpanded();
        }
        return f28703a.c(menuItem);
    }
}
