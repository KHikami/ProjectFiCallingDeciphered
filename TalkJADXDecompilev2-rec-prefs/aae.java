package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

public final class aae extends Button implements nv {
    private final aac f21a;
    private final abf f22b;

    public aae(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.f861G);
    }

    private aae(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, i);
        this.f21a = new aac(this);
        this.f21a.m45a(attributeSet, i);
        this.f22b = abf.m178a((TextView) this);
        this.f22b.mo17a(attributeSet, i);
        this.f22b.mo16a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f21a != null) {
            this.f21a.m42a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f21a != null) {
            this.f21a.m41a();
        }
    }

    public void mo1a(ColorStateList colorStateList) {
        if (this.f21a != null) {
            this.f21a.m43a(colorStateList);
        }
    }

    public ColorStateList mo3c() {
        return this.f21a != null ? this.f21a.m46b() : null;
    }

    public void mo2a(Mode mode) {
        if (this.f21a != null) {
            this.f21a.m44a(mode);
        }
    }

    public Mode mo4d() {
        return this.f21a != null ? this.f21a.m47c() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f21a != null) {
            this.f21a.m48d();
        }
        if (this.f22b != null) {
            this.f22b.mo16a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f22b != null) {
            this.f22b.m181a(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }
}
