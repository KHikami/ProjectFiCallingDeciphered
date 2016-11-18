package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jwu extends jwi {
    private List<jwi> a = new ArrayList();
    private boolean c = true;
    private int d = 0;
    private boolean e = false;

    public jwu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jxi.aS, i, 0);
        this.c = obtainStyledAttributes.getBoolean(jxi.aT, this.c);
        obtainStyledAttributes.recycle();
    }

    public void a(boolean z) {
        this.c = z;
    }

    public int a() {
        return this.a.size();
    }

    public jwi a(int i) {
        return (jwi) this.a.get(i);
    }

    public boolean c(jwi jwi) {
        if (this.a.contains(jwi)) {
            return true;
        }
        int i;
        if (jwi.n() == Integer.MAX_VALUE) {
            if (this.c) {
                i = this.d;
                this.d = i + 1;
                jwi.f(i);
            }
            if (jwi instanceof jwu) {
                ((jwu) jwi).a(this.c);
            }
        }
        i = Collections.binarySearch(this.a, jwi);
        if (i < 0) {
            i = (-i) - 1;
        }
        if (!b(jwi)) {
            return false;
        }
        synchronized (this) {
            this.a.add(i, jwi);
        }
        jwi.a(B());
        if (this.e) {
            jwi.C();
        }
        A();
        return true;
    }

    public boolean d(jwi jwi) {
        boolean e = e(jwi);
        A();
        return e;
    }

    private boolean e(jwi jwi) {
        boolean remove;
        synchronized (this) {
            jwi.E();
            remove = this.a.remove(jwi);
        }
        return remove;
    }

    public void c() {
        synchronized (this) {
            List list = this.a;
            for (int size = list.size() - 1; size >= 0; size--) {
                e((jwi) list.get(0));
            }
        }
        A();
    }

    public boolean b(jwi jwi) {
        jwi.h(D());
        return true;
    }

    public jwi a(CharSequence charSequence) {
        if (TextUtils.equals(s(), charSequence)) {
            return this;
        }
        int a = a();
        for (int i = 0; i < a; i++) {
            jwi a2 = a(i);
            String s = a2.s();
            if (s != null && s.equals(charSequence)) {
                return a2;
            }
            if (a2 instanceof jwu) {
                a2 = ((jwu) a2).a(charSequence);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public boolean d() {
        return true;
    }

    public void C() {
        super.C();
        this.e = true;
        int a = a();
        for (int i = 0; i < a; i++) {
            a(i).C();
        }
    }

    protected void E() {
        super.E();
        this.e = false;
    }

    public void f(boolean z) {
        super.f(z);
        int a = a();
        for (int i = 0; i < a; i++) {
            a(i).h(z);
        }
    }

    void f() {
        synchronized (this) {
            Collections.sort(this.a);
        }
    }

    protected void c(Bundle bundle) {
        super.c(bundle);
        int a = a();
        for (int i = 0; i < a; i++) {
            a(i).c(bundle);
        }
    }

    protected void e(Bundle bundle) {
        super.e(bundle);
        int a = a();
        for (int i = 0; i < a; i++) {
            a(i).e(bundle);
        }
    }
}
