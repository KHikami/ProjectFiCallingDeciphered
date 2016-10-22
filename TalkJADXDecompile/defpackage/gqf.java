package defpackage;

import android.view.View;
import com.google.android.apps.hangouts.views.MultiLineLayout;

/* renamed from: gqf */
public final class gqf extends gqg {
    final /* synthetic */ MultiLineLayout a;
    private int c;
    private int d;
    private int e;
    private int f;

    public gqf(MultiLineLayout multiLineLayout) {
        this.a = multiLineLayout;
        super(multiLineLayout);
    }

    public void a(int i, int i2) {
        this.c = 0;
        this.d = 0;
        this.e = i;
        this.f = i2;
    }

    protected void a(View view) {
        this.a.measureChild(view, this.e, this.f);
    }

    protected void a(View view, int i, int i2, int i3, int i4) {
        this.c = Math.max(this.c, i + i3);
        this.d = Math.max(this.d, i2 + i4);
    }

    public void a(int i) {
        super.a(i);
        this.c += this.a.getPaddingRight();
        this.d += this.a.getPaddingBottom();
        this.a.setMeasuredDimension(View.resolveSize(this.c, this.e), View.resolveSize(this.d, this.f));
    }
}
