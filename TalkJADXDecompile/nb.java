import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;

public final class nb {
    static final nf a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            a = new ne();
        } else if (i >= 11) {
            a = new nd();
        } else {
            a = new nc();
        }
    }

    public static void a(MenuItem menuItem, int i) {
        if (menuItem instanceof ju) {
            ((ju) menuItem).setShowAsAction(i);
        } else {
            a.a(menuItem, i);
        }
    }

    public static MenuItem a(MenuItem menuItem, View view) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).setActionView(view);
        }
        return a.a(menuItem, view);
    }

    public static MenuItem b(MenuItem menuItem, int i) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).setActionView(i);
        }
        return a.b(menuItem, i);
    }

    public static View a(MenuItem menuItem) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).getActionView();
        }
        return a.a(menuItem);
    }

    public static MenuItem a(MenuItem menuItem, mb mbVar) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).a(mbVar);
        }
        return menuItem;
    }

    public static boolean b(MenuItem menuItem) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).expandActionView();
        }
        return a.b(menuItem);
    }

    public static boolean c(MenuItem menuItem) {
        if (menuItem instanceof ju) {
            return ((ju) menuItem).isActionViewExpanded();
        }
        return a.c(menuItem);
    }
}
