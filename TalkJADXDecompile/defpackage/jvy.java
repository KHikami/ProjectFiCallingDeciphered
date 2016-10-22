package defpackage;

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
import uo;
import up;

/* renamed from: jvy */
public class jvy extends jwi implements OnClickListener, OnDismissListener, jwz {
    private up a;
    private CharSequence c;
    private CharSequence d;
    private Drawable e;
    private CharSequence f;
    private CharSequence g;
    private int h;
    private Dialog i;
    private int j;

    private jvy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.at, i, 0);
        this.c = obtainStyledAttributes.getString(jxi.ax);
        if (this.c == null) {
            this.c = o();
        }
        this.d = obtainStyledAttributes.getString(jxi.aw);
        this.e = obtainStyledAttributes.getDrawable(jxi.au);
        this.f = obtainStyledAttributes.getString(jxi.az);
        this.g = obtainStyledAttributes.getString(jxi.ay);
        this.h = obtainStyledAttributes.getResourceId(jxi.av, this.h);
        obtainStyledAttributes.recycle();
    }

    public jvy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.zI);
    }

    public void a(CharSequence charSequence) {
        this.c = charSequence;
    }

    public void a(int i) {
        a(x().getString(i));
    }

    public CharSequence a() {
        return this.d;
    }

    public void a(up upVar) {
    }

    protected void M_() {
        if (this.i == null || !this.i.isShowing()) {
            a(null);
        }
    }

    protected void a(Bundle bundle) {
        Context x = x();
        this.j = -2;
        this.a = new up(x).a(this.c).a(this.e).a(this.f, this).b(this.g, this);
        View c = c();
        if (c != null) {
            b(c);
            this.a.b(c);
        } else {
            this.a.b(this.d);
        }
        a(this.a);
        B().a((jwz) this);
        uo b = this.a.b();
        this.i = b;
        if (bundle != null) {
            b.onRestoreInstanceState(bundle);
        }
        b.setOnDismissListener(this);
        b.show();
    }

    protected View c() {
        if (this.h == 0) {
            return null;
        }
        return LayoutInflater.from(this.a.a()).inflate(this.h, null);
    }

    protected void b(View view) {
        View findViewById = view.findViewById(co.e);
        if (findViewById != null) {
            CharSequence a = a();
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
        this.j = i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        B().b((jwz) this);
        this.i = null;
        a(this.j == -1);
    }

    protected void a(boolean z) {
    }

    public void d() {
        if (this.i != null && this.i.isShowing()) {
            this.i.dismiss();
        }
    }

    protected Parcelable e() {
        Parcelable e = super.e();
        if (this.i == null || !this.i.isShowing()) {
            return e;
        }
        Parcelable jvz = new jvz(e);
        jvz.a = true;
        jvz.b = this.i.onSaveInstanceState();
        return jvz;
    }

    protected void a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(jvz.class)) {
            super.a(parcelable);
            return;
        }
        jvz jvz = (jvz) parcelable;
        super.a(jvz.getSuperState());
        if (jvz.a) {
            a(jvz.b);
        }
    }
}
