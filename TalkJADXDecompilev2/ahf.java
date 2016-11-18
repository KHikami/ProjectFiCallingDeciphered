package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;

public class ahf extends ahc {
    public lo<String, Integer> g = new lo(ahm.a.length);
    public final float h;
    public boolean i;

    public ahf(Context context, ed edVar, Cursor cursor, float f, boolean z) {
        super(context, edVar, cursor);
        this.h = f;
        this.i = z;
    }

    public dr a(Cursor cursor, int i) {
        String b = b(cursor);
        String c = c(cursor);
        String d = d(cursor);
        boolean e = e(cursor);
        boolean z = false;
        if (b == null && e) {
            z = true;
        }
        agk a = gwb.a(this.a, e());
        a.c(b).d(c).e(d).b(this.i).a(this.h);
        return a(a.a(), i, z);
    }

    protected Class<? extends ahg> e() {
        return ahg.class;
    }

    public Cursor a(Cursor cursor) {
        int i = 0;
        this.g.clear();
        if (cursor != null) {
            for (String str : ahm.a) {
                this.g.put(str, Integer.valueOf(cursor.getColumnIndexOrThrow(str)));
            }
            String[] strArr = ahm.b;
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                int columnIndex = cursor.getColumnIndex(str2);
                if (columnIndex != -1) {
                    this.g.put(str2, Integer.valueOf(columnIndex));
                }
                i++;
            }
        }
        return super.a(cursor);
    }

    public String b(Cursor cursor) {
        return a(cursor, "contentUri");
    }

    public String c(Cursor cursor) {
        return a(cursor, "thumbnailUri");
    }

    public String d(Cursor cursor) {
        return a(cursor, "_display_name");
    }

    public boolean e(Cursor cursor) {
        String a = a(cursor, "loadingIndicator");
        if (a == null) {
            return false;
        }
        return Boolean.valueOf(a).booleanValue();
    }

    private String a(Cursor cursor, String str) {
        if (this.g.containsKey(str)) {
            return cursor.getString(((Integer) this.g.get(str)).intValue());
        }
        return null;
    }

    protected ahg a(Intent intent, int i, boolean z) {
        ahg ahg = new ahg();
        ahg.a(intent, i, z, ahg);
        return ahg;
    }
}
