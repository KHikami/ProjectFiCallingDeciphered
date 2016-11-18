package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListView;

final class uj extends CursorAdapter {
    final /* synthetic */ ListView a;
    final /* synthetic */ uc b;
    final /* synthetic */ uh c;
    private final int d;
    private final int e;

    uj(uh uhVar, Context context, Cursor cursor, boolean z, ListView listView, uc ucVar) {
        this.c = uhVar;
        this.a = listView;
        this.b = ucVar;
        super(context, cursor, false);
        Cursor cursor2 = getCursor();
        this.d = cursor2.getColumnIndexOrThrow(this.c.I);
        this.e = cursor2.getColumnIndexOrThrow(this.c.J);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.d));
        this.a.setItemChecked(cursor.getPosition(), cursor.getInt(this.e) == 1);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.c.b.inflate(this.b.m, viewGroup, false);
    }
}
