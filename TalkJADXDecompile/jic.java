import android.content.ContentValues;

final class jic extends ThreadLocal<ContentValues> {
    jic() {
    }

    protected /* synthetic */ Object initialValue() {
        return new ContentValues();
    }
}
