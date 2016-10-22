import android.app.FragmentManager;
import android.content.Context;
import android.database.Cursor;
import android.view.View;

/* compiled from: PG */
public final class api extends aph {
    api(Context context, FragmentManager fragmentManager, awt awt, aaz aaz) {
        super(context, fragmentManager, awt, aaz);
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        super.bindView(view, context, cursor);
        String string = cursor.getString(2);
        view.findViewById(aq.Y).setVisibility(8);
        a(view, string, null);
    }
}
