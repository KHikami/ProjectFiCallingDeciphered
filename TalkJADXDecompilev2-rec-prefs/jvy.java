package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class jvy extends jwi implements OnClickListener, OnDismissListener, jwz {
    private up f14141a;
    private CharSequence f14142c;
    private CharSequence f14143d;
    private Drawable f14144e;
    private CharSequence f14145f;
    private CharSequence f14146g;
    private int f14147h;
    private Dialog f14148i;
    private int f14149j;

    private jvy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.at, i, 0);
        this.f14142c = obtainStyledAttributes.getString(jxi.ax);
        if (this.f14142c == null) {
            this.f14142c = m5157o();
        }
        this.f14143d = obtainStyledAttributes.getString(jxi.aw);
        this.f14144e = obtainStyledAttributes.getDrawable(jxi.au);
        this.f14145f = obtainStyledAttributes.getString(jxi.az);
        this.f14146g = obtainStyledAttributes.getString(jxi.ay);
        this.f14147h = obtainStyledAttributes.getResourceId(jxi.av, this.f14147h);
        obtainStyledAttributes.recycle();
    }

    public jvy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.zI);
    }

    public void m16363a(CharSequence charSequence) {
        this.f14142c = charSequence;
    }

    public void m16360a(int i) {
        m16363a(m5166x().getString(i));
    }

    public CharSequence mo531a() {
        return this.f14143d;
    }

    public void mo2100a(up upVar) {
    }

    protected void M_() {
        if (this.f14148i == null || !this.f14148i.isShowing()) {
            m16361a(null);
        }
    }

    protected void m16361a(Bundle bundle) {
        Context x = m5166x();
        this.f14149j = -2;
        this.f14141a = new up(x).a(this.f14142c).a(this.f14144e).a(this.f14145f, this).b(this.f14146g, this);
        View c = mo1328c();
        if (c != null) {
            m16366b(c);
            this.f14141a.b(c);
        } else {
            this.f14141a.b(this.f14143d);
        }
        mo2100a(this.f14141a);
        m5107B().m25365a((jwz) this);
        Dialog b = this.f14141a.b();
        this.f14148i = b;
        if (bundle != null) {
            b.onRestoreInstanceState(bundle);
        }
        b.setOnDismissListener(this);
        b.show();
    }

    protected View mo1328c() {
        if (this.f14147h == 0) {
            return null;
        }
        return LayoutInflater.from(this.f14141a.a()).inflate(this.f14147h, null);
    }

    protected void m16366b(View view) {
        View findViewById = view.findViewById(co.f5746e);
        if (findViewById != null) {
            CharSequence a = mo531a();
            int i = 8;
            if (!TextUtils.isEmpty(a)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(a);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f14149j = i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        m5107B().m25371b((jwz) this);
        this.f14148i = null;
        mo2101a(this.f14149j == -1);
    }

    protected void mo2101a(boolean z) {
    }

    public void mo2099d() {
        if (this.f14148i != null && this.f14148i.isShowing()) {
            this.f14148i.dismiss();
        }
    }

    protected Parcelable mo532e() {
        Parcelable e = super.mo532e();
        if (this.f14148i == null || !this.f14148i.isShowing()) {
            return e;
        }
        Parcelable jvz = new jvz(e);
        jvz.f21152a = true;
        jvz.f21153b = this.f14148i.onSaveInstanceState();
        return jvz;
    }

    protected void mo529a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(jvz.class)) {
            super.mo529a(parcelable);
            return;
        }
        jvz jvz = (jvz) parcelable;
        super.mo529a(jvz.getSuperState());
        if (jvz.f21152a) {
            m16361a(jvz.f21153b);
        }
    }
}
