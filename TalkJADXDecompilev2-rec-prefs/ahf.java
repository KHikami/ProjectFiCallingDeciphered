package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;

public class ahf extends ahc {
    public lo<String, Integer> f717g = new lo(ahm.f804a.length);
    public final float f718h;
    public boolean f719i;

    public ahf(Context context, ed edVar, Cursor cursor, float f, boolean z) {
        super(context, edVar, cursor);
        this.f718h = f;
        this.f719i = z;
    }

    public dr mo191a(Cursor cursor, int i) {
        String b = m1220b(cursor);
        String c = m1221c(cursor);
        String d = m1222d(cursor);
        boolean e = m1224e(cursor);
        boolean z = false;
        if (b == null && e) {
            z = true;
        }
        agk a = gwb.m1527a(this.a, mo192e());
        a.m1080c(b).m1081d(c).m1082e(d).m1079b(this.f719i).m1072a(this.f718h);
        return m1217a(a.m1077a(), i, z);
    }

    protected Class<? extends ahg> mo192e() {
        return ahg.class;
    }

    public Cursor mo190a(Cursor cursor) {
        int i = 0;
        this.f717g.clear();
        if (cursor != null) {
            for (String str : ahm.f804a) {
                this.f717g.put(str, Integer.valueOf(cursor.getColumnIndexOrThrow(str)));
            }
            String[] strArr = ahm.f805b;
            int length = strArr.length;
            while (i < length) {
                String str2 = strArr[i];
                int columnIndex = cursor.getColumnIndex(str2);
                if (columnIndex != -1) {
                    this.f717g.put(str2, Integer.valueOf(columnIndex));
                }
                i++;
            }
        }
        return super.mo190a(cursor);
    }

    public String m1220b(Cursor cursor) {
        return m1216a(cursor, "contentUri");
    }

    public String m1221c(Cursor cursor) {
        return m1216a(cursor, "thumbnailUri");
    }

    public String m1222d(Cursor cursor) {
        return m1216a(cursor, "_display_name");
    }

    public boolean m1224e(Cursor cursor) {
        String a = m1216a(cursor, "loadingIndicator");
        if (a == null) {
            return false;
        }
        return Boolean.valueOf(a).booleanValue();
    }

    private String m1216a(Cursor cursor, String str) {
        if (this.f717g.containsKey(str)) {
            return cursor.getString(((Integer) this.f717g.get(str)).intValue());
        }
        return null;
    }

    protected ahg m1217a(Intent intent, int i, boolean z) {
        ahg ahg = new ahg();
        ahg.m1252a(intent, i, z, ahg);
        return ahg;
    }
}
