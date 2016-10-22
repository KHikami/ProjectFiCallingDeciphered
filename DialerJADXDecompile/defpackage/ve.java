package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: ve */
public final class ve extends Button implements ki {
    private final vi a;
    private final vd b;
    private final wg c;

    public ve(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.F);
    }

    private ve(Context context, AttributeSet attributeSet, int i) {
        super(aae.a(context), attributeSet, i);
        this.a = vi.a();
        this.b = new vd(this, this.a);
        this.b.a(attributeSet, i);
        this.c = wg.a((TextView) this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.b(null);
        }
    }

    public final void a(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    public final ColorStateList c() {
        return this.b != null ? this.b.a() : null;
    }

    public final void a(Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    public final Mode d() {
        return this.b != null ? this.b.b() : null;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }
}
