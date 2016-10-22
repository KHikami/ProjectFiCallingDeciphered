import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
public abstract class agh implements agb {
    protected abstract int a(Integer num);

    protected boolean b(Integer num) {
        return num.intValue() == 0;
    }

    protected String a() {
        return "data2";
    }

    protected String b() {
        return "data3";
    }

    public final CharSequence a(Context context, ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger(a());
        String asString = contentValues.getAsString(b());
        Resources resources = context.getResources();
        int a = a(asInteger);
        if (asInteger == null) {
            return resources.getText(a);
        }
        if (!b(asInteger)) {
            return resources.getText(a);
        }
        Object[] objArr = new Object[1];
        if (asString == null) {
            asString = "";
        }
        objArr[0] = asString;
        return resources.getString(a, objArr);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
