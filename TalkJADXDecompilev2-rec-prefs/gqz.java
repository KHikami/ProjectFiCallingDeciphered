package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.views.MessageListItemView;

public class gqz extends gpf implements gpv {
    String f4702a;
    public String f4703b;
    public String f4704c;
    bko f4705d;
    public fwx f4706p;
    private String f4707q;
    private OnClickListener f4708r;

    public gqz(Context context) {
        this(context, null);
    }

    public gqz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void m6850a(bko bko, boolean z, String str, String str2, String str3, String str4, int i, int i2, int i3, fwx fwx, int i4, gph gph, MessageListItemView messageListItemView) {
        this.f4705d = bko;
        this.f4702a = str3;
        this.f4703b = str2;
        this.f4706p = fwx;
        this.f4707q = str;
        mo765a(str4, 0);
        if (!(z && TextUtils.isEmpty(str4))) {
            m6858j();
        }
        this.f4708r = new gra(this, messageListItemView, gph);
        setOnClickListener(this.f4708r);
        m6621a(bc.tT);
        if (i4 == 0) {
            this.k.setIndeterminate(true);
        } else {
            this.k.setIndeterminate(false);
            this.k.setProgress(i4);
        }
        super.m6622a(bko, z, str, i, i2, i3);
    }

    protected boolean mo767g() {
        return this.f4706p == fwx.QUEUED || this.f4706p == fwx.UPLOADING;
    }

    protected boolean mo768h() {
        return this.f4706p == fwx.AWAIT_READY || this.f4706p == fwx.SENDING;
    }

    public void m6851a(fwx fwx, int i) {
        this.f4706p = fwx;
        m6628e();
        if (i > 0) {
            if (this.k.isIndeterminate()) {
                this.k.m10439a();
            }
            this.k.setProgress(i);
        }
    }

    public void d_() {
        super.d_();
        m6858j();
    }

    public void m6858j() {
        if (this.f4702a != null && this.f4703b != null && TextUtils.isEmpty(this.f4704c)) {
            setEnabled(false);
            new grb(this).execute(new Void[0]);
        }
    }

    protected void mo766e(String str) {
        ((dex) jyn.m25426a(getContext(), dex.class)).mo1510b(str, this.m, ((dey) jyn.m25426a(getContext(), dey.class)).mo1513a(g), new iic().m21856b().m21858d());
    }

    public void mo765a(String str, long j) {
        this.f4704c = str;
    }

    public void mo716a(String str) {
        if (!this.f4707q.equals(str)) {
            this.f4707q = str;
            m6626c(this.f4707q);
        }
    }

    protected boolean mo769i() {
        return this.f4706p != null && (this.f4706p == fwx.QUEUED || this.f4706p == fwx.UPLOADING || this.f4706p == fwx.AWAIT_READY || this.f4706p == fwx.SENDING);
    }
}
