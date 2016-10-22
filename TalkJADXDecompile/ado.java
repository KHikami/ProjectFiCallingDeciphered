import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class ado extends add implements adn {
    private static Method a;
    private adn b;

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
        }
    }

    public ado(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    acj a(Context context, boolean z) {
        acj adp = new adp(context, z);
        adp.a(this);
        return adp;
    }

    public void a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.h.setEnterTransition(null);
        }
    }

    public void b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.h.setExitTransition(null);
        }
    }

    public void a(adn adn) {
        this.b = adn;
    }

    public void b(boolean z) {
        if (a != null) {
            try {
                a.invoke(this.h, new Object[]{Boolean.valueOf(false)});
            } catch (Exception e) {
            }
        }
    }

    public void b(xy xyVar, MenuItem menuItem) {
        if (this.b != null) {
            this.b.b(xyVar, menuItem);
        }
    }

    public void a(xy xyVar, MenuItem menuItem) {
        if (this.b != null) {
            this.b.a(xyVar, menuItem);
        }
    }
}
