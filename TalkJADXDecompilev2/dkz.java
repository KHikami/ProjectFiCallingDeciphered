package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public final class dkz extends dhw {
    private final int g;
    private final int h;
    private final String i;

    public dkz(Context context, itl itl, int i, int i2, int i3, int i4, int i5, String str, String str2, boolean z, boolean z2, OnClickListener onClickListener) {
        super(context, itl, i3, i4, i, z, z2, str, onClickListener);
        this.g = i2;
        this.h = i5;
        this.i = str2;
    }

    public View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        View a = super.a(layoutInflater, i, viewGroup);
        ((ImageButton) a.findViewById(this.a)).setOnTouchListener(new dla(this));
        a(this.e);
        return a;
    }

    public void a(boolean z) {
        int color;
        ImageButton imageButton = (ImageButton) this.f.findViewById(this.a);
        GradientDrawable gradientDrawable = (GradientDrawable) imageButton.getBackground().mutate();
        if (z) {
            color = getResources().getColor(this.c);
        } else {
            color = getResources().getColor(this.g);
        }
        gradientDrawable.setColor(color);
        imageButton.setImageResource(z ? this.b : this.h);
        imageButton.setContentDescription(z ? this.d : this.i);
        this.e = z;
    }
}
