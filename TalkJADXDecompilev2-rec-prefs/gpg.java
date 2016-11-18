package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;

final class gpg extends azt<Drawable> {
    final /* synthetic */ gpf f15857b;
    private final Resources f15858d = this.f15857b.getResources();
    private TextView f15859e = null;

    protected /* synthetic */ void mo434a(Object obj) {
        m18261e((Drawable) obj);
    }

    gpg(gpf gpf) {
        this.f15857b = gpf;
        super(gpf.f4445h);
    }

    public void mo432b(Drawable drawable) {
        super.mo432b(drawable);
        this.f15857b.m6630f();
    }

    public void mo433c(Drawable drawable) {
        super.mo433c(drawable);
        if (this.f15857b.mo719b()) {
            this.f15857b.f4446i.setVisibility(0);
            this.f15857b.f4447j.setVisibility(0);
            return;
        }
        this.f15857b.m6621a(bc.gy);
        this.f15857b.f4445h.setBackgroundColor(this.f15858d.getColor(17170443));
        this.f15857b.f4446i.setImageResource(R$drawable.aH);
        this.f15857b.f4446i.setVisibility(0);
        this.f15859e = new TextView(this.f15857b.getContext());
        this.f15859e.setLayoutParams(new LayoutParams(-2, -2));
        this.f15859e.setText(bc.gy);
        this.f15859e.setTextColor(this.f15858d.getColor(gwb.dE));
        this.f15857b.addView(this.f15859e, 0);
    }

    private void m18261e(Drawable drawable) {
        boolean z = gpf.f4438e;
        this.f15857b.f4452o = null;
        if (this.f15857b.mo719b()) {
            this.f15857b.f4446i.setVisibility(0);
        }
        if (this.f15859e != null) {
            this.f15857b.removeView(this.f15859e);
            this.f15859e.setText(null);
            this.f15859e = null;
            this.f15857b.f4445h.setBackgroundColor(this.f15858d.getColor(17170445));
            this.f15857b.f4446i.setImageDrawable(null);
        }
        this.f15857b.f4445h.setImageDrawable(drawable);
        this.f15857b.f4445h.requestLayout();
        this.f15857b.m6624a(true);
    }
}
