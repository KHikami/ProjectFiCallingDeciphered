package io.grpc.internal;

import cob;
import czy;
import daa;
import dgx;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
final class av implements dgx {
    private static final czy a;

    public final /* synthetic */ Object a(String str) {
        boolean z;
        cob.a(str.length() > 0, (Object) "empty timeout");
        if (str.length() <= 9) {
            z = true;
        } else {
            z = false;
        }
        cob.a(z, (Object) "bad timeout format");
        String substring = str.substring(0, str.length() - 1);
        TimeUnit timeUnit = (TimeUnit) a.get(Character.valueOf(str.charAt(str.length() - 1)));
        if (timeUnit != null) {
            return Long.valueOf(timeUnit.toNanos(Long.parseLong(substring)));
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[]{Character.valueOf(r4)}));
    }

    public final /* synthetic */ String a(Object obj) {
        Long l = (Long) obj;
        cob.a(l.longValue() >= 0, (Object) "Negative timeout");
        Iterator b = a.c().b();
        while (b.hasNext()) {
            Entry entry = (Entry) b.next();
            long convert = ((TimeUnit) entry.getValue()).convert(l.longValue(), TimeUnit.NANOSECONDS);
            if (convert < 100000000) {
                String valueOf = String.valueOf(Long.toString(convert));
                String valueOf2 = String.valueOf(entry.getKey());
                return new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString();
            }
        }
        throw new IllegalArgumentException("Timeout too large");
    }

    av() {
    }

    static {
        a = new daa().a(Character.valueOf('n'), TimeUnit.NANOSECONDS).a(Character.valueOf('u'), TimeUnit.MICROSECONDS).a(Character.valueOf('m'), TimeUnit.MILLISECONDS).a(Character.valueOf('S'), TimeUnit.SECONDS).a(Character.valueOf('M'), TimeUnit.MINUTES).a(Character.valueOf('H'), TimeUnit.HOURS).a();
    }
}
