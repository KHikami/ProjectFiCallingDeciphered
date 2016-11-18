package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;

final class huv extends CursorWrapper {
    private int a = 100;

    public huv(Cursor cursor, int i) {
        super(cursor);
    }

    public int getCount() {
        return Math.min(super.getCount(), this.a);
    }
}
