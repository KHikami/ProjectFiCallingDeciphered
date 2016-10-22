package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import ru;
import rv;

public class ContentLoadingProgressBar extends ProgressBar {
    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final Runnable e;
    private final Runnable f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = -1;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new ru(this);
        this.f = new rv(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    private void b() {
        removeCallbacks(this.e);
        removeCallbacks(this.f);
    }

    public void a() {
        this.a = -1;
        this.d = false;
        removeCallbacks(this.e);
        if (!this.c) {
            postDelayed(this.f, 500);
            this.c = true;
        }
    }
}
