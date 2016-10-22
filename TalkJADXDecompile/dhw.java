import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class dhw extends FrameLayout {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public boolean e;
    public View f;
    private final itl g;
    private boolean h;
    private OnClickListener i;
    private dhx j;

    public dhw(Context context, itl itl, int i, int i2, int i3, boolean z, boolean z2, String str, OnClickListener onClickListener) {
        super(context);
        this.g = itl;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.h = z;
        this.e = z2;
        this.d = str;
        this.i = onClickListener;
    }

    public View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        this.f = layoutInflater.inflate(i, viewGroup, false);
        ImageButton imageButton = (ImageButton) this.f.findViewById(this.a);
        imageButton.setImageResource(this.b);
        a(this.e);
        b(this.h);
        setOnClickListener(this.i);
        ((GradientDrawable) imageButton.getBackground().mutate()).setColor(getResources().getColor(this.c));
        imageButton.setContentDescription(this.d);
        return this.f;
    }

    public boolean a() {
        return this.e;
    }

    public void a(boolean z) {
        this.e = z;
        if (this.f != null) {
            ((ImageButton) this.f.findViewById(this.a)).setEnabled(z);
            this.f.setAlpha(z ? 1.0f : 0.2f);
        }
    }

    public void b(boolean z) {
        this.h = z;
        if (this.f != null) {
            this.f.setVisibility(z ? 0 : 8);
        }
    }

    public boolean b() {
        return this.h;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.i = onClickListener;
        if (this.f != null) {
            ((ImageButton) this.f.findViewById(this.a)).setOnClickListener(onClickListener);
        }
    }

    public void a(dhx dhx) {
        this.j = dhx;
    }

    public void a(itl itl) {
        if (this.j != null && this.g.equals(itl)) {
            this.j.a(itl);
        }
    }

    public void a(did did) {
        if (this.j != null) {
            this.j.a(did);
        }
    }
}
