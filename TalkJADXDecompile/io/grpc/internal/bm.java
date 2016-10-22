package io.grpc.internal;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import mjx;
import mjz;
import olc;

final class bm implements olc<Long> {
    private static final mjx<Character, TimeUnit> a;

    public /* synthetic */ String a(Object obj) {
        Long l = (Long) obj;
        bm.a(l.longValue() >= 0, (Object) "Negative timeout");
        Iterator a = a.e().a();
        while (a.hasNext()) {
            Entry entry = (Entry) a.next();
            long convert = ((TimeUnit) entry.getValue()).convert(l.longValue(), TimeUnit.NANOSECONDS);
            if (convert < 100000000) {
                String valueOf = String.valueOf(Long.toString(convert));
                String valueOf2 = String.valueOf(entry.getKey());
                return new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString();
            }
        }
        throw new IllegalArgumentException("Timeout too large");
    }

    bm() {
    }

    public /* synthetic */ Object a(String str) {
        boolean z;
        bm.a(str.length() > 0, (Object) "empty timeout");
        if (str.length() <= 9) {
            z = true;
        } else {
            z = false;
        }
        bm.a(z, (Object) "bad timeout format");
        String substring = str.substring(0, str.length() - 1);
        TimeUnit timeUnit = (TimeUnit) a.get(Character.valueOf(str.charAt(str.length() - 1)));
        if (timeUnit != null) {
            return Long.valueOf(timeUnit.toNanos(Long.parseLong(substring)));
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[]{Character.valueOf(r4)}));
    }

    static {
        a = new mjz().a(Character.valueOf('n'), TimeUnit.NANOSECONDS).a(Character.valueOf('u'), TimeUnit.MICROSECONDS).a(Character.valueOf('m'), TimeUnit.MILLISECONDS).a(Character.valueOf('S'), TimeUnit.SECONDS).a(Character.valueOf('M'), TimeUnit.MINUTES).a(Character.valueOf('H'), TimeUnit.HOURS).a();
    }
}
