package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: aqn */
public abstract class aqn extends adx {
    static final ClipData g;
    private View a;
    String h;

    static {
        aqn.class.getSimpleName();
        g = ClipData.newPlainText("", "");
    }

    public aqn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(aq.bt);
        setOnLongClickListener(new aqo(this));
    }

    public void a(adg adg) {
        super.a(adg);
        this.h = null;
        if (adg != null) {
            this.h = adg.g;
            if (adg == adg.a) {
                setVisibility(4);
                return;
            }
            ((ImageView) findViewById(aq.K)).setVisibility(adg.m ? 0 : 8);
            setVisibility(0);
        }
    }

    protected final boolean a() {
        return false;
    }

    protected final OnClickListener c() {
        return new aqp(this);
    }

    protected final abc a(String str, String str2) {
        return new abc(str, str2, 1, 0.7f, -0.12f, false);
    }

    protected final void a(boolean z) {
        if (this.a != null) {
            this.a.setVisibility(z ? 8 : 0);
        }
    }

    protected final boolean d() {
        return false;
    }
}
