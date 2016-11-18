package p000;

import android.content.Context;
import android.util.AttributeSet;

public final class grc extends gpf {
    String f15947a;

    public grc(Context context) {
        this(context, null);
    }

    private grc(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public void m18319a(bko bko, boolean z, String str, String str2, dr drVar, int i, int i2, int i3) {
        String str3;
        mo716a(str);
        setOnClickListener(new grd(this, str, str2, drVar));
        m6621a(bc.tT);
        if (fyi.m16612a()) {
            str3 = this.f15947a;
        } else {
            str3 = null;
        }
        super.m6622a(bko, z, str3, i, i2, i3);
    }

    protected boolean mo769i() {
        return true;
    }

    public void mo716a(String str) {
        this.f15947a = str;
    }
}
