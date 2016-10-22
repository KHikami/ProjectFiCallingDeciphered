package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: grc */
public final class grc extends gpf {
    String a;

    public grc(Context context) {
        this(context, null);
    }

    private grc(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public void a(bko bko, boolean z, String str, String str2, dr drVar, int i, int i2, int i3) {
        String str3;
        a(str);
        setOnClickListener(new grd(this, str, str2, drVar));
        a(bc.tT);
        if (fyi.a()) {
            str3 = this.a;
        } else {
            str3 = null;
        }
        super.a(bko, z, str3, i, i2, i3);
    }

    protected boolean i() {
        return true;
    }

    public void a(String str) {
        this.a = str;
    }
}
