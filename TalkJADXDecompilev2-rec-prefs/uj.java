package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListView;

final class uj extends CursorAdapter {
    final /* synthetic */ ListView f35286a;
    final /* synthetic */ uc f35287b;
    final /* synthetic */ uh f35288c;
    private final int f35289d;
    private final int f35290e;

    uj(uh uhVar, Context context, Cursor cursor, boolean z, ListView listView, uc ucVar) {
        this.f35288c = uhVar;
        this.f35286a = listView;
        this.f35287b = ucVar;
        super(context, cursor, false);
        Cursor cursor2 = getCursor();
        this.f35289d = cursor2.getColumnIndexOrThrow(this.f35288c.f35254I);
        this.f35290e = cursor2.getColumnIndexOrThrow(this.f35288c.f35255J);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f35289d));
        this.f35286a.setItemChecked(cursor.getPosition(), cursor.getInt(this.f35290e) == 1);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f35288c.f35259b.inflate(this.f35287b.f35222m, viewGroup, false);
    }
}
