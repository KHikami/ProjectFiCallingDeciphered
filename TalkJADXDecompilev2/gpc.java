package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpc extends gpf {
    String a;
    String b;
    gph c;
    MessageListItemView d;

    public gpc(Context context) {
        this(context, null);
    }

    private gpc(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public void a(bko bko, boolean z, String str, int i, int i2, int i3, gph gph, MessageListItemView messageListItemView, String str2, String str3) {
        a(str);
        this.b = str3;
        this.c = gph;
        this.d = messageListItemView;
        if (!(this.d == null || this.c == null || this.b == null || ("image/gif".equals(str2) && !gkd.a(getContext())))) {
            setOnClickListener(new gpd(this));
        }
        a(bc.fs);
        super.a(bko, z, str, i, i2, i3);
    }

    protected boolean b() {
        return false;
    }

    public void a(String str) {
        this.a = str;
    }
}
