package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

final class abg extends abf {
    private afn f151b;
    private afn f152c;

    abg(TextView textView) {
        super(textView);
    }

    void mo17a(AttributeSet attributeSet, int i) {
        super.mo17a(attributeSet, i);
        Context context = this.a.getContext();
        aai a = aai.m66a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.f29030W, i, 0);
        if (obtainStyledAttributes.hasValue(wi.ab)) {
            this.f151b = abf.m179a(context, a, obtainStyledAttributes.getResourceId(wi.ab, 0));
        }
        if (obtainStyledAttributes.hasValue(wi.f29032Y)) {
            this.f152c = abf.m179a(context, a, obtainStyledAttributes.getResourceId(wi.f29032Y, 0));
        }
        obtainStyledAttributes.recycle();
    }

    void mo16a() {
        super.mo16a();
        if (this.f151b != null || this.f152c != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            m182a(compoundDrawablesRelative[0], this.f151b);
            m182a(compoundDrawablesRelative[2], this.f152c);
        }
    }
}
