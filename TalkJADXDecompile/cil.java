import android.database.Cursor;
import android.database.CursorWrapper;

final class cil extends CursorWrapper {
    final int a;

    public cil(Cursor cursor) {
        super(cursor);
        this.a = cursor.getCount();
    }

    public boolean moveToPosition(int i) {
        return super.moveToPosition((this.a - i) - 1);
    }

    public int getPosition() {
        return (this.a - super.getPosition()) - 1;
    }

    public boolean isAfterLast() {
        return super.isBeforeFirst();
    }

    public boolean isBeforeFirst() {
        return super.isAfterLast();
    }

    public boolean isFirst() {
        return super.isLast();
    }

    public boolean isLast() {
        return super.isFirst();
    }

    public boolean move(int i) {
        return super.move(-i);
    }

    public boolean moveToFirst() {
        return super.moveToLast();
    }

    public boolean moveToLast() {
        return super.moveToFirst();
    }

    public boolean moveToNext() {
        return super.moveToPrevious();
    }

    public boolean moveToPrevious() {
        return super.moveToNext();
    }
}
