import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
public final class ahr extends ahl {
    private final boolean c;

    public ahr(ContentValues contentValues) {
        super(contentValues);
        this.c = false;
    }

    private boolean d() {
        return c() != null;
    }

    public final boolean a(ahl ahl, Context context) {
        if (!(ahl instanceof ahr) || this.b == null || ahl.b == null) {
            return false;
        }
        ahr ahr = (ahr) ahl;
        if (!b().equals(ahr.b())) {
            return false;
        }
        if (d() && ahr.d()) {
            if (c() != ahr.c()) {
                return false;
            }
            if (c().intValue() != -1 || TextUtils.equals(e(), ahr.e())) {
                return true;
            }
            return false;
        } else if (d()) {
            if (c().intValue() == -1) {
                return true;
            }
            return false;
        } else if (!ahr.d()) {
            return true;
        } else {
            if (ahr.c().intValue() == -1) {
                return true;
            }
            return false;
        }
    }

    private String b() {
        return this.a.getAsString("data1");
    }

    private Integer c() {
        return this.a.getAsInteger("data5");
    }

    private String e() {
        return this.a.getAsString("data6");
    }
}
