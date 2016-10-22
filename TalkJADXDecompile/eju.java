import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.apps.hangouts.fragments.BabelPhotoViewFragment;

public final class eju extends ahf {
    final boolean j;

    public eju(Context context, ed edVar, Cursor cursor, float f, boolean z) {
        super(context, edVar, cursor, f, false);
        this.j = false;
    }

    public dr a(Cursor cursor, int i) {
        String b = b(cursor);
        String c = c(cursor);
        boolean e = e(cursor);
        boolean z = false;
        if (b == null && e) {
            z = true;
        }
        agk c2 = gwb.c(this.a);
        c2.c(b).d(c).b(this.j).a(this.h);
        Intent a = c2.a();
        a.putExtra("content_type", cursor.getString(cursor.getColumnIndex("contentType")));
        return BabelPhotoViewFragment.a(a, i, z);
    }
}
