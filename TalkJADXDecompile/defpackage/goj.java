package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;

/* renamed from: goj */
public final class goj extends gpf {
    public goj(Context context) {
        this(context, null);
    }

    private goj(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public void a(bko bko, boolean z, String str, int i, int i2, int i3, String str2, dr drVar, String str3) {
        setOnClickListener(new gok(this, drVar, str2));
        if (TextUtils.isEmpty(str3)) {
            setContentDescription(str3);
            d(str3);
        } else {
            a(bc.cR);
        }
        super.a(bko, z, str, i, i2, i3);
    }

    protected boolean b() {
        return false;
    }

    public void a(String str) {
    }
}
