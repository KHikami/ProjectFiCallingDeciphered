package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* renamed from: jq */
public final class jq {
    private static ju a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            a = new jt();
        } else if (i >= 11) {
            a = new js();
        } else {
            a = new jr();
        }
    }

    public static void a(MenuItem menuItem, int i) {
        if (menuItem instanceof hq) {
            ((hq) menuItem).setShowAsAction(i);
        } else {
            a.a(menuItem, i);
        }
    }

    public static MenuItem a(MenuItem menuItem, View view) {
        if (menuItem instanceof hq) {
            return ((hq) menuItem).setActionView(view);
        }
        return a.a(menuItem, view);
    }

    public static MenuItem b(MenuItem menuItem, int i) {
        if (menuItem instanceof hq) {
            return ((hq) menuItem).setActionView(i);
        }
        return a.b(menuItem, i);
    }

    public static View a(MenuItem menuItem) {
        if (menuItem instanceof hq) {
            return ((hq) menuItem).getActionView();
        }
        return a.a(menuItem);
    }

    public static MenuItem a(MenuItem menuItem, iv ivVar) {
        if (menuItem instanceof hq) {
            return ((hq) menuItem).a(ivVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static boolean b(MenuItem menuItem) {
        if (menuItem instanceof hq) {
            return ((hq) menuItem).expandActionView();
        }
        return a.b(menuItem);
    }

    public static boolean c(MenuItem menuItem) {
        if (menuItem instanceof hq) {
            return ((hq) menuItem).isActionViewExpanded();
        }
        return a.c(menuItem);
    }
}
