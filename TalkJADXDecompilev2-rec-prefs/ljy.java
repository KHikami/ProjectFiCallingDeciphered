package p000;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class ljy {
    static final Map<Integer, ljo> f25127a = new HashMap();
    private static final AtomicInteger f25128b = new AtomicInteger();

    public static ljo m29197a(Intent intent) {
        if (!intent.hasExtra("tracing_intent_id")) {
            return null;
        }
        return (ljo) f25127a.remove(Integer.valueOf(intent.getIntExtra("tracing_intent_id", -1)));
    }

    public static Runnable m29195a(Runnable runnable) {
        return ljy.m29196a(lkb.m29209b(), runnable);
    }

    static Runnable m29196a(ljo ljo, Runnable runnable) {
        return new ljz(ljo, runnable);
    }
}
