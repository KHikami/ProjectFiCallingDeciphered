import android.content.ContentValues;
import android.content.Context;

/* compiled from: PG */
public class ahl implements aay {
    public final ContentValues a;
    public ahm b;

    public final /* synthetic */ void a(Object obj) {
        long j = 0;
        int i = 0;
        ahl ahl = (ahl) obj;
        ahm ahm = this.b;
        ahm ahm2 = ahl.b;
        if ((!a(ahm) && ahl.a(ahm2)) || (ahl.a(ahm2) && afu.a(ahm, b(ahm)) > afu.a(ahm2, ahl.b(ahm2)))) {
            this.a.put(ahm2.i, Integer.valueOf(ahl.b(ahm2)));
            this.b = ahm2;
        }
        this.b.p = Math.max(ahm.p, ahm2.p);
        if (a() || ahl.a()) {
            this.a.put("is_super_primary", Integer.valueOf(1));
            this.a.put("is_primary", Integer.valueOf(1));
        }
        if (c() || ahl.c()) {
            this.a.put("is_primary", Integer.valueOf(1));
        }
        ContentValues contentValues = this.a;
        String str = "times_used";
        int intValue = d() == null ? 0 : d().intValue();
        if (ahl.d() != null) {
            i = ahl.d().intValue();
        }
        contentValues.put(str, Integer.valueOf(intValue + i));
        contentValues = this.a;
        str = "last_time_used";
        long longValue = e() == null ? 0 : e().longValue();
        if (ahl.e() != null) {
            j = ahl.e().longValue();
        }
        contentValues.put(str, Long.valueOf(Math.max(longValue, j)));
    }

    public ahl(ContentValues contentValues) {
        this.a = contentValues;
    }

    private String b() {
        return this.a.getAsString("mimetype");
    }

    private boolean c() {
        Integer asInteger = this.a.getAsInteger("is_primary");
        return (asInteger == null || asInteger.intValue() == 0) ? false : true;
    }

    public boolean a() {
        Integer asInteger = this.a.getAsInteger("is_super_primary");
        return (asInteger == null || asInteger.intValue() == 0) ? false : true;
    }

    public final boolean a(ahm ahm) {
        String str = ahm.i;
        return (str == null || !this.a.containsKey(str) || this.a.getAsInteger(str) == null) ? false : true;
    }

    public final int b(ahm ahm) {
        return this.a.getAsInteger(ahm.i).intValue();
    }

    private String a(Context context, ahm ahm) {
        if (ahm.h == null) {
            return null;
        }
        CharSequence a = ahm.h.a(context, this.a);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    private Integer d() {
        return this.a.getAsInteger("times_used");
    }

    private Long e() {
        return this.a.getAsLong("last_time_used");
    }

    public boolean a(ahl ahl, Context context) {
        if (this.b == null || ahl.b == null) {
            return false;
        }
        return abn.a(b(), a(context, this.b), ahl.b(), ahl.a(context, ahl.b));
    }
}
