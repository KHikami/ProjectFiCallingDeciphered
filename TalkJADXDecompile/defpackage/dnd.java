package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: dnd */
public enum dnd {
    INVITED_ONLY(bc.eh),
    DOMAIN_RESTRICTED(bc.do, bc.dp),
    DOMAIN_WITH_EXTERNAL(bc.dq, bc.dr),
    KNOCKABLE(bc.el),
    OPEN(bc.eZ);
    
    private final int f;
    private final int g;

    private dnd(int i) {
        this(r1, r2, i, i);
    }

    private dnd(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public String a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getResources().getString(this.g);
        }
        return context.getResources().getString(this.f, new Object[]{str});
    }
}
