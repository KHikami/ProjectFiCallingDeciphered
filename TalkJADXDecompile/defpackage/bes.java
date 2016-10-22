package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import java.util.Set;

/* renamed from: bes */
final class bes extends jii {
    static final Map<Integer, bes> a;
    static final beu b;
    static final Map<Integer, Set<bet>> c;

    static {
        a = new ky();
        b = new beu();
        c = new ky();
    }

    private bes(Context context, int i) {
        super(context, "callerid_data", i, null, 1);
    }

    private static bes b(Context context, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid account ID: " + i);
        }
        bes bes;
        synchronized (a) {
            if (a.get(Integer.valueOf(i)) == null) {
                a.put(Integer.valueOf(i), new bes(context, i));
            }
            bes = (bes) a.get(Integer.valueOf(i));
        }
        return bes;
    }

    static void a(Context context, int i, long j, loa[] loaArr) {
        int i2;
        boolean z = false;
        SQLiteDatabase writableDatabase = bes.b(context, i).getWritableDatabase();
        writableDatabase.beginTransaction();
        if (loaArr.length > 0) {
            i2 = 0;
            for (nzf nzf : loaArr) {
                if (gwb.b(nzf.d)) {
                    b.a(i, new beq(j, nzf));
                    i2++;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("phone_number_e164", nzf.a.a);
                contentValues.put("is_default", Integer.valueOf(gld.a(gwb.b(nzf.d))));
                contentValues.put("refreshed_at", Long.valueOf(j));
                contentValues.put("client_callerid_setting", nzf.a(nzf));
                writableDatabase.replace("client_callerid_settings", null, contentValues);
            }
        } else {
            i2 = 0;
        }
        writableDatabase.delete("client_callerid_settings", "refreshed_at< ?", new String[]{String.valueOf(j)});
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        if (i2 == 0) {
            b.a(i, null);
        }
        if (i2 <= 1) {
            z = true;
        }
        ba.a(z);
    }

    static void a(int i, bet bet) {
        if (c.containsKey(Integer.valueOf(i))) {
            ((Set) c.get(Integer.valueOf(i))).remove(bet);
        }
    }

    static beq a(Context context, int i) {
        if (gwb.g(context, i)) {
            return bes.a(true, context, i);
        }
        return null;
    }

    private static beq a(boolean z, Context context, int i) {
        gwb.aK();
        if (!b.a(i)) {
            String[] strArr = bfx.a;
            String valueOf = String.valueOf("is_default=");
            Cursor query = bes.b(context, i).getReadableDatabase().query("client_callerid_settings", strArr, new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(gld.a(true)).toString(), null, null, null, null, null);
            try {
                switch (query.getCount()) {
                    case wi.w /*0*/:
                        b.a(i, null);
                        break;
                    case wi.j /*1*/:
                        query.moveToFirst();
                        b.a(i, new beq(query.getLong(0), bes.a(query)));
                        break;
                    default:
                        throw new RuntimeException("Expected max of 1 default ClientCallerIdSetting but found " + query.getCount());
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
        return b.b(i);
    }

    private static loa a(Cursor cursor) {
        try {
            return (loa) nzf.a(new loa(), cursor.getBlob(1));
        } catch (Throwable e) {
            throw new RuntimeException("Issue parsing ClientCallerIdSetting data from database partition", e);
        }
    }
}
