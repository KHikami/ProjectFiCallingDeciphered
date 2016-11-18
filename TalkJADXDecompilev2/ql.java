package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;

public final class ql {
    public static final qr a;
    public final Object b;

    static {
        if (VERSION.SDK_INT >= 24) {
            a = new qp();
        } else if (VERSION.SDK_INT >= 23) {
            a = new qo();
        } else if (VERSION.SDK_INT >= 22) {
            a = new qn((byte) 0);
        } else if (VERSION.SDK_INT >= 21) {
            a = new qn();
        } else if (VERSION.SDK_INT >= 19) {
            a = new qu();
        } else if (VERSION.SDK_INT >= 18) {
            a = new qt();
        } else if (VERSION.SDK_INT >= 17) {
            a = new qs((byte) 0);
        } else if (VERSION.SDK_INT >= 16) {
            a = new qs();
        } else if (VERSION.SDK_INT >= 14) {
            a = new qq();
        } else {
            a = new qr();
        }
    }

    public ql(Object obj) {
        this.b = obj;
    }

    public Object a() {
        return this.b;
    }

    public void a(View view) {
        a.c(this.b, view);
    }

    public void b(View view) {
        a.a(this.b, view);
    }

    public int b() {
        return a.c(this.b);
    }

    public void a(int i) {
        a.a(this.b, i);
    }

    public void a(qm qmVar) {
        a.a(this.b, qmVar.E);
    }

    public boolean b(qm qmVar) {
        return a.b(this.b, qmVar.E);
    }

    public void c(View view) {
        a.b(this.b, view);
    }

    public void a(Rect rect) {
        a.a(this.b, rect);
    }

    public void b(Rect rect) {
        a.c(this.b, rect);
    }

    public void c(Rect rect) {
        a.b(this.b, rect);
    }

    public void d(Rect rect) {
        a.d(this.b, rect);
    }

    private boolean o() {
        return a.h(this.b);
    }

    public void a(boolean z) {
        a.a(this.b, z);
    }

    private boolean p() {
        return a.i(this.b);
    }

    public void b(boolean z) {
        a.b(this.b, z);
    }

    public boolean c() {
        return a.l(this.b);
    }

    public void c(boolean z) {
        a.e(this.b, z);
    }

    public boolean d() {
        return a.m(this.b);
    }

    public void d(boolean z) {
        a.f(this.b, z);
    }

    public boolean e() {
        return a.s(this.b);
    }

    public void e(boolean z) {
        a.j(this.b, z);
    }

    public boolean f() {
        return a.t(this.b);
    }

    public void f(boolean z) {
        a.k(this.b, z);
    }

    public boolean g() {
        return a.q(this.b);
    }

    public void g(boolean z) {
        a.i(this.b, z);
    }

    public boolean h() {
        return a.j(this.b);
    }

    public void h(boolean z) {
        a.c(this.b, z);
    }

    public boolean i() {
        return a.n(this.b);
    }

    public void i(boolean z) {
        a.g(this.b, z);
    }

    public boolean j() {
        return a.k(this.b);
    }

    public void j(boolean z) {
        a.d(this.b, z);
    }

    private boolean q() {
        return a.o(this.b);
    }

    private boolean r() {
        return a.p(this.b);
    }

    public void k(boolean z) {
        a.h(this.b, z);
    }

    public CharSequence k() {
        return a.f(this.b);
    }

    public void a(CharSequence charSequence) {
        a.c(this.b, charSequence);
    }

    public CharSequence l() {
        return a.d(this.b);
    }

    public void b(CharSequence charSequence) {
        a.a(this.b, charSequence);
    }

    private CharSequence s() {
        return a.g(this.b);
    }

    public CharSequence m() {
        return a.e(this.b);
    }

    public void c(CharSequence charSequence) {
        a.b(this.b, charSequence);
    }

    public void n() {
        a.r(this.b);
    }

    private String t() {
        return a.u(this.b);
    }

    public void a(Object obj) {
        a.c(this.b, ((qv) obj).a);
    }

    public void b(Object obj) {
        a.d(this.b, ((qw) obj).a);
    }

    public int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ql qlVar = (ql) obj;
        if (this.b == null) {
            if (qlVar.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(qlVar.b)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(k());
        stringBuilder.append("; className: ").append(l());
        stringBuilder.append("; text: ").append(s());
        stringBuilder.append("; contentDescription: ").append(m());
        stringBuilder.append("; viewId: ").append(t());
        stringBuilder.append("; checkable: ").append(o());
        stringBuilder.append("; checked: ").append(p());
        stringBuilder.append("; focusable: ").append(c());
        stringBuilder.append("; focused: ").append(d());
        stringBuilder.append("; selected: ").append(g());
        stringBuilder.append("; clickable: ").append(h());
        stringBuilder.append("; longClickable: ").append(i());
        stringBuilder.append("; enabled: ").append(j());
        stringBuilder.append("; password: ").append(q());
        stringBuilder.append("; scrollable: " + r());
        stringBuilder.append("; [");
        int b = b();
        while (b != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            int i = (numberOfTrailingZeros ^ -1) & b;
            switch (numberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            stringBuilder.append(str);
            if (i != 0) {
                stringBuilder.append(", ");
            }
            b = i;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
