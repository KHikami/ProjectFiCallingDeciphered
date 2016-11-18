package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.EnumMap;

public final class etu implements esn {
    private static final etx[] f12251c = etx.values();
    public final int f12252a;
    public final String f12253b;
    private final EnumMap<etx, etv> f12254d = new EnumMap(etx.class);

    public etu(int i, String str) {
        this.f12252a = i;
        this.f12253b = str;
    }

    public int mo1938a(fbc fbc, int i) {
        int i2 = 0;
        for (etx etx : f12251c) {
            if (etx.m14523a(i) && m14507b(etx, fbc.m14879a(etx), fbc.f12616a)) {
                i2 |= etx.f12271l;
            }
        }
        return i2;
    }

    public int mo1937a(Cursor cursor) {
        return m14500a(cursor, glj.m17956a());
    }

    private int m14500a(Cursor cursor, long j) {
        int i = 0;
        for (etx etx : f12251c) {
            long a = etx.m14521a(cursor);
            if (a > 0 && etx.m14526b(a, j) && m14507b(etx, etx.m14525b(cursor), a)) {
                i |= etx.f12271l;
            }
        }
        return i;
    }

    public boolean mo1940a(etx etx, Object obj, long j) {
        if (etx != etx.LAST_SEEN) {
            return m14507b(etx, obj, j);
        }
        Long l = (Long) obj;
        etv etv = (etv) this.f12254d.get(etx.LAST_SEEN);
        if (etv == null) {
            return false;
        }
        if (etv.f12256b == null) {
            return false;
        }
        if (!etu.m14506a((Long) etv.f12256b, l, j)) {
            return false;
        }
        etv.f12256b = l;
        return true;
    }

    private boolean m14507b(etx etx, Object obj, long j) {
        etv etv = (etv) this.f12254d.get(etx);
        if (etv == null) {
            this.f12254d.put(etx, new etv(obj, j));
        } else if (j < etv.f12255a) {
            return false;
        } else {
            if (!etu.m14505a(etx, etv, j)) {
                etv.f12256b = null;
            }
            etv.f12255a = j;
            if (etv.m14519a(obj)) {
                return false;
            }
            if (etx == etx.LAST_SEEN && etv.f12256b != null && obj != null && !etu.m14506a((Long) etv.f12256b, (Long) obj, j)) {
                return false;
            }
            etv.f12256b = obj;
        }
        return true;
    }

    public void mo1939a(int i, ContentValues contentValues) {
        for (etx etx : f12251c) {
            if (etx.m14523a(i)) {
                etv etv = (etv) this.f12254d.get(etx);
                if (etv != null) {
                    etx.m14522a(etv.f12256b, Long.valueOf(etv.f12255a), contentValues);
                } else {
                    etx.m14522a(null, null, contentValues);
                }
            }
        }
    }

    public String m14512a() {
        return (String) m14502a(etx.STATUS_MESSAGE);
    }

    public int m14508a(int i) {
        return m14501a(etx.DEVICE_STATUS, 0);
    }

    public int m14517b(int i) {
        return m14501a(etx.CALL_TYPE, 0);
    }

    public long m14511a(long j) {
        return gwb.m1524a((Long) m14502a(etx.LAST_SEEN), 0);
    }

    public boolean m14516a(boolean z) {
        return gwb.m1929a((Boolean) m14502a(etx.REACHABLE), false);
    }

    private int m14501a(etx etx, int i) {
        return gwb.m1508a((Integer) m14502a(etx), i);
    }

    private <T> T m14502a(etx etx) {
        return m14503a(etx, glj.m17956a());
    }

    private <T> T m14503a(etx etx, long j) {
        etv etv = (etv) this.f12254d.get(etx);
        return etu.m14505a(etx, etv, j) ? etv.f12256b : null;
    }

    public boolean m14514a(int i, long j) {
        for (etx etx : f12251c) {
            if (etx.m14523a(i)) {
                etv etv = (etv) this.f12254d.get(etx);
                if (etv == null || !etx.m14524a(etv.f12255a, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int m14518b(int i, long j) {
        etx[] etxArr = f12251c;
        int length = etxArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4;
            etx etx = etxArr[i2];
            if (etx.m14523a(i) && etu.m14505a(etx, (etv) this.f12254d.get(etx), j)) {
                i4 = etx.f12271l | i3;
            } else {
                i4 = i3;
            }
            i2++;
            i3 = i4;
        }
        return i3;
    }

    private static boolean m14505a(etx etx, etv etv, long j) {
        return etv != null && etx.m14526b(etv.f12255a, j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Presence [");
        m14504a("reachable", etx.REACHABLE, stringBuilder);
        m14504a("available", etx.AVAILABLE, stringBuilder);
        m14504a("callType", etx.CALL_TYPE, stringBuilder);
        m14504a("deviceStatus", etx.DEVICE_STATUS, stringBuilder);
        m14504a("lastSeen", etx.LAST_SEEN, stringBuilder);
        m14504a("statusMessage", etx.STATUS_MESSAGE, stringBuilder);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void m14504a(String str, etx etx, StringBuilder stringBuilder) {
        etv etv = (etv) this.f12254d.get(etx);
        if (etv != null) {
            stringBuilder.append(str).append(':').append(etv.f12256b).append('(').append(etv.f12255a).append(") ");
        }
    }

    private static boolean m14506a(Long l, Long l2, long j) {
        iil.m21875b("Expected non-null", (Object) l);
        iil.m21875b("Expected non-null", (Object) l2);
        long a = gwb.m1523a(l2);
        long a2 = gwb.m1523a(l);
        if (!glj.m17962a(a, j)) {
            glk.m17981d("Babel", "incoming last seen is in the future: lastSeenVal=" + a + " valueTime=" + j, new Object[0]);
            return false;
        } else if (a > a2 || !glj.m17962a(a2, j)) {
            return true;
        } else {
            return false;
        }
    }
}
