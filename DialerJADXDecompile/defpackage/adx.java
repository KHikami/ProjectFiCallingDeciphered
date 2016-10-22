package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: adx */
public abstract class adx extends FrameLayout {
    private static final String a;
    public adz b;
    public Uri c;
    public ImageView d;
    public QuickContactBadge e;
    public aaz f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private View k;

    public abstract boolean a();

    public abstract int b();

    static {
        a = adx.class.getSimpleName();
    }

    public adx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = null;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(cob.w);
        this.e = (QuickContactBadge) findViewById(cob.A);
        this.d = (ImageView) findViewById(cob.v);
        this.h = (TextView) findViewById(cob.B);
        this.i = (TextView) findViewById(cob.y);
        this.j = (TextView) findViewById(cob.x);
        this.k = findViewById(cob.z);
        findViewById(cob.u);
        setOnClickListener(c());
    }

    public OnClickListener c() {
        return new ady(this);
    }

    public void a(adg adg) {
        boolean z = false;
        if (adg != null) {
            this.g.setText(b(adg));
            this.c = adg.i;
            if (this.h != null) {
                String str = adg.e;
                this.h.setVisibility(8);
            }
            if (this.i != null) {
                if (TextUtils.isEmpty(adg.f)) {
                    this.i.setVisibility(8);
                } else {
                    this.i.setVisibility(0);
                    this.i.setText(adg.f);
                }
            }
            if (this.j != null) {
                this.j.setText(adg.g);
            }
            setVisibility(0);
            if (this.f != null) {
                abc a = a(adg.b, adg.j);
                if (adg.h == null) {
                    z = true;
                }
                a(z);
                if (this.d != null) {
                    this.f.a(this.d, adg.h, b(), a(), d(), a);
                    if (this.e != null) {
                        this.e.assignContactUri(this.c);
                    }
                } else if (this.e != null) {
                    this.e.assignContactUri(this.c);
                    this.f.a(this.e, adg.h, b(), a(), d(), a);
                }
            } else {
                Log.w(a, "contactPhotoManager not set");
            }
            if (this.k != null) {
                this.k.setContentDescription(adg.b);
                return;
            } else if (this.e != null) {
                this.e.setContentDescription(adg.b);
                return;
            } else {
                return;
            }
        }
        setVisibility(4);
    }

    public String b(adg adg) {
        return adg.b;
    }

    public void a(boolean z) {
    }

    public abc a(String str, String str2) {
        return new abc(str, str2, d());
    }

    public boolean d() {
        return true;
    }
}
