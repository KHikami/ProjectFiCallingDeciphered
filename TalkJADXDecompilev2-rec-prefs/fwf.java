package p000;

import android.content.Context;
import android.util.AttributeSet;

public final class fwf extends jwb {
    private CharSequence[] f14156c;

    public fwf(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public void m16389a(CharSequence[] charSequenceArr) {
        this.f14156c = charSequenceArr;
    }

    protected void mo2100a(up upVar) {
        upVar.a(new fwg(this, m5166x(), gwb.hD, m16384f(), this.f14156c), this);
        upVar.b(null, null);
        super.mo2100a(upVar);
    }
}
