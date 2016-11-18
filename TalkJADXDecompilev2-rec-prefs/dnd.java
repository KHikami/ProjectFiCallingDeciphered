package p000;

import android.content.Context;
import android.text.TextUtils;

public enum dnd {
    INVITED_ONLY(bc.eh),
    DOMAIN_RESTRICTED(bc.f2947do, bc.dp),
    DOMAIN_WITH_EXTERNAL(bc.dq, bc.dr),
    KNOCKABLE(bc.el),
    OPEN(bc.eZ);
    
    private final int f10149f;
    private final int f10150g;

    private dnd(int i) {
        this(r1, r2, i, i);
    }

    private dnd(int i, int i2) {
        this.f10149f = i;
        this.f10150g = i2;
    }

    public String m12274a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getResources().getString(this.f10150g);
        }
        return context.getResources().getString(this.f10149f, new Object[]{str});
    }
}
