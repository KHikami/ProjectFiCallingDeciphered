package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import sz;

/* renamed from: aar */
final class aar extends PopupWindow {
    private static final boolean a;
    private boolean b;

    static {
        a = VERSION.SDK_INT < 21;
    }

    public aar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public aar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        afp a = afp.a(context, attributeSet, wi.cf, i, i2);
        if (a.g(wi.ci)) {
            a(a.a(wi.ci, false));
        }
        setBackgroundDrawable(a.a(wi.ch));
        int i3 = VERSION.SDK_INT;
        if (i2 != 0 && i3 < 11 && a.g(wi.cg)) {
            setAnimationStyle(a.g(wi.cg, -1));
        }
        a.a();
        if (VERSION.SDK_INT < 14) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
                declaredField.setAccessible(true);
                Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                declaredField2.setAccessible(true);
                declaredField2.set(this, new aas(declaredField, this, (OnScrollChangedListener) declaredField2.get(this)));
            } catch (Exception e) {
            }
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        int height;
        if (a && this.b) {
            height = i2 - view.getHeight();
        } else {
            height = i2;
        }
        super.update(view, i, height, i3, i4);
    }

    private void a(boolean z) {
        if (a) {
            this.b = z;
        } else {
            sz.a.a(this, z);
        }
    }
}
