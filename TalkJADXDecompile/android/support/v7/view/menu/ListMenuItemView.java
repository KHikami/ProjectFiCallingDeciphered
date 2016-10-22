package android.support.v7.view.menu;

import afp;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import gwb;
import wi;
import yc;
import yq;

public class ListMenuItemView extends LinearLayout implements yq {
    private yc a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private ImageView g;
    private Drawable h;
    private int i;
    private Context j;
    private boolean k;
    private Drawable l;
    private int m;
    private LayoutInflater n;
    private boolean o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.U);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        afp a = afp.a(getContext(), attributeSet, wi.bX, i, 0);
        this.h = a.a(wi.bY);
        this.i = a.g(wi.bZ, -1);
        this.k = a.a(wi.ca, false);
        this.j = context;
        this.l = a.a(wi.cb);
        a.a();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(this.h);
        this.d = (TextView) findViewById(gwb.bJ);
        if (this.i != -1) {
            this.d.setTextAppearance(this.j, this.i);
        }
        this.f = (TextView) findViewById(gwb.bE);
        this.g = (ImageView) findViewById(gwb.bH);
        if (this.g != null) {
            this.g.setImageDrawable(this.l);
        }
    }

    public void a(yc ycVar, int i) {
        int i2 = 0;
        this.a = ycVar;
        this.m = 0;
        setVisibility(ycVar.isVisible() ? 0 : 8);
        a(ycVar.a(this));
        b(ycVar.isCheckable());
        boolean f = ycVar.f();
        ycVar.d();
        c(f);
        a(ycVar.getIcon());
        setEnabled(ycVar.isEnabled());
        f = ycVar.hasSubMenu();
        if (this.g != null) {
            ImageView imageView = this.g;
            if (!f) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    public void a(boolean z) {
        this.o = true;
        this.k = true;
    }

    public void a(CharSequence charSequence) {
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        } else if (this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }

    public yc a() {
        return this.a;
    }

    public void b(boolean z) {
        if (z || this.c != null || this.e != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.a.g()) {
                if (this.c == null) {
                    this.c = (RadioButton) c().inflate(gwb.bW, this, false);
                    addView(this.c);
                }
                compoundButton = this.c;
                compoundButton2 = this.e;
            } else {
                if (this.e == null) {
                    this.e = (CheckBox) c().inflate(gwb.bT, this, false);
                    addView(this.e);
                }
                compoundButton = this.e;
                compoundButton2 = this.c;
            }
            if (z) {
                int i;
                compoundButton.setChecked(this.a.isChecked());
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.e != null) {
                this.e.setVisibility(8);
            }
            if (this.c != null) {
                this.c.setVisibility(8);
            }
        }
    }

    public void c(boolean z) {
        int i = (z && this.a.f()) ? 0 : 8;
        if (i == 0) {
            this.f.setText(this.a.e());
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    public void a(Drawable drawable) {
        boolean z = this.a.h() || this.o;
        if (!z && !this.k) {
            return;
        }
        if (this.b != null || drawable != null || this.k) {
            if (this.b == null) {
                this.b = (ImageView) c().inflate(gwb.bU, this, false);
                addView(this.b, 0);
            }
            if (drawable != null || this.k) {
                ImageView imageView = this.b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.b.getVisibility() != 0) {
                    this.b.setVisibility(0);
                    return;
                }
                return;
            }
            this.b.setVisibility(8);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.b != null && this.k) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean b() {
        return false;
    }

    private LayoutInflater c() {
        if (this.n == null) {
            this.n = LayoutInflater.from(getContext());
        }
        return this.n;
    }
}
