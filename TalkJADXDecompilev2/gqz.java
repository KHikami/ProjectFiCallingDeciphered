package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

public class gqz extends gpf implements gpv {
    String a;
    public String b;
    public String c;
    bko d;
    public fwx p;
    private String q;
    private OnClickListener r;

    public gqz(Context context) {
        this(context, null);
    }

    public gqz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(bko bko, boolean z, String str, String str2, String str3, String str4, int i, int i2, int i3, fwx fwx, int i4, gph gph, MessageListItemView messageListItemView) {
        this.d = bko;
        this.a = str3;
        this.b = str2;
        this.p = fwx;
        this.q = str;
        a(str4, 0);
        if (!(z && TextUtils.isEmpty(str4))) {
            j();
        }
        this.r = new gra(this, messageListItemView, gph);
        setOnClickListener(this.r);
        a(bc.tT);
        if (i4 == 0) {
            this.k.setIndeterminate(true);
        } else {
            this.k.setIndeterminate(false);
            this.k.setProgress(i4);
        }
        super.a(bko, z, str, i, i2, i3);
    }

    protected boolean g() {
        return this.p == fwx.QUEUED || this.p == fwx.UPLOADING;
    }

    protected boolean h() {
        return this.p == fwx.AWAIT_READY || this.p == fwx.SENDING;
    }

    public void a(fwx fwx, int i) {
        this.p = fwx;
        e();
        if (i > 0) {
            if (this.k.isIndeterminate()) {
                this.k.a();
            }
            this.k.setProgress(i);
        }
    }

    public void d_() {
        super.d_();
        j();
    }

    public void j() {
        if (this.a != null && this.b != null && TextUtils.isEmpty(this.c)) {
            setEnabled(false);
            new grb(this).execute(new Void[0]);
        }
    }

    protected void e(String str) {
        ((dex) jyn.a(getContext(), dex.class)).b(str, this.m, ((dey) jyn.a(getContext(), dey.class)).a(g), new iic().b().d());
    }

    public void a(String str, long j) {
        this.c = str;
    }

    public void a(String str) {
        if (!this.q.equals(str)) {
            this.q = str;
            c(this.q);
        }
    }

    protected boolean i() {
        return this.p != null && (this.p == fwx.QUEUED || this.p == fwx.UPLOADING || this.p == fwx.AWAIT_READY || this.p == fwx.SENDING);
    }
}
