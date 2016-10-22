import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class bny extends bpb implements Closeable {
    static final String a;
    static final String b;
    final boz c;
    private final bnz d;
    private final boz e;

    static {
        a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
        b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    }

    bny(bnp bnp) {
        super(bnp);
        this.c = new boz(f());
        this.e = new boz(f());
        this.d = new bnz(this, bnp.a, r());
    }

    private final long a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = m().rawQuery(str, null);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            d("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = "?" + str;
            }
            return bwd.a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            e("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    private List d(long j) {
        Cursor query;
        Object e;
        Throwable th;
        Cursor cursor = null;
        cqn.b();
        o();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase m = m();
        List arrayList = new ArrayList();
        try {
            query = m.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", new Object[]{"hit_id"}), Long.toString(j));
            try {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(Long.valueOf(query.getLong(0)));
                    } while (query.moveToNext());
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    d("Error selecting hit ids", e);
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            d("Error selecting hit ids", e);
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    private Map g(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            return bwd.a(new URI("?" + str), "UTF-8");
        } catch (URISyntaxException e) {
            e("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    final long a(String str, String[] strArr, long j) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor rawQuery = m().rawQuery(str, strArr);
            try {
                if (rawQuery.moveToFirst()) {
                    long j2 = rawQuery.getLong(0);
                    if (rawQuery == null) {
                        return j2;
                    }
                    rawQuery.close();
                    return j2;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return 0;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = rawQuery;
                try {
                    d("Database error", str, e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = rawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            d("Database error", str, e);
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(long r14) {
        /*
        r13 = this;
        r0 = 1;
        r1 = 0;
        r9 = 0;
        r2 = 0;
        r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x008f;
    L_0x0009:
        buf.b(r0);
        cqn.b();
        r13.o();
        r0 = r13.m();
        r1 = "hits2";
        r2 = 5;
        r2 = new java.lang.String[r2];	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 0;
        r4 = "hit_id";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 1;
        r4 = "hit_time";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 2;
        r4 = "hit_string";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 3;
        r4 = "hit_url";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 4;
        r4 = "hit_app_id";
        r2[r3] = r4;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = "%s ASC";
        r8 = 1;
        r8 = new java.lang.Object[r8];	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r10 = 0;
        r11 = "hit_id";
        r8[r10] = r11;	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r7 = java.lang.String.format(r7, r8);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r8 = java.lang.Long.toString(r14);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x0092, all -> 0x00a2 }
        r10 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r10.<init>();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = r9.moveToFirst();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        if (r0 == 0) goto L_0x0089;
    L_0x0059:
        r0 = 0;
        r6 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = 1;
        r3 = r9.getLong(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = 2;
        r0 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r1 = 3;
        r1 = r9.getString(r1);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r2 = 4;
        r8 = r9.getInt(r2);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r2 = r13.a(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r5 = bpq.c(r1);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = new bos;	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r1 = r13;
        r0.<init>(r1, r2, r3, r5, r6, r8);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r10.add(r0);	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        r0 = r9.moveToNext();	 Catch:{ SQLiteException -> 0x00a4, all -> 0x00a2 }
        if (r0 != 0) goto L_0x0059;
    L_0x0089:
        if (r9 == 0) goto L_0x008e;
    L_0x008b:
        r9.close();
    L_0x008e:
        return r10;
    L_0x008f:
        r0 = r1;
        goto L_0x0009;
    L_0x0092:
        r0 = move-exception;
        r1 = r9;
    L_0x0094:
        r2 = "Error loading hits from the database";
        r13.e(r2, r0);	 Catch:{ all -> 0x009a }
        throw r0;	 Catch:{ all -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        r9 = r1;
    L_0x009c:
        if (r9 == 0) goto L_0x00a1;
    L_0x009e:
        r9.close();
    L_0x00a1:
        throw r0;
    L_0x00a2:
        r0 = move-exception;
        goto L_0x009c;
    L_0x00a4:
        r0 = move-exception;
        r1 = r9;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: bny.a(long):java.util.List");
    }

    protected final void a() {
    }

    public final void a(bos bos) {
        String str;
        buf.A((Object) bos);
        cqn.b();
        o();
        buf.A((Object) bos);
        Builder builder = new Builder();
        for (Entry entry : bos.a.entrySet()) {
            str = (String) entry.getKey();
            if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str))) {
                builder.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        str = encodedQuery == null ? "" : encodedQuery;
        if (str.length() > 8192) {
            this.f.a().a(bos, "Hit length exceeds the maximum allowed size");
            return;
        }
        int intValue = ((Integer) boq.c.a()).intValue();
        long q = q();
        if (q > ((long) (intValue - 1))) {
            List d = d((q - ((long) intValue)) + 1);
            d("Store full, deleting hits to make room, count", Integer.valueOf(d.size()));
            a(d);
        }
        SQLiteDatabase m = m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", str);
        contentValues.put("hit_time", Long.valueOf(bos.d));
        contentValues.put("hit_app_id", Integer.valueOf(bos.e));
        contentValues.put("hit_url", bos.f ? bom.h() : bom.i());
        try {
            long insert = m.insert("hits2", null, contentValues);
            if (insert == -1) {
                f("Failed to insert a hit (got -1)");
            } else {
                b("Hit saved to database. db-id, hit", Long.valueOf(insert), bos);
            }
        } catch (SQLiteException e) {
            e("Error storing a hit", e);
        }
    }

    public final void a(List list) {
        buf.A((Object) list);
        cqn.b();
        o();
        if (!list.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder("hit_id");
            stringBuilder.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(l);
            }
            stringBuilder.append(")");
            String stringBuilder2 = stringBuilder.toString();
            try {
                SQLiteDatabase m = m();
                a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = m.delete("hits2", stringBuilder2, null);
                if (delete != list.size()) {
                    super.a(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), stringBuilder2);
                }
            } catch (SQLiteException e) {
                e("Error deleting hits", e);
                throw e;
            }
        }
    }

    public final void b() {
        o();
        m().beginTransaction();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List c(long r13) {
        /*
        r12 = this;
        r12.o();
        cqn.b();
        r0 = r12.m();
        r9 = 0;
        r1 = 5;
        r2 = new java.lang.String[r1];	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = 0;
        r3 = "cid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = 1;
        r3 = "tid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = 2;
        r3 = "adid";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = 3;
        r3 = "hits_count";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = 4;
        r3 = "params";
        r2[r1] = r3;	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = boq.d;	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = r1.a();	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = (java.lang.Integer) r1;	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r10 = r1.intValue();	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r8 = java.lang.String.valueOf(r10);	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r3 = "app_uid=?";
        r1 = 1;
        r4 = new java.lang.String[r1];	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = 0;
        r5 = "0";
        r4[r1] = r5;	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r1 = "properties";
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
        r11 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r11.<init>();	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r0 = r9.moveToFirst();	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        if (r0 == 0) goto L_0x008d;
    L_0x0055:
        r0 = 0;
        r3 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r0 = 1;
        r4 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r0 = 2;
        r0 = r9.getInt(r0);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        if (r0 == 0) goto L_0x009e;
    L_0x0066:
        r5 = 1;
    L_0x0067:
        r0 = 3;
        r0 = r9.getInt(r0);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r6 = (long) r0;	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r0 = 4;
        r0 = r9.getString(r0);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r8 = r12.g(r0);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r0 = android.text.TextUtils.isEmpty(r3);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        if (r0 != 0) goto L_0x0082;
    L_0x007c:
        r0 = android.text.TextUtils.isEmpty(r4);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        if (r0 == 0) goto L_0x00a0;
    L_0x0082:
        r0 = "Read property with empty client id or tracker id";
        r12.c(r0, r3, r4);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
    L_0x0087:
        r0 = r9.moveToNext();	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        if (r0 != 0) goto L_0x0055;
    L_0x008d:
        r0 = r11.size();	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        if (r0 < r10) goto L_0x0098;
    L_0x0093:
        r0 = "Sending hits to too many properties. Campaign report might be incorrect";
        r12.e(r0);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
    L_0x0098:
        if (r9 == 0) goto L_0x009d;
    L_0x009a:
        r9.close();
    L_0x009d:
        return r11;
    L_0x009e:
        r5 = 0;
        goto L_0x0067;
    L_0x00a0:
        r0 = new bns;	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r1 = 0;
        r0.<init>(r1, r3, r4, r5, r6, r8);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        r11.add(r0);	 Catch:{ SQLiteException -> 0x00ab, all -> 0x00bb }
        goto L_0x0087;
    L_0x00ab:
        r0 = move-exception;
        r1 = r9;
    L_0x00ad:
        r2 = "Error loading hits from the database";
        r12.e(r2, r0);	 Catch:{ all -> 0x00b3 }
        throw r0;	 Catch:{ all -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        r9 = r1;
    L_0x00b5:
        if (r9 == 0) goto L_0x00ba;
    L_0x00b7:
        r9.close();
    L_0x00ba:
        throw r0;
    L_0x00bb:
        r0 = move-exception;
        goto L_0x00b5;
    L_0x00bd:
        r0 = move-exception;
        r1 = r9;
        goto L_0x00ad;
        */
        throw new UnsupportedOperationException("Method not decompiled: bny.c(long):java.util.List");
    }

    public final void c() {
        o();
        m().setTransactionSuccessful();
    }

    public final void close() {
        try {
            this.d.close();
        } catch (SQLiteException e) {
            e("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            e("Error closing database", e2);
        }
    }

    public final void d() {
        o();
        m().endTransaction();
    }

    final boolean l() {
        return q() == 0;
    }

    final SQLiteDatabase m() {
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            d("Error opening database", e);
            throw e;
        }
    }

    private long q() {
        cqn.b();
        o();
        return a("SELECT COUNT(*) FROM hits2", null);
    }

    public final void b(long j) {
        cqn.b();
        o();
        List arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        a("Deleting hit, id", Long.valueOf(j));
        a(arrayList);
    }

    private final String r() {
        if (!btq.a) {
            return "google_analytics_v4.db";
        }
        if (h().a()) {
            return "google_analytics_v4.db";
        }
        return "google_analytics2_v4.db";
    }
}
