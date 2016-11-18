package p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;

public final class ql {
    public static final qr f35003a;
    public final Object f35004b;

    static {
        if (VERSION.SDK_INT >= 24) {
            f35003a = new qp();
        } else if (VERSION.SDK_INT >= 23) {
            f35003a = new qo();
        } else if (VERSION.SDK_INT >= 22) {
            f35003a = new qn((byte) 0);
        } else if (VERSION.SDK_INT >= 21) {
            f35003a = new qn();
        } else if (VERSION.SDK_INT >= 19) {
            f35003a = new qu();
        } else if (VERSION.SDK_INT >= 18) {
            f35003a = new qt();
        } else if (VERSION.SDK_INT >= 17) {
            f35003a = new qs((byte) 0);
        } else if (VERSION.SDK_INT >= 16) {
            f35003a = new qs();
        } else if (VERSION.SDK_INT >= 14) {
            f35003a = new qq();
        } else {
            f35003a = new qr();
        }
    }

    public ql(Object obj) {
        this.f35004b = obj;
    }

    public Object m40349a() {
        return this.f35004b;
    }

    public void m40352a(View view) {
        f35003a.mo4289c(this.f35004b, view);
    }

    public void m40359b(View view) {
        f35003a.mo4279a(this.f35004b, view);
    }

    public int m40357b() {
        return f35003a.mo4287c(this.f35004b);
    }

    public void m40350a(int i) {
        f35003a.mo4277a(this.f35004b, i);
    }

    public void m40355a(qm qmVar) {
        f35003a.mo4325a(this.f35004b, qmVar.f35035E);
    }

    public boolean m40363b(qm qmVar) {
        return f35003a.mo4326b(this.f35004b, qmVar.f35035E);
    }

    public void m40365c(View view) {
        f35003a.mo4284b(this.f35004b, view);
    }

    public void m40351a(Rect rect) {
        f35003a.mo4278a(this.f35004b, rect);
    }

    public void m40358b(Rect rect) {
        f35003a.mo4288c(this.f35004b, rect);
    }

    public void m40364c(Rect rect) {
        f35003a.mo4283b(this.f35004b, rect);
    }

    public void m40369d(Rect rect) {
        f35003a.mo4293d(this.f35004b, rect);
    }

    private boolean m40343o() {
        return f35003a.mo4302h(this.f35004b);
    }

    public void m40356a(boolean z) {
        f35003a.mo4281a(this.f35004b, z);
    }

    private boolean m40344p() {
        return f35003a.mo4304i(this.f35004b);
    }

    public void m40362b(boolean z) {
        f35003a.mo4286b(this.f35004b, z);
    }

    public boolean m40368c() {
        return f35003a.mo4307l(this.f35004b);
    }

    public void m40367c(boolean z) {
        f35003a.mo4296e(this.f35004b, z);
    }

    public boolean m40371d() {
        return f35003a.mo4308m(this.f35004b);
    }

    public void m40370d(boolean z) {
        f35003a.mo4298f(this.f35004b, z);
    }

    public boolean m40373e() {
        return f35003a.mo4316s(this.f35004b);
    }

    public void m40372e(boolean z) {
        f35003a.mo4314j(this.f35004b, z);
    }

    public boolean m40375f() {
        return f35003a.mo4317t(this.f35004b);
    }

    public void m40374f(boolean z) {
        f35003a.mo4315k(this.f35004b, z);
    }

    public boolean m40377g() {
        return f35003a.mo4312q(this.f35004b);
    }

    public void m40376g(boolean z) {
        f35003a.mo4303i(this.f35004b, z);
    }

    public boolean m40379h() {
        return f35003a.mo4305j(this.f35004b);
    }

    public void m40378h(boolean z) {
        f35003a.mo4291c(this.f35004b, z);
    }

    public boolean m40381i() {
        return f35003a.mo4309n(this.f35004b);
    }

    public void m40380i(boolean z) {
        f35003a.mo4300g(this.f35004b, z);
    }

    public boolean m40383j() {
        return f35003a.mo4306k(this.f35004b);
    }

    public void m40382j(boolean z) {
        f35003a.mo4294d(this.f35004b, z);
    }

    private boolean m40345q() {
        return f35003a.mo4310o(this.f35004b);
    }

    private boolean m40346r() {
        return f35003a.mo4311p(this.f35004b);
    }

    public void m40385k(boolean z) {
        f35003a.mo4301h(this.f35004b, z);
    }

    public CharSequence m40384k() {
        return f35003a.mo4297f(this.f35004b);
    }

    public void m40353a(CharSequence charSequence) {
        f35003a.mo4290c(this.f35004b, charSequence);
    }

    public CharSequence m40386l() {
        return f35003a.mo4292d(this.f35004b);
    }

    public void m40360b(CharSequence charSequence) {
        f35003a.mo4280a(this.f35004b, charSequence);
    }

    private CharSequence m40347s() {
        return f35003a.mo4299g(this.f35004b);
    }

    public CharSequence m40387m() {
        return f35003a.mo4295e(this.f35004b);
    }

    public void m40366c(CharSequence charSequence) {
        f35003a.mo4285b(this.f35004b, charSequence);
    }

    public void m40388n() {
        f35003a.mo4313r(this.f35004b);
    }

    private String m40348t() {
        return f35003a.mo4318u(this.f35004b);
    }

    public void m40354a(Object obj) {
        f35003a.mo4321c(this.f35004b, ((qv) obj).f35036a);
    }

    public void m40361b(Object obj) {
        f35003a.mo4322d(this.f35004b, ((qw) obj).f35037a);
    }

    public int hashCode() {
        return this.f35004b == null ? 0 : this.f35004b.hashCode();
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
        if (this.f35004b == null) {
            if (qlVar.f35004b != null) {
                return false;
            }
            return true;
        } else if (this.f35004b.equals(qlVar.f35004b)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m40351a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m40364c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(m40384k());
        stringBuilder.append("; className: ").append(m40386l());
        stringBuilder.append("; text: ").append(m40347s());
        stringBuilder.append("; contentDescription: ").append(m40387m());
        stringBuilder.append("; viewId: ").append(m40348t());
        stringBuilder.append("; checkable: ").append(m40343o());
        stringBuilder.append("; checked: ").append(m40344p());
        stringBuilder.append("; focusable: ").append(m40368c());
        stringBuilder.append("; focused: ").append(m40371d());
        stringBuilder.append("; selected: ").append(m40377g());
        stringBuilder.append("; clickable: ").append(m40379h());
        stringBuilder.append("; longClickable: ").append(m40381i());
        stringBuilder.append("; enabled: ").append(m40383j());
        stringBuilder.append("; password: ").append(m40345q());
        stringBuilder.append("; scrollable: " + m40346r());
        stringBuilder.append("; [");
        int b = m40357b();
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
