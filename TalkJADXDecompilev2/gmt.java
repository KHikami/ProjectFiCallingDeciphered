package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class gmt extends LinearLayout {
    private dbe a;
    private String b;
    private long c;

    public gmt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(dbe dbe) {
        this.a = dbe;
    }

    public void a() {
        if (this.a != null) {
            this.a.a(this.b, this.c, true, true);
        }
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(long j) {
        this.c = j;
    }
}
