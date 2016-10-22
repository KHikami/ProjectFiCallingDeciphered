import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class jvf {
    public static final String a;
    public static final String b;
    public static final String c;
    private static jve d;

    static {
        a = jum.class.getName();
        b = jun.class.getName();
        c = jzz.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (d == null) {
            d = new jve();
        }
        jyn.a(jum.class, new juj(context));
    }

    public static void b(Context context, jyn jyn) {
        if (d == null) {
            d = new jve();
        }
        Class cls = jun.class;
        List arrayList = new ArrayList(2);
        kad kad = juk.a;
        jsn jsn = (jsn) jyn.b(context, jsn.class);
        if (jsn != null) {
            arrayList.add(new jva(jsn));
        }
        jyn.a(cls, (jun[]) arrayList.toArray(new jun[arrayList.size()]));
    }

    public static void a(jyn jyn) {
        if (d == null) {
            d = new jve();
        }
        kad kad = jzz.a;
        jyn.a(jzz.class, new jzz[0]);
    }
}
