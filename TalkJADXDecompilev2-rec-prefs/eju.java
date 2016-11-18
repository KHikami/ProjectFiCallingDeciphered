package p000;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment;

public final class eju extends ahf {
    final boolean f11670j = false;

    public eju(Context context, ed edVar, Cursor cursor, float f, boolean z) {
        super(context, edVar, cursor, f, false);
    }

    public dr mo191a(Cursor cursor, int i) {
        String b = m1220b(cursor);
        String c = m1221c(cursor);
        boolean e = m1224e(cursor);
        boolean z = false;
        if (b == null && e) {
            z = true;
        }
        agk c2 = gwb.m2075c(this.a);
        c2.m1080c(b).m1081d(c).m1079b(this.f11670j).m1072a(this.h);
        Intent a = c2.m1077a();
        a.putExtra("content_type", cursor.getString(cursor.getColumnIndex("contentType")));
        return BabelPhotoViewFragment.m8445a(a, i, z);
    }
}
