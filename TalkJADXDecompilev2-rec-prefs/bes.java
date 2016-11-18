package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import java.util.Set;

final class bes extends jii {
    static final Map<Integer, bes> f3159a = new ky();
    static final beu f3160b = new beu();
    static final Map<Integer, Set<bet>> f3161c = new ky();

    private bes(Context context, int i) {
        super(context, "callerid_data", i, null, 1);
    }

    private static bes m5030b(Context context, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid account ID: " + i);
        }
        bes bes;
        synchronized (f3159a) {
            if (f3159a.get(Integer.valueOf(i)) == null) {
                f3159a.put(Integer.valueOf(i), new bes(context, i));
            }
            bes = (bes) f3159a.get(Integer.valueOf(i));
        }
        return bes;
    }

    static void m5029a(Context context, int i, long j, loa[] loaArr) {
        int i2;
        boolean z = false;
        SQLiteDatabase writableDatabase = bes.m5030b(context, i).getWritableDatabase();
        writableDatabase.beginTransaction();
        if (loaArr.length > 0) {
            i2 = 0;
            for (nzf nzf : loaArr) {
                if (gwb.m2061b(nzf.f25846d)) {
                    f3160b.m5032a(i, new beq(j, nzf));
                    i2++;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("phone_number_e164", nzf.f25843a.f28411a);
                contentValues.put("is_default", Integer.valueOf(gld.m17921a(gwb.m2061b(nzf.f25846d))));
                contentValues.put("refreshed_at", Long.valueOf(j));
                contentValues.put("client_callerid_setting", nzf.m1029a(nzf));
                writableDatabase.replace("client_callerid_settings", null, contentValues);
            }
        } else {
            i2 = 0;
        }
        writableDatabase.delete("client_callerid_settings", "refreshed_at< ?", new String[]{String.valueOf(j)});
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        if (i2 == 0) {
            f3160b.m5032a(i, null);
        }
        if (i2 <= 1) {
            z = true;
        }
        ba.m4577a(z);
    }

    static void m5028a(int i, bet bet) {
        if (f3161c.containsKey(Integer.valueOf(i))) {
            ((Set) f3161c.get(Integer.valueOf(i))).remove(bet);
        }
    }

    static beq m5025a(Context context, int i) {
        if (gwb.m2222g(context, i)) {
            return bes.m5026a(true, context, i);
        }
        return null;
    }

    private static beq m5026a(boolean z, Context context, int i) {
        gwb.aK();
        if (!f3160b.m5033a(i)) {
            String[] strArr = bfx.f3237a;
            String valueOf = String.valueOf("is_default=");
            Cursor query = bes.m5030b(context, i).getReadableDatabase().query("client_callerid_settings", strArr, new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(gld.m17921a(true)).toString(), null, null, null, null, null);
            try {
                switch (query.getCount()) {
                    case 0:
                        f3160b.m5032a(i, null);
                        break;
                    case 1:
                        query.moveToFirst();
                        f3160b.m5032a(i, new beq(query.getLong(0), bes.m5027a(query)));
                        break;
                    default:
                        throw new RuntimeException("Expected max of 1 default ClientCallerIdSetting but found " + query.getCount());
                }
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        }
        return f3160b.m5034b(i);
    }

    private static loa m5027a(Cursor cursor) {
        try {
            return (loa) nzf.m1027a(new loa(), cursor.getBlob(1));
        } catch (Throwable e) {
            throw new RuntimeException("Issue parsing ClientCallerIdSetting data from database partition", e);
        }
    }
}
