import android.content.Context;
import java.util.concurrent.Executors;

public final class biy {
    public static final String a;
    private static bix b;

    static {
        a = biw.class.getName();
    }

    public static void a(Context context, jyn jyn) {
        if (b == null) {
            b = new bix();
        }
        jyn.a(biw.class, new biz("babel_", context, Executors.newSingleThreadExecutor()));
    }
}
