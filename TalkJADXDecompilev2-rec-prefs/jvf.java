package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class jvf {
    public static final String f21122a = jum.class.getName();
    public static final String f21123b = jun.class.getName();
    public static final String f21124c = jzz.class.getName();
    private static jve f21125d;

    public static void m25306a(Context context, jyn jyn) {
        if (f21125d == null) {
            f21125d = new jve();
        }
        jyn.m25444a(jum.class, new juj(context));
    }

    public static void m25308b(Context context, jyn jyn) {
        if (f21125d == null) {
            f21125d = new jve();
        }
        Class cls = jun.class;
        List arrayList = new ArrayList(2);
        kad kad = juk.f21070a;
        jsn jsn = (jsn) jyn.m25433b(context, jsn.class);
        if (jsn != null) {
            arrayList.add(new jva(jsn));
        }
        jyn.m25445a(cls, (jun[]) arrayList.toArray(new jun[arrayList.size()]));
    }

    public static void m25307a(jyn jyn) {
        if (f21125d == null) {
            f21125d = new jve();
        }
        kad kad = jzz.f19869a;
        jyn.m25445a(jzz.class, new jzz[0]);
    }
}
