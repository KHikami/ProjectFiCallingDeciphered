package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.EnumMap;

public final class etu implements esn {
    private static final etx[] c = etx.values();
    public final int a;
    public final String b;
    private final EnumMap<etx, etv> d = new EnumMap(etx.class);

    public etu(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int a(fbc fbc, int i) {
        int i2 = 0;
        for (etx etx : c) {
            if (etx.a(i) && b(etx, fbc.a(etx), fbc.a)) {
                i2 |= etx.l;
            }
        }
        return i2;
    }

    public int a(Cursor cursor) {
        return a(cursor, glj.a());
    }

    private int a(Cursor cursor, long j) {
        int i = 0;
        for (etx etx : c) {
            long a = etx.a(cursor);
            if (a > 0 && etx.b(a, j) && b(etx, etx.b(cursor), a)) {
                i |= etx.l;
            }
        }
        return i;
    }

    public boolean a(etx etx, Object obj, long j) {
        if (etx != etx.LAST_SEEN) {
            return b(etx, obj, j);
        }
        Long l = (Long) obj;
        etv etv = (etv) this.d.get(etx.LAST_SEEN);
        if (etv == null) {
            return false;
        }
        if (etv.b == null) {
            return false;
        }
        if (!etu.a((Long) etv.b, l, j)) {
            return false;
        }
        etv.b = l;
        return true;
    }

    private boolean b(etx etx, Object obj, long j) {
        etv etv = (etv) this.d.get(etx);
        if (etv == null) {
            this.d.put(etx, new etv(obj, j));
        } else if (j < etv.a) {
            return false;
        } else {
            if (!etu.a(etx, etv, j)) {
                etv.b = null;
            }
            etv.a = j;
            if (etv.a(obj)) {
                return false;
            }
            if (etx == etx.LAST_SEEN && etv.b != null && obj != null && !etu.a((Long) etv.b, (Long) obj, j)) {
                return false;
            }
            etv.b = obj;
        }
        return true;
    }

    public void a(int i, ContentValues contentValues) {
        for (etx etx : c) {
            if (etx.a(i)) {
                etv etv = (etv) this.d.get(etx);
                if (etv != null) {
                    etx.a(etv.b, Long.valueOf(etv.a), contentValues);
                } else {
                    etx.a(null, null, contentValues);
                }
            }
        }
    }

    public String a() {
        return (String) a(etx.STATUS_MESSAGE);
    }

    public int a(int i) {
        return a(etx.DEVICE_STATUS, 0);
    }

    public int b(int i) {
        return a(etx.CALL_TYPE, 0);
    }

    public long a(long j) {
        return gwb.a((Long) a(etx.LAST_SEEN), 0);
    }

    public boolean a(boolean z) {
        return gwb.a((Boolean) a(etx.REACHABLE), false);
    }

    private int a(etx etx, int i) {
        return gwb.a((Integer) a(etx), i);
    }

    private <T> T a(etx etx) {
        return a(etx, glj.a());
    }

    private <T> T a(etx etx, long j) {
        etv etv = (etv) this.d.get(etx);
        return etu.a(etx, etv, j) ? etv.b : null;
    }

    public boolean a(int i, long j) {
        for (etx etx : c) {
            if (etx.a(i)) {
                etv etv = (etv) this.d.get(etx);
                if (etv == null || !etx.a(etv.a, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int b(int i, long j) {
        etx[] etxArr = c;
        int length = etxArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4;
            etx etx = etxArr[i2];
            if (etx.a(i) && etu.a(etx, (etv) this.d.get(etx), j)) {
                i4 = etx.l | i3;
            } else {
                i4 = i3;
            }
            i2++;
            i3 = i4;
        }
        return i3;
    }

    private static boolean a(etx etx, etv etv, long j) {
        return etv != null && etx.b(etv.a, j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Presence [");
        a("reachable", etx.REACHABLE, stringBuilder);
        a("available", etx.AVAILABLE, stringBuilder);
        a("callType", etx.CALL_TYPE, stringBuilder);
        a("deviceStatus", etx.DEVICE_STATUS, stringBuilder);
        a("lastSeen", etx.LAST_SEEN, stringBuilder);
        a("statusMessage", etx.STATUS_MESSAGE, stringBuilder);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void a(String str, etx etx, StringBuilder stringBuilder) {
        etv etv = (etv) this.d.get(etx);
        if (etv != null) {
            stringBuilder.append(str).append(':').append(etv.b).append('(').append(etv.a).append(") ");
        }
    }

    private static boolean a(Long l, Long l2, long j) {
        iil.b("Expected non-null", (Object) l);
        iil.b("Expected non-null", (Object) l2);
        long a = gwb.a(l2);
        long a2 = gwb.a(l);
        if (!glj.a(a, j)) {
            glk.d("Babel", "incoming last seen is in the future: lastSeenVal=" + a + " valueTime=" + j, new Object[0]);
            return false;
        } else if (a > a2 || !glj.a(a2, j)) {
            return true;
        } else {
            return false;
        }
    }
}
