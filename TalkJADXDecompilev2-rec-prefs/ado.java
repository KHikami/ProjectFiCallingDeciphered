package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class ado extends add implements adn {
    private static Method f342a;
    private adn f343b;

    static {
        try {
            f342a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
        }
    }

    public ado(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    acj mo80a(Context context, boolean z) {
        acj adp = new adp(context, z);
        adp.m660a(this);
        return adp;
    }

    public void m655a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.h.setEnterTransition(null);
        }
    }

    public void m657b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.h.setExitTransition(null);
        }
    }

    public void m654a(adn adn) {
        this.f343b = adn;
    }

    public void m659b(boolean z) {
        if (f342a != null) {
            try {
                f342a.invoke(this.h, new Object[]{Boolean.valueOf(false)});
            } catch (Exception e) {
            }
        }
    }

    public void mo82b(xy xyVar, MenuItem menuItem) {
        if (this.f343b != null) {
            this.f343b.mo82b(xyVar, menuItem);
        }
    }

    public void mo81a(xy xyVar, MenuItem menuItem) {
        if (this.f343b != null) {
            this.f343b.mo81a(xyVar, menuItem);
        }
    }
}
