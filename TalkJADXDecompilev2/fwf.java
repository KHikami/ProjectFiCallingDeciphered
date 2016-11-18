package defpackage;

import android.content.Context;
import android.util.AttributeSet;

public final class fwf extends jwb {
    private CharSequence[] c;

    public fwf(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public void a(CharSequence[] charSequenceArr) {
        this.c = charSequenceArr;
    }

    protected void a(up upVar) {
        upVar.a(new fwg(this, x(), gwb.hD, f(), this.c), this);
        upVar.b(null, null);
        super.a(upVar);
    }
}
