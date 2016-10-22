import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

/* compiled from: PG */
public final class adv extends TextView {
    public adv(Context context, AttributeSet attributeSet, View view) {
        super(context, null);
        if (abp.a != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, abp.a);
            int color = obtainStyledAttributes.getColor(abp.c, -1);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(abp.s, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(abp.l, 0);
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(buf.cP) + dimensionPixelSize2;
            obtainStyledAttributes.recycle();
            setBackgroundColor(color);
            setTextAppearance(getContext(), buf.gX);
            setLayoutParams(new LayoutParams(dimensionPixelSize3, -2));
            setLayoutDirection(view.getLayoutDirection());
            setGravity((aix.b(this) ? 5 : 3) | 16);
            setPaddingRelative(getPaddingStart() + dimensionPixelSize2, getPaddingTop() + (dimensionPixelSize << 1), getPaddingEnd(), getPaddingBottom());
        }
    }
}
