package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: wh */
final class wh extends wg {
    private static final int[] b;
    private aaf c;
    private aaf d;

    static {
        b = new int[]{16843666, 16843667};
    }

    wh(TextView textView) {
        super(textView);
    }

    final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.a.getContext();
        vi a = vi.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.c = wg.a(context, a, obtainStyledAttributes.getResourceId(0, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.d = wg.a(context, a, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }

    final void a() {
        super.a();
        if (this.c != null || this.d != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.c);
            a(compoundDrawablesRelative[2], this.d);
        }
    }
}
