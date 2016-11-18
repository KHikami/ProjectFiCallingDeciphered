package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class aar extends PopupWindow {
    private static final boolean f58a = (VERSION.SDK_INT < 21);
    private boolean f59b;

    public aar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m106a(context, attributeSet, i, 0);
    }

    public aar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m106a(context, attributeSet, i, i2);
    }

    private void m106a(Context context, AttributeSet attributeSet, int i, int i2) {
        afp a = afp.m927a(context, attributeSet, wi.cf, i, i2);
        if (a.m944g(wi.ci)) {
            m107a(a.m932a(wi.ci, false));
        }
        setBackgroundDrawable(a.m930a(wi.ch));
        int i3 = VERSION.SDK_INT;
        if (i2 != 0 && i3 < 11 && a.m944g(wi.cg)) {
            setAnimationStyle(a.m943g(wi.cg, -1));
        }
        a.m931a();
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
        if (f58a && this.f59b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f58a && this.f59b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        int height;
        if (f58a && this.f59b) {
            height = i2 - view.getHeight();
        } else {
            height = i2;
        }
        super.update(view, i, height, i3, i4);
    }

    private void m107a(boolean z) {
        if (f58a) {
            this.f59b = z;
        } else {
            sz.a.a(this, z);
        }
    }
}
