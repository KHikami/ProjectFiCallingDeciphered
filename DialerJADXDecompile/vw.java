import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RatingBar;

/* compiled from: PG */
public final class vw extends RatingBar {
    private vu a;
    private vi b;

    public vw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.V);
    }

    private vw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = vi.a();
        this.a = new vu(this, this.b);
        this.a.a(attributeSet, i);
    }

    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.a.a;
        if (bitmap != null) {
            setMeasuredDimension(kn.a(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
