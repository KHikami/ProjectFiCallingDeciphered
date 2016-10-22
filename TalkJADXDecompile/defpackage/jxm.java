package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;

/* renamed from: jxm */
public class jxm extends jwi {
    public boolean a;
    private CharSequence c;
    private CharSequence d;
    private boolean e;
    private boolean f;
    private boolean g;

    public jxm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void M_() {
        super.M_();
        boolean z = !a();
        this.f = true;
        if (a((Object) Boolean.valueOf(z))) {
            a(z);
        }
    }

    public void a(boolean z) {
        boolean z2 = this.a != z;
        if (z2 || !this.e) {
            this.a = z;
            this.e = true;
            b(z);
            if (z2) {
                f(D());
                z();
            }
        }
    }

    public boolean a() {
        return this.a;
    }

    public boolean D() {
        boolean z = this.g ? this.a : !this.a;
        if (z || super.D()) {
            return true;
        }
        return false;
    }

    public void e(CharSequence charSequence) {
        this.c = charSequence;
        if (a()) {
            z();
        }
    }

    public void f(CharSequence charSequence) {
        this.d = charSequence;
        if (!a()) {
            z();
        }
    }

    public void i(boolean z) {
        this.g = z;
    }

    protected Object a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    protected void a(boolean z, Object obj) {
        boolean c;
        if (z) {
            c = c(this.a);
        } else {
            c = ((Boolean) obj).booleanValue();
        }
        a(c);
    }

    public void b(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) x().getSystemService("accessibility");
        if (this.f && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(1);
            view.onInitializeAccessibilityEvent(obtain);
            view.dispatchPopulateAccessibilityEvent(obtain);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        this.f = false;
    }

    public void c(View view) {
        int i = 0;
        TextView textView = (TextView) view.findViewById(co.g);
        if (textView != null) {
            int i2;
            int i3 = 1;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
                i3 = 0;
            } else if (!(this.a || TextUtils.isEmpty(this.d))) {
                textView.setText(this.d);
                i3 = 0;
            }
            if (i3 != 0) {
                CharSequence g = g();
                if (!TextUtils.isEmpty(g)) {
                    textView.setText(g);
                    i2 = 0;
                    if (i2 != 0) {
                        i = 8;
                    }
                    if (i != textView.getVisibility()) {
                        textView.setVisibility(i);
                    }
                }
            }
            i2 = i3;
            if (i2 != 0) {
                i = 8;
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    protected Parcelable e() {
        Parcelable e = super.e();
        if (v()) {
            return e;
        }
        jxn jxn = new jxn(e);
        jxn.a = a();
        return jxn;
    }

    protected void a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(jxn.class)) {
            super.a(parcelable);
            return;
        }
        jxn jxn = (jxn) parcelable;
        super.a(jxn.getSuperState());
        a(jxn.a);
    }
}
