import android.content.Context;
import java.util.regex.Pattern;

public final class gzg {
    private static gzg a;
    private static final Pattern c;
    private hbo b;

    static {
        c = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    }

    private gzg(Context context) {
        this.b = hbo.c(context);
    }

    public static synchronized gzg a(Context context) {
        gzg gzg;
        synchronized (gzg.class) {
            if (a == null) {
                a = new gzg(context);
            }
            gzg = a;
        }
        return gzg;
    }
}
