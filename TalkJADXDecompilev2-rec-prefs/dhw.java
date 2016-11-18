package p000;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class dhw extends FrameLayout {
    public final int f9772a;
    public final int f9773b;
    public final int f9774c;
    public final String f9775d;
    public boolean f9776e;
    public View f9777f;
    private final itl f9778g;
    private boolean f9779h;
    private OnClickListener f9780i;
    private dhx f9781j;

    public dhw(Context context, itl itl, int i, int i2, int i3, boolean z, boolean z2, String str, OnClickListener onClickListener) {
        super(context);
        this.f9778g = itl;
        this.f9772a = i;
        this.f9773b = i2;
        this.f9774c = i3;
        this.f9779h = z;
        this.f9776e = z2;
        this.f9775d = str;
        this.f9780i = onClickListener;
    }

    public View mo1594a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        this.f9777f = layoutInflater.inflate(i, viewGroup, false);
        ImageButton imageButton = (ImageButton) this.f9777f.findViewById(this.f9772a);
        imageButton.setImageResource(this.f9773b);
        mo1595a(this.f9776e);
        m11874b(this.f9779h);
        setOnClickListener(this.f9780i);
        ((GradientDrawable) imageButton.getBackground().mutate()).setColor(getResources().getColor(this.f9774c));
        imageButton.setContentDescription(this.f9775d);
        return this.f9777f;
    }

    public boolean m11873a() {
        return this.f9776e;
    }

    public void mo1595a(boolean z) {
        this.f9776e = z;
        if (this.f9777f != null) {
            ((ImageButton) this.f9777f.findViewById(this.f9772a)).setEnabled(z);
            this.f9777f.setAlpha(z ? 1.0f : 0.2f);
        }
    }

    public void m11874b(boolean z) {
        this.f9779h = z;
        if (this.f9777f != null) {
            this.f9777f.setVisibility(z ? 0 : 8);
        }
    }

    public boolean m11875b() {
        return this.f9779h;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f9780i = onClickListener;
        if (this.f9777f != null) {
            ((ImageButton) this.f9777f.findViewById(this.f9772a)).setOnClickListener(onClickListener);
        }
    }

    public void m11869a(dhx dhx) {
        this.f9781j = dhx;
    }

    public void m11871a(itl itl) {
        if (this.f9781j != null && this.f9778g.equals(itl)) {
            this.f9781j.mo1602a(itl);
        }
    }

    public void m11870a(did did) {
        if (this.f9781j != null) {
            this.f9781j.mo1601a(did);
        }
    }
}
