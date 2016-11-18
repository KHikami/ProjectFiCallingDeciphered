package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;

public class jxm extends jwi {
    public boolean f3287a;
    private CharSequence f3288c;
    private CharSequence f3289d;
    private boolean f3290e;
    private boolean f3291f;
    private boolean f3292g;

    public jxm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void M_() {
        super.M_();
        boolean z = !mo531a();
        this.f3291f = true;
        if (m5125a((Object) Boolean.valueOf(z))) {
            mo534a(z);
        }
    }

    public void mo534a(boolean z) {
        boolean z2 = this.f3287a != z;
        if (z2 || !this.f3290e) {
            this.f3287a = z;
            this.f3290e = true;
            mo3620b(z);
            if (z2) {
                mo1331f(mo526D());
                m5168z();
            }
        }
    }

    public boolean mo531a() {
        return this.f3287a;
    }

    public boolean mo526D() {
        boolean z = this.f3292g ? this.f3287a : !this.f3287a;
        if (z || super.mo526D()) {
            return true;
        }
        return false;
    }

    public void m5178e(CharSequence charSequence) {
        this.f3288c = charSequence;
        if (mo531a()) {
            m5168z();
        }
    }

    public void m5179f(CharSequence charSequence) {
        this.f3289d = charSequence;
        if (!mo531a()) {
            m5168z();
        }
    }

    public void m5180i(boolean z) {
        this.f3292g = z;
    }

    protected Object mo528a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    protected void mo530a(boolean z, Object obj) {
        boolean c;
        if (z) {
            c = mo3621c(this.f3287a);
        } else {
            c = ((Boolean) obj).booleanValue();
        }
        mo534a(c);
    }

    public void m5175b(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) m5166x().getSystemService("accessibility");
        if (this.f3291f && accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(1);
            view.onInitializeAccessibilityEvent(obtain);
            view.dispatchPopulateAccessibilityEvent(obtain);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        this.f3291f = false;
    }

    public void m5176c(View view) {
        int i = 0;
        TextView textView = (TextView) view.findViewById(co.f5748g);
        if (textView != null) {
            int i2;
            int i3 = 1;
            if (this.f3287a && !TextUtils.isEmpty(this.f3288c)) {
                textView.setText(this.f3288c);
                i3 = 0;
            } else if (!(this.f3287a || TextUtils.isEmpty(this.f3289d))) {
                textView.setText(this.f3289d);
                i3 = 0;
            }
            if (i3 != 0) {
                CharSequence g = mo2103g();
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

    protected Parcelable mo532e() {
        Parcelable e = super.mo532e();
        if (m5164v()) {
            return e;
        }
        jxn jxn = new jxn(e);
        jxn.f21255a = mo531a();
        return jxn;
    }

    protected void mo529a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(jxn.class)) {
            super.mo529a(parcelable);
            return;
        }
        jxn jxn = (jxn) parcelable;
        super.mo529a(jxn.getSuperState());
        mo534a(jxn.f21255a);
    }
}
