package defpackage;

import android.app.FragmentManager;
import android.content.Context;
import android.database.Cursor;
import android.view.View;

/* compiled from: PG */
/* renamed from: apb */
public final class apb extends aph {
    apb(Context context, FragmentManager fragmentManager, awt awt, aaz aaz) {
        super(context, fragmentManager, awt, aaz);
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        super.bindView(view, context, cursor);
        Integer valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("_id")));
        String string = cursor.getString(cursor.getColumnIndex("country_iso"));
        String string2 = cursor.getString(cursor.getColumnIndex("number"));
        cursor.getString(cursor.getColumnIndex("normalized_number"));
        view.findViewById(aq.Y).setOnClickListener(new apc(this, valueOf, string2, string, context));
        a(view, string2, string);
    }

    public final boolean isEmpty() {
        return false;
    }
}
