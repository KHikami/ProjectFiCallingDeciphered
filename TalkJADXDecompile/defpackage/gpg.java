package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;

/* renamed from: gpg */
final class gpg extends azt<Drawable> {
    final /* synthetic */ gpf b;
    private final Resources d;
    private TextView e;

    protected /* synthetic */ void a(Object obj) {
        e((Drawable) obj);
    }

    gpg(gpf gpf) {
        this.b = gpf;
        super(gpf.h);
        this.d = this.b.getResources();
        this.e = null;
    }

    public void b(Drawable drawable) {
        super.b(drawable);
        this.b.f();
    }

    public void c(Drawable drawable) {
        super.c(drawable);
        if (this.b.b()) {
            this.b.i.setVisibility(0);
            this.b.j.setVisibility(0);
            return;
        }
        this.b.a(bc.gy);
        this.b.h.setBackgroundColor(this.d.getColor(17170443));
        this.b.i.setImageResource(R$drawable.aH);
        this.b.i.setVisibility(0);
        this.e = new TextView(this.b.getContext());
        this.e.setLayoutParams(new LayoutParams(-2, -2));
        this.e.setText(bc.gy);
        this.e.setTextColor(this.d.getColor(gwb.dE));
        this.b.addView(this.e, 0);
    }

    private void e(Drawable drawable) {
        boolean z = gpf.e;
        this.b.o = null;
        if (this.b.b()) {
            this.b.i.setVisibility(0);
        }
        if (this.e != null) {
            this.b.removeView(this.e);
            this.e.setText(null);
            this.e = null;
            this.b.h.setBackgroundColor(this.d.getColor(17170445));
            this.b.i.setImageDrawable(null);
        }
        this.b.h.setImageDrawable(drawable);
        this.b.h.requestLayout();
        this.b.a(true);
    }
}
