package p000;

import android.database.Cursor;
import android.database.CursorWrapper;

final class huv extends CursorWrapper {
    private int f17344a = 100;

    public huv(Cursor cursor, int i) {
        super(cursor);
    }

    public int getCount() {
        return Math.min(super.getCount(), this.f17344a);
    }
}
