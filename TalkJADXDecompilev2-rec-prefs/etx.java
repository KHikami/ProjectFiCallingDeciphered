package p000;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.concurrent.TimeUnit;

public enum etx {
    REACHABLE(1, 0, 30, fbe.BOOLEAN, "reachable", "reachable_time"),
    AVAILABLE(2, 5, 1, fbe.BOOLEAN, "available", "available_time"),
    STATUS_MESSAGE(3, 0, 1, fbe.STRING, "status_message", "status_message_time"),
    CALL_TYPE(6, 5, 1, fbe.INTEGER, "call_type", "call_type_time"),
    DEVICE_STATUS(7, 5, 1, fbe.INTEGER, "device_status", "device_status_time"),
    LAST_SEEN(10, 0, 1, fbe.LONG, "last_seen", "last_seen_time"),
    LOCATION(4, 5, 1, fbe.OBJECT, "location", "location_time");
    
    public static final etx[] f12266h = null;
    public final long f12268i;
    public final long f12269j;
    public final int f12270k;
    public final int f12271l;
    public final String f12272m;
    public final String f12273n;
    private final fbe f12274o;

    static {
        f12266h = etx.values();
    }

    private etx(int i, long j, long j2, fbe fbe, String str, String str2) {
        this.f12270k = i;
        this.f12268i = TimeUnit.MINUTES.toMillis(j);
        this.f12269j = TimeUnit.MINUTES.toMillis(j2);
        this.f12274o = fbe;
        this.f12272m = str;
        this.f12273n = str2;
        int ordinal = ordinal();
        iil.m21871a("Ordinals should always be >= 0.  If the ordinal has exceeded 31, then the type of fieldMask must be bumped from an int => long.", ordinal, 0, 31);
        this.f12271l = 1 << ordinal;
    }

    public boolean m14523a(int i) {
        return (this.f12271l & i) != 0;
    }

    public boolean m14524a(long j, long j2) {
        return etx.m14520a(j, j2, this.f12269j);
    }

    public boolean m14526b(long j, long j2) {
        return etx.m14520a(j, j2, this.f12268i);
    }

    private static boolean m14520a(long j, long j2, long j3) {
        return (j >= j2 - j3 && j <= j2) || j3 == 0;
    }

    public long m14521a(Cursor cursor) {
        return cursor.getLong((ordinal() * 2) + 1);
    }

    public Object m14525b(Cursor cursor) {
        int ordinal = ordinal() * 2;
        return cursor.isNull(ordinal) ? null : this.f12274o.mo1963a(cursor, ordinal);
    }

    public void m14522a(Object obj, Long l, ContentValues contentValues) {
        this.f12274o.mo1964a(this.f12272m, obj, contentValues);
        contentValues.put(this.f12273n, l);
    }
}
