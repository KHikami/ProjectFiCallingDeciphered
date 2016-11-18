package p000;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.hangouts.views.MessageListItemView;

public final class gpc extends gpf {
    String f15852a;
    String f15853b;
    gph f15854c;
    MessageListItemView f15855d;

    public gpc(Context context) {
        this(context, null);
    }

    private gpc(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public void m18258a(bko bko, boolean z, String str, int i, int i2, int i3, gph gph, MessageListItemView messageListItemView, String str2, String str3) {
        mo716a(str);
        this.f15853b = str3;
        this.f15854c = gph;
        this.f15855d = messageListItemView;
        if (!(this.f15855d == null || this.f15854c == null || this.f15853b == null || ("image/gif".equals(str2) && !gkd.m17876a(getContext())))) {
            setOnClickListener(new gpd(this));
        }
        m6621a(bc.fs);
        super.m6622a(bko, z, str, i, i2, i3);
    }

    protected boolean mo719b() {
        return false;
    }

    public void mo716a(String str) {
        this.f15852a = str;
    }
}
