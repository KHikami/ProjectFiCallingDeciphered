import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

public final class cmc extends LinearLayout {
    private final int a;
    private final int b;
    private final Paint c;
    private final int d;
    private final Paint e;
    private int f;
    private float g;

    public cmc(Context context, int i) {
        this(context, null, i);
    }

    private cmc(Context context, AttributeSet attributeSet, int i) {
        super(context, null);
        setWillNotDraw(false);
        this.a = i;
        float f = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int i2 = typedValue.data;
        this.b = (int) (0.0f * f);
        this.c = new Paint();
        this.c.setColor(Color.argb(38, Color.red(i2), Color.green(i2), Color.blue(i2)));
        this.d = (int) (f * 3.0f);
        this.e = new Paint();
        this.e.setColor(getResources().getColor(gwb.nj));
    }

    void a(int i, float f) {
        this.f = i;
        this.g = f;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        int height = getHeight();
        if (getChildCount() > 0) {
            View childAt = getChildAt(this.f);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (this.g > 0.0f && this.f < getChildCount() - 1) {
                View childAt2 = getChildAt(this.f + 1);
                left = (int) ((((float) left) * (1.0f - this.g)) + (this.g * ((float) childAt2.getLeft())));
                right = (int) ((((float) right) * (1.0f - this.g)) + (((float) childAt2.getRight()) * this.g));
            }
            canvas.drawRect((float) left, (float) (height - this.d), (float) right, (float) height, this.e);
        }
        if (this.a == 0) {
            canvas.drawRect(0.0f, (float) (height - this.b), (float) getWidth(), (float) height, this.c);
        } else if (this.a == 1) {
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) this.b, this.c);
        }
    }
}
