package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.hangouts.R$drawable;

public final class gqx extends ImageView implements dye {
    String f15939a;

    public gqx(Context context) {
        this(context, null);
    }

    private gqx(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private gqx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }

    public void m18315a(bko bko, String str, dr drVar) {
        mo716a(str);
        setImageResource(R$drawable.bC);
        setPadding(0, 5, 0, 6);
        setLongClickable(true);
        setOnClickListener(new gqy(this, bko, drVar));
        setContentDescription(getResources().getString(bc.tM));
    }

    public void p_() {
    }

    public void b_() {
    }

    public void c_() {
    }

    public void d_() {
    }

    public void mo716a(String str) {
        this.f15939a = str;
    }
}
