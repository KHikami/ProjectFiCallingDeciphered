import android.database.Cursor;
import android.database.CursorWrapper;

final class huv extends CursorWrapper {
    private int a;

    public huv(Cursor cursor, int i) {
        super(cursor);
        this.a = 100;
    }

    public int getCount() {
        return Math.min(super.getCount(), this.a);
    }
}
