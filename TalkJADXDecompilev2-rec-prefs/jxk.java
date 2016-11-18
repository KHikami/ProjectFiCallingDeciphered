package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.Switch;

public class jxk extends jxm {
    private final jxl f3293c;
    private CharSequence f3294d;
    private CharSequence f3295e;

    private jxk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f3293c = new jxl(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aY, i, 0);
        m5178e(obtainStyledAttributes.getString(jxi.bb));
        m5179f(obtainStyledAttributes.getString(jxi.ba));
        m5182a(obtainStyledAttributes.getString(jxi.bd));
        m5183d(obtainStyledAttributes.getString(jxi.bc));
        m5180i(obtainStyledAttributes.getBoolean(jxi.aZ, false));
        obtainStyledAttributes.recycle();
    }

    private jxk(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private jxk(Context context, AttributeSet attributeSet) {
        this(context, null, gwb.zN);
    }

    public jxk(Context context) {
        this(context, null);
    }

    protected void mo533a(View view) {
        super.mo533a(view);
        View findViewById = view.findViewById(co.f5749h);
        if (findViewById != null && (findViewById instanceof Checkable)) {
            if (findViewById instanceof Switch) {
                ((Switch) findViewById).setOnCheckedChangeListener(null);
            }
            ((Checkable) findViewById).setChecked(this.a);
            if (findViewById instanceof Switch) {
                Switch switchR = (Switch) findViewById;
                switchR.setTextOn(this.f3294d);
                switchR.setTextOff(this.f3295e);
                switchR.setOnCheckedChangeListener(this.f3293c);
            }
        }
        m5176c(view);
    }

    public void m5182a(CharSequence charSequence) {
        this.f3294d = charSequence;
        m5168z();
    }

    public void m5183d(CharSequence charSequence) {
        this.f3295e = charSequence;
        m5168z();
    }
}
