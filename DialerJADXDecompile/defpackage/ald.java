package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.widget.EditText;
import android.widget.Toast;

/* compiled from: PG */
/* renamed from: ald */
public final class ald extends acc {
    private boolean a;

    public ald(ContentResolver contentResolver) {
        super(contentResolver);
    }

    protected final void a(int i, Object obj, Cursor cursor) {
        try {
            buf.hX = null;
            if (!this.a) {
                ale ale = (ale) obj;
                ale.a.dismiss();
                EditText a = ale.a();
                if (!(cursor == null || a == null || !cursor.moveToPosition(ale.b))) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                    a.getText().replace(0, 0, cursor.getString(cursor.getColumnIndexOrThrow("number")));
                    Context context = ale.a.getContext();
                    Toast.makeText(context, aim.a(context.getResources(), cob.co, string), 0).show();
                }
                buf.a(cursor);
            }
        } finally {
            buf.a(cursor);
        }
    }

    public final void a() {
        this.a = true;
        cancelOperation(-1);
    }
}
