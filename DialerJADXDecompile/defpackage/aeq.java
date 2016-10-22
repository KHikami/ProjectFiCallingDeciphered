package defpackage;

import android.content.CursorLoader;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.ContactsContract.Profile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aeq */
public final class aeq extends CursorLoader {
    boolean a;
    private String[] b;

    public final void setProjection(String[] strArr) {
        super.setProjection(strArr);
        this.b = strArr;
    }

    public final Cursor loadInBackground() {
        Cursor loadInBackground;
        List arrayList = new ArrayList();
        if (this.a) {
            arrayList.add(a());
        }
        Cursor cursor = null;
        try {
            loadInBackground = super.loadInBackground();
        } catch (NullPointerException e) {
            loadInBackground = cursor;
            arrayList.add(loadInBackground);
            return new aer(this, (Cursor[]) arrayList.toArray(new Cursor[arrayList.size()]), loadInBackground);
        } catch (SecurityException e2) {
            loadInBackground = cursor;
            arrayList.add(loadInBackground);
            return new aer(this, (Cursor[]) arrayList.toArray(new Cursor[arrayList.size()]), loadInBackground);
        }
        arrayList.add(loadInBackground);
        return new aer(this, (Cursor[]) arrayList.toArray(new Cursor[arrayList.size()]), loadInBackground);
    }

    private final MatrixCursor a() {
        MatrixCursor matrixCursor = null;
        Cursor query = getContext().getContentResolver().query(Profile.CONTENT_URI, this.b, null, null, null);
        if (query != null) {
            try {
                matrixCursor = new MatrixCursor(this.b);
                Object[] objArr = new Object[this.b.length];
                while (query.moveToNext()) {
                    for (int i = 0; i < objArr.length; i++) {
                        objArr[i] = query.getString(i);
                    }
                    matrixCursor.addRow(objArr);
                }
            } finally {
                query.close();
            }
        }
        return matrixCursor;
    }
}
