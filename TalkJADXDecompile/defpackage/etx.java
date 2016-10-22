package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.concurrent.TimeUnit;

/* renamed from: etx */
public enum etx {
    REACHABLE(1, 0, 30, fbe.BOOLEAN, "reachable", "reachable_time"),
    AVAILABLE(2, 5, 1, fbe.BOOLEAN, "available", "available_time"),
    STATUS_MESSAGE(3, 0, 1, fbe.STRING, "status_message", "status_message_time"),
    CALL_TYPE(6, 5, 1, fbe.INTEGER, "call_type", "call_type_time"),
    DEVICE_STATUS(7, 5, 1, fbe.INTEGER, "device_status", "device_status_time"),
    LAST_SEEN(10, 0, 1, fbe.LONG, "last_seen", "last_seen_time"),
    LOCATION(4, 5, 1, fbe.OBJECT, "location", "location_time");
    
    public static final etx[] h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    private final fbe o;

    static {
        h = etx.values();
    }

    private etx(int i, long j, long j2, fbe fbe, String str, String str2) {
        this.k = i;
        this.i = TimeUnit.MINUTES.toMillis(j);
        this.j = TimeUnit.MINUTES.toMillis(j2);
        this.o = fbe;
        this.m = str;
        this.n = str2;
        int ordinal = ordinal();
        iil.a("Ordinals should always be >= 0.  If the ordinal has exceeded 31, then the type of fieldMask must be bumped from an int => long.", ordinal, 0, 31);
        this.l = 1 << ordinal;
    }

    public boolean a(int i) {
        return (this.l & i) != 0;
    }

    public boolean a(long j, long j2) {
        return etx.a(j, j2, this.j);
    }

    public boolean b(long j, long j2) {
        return etx.a(j, j2, this.i);
    }

    private static boolean a(long j, long j2, long j3) {
        return (j >= j2 - j3 && j <= j2) || j3 == 0;
    }

    public long a(Cursor cursor) {
        return cursor.getLong((ordinal() * 2) + 1);
    }

    public Object b(Cursor cursor) {
        int ordinal = ordinal() * 2;
        return cursor.isNull(ordinal) ? null : this.o.a(cursor, ordinal);
    }

    public void a(Object obj, Long l, ContentValues contentValues) {
        this.o.a(this.m, obj, contentValues);
        contentValues.put(this.n, l);
    }
}
