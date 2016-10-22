import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

final class abg extends abf {
    private afn b;
    private afn c;

    abg(TextView textView) {
        super(textView);
    }

    void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.a.getContext();
        aai a = aai.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.W, i, 0);
        if (obtainStyledAttributes.hasValue(wi.ab)) {
            this.b = abf.a(context, a, obtainStyledAttributes.getResourceId(wi.ab, 0));
        }
        if (obtainStyledAttributes.hasValue(wi.Y)) {
            this.c = abf.a(context, a, obtainStyledAttributes.getResourceId(wi.Y, 0));
        }
        obtainStyledAttributes.recycle();
    }

    void a() {
        super.a();
        if (this.b != null || this.c != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.b);
            a(compoundDrawablesRelative[2], this.c);
        }
    }
}
