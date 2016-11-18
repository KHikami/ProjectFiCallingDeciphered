package p000;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public final class dkz extends dhw {
    private final int f10054g;
    private final int f10055h;
    private final String f10056i;

    public dkz(Context context, itl itl, int i, int i2, int i3, int i4, int i5, String str, String str2, boolean z, boolean z2, OnClickListener onClickListener) {
        super(context, itl, i3, i4, i, z, z2, str, onClickListener);
        this.f10054g = i2;
        this.f10055h = i5;
        this.f10056i = str2;
    }

    public View mo1594a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        View a = super.mo1594a(layoutInflater, i, viewGroup);
        ((ImageButton) a.findViewById(this.a)).setOnTouchListener(new dla(this));
        mo1595a(this.e);
        return a;
    }

    public void mo1595a(boolean z) {
        int color;
        ImageButton imageButton = (ImageButton) this.f.findViewById(this.a);
        GradientDrawable gradientDrawable = (GradientDrawable) imageButton.getBackground().mutate();
        if (z) {
            color = getResources().getColor(this.c);
        } else {
            color = getResources().getColor(this.f10054g);
        }
        gradientDrawable.setColor(color);
        imageButton.setImageResource(z ? this.b : this.f10055h);
        imageButton.setContentDescription(z ? this.d : this.f10056i);
        this.e = z;
    }
}
