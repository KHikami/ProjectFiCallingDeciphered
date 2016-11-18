package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class gmt extends LinearLayout {
    private dbe f6878a;
    private String f6879b;
    private long f6880c;

    public gmt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void m9252a(dbe dbe) {
        this.f6878a = dbe;
    }

    public void m9250a() {
        if (this.f6878a != null) {
            this.f6878a.m11409a(this.f6879b, this.f6880c, true, true);
        }
    }

    public void m9253a(String str) {
        this.f6879b = str;
    }

    public void m9251a(long j) {
        this.f6880c = j;
    }
}
