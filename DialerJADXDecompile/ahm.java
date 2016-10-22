import android.content.ContentValues;
import java.text.SimpleDateFormat;
import java.util.List;

/* compiled from: PG */
public final class ahm {
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public agb f;
    public agb g;
    public agb h;
    public String i;
    public int j;
    public List k;
    public List l;
    public ContentValues m;
    public SimpleDateFormat n;
    public SimpleDateFormat o;
    public int p;
    private int q;
    private boolean r;

    public ahm() {
        this.p = 1;
    }

    public ahm(String str, int i, int i2, boolean z) {
        this.b = str;
        this.q = i;
        this.e = i2;
        this.r = true;
        this.j = -1;
        this.p = 1;
    }

    private static String a(SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat == null ? "(null)" : simpleDateFormat.toPattern();
    }

    private static String a(Iterable iterable) {
        if (iterable == null) {
            return "(null)";
        }
        return das.a(iterable.iterator());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataKind:");
        stringBuilder.append(" resPackageName=").append(this.a);
        stringBuilder.append(" mimeType=").append(this.b);
        stringBuilder.append(" titleRes=").append(this.q);
        stringBuilder.append(" iconAltRes=").append(this.c);
        stringBuilder.append(" iconAltDescriptionRes=").append(this.d);
        stringBuilder.append(" weight=").append(this.e);
        stringBuilder.append(" editable=").append(this.r);
        stringBuilder.append(" actionHeader=").append(this.f);
        stringBuilder.append(" actionAltHeader=").append(this.g);
        stringBuilder.append(" actionBody=").append(this.h);
        stringBuilder.append(" typeColumn=").append(this.i);
        stringBuilder.append(" typeOverallMax=").append(this.j);
        stringBuilder.append(" typeList=").append(a(this.k));
        stringBuilder.append(" fieldList=").append(a(this.l));
        stringBuilder.append(" defaultValues=").append(this.m);
        stringBuilder.append(" dateFormatWithoutYear=").append(a(this.n));
        stringBuilder.append(" dateFormatWithYear=").append(a(this.o));
        return stringBuilder.toString();
    }
}
