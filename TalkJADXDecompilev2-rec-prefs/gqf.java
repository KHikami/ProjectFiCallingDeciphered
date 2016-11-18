package p000;

import android.view.View;
import com.google.android.apps.hangouts.views.MultiLineLayout;

public final class gqf extends gqg {
    final /* synthetic */ MultiLineLayout f15904a;
    private int f15905c;
    private int f15906d;
    private int f15907e;
    private int f15908f;

    public gqf(MultiLineLayout multiLineLayout) {
        this.f15904a = multiLineLayout;
        super(multiLineLayout);
    }

    public void m18305a(int i, int i2) {
        this.f15905c = 0;
        this.f15906d = 0;
        this.f15907e = i;
        this.f15908f = i2;
    }

    protected void mo2316a(View view) {
        this.f15904a.measureChild(view, this.f15907e, this.f15908f);
    }

    protected void mo2314a(View view, int i, int i2, int i3, int i4) {
        this.f15905c = Math.max(this.f15905c, i + i3);
        this.f15906d = Math.max(this.f15906d, i2 + i4);
    }

    public void mo2315a(int i) {
        super.mo2315a(i);
        this.f15905c += this.f15904a.getPaddingRight();
        this.f15906d += this.f15904a.getPaddingBottom();
        this.f15904a.setMeasuredDimension(View.resolveSize(this.f15905c, this.f15907e), View.resolveSize(this.f15906d, this.f15908f));
    }
}
