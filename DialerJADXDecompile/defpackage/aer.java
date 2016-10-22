package defpackage;

import android.database.Cursor;
import android.database.MergeCursor;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: aer */
final class aer extends MergeCursor {
    private /* synthetic */ Cursor a;

    aer(aeq aeq, Cursor[] cursorArr, Cursor cursor) {
        this.a = cursor;
        super(cursorArr);
    }

    public final Bundle getExtras() {
        return this.a == null ? new Bundle() : this.a.getExtras();
    }
}
