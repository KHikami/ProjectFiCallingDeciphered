package defpackage;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class ljy {
    static final Map<Integer, ljo> a = new HashMap();
    private static final AtomicInteger b = new AtomicInteger();

    public static ljo a(Intent intent) {
        if (!intent.hasExtra("tracing_intent_id")) {
            return null;
        }
        return (ljo) a.remove(Integer.valueOf(intent.getIntExtra("tracing_intent_id", -1)));
    }

    public static Runnable a(Runnable runnable) {
        return ljy.a(lkb.b(), runnable);
    }

    static Runnable a(ljo ljo, Runnable runnable) {
        return new ljz(ljo, runnable);
    }
}
