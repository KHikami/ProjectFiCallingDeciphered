package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;

public final class goj extends gpf {
    public goj(Context context) {
        this(context, null);
    }

    private goj(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public void m18215a(bko bko, boolean z, String str, int i, int i2, int i3, String str2, dr drVar, String str3) {
        setOnClickListener(new gok(this, drVar, str2));
        if (TextUtils.isEmpty(str3)) {
            setContentDescription(str3);
            m6627d(str3);
        } else {
            m6621a(bc.cR);
        }
        super.m6622a(bko, z, str, i, i2, i3);
    }

    protected boolean mo719b() {
        return false;
    }

    public void mo716a(String str) {
    }
}
