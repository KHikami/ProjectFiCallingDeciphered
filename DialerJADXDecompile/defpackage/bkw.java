package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: bkw */
public final class bkw {
    public static final Map a;
    public static final Map b;

    static {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
    }

    public static Boolean a(String str) {
        blb blb = (blb) a.get(str);
        if (blb != null && blb == blb.NOT_SPAM) {
            return Boolean.valueOf(false);
        }
        if (blb != null && blb == blb.SPAM) {
            return Boolean.valueOf(true);
        }
        Boolean bool = (Boolean) b.get(str);
        if (bool != null && bool.booleanValue()) {
            return Boolean.valueOf(true);
        }
        if (blb == null || bool == null) {
            return null;
        }
        return Boolean.valueOf(false);
    }

    public static void a(String str, boolean z) {
        b.put(str, Boolean.valueOf(z));
    }

    public static void a(String str, blb blb) {
        if (blb == null) {
            a.remove(str);
        } else {
            a.put(str, blb);
        }
    }
}
