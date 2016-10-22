package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: bno */
public class bno {
    public final bnp f;

    public bno(bnp bnp) {
        buf.A((Object) bnp);
        this.f = bnp;
    }

    private static String a(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    protected static String a(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object a = bno.a(obj);
        Object a2 = bno.a(obj2);
        Object a3 = bno.a(obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            stringBuilder.append(str2);
            stringBuilder.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            stringBuilder.append(str2);
            stringBuilder.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            stringBuilder.append(str2);
            stringBuilder.append(a3);
        }
        return stringBuilder.toString();
    }

    public static boolean k() {
        return Log.isLoggable((String) boq.b.a(), 2);
    }

    final void a(int i, String str, Object obj, Object obj2, Object obj3) {
        bot bot = null;
        if (this.f != null) {
            bot = this.f.e;
        }
        if (bot != null) {
            String str2 = (String) boq.b.a();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, bno.a(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                bot.b(i, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String str3 = (String) boq.b.a();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, bno.a(str, obj, obj2, obj3));
        }
    }

    public final void a(String str, Object obj) {
        a(2, str, obj, null, null);
    }

    public final void a(String str, Object obj, Object obj2) {
        a(2, str, obj, obj2, null);
    }

    public final void b(String str) {
        a(2, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        a(3, str, obj, null, null);
    }

    public final void b(String str, Object obj, Object obj2) {
        a(3, str, obj, obj2, null);
    }

    public final void c(String str) {
        a(3, str, null, null, null);
    }

    public final void c(String str, Object obj) {
        a(4, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        a(5, str, obj, obj2, null);
    }

    public final void d(String str) {
        a(4, str, null, null, null);
    }

    public final void d(String str, Object obj) {
        a(5, str, obj, null, null);
    }

    public final void d(String str, Object obj, Object obj2) {
        a(6, str, obj, obj2, null);
    }

    public final void e(String str) {
        a(5, str, null, null, null);
    }

    public final void e(String str, Object obj) {
        a(6, str, obj, null, null);
    }

    public final bwa f() {
        return this.f.c;
    }

    public final void f(String str) {
        a(6, str, null, null, null);
    }

    public final Context g() {
        return this.f.a;
    }

    protected final bom h() {
        return this.f.d;
    }

    protected final boo i() {
        bnp bnp = this.f;
        bnp.a(bnp.f);
        return bnp.f;
    }

    protected final box j() {
        bnp bnp = this.f;
        bnp.a(bnp.g);
        return bnp.g;
    }

    protected final void e() {
        if (btq.a) {
            throw new IllegalStateException("Call only supported on the client side");
        }
    }
}
