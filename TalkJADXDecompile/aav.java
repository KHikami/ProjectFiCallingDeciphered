import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RatingBar;

public final class aav extends RatingBar {
    private aat a;

    public aav(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.Y);
    }

    private aav(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new aat(this);
        this.a.a(attributeSet, i);
    }

    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.a.a();
        if (a != null) {
            setMeasuredDimension(oa.a(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
