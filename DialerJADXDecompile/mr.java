import android.graphics.Rect;
import android.os.Build.VERSION;

/* compiled from: PG */
public final class mr {
    public static final mv a;
    public final Object b;

    static {
        if (VERSION.SDK_INT >= 24) {
            a = new mt();
        } else if (VERSION.SDK_INT >= 22) {
            a = new ms((byte) 0);
        } else if (VERSION.SDK_INT >= 21) {
            a = new ms();
        } else if (VERSION.SDK_INT >= 19) {
            a = new my();
        } else if (VERSION.SDK_INT >= 18) {
            a = new mx();
        } else if (VERSION.SDK_INT >= 17) {
            a = new mw((byte) 0);
        } else if (VERSION.SDK_INT >= 16) {
            a = new mw();
        } else if (VERSION.SDK_INT >= 14) {
            a = new mu();
        } else {
            a = new mv();
        }
    }

    public static mr a(Object obj) {
        if (obj != null) {
            return new mr(obj);
        }
        return null;
    }

    public mr(Object obj) {
        this.b = obj;
    }

    public final int a() {
        return a.b(this.b);
    }

    public final void a(int i) {
        a.a(this.b, i);
    }

    public final void a(Rect rect) {
        a.a(this.b, rect);
    }

    public final void b(Rect rect) {
        a.c(this.b, rect);
    }

    public final void c(Rect rect) {
        a.b(this.b, rect);
    }

    public final void d(Rect rect) {
        a.d(this.b, rect);
    }

    public final boolean b() {
        return a.i(this.b);
    }

    public final boolean c() {
        return a.l(this.b);
    }

    public final void a(boolean z) {
        a.g(this.b, z);
    }

    public final void b(boolean z) {
        a.a(this.b, true);
    }

    public final boolean d() {
        return a.k(this.b);
    }

    public final boolean e() {
        return a.o(this.b);
    }

    public final boolean f() {
        return a.p(this.b);
    }

    public final void c(boolean z) {
        a.e(this.b, z);
    }

    public final CharSequence g() {
        return a.d(this.b);
    }

    public final void a(CharSequence charSequence) {
        a.a(this.b, charSequence);
    }

    public final CharSequence h() {
        return a.g(this.b);
    }

    public final CharSequence i() {
        return a.e(this.b);
    }

    public final int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        mr mrVar = (mr) obj;
        if (this.b == null) {
            if (mrVar.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(mrVar.b)) {
            return true;
        } else {
            return false;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(a.f(this.b));
        stringBuilder.append("; className: ").append(g());
        stringBuilder.append("; text: ").append(h());
        stringBuilder.append("; contentDescription: ").append(i());
        stringBuilder.append("; viewId: ").append(a.r(this.b));
        stringBuilder.append("; checkable: ").append(a.h(this.b));
        stringBuilder.append("; checked: ").append(b());
        stringBuilder.append("; focusable: ").append(c());
        stringBuilder.append("; focused: ").append(a.m(this.b));
        stringBuilder.append("; selected: ").append(a.q(this.b));
        stringBuilder.append("; clickable: ").append(a.j(this.b));
        stringBuilder.append("; longClickable: ").append(a.n(this.b));
        stringBuilder.append("; enabled: ").append(d());
        stringBuilder.append("; password: ").append(e());
        stringBuilder.append("; scrollable: " + f());
        stringBuilder.append("; [");
        int a = a();
        while (a != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a);
            int i = (numberOfTrailingZeros ^ -1) & a;
            switch (numberOfTrailingZeros) {
                case rq.b /*1*/:
                    str = "ACTION_FOCUS";
                    break;
                case rq.c /*2*/:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case rl.f /*4*/:
                    str = "ACTION_SELECT";
                    break;
                case rl.j /*8*/:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case rk.bX /*16*/:
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
            a = i;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
