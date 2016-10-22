import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.Switch;

public class jxk extends jxm {
    private final jxl c;
    private CharSequence d;
    private CharSequence e;

    private jxk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.c = new jxl(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aY, i, 0);
        e(obtainStyledAttributes.getString(jxi.bb));
        f(obtainStyledAttributes.getString(jxi.ba));
        a(obtainStyledAttributes.getString(jxi.bd));
        d(obtainStyledAttributes.getString(jxi.bc));
        i(obtainStyledAttributes.getBoolean(jxi.aZ, false));
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

    protected void a(View view) {
        super.a(view);
        View findViewById = view.findViewById(co.h);
        if (findViewById != null && (findViewById instanceof Checkable)) {
            if (findViewById instanceof Switch) {
                ((Switch) findViewById).setOnCheckedChangeListener(null);
            }
            ((Checkable) findViewById).setChecked(this.a);
            if (findViewById instanceof Switch) {
                Switch switchR = (Switch) findViewById;
                switchR.setTextOn(this.d);
                switchR.setTextOff(this.e);
                switchR.setOnCheckedChangeListener(this.c);
            }
        }
        c(view);
    }

    public void a(CharSequence charSequence) {
        this.d = charSequence;
        z();
    }

    public void d(CharSequence charSequence) {
        this.e = charSequence;
        z();
    }
}
