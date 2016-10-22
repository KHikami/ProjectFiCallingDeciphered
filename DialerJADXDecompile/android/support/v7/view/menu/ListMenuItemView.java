package android.support.v7.view.menu;

import aah;
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
import buf;
import rk;
import rl;
import su;
import sy;
import tm;

/* compiled from: PG */
public class ListMenuItemView extends LinearLayout implements tm {
    public sy a;
    public boolean b;
    public boolean c;
    private ImageView d;
    private RadioButton e;
    private TextView f;
    private CheckBox g;
    private TextView h;
    private ImageView i;
    private Drawable j;
    private int k;
    private Context l;
    private Drawable m;
    private LayoutInflater n;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.R);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        aah a = aah.a(getContext(), attributeSet, rk.bh, i, 0);
        this.j = a.a(rk.bi);
        this.k = a.g(rk.bj, -1);
        this.b = a.a(rk.bk, false);
        this.l = context;
        this.m = a.a(rk.bl);
        a.a.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(this.j);
        this.f = (TextView) findViewById(buf.bF);
        if (this.k != -1) {
            this.f.setTextAppearance(this.l, this.k);
        }
        this.h = (TextView) findViewById(buf.bA);
        this.i = (ImageView) findViewById(buf.bD);
        if (this.i != null) {
            this.i.setImageDrawable(this.m);
        }
    }

    public final void a(sy syVar, int i) {
        int i2 = 0;
        this.a = syVar;
        setVisibility(syVar.isVisible() ? 0 : 8);
        CharSequence a = syVar.a((tm) this);
        if (a != null) {
            this.f.setText(a);
            if (this.f.getVisibility() != 0) {
                this.f.setVisibility(0);
            }
        } else if (this.f.getVisibility() != 8) {
            this.f.setVisibility(8);
        }
        boolean isCheckable = syVar.isCheckable();
        if (!(!isCheckable && this.e == null && this.g == null)) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.a.e()) {
                if (this.e == null) {
                    this.e = (RadioButton) c().inflate(buf.bT, this, false);
                    addView(this.e);
                }
                compoundButton = this.e;
                compoundButton2 = this.g;
            } else {
                if (this.g == null) {
                    this.g = (CheckBox) c().inflate(buf.bQ, this, false);
                    addView(this.g);
                }
                compoundButton = this.g;
                compoundButton2 = this.e;
            }
            if (isCheckable) {
                int i3;
                compoundButton.setChecked(this.a.isChecked());
                if (isCheckable) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                if (compoundButton.getVisibility() != i3) {
                    compoundButton.setVisibility(i3);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility() == 8)) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (this.g != null) {
                    this.g.setVisibility(8);
                }
                if (this.e != null) {
                    this.e.setVisibility(8);
                }
            }
        }
        boolean d = syVar.d();
        syVar.c();
        int i4 = (d && this.a.d()) ? 0 : 8;
        if (i4 == 0) {
            TextView textView = this.h;
            char c = this.a.c();
            if (c == '\u0000') {
                a = "";
            } else {
                StringBuilder stringBuilder = new StringBuilder(null);
                switch (c) {
                    case rl.j /*8*/:
                        stringBuilder.append(null);
                        break;
                    case rl.m /*10*/:
                        stringBuilder.append(null);
                        break;
                    case ' ':
                        stringBuilder.append(null);
                        break;
                    default:
                        stringBuilder.append(c);
                        break;
                }
                a = stringBuilder.toString();
            }
            textView.setText(a);
        }
        if (this.h.getVisibility() != i4) {
            this.h.setVisibility(i4);
        }
        Drawable icon = syVar.getIcon();
        su suVar = this.a.b;
        int i5 = this.c ? 1 : 0;
        if ((i5 != 0 || this.b) && !(this.d == null && icon == null && !this.b)) {
            if (this.d == null) {
                this.d = (ImageView) c().inflate(buf.bR, this, false);
                addView(this.d, 0);
            }
            if (icon != null || this.b) {
                this.d.setImageDrawable(i5 != 0 ? icon : null);
                if (this.d.getVisibility() != 0) {
                    this.d.setVisibility(0);
                }
            } else {
                this.d.setVisibility(8);
            }
        }
        setEnabled(syVar.isEnabled());
        d = syVar.hasSubMenu();
        if (this.i != null) {
            ImageView imageView = this.i;
            if (!d) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    public final sy a() {
        return this.a;
    }

    protected void onMeasure(int i, int i2) {
        if (this.d != null && this.b) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public final boolean b() {
        return false;
    }

    private final LayoutInflater c() {
        if (this.n == null) {
            this.n = LayoutInflater.from(getContext());
        }
        return this.n;
    }
}
