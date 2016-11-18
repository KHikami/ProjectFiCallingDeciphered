package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jwu extends jwi {
    private List<jwi> f8675a = new ArrayList();
    private boolean f8676c = true;
    private int f8677d = 0;
    private boolean f8678e = false;

    public jwu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aS, i, 0);
        this.f8676c = obtainStyledAttributes.getBoolean(jxi.aT, this.f8676c);
        obtainStyledAttributes.recycle();
    }

    public void m10479a(boolean z) {
        this.f8676c = z;
    }

    public int mo531a() {
        return this.f8675a.size();
    }

    public jwi m10477a(int i) {
        return (jwi) this.f8675a.get(i);
    }

    public boolean m10483c(jwi jwi) {
        if (this.f8675a.contains(jwi)) {
            return true;
        }
        int i;
        if (jwi.m5156n() == Integer.MAX_VALUE) {
            if (this.f8676c) {
                i = this.f8677d;
                this.f8677d = i + 1;
                jwi.m5143f(i);
            }
            if (jwi instanceof jwu) {
                ((jwu) jwi).m10479a(this.f8676c);
            }
        }
        i = Collections.binarySearch(this.f8675a, jwi);
        if (i < 0) {
            i = (-i) - 1;
        }
        if (!mo1332b(jwi)) {
            return false;
        }
        synchronized (this) {
            this.f8675a.add(i, jwi);
        }
        jwi.mo2094a(m5107B());
        if (this.f8678e) {
            jwi.mo1326C();
        }
        m5106A();
        return true;
    }

    public boolean m10485d(jwi jwi) {
        boolean e = m10473e(jwi);
        m5106A();
        return e;
    }

    private boolean m10473e(jwi jwi) {
        boolean remove;
        synchronized (this) {
            jwi.mo1327E();
            remove = this.f8675a.remove(jwi);
        }
        return remove;
    }

    public void mo1328c() {
        synchronized (this) {
            List list = this.f8675a;
            for (int size = list.size() - 1; size >= 0; size--) {
                m10473e((jwi) list.get(0));
            }
        }
        m5106A();
    }

    public boolean mo1332b(jwi jwi) {
        jwi.m5151h(mo526D());
        return true;
    }

    public jwi m10478a(CharSequence charSequence) {
        if (TextUtils.equals(m5161s(), charSequence)) {
            return this;
        }
        int a = mo531a();
        for (int i = 0; i < a; i++) {
            jwi a2 = m10477a(i);
            String s = a2.m5161s();
            if (s != null && s.equals(charSequence)) {
                return a2;
            }
            if (a2 instanceof jwu) {
                a2 = ((jwu) a2).m10478a(charSequence);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public boolean mo1334d() {
        return true;
    }

    public void mo1326C() {
        super.mo1326C();
        this.f8678e = true;
        int a = mo531a();
        for (int i = 0; i < a; i++) {
            m10477a(i).mo1326C();
        }
    }

    protected void mo1327E() {
        super.mo1327E();
        this.f8678e = false;
    }

    public void mo1331f(boolean z) {
        super.mo1331f(z);
        int a = mo531a();
        for (int i = 0; i < a; i++) {
            m10477a(i).m5151h(z);
        }
    }

    void m10487f() {
        synchronized (this) {
            Collections.sort(this.f8675a);
        }
    }

    protected void mo1329c(Bundle bundle) {
        super.mo1329c(bundle);
        int a = mo531a();
        for (int i = 0; i < a; i++) {
            m10477a(i).mo1329c(bundle);
        }
    }

    protected void mo1330e(Bundle bundle) {
        super.mo1330e(bundle);
        int a = mo531a();
        for (int i = 0; i < a; i++) {
            m10477a(i).mo1330e(bundle);
        }
    }
}
