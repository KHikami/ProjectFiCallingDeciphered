package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* compiled from: PG */
/* renamed from: vs */
final class vs extends PopupWindow {
    private static final boolean a;
    private boolean b;

    static {
        a = VERSION.SDK_INT < 21;
    }

    public vs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    @TargetApi(11)
    public vs(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        aah a = aah.a(context, attributeSet, rk.bm, i, i2);
        if (a.e(rk.bp)) {
            boolean a2 = a.a(rk.bp, false);
            if (a) {
                this.b = a2;
            } else {
                oq.a.a((PopupWindow) this, a2);
            }
        }
        setBackgroundDrawable(a.a(rk.bo));
        int i3 = VERSION.SDK_INT;
        if (i2 != 0 && i3 < 11 && i3 >= 9 && a.e(rk.bn)) {
            setAnimationStyle(a.g(rk.bn, -1));
        }
        a.a.recycle();
        if (VERSION.SDK_INT < 14) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
                declaredField.setAccessible(true);
                Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                declaredField2.setAccessible(true);
                declaredField2.set(this, new vt(declaredField, this, (OnScrollChangedListener) declaredField2.get(this)));
            } catch (Exception e) {
            }
        }
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @TargetApi(19)
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        int height;
        if (a && this.b) {
            height = i2 - view.getHeight();
        } else {
            height = i2;
        }
        super.update(view, i, height, i3, i4);
    }
}
