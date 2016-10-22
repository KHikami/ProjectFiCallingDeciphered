import android.content.ContentValues;

/* compiled from: PG */
public final class ahz extends ahl {
    public ahz() {
        super(new ContentValues());
        this.a.put("mimetype", "vnd.android.cursor.item/name");
    }

    public ahz(ContentValues contentValues) {
        super(contentValues);
    }

    public final boolean a() {
        ContentValues contentValues = this.a;
        return (contentValues == null || !contentValues.containsKey("is_super_primary")) ? false : contentValues.getAsBoolean("is_super_primary").booleanValue();
    }
}
