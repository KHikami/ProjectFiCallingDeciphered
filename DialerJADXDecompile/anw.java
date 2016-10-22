import android.content.Context;
import android.content.res.Resources;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextUtils;
import android.text.format.DateUtils;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: PG */
public final class anw {
    final Context a;
    final Resources b;
    final aob c;
    ArrayList d;
    private final Calendar e;

    public anw(Context context, Resources resources, aob aob) {
        this.d = new ArrayList();
        this.a = context;
        this.b = resources;
        this.c = aob;
        this.e = Calendar.getInstance();
    }

    public final CharSequence a(ala ala) {
        if (ala.z) {
            return this.b.getString(cob.cY);
        }
        if (ala.A) {
            return this.b.getString(cob.bf);
        }
        CharSequence charSequence = null;
        if (!(TextUtils.isEmpty(ala.a) || awy.a(ala.a.toString()) || this.c.a(ala.s, ala.a))) {
            if (TextUtils.isEmpty(ala.j) && !TextUtils.isEmpty(ala.f)) {
                charSequence = ala.f;
            } else if (!(ala.m == 0 && TextUtils.isEmpty(ala.n))) {
                charSequence = Phone.getTypeLabel(this.b, ala.m, ala.n);
            }
        }
        if (TextUtils.isEmpty(ala.j) || !TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        return ala.w;
    }

    public final CharSequence b(ala ala) {
        int i = 4;
        if (ala.g[0] != 4) {
            return DateUtils.getRelativeTimeSpanString(ala.h, System.currentTimeMillis(), 60000, 262144);
        }
        String string;
        Resources resources = this.b;
        int i2 = cob.dv;
        Object[] objArr = new Object[2];
        long j = ala.h;
        if (DateUtils.isToday(j)) {
            string = this.b.getString(cob.dx);
        } else {
            Context context = this.a;
            this.e.setTimeInMillis(System.currentTimeMillis());
            int i3 = this.e.get(1);
            this.e.setTimeInMillis(j);
            if (i3 != this.e.get(1)) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 0) {
                i = 8;
            }
            string = DateUtils.formatDateTime(context, j, i | 65552);
        }
        objArr[0] = string;
        objArr[1] = DateUtils.formatDateTime(this.a, ala.h, 1);
        return resources.getString(i2, objArr);
    }
}
