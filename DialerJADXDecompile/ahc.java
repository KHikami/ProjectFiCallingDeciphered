import android.content.ContentValues;
import android.content.Context;

/* compiled from: PG */
public final class ahc implements agb {
    private final int a;
    private final String b;

    public ahc(int i) {
        this(i, null);
    }

    public ahc(String str) {
        this(-1, str);
    }

    private ahc(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final CharSequence a(Context context, ContentValues contentValues) {
        CharSequence text;
        String asString;
        boolean containsKey = contentValues.containsKey(this.b);
        int i = this.a > 0 ? 1 : 0;
        if (i != 0) {
            text = context.getText(this.a);
        } else {
            text = null;
        }
        if (containsKey) {
            asString = contentValues.getAsString(this.b);
        } else {
            asString = null;
        }
        if (i != 0 && containsKey) {
            return String.format(text.toString(), new Object[]{asString});
        } else if (i != 0) {
            return text;
        } else {
            if (containsKey) {
                return asString;
            }
            return null;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        int i = this.a;
        String str = this.b;
        return new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(str).length()).append(valueOf).append(" mStringRes=").append(i).append(" mColumnName").append(str).toString();
    }
}
