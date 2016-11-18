package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class grt {
    Context f15986a;
    private gru f15987b;

    grt(Context context) {
        this.f15986a = context;
        this.f15987b = new gru(context, (bhl) jyn.m25426a(context, bhl.class));
    }

    public gsd m18371a(Cursor cursor, bko bko, String str, Uri uri, hxz hxz, long j, Map<String, String> map) {
        grw a = m18369a(bko.m5638g(), str, uri, hxz, j, this.f15987b);
        a.m18378a(cursor, bko.m5638g(), (Map) map);
        return a.f15990n;
    }

    public ArrayList<hxz> m18372a(int i, String str, int i2, Map<String, String> map) {
        List<ebs> a = m18370a(i, str, i2);
        ArrayList<hxz> arrayList = new ArrayList();
        if (!a.isEmpty()) {
            for (ebs ebs : a) {
                gse gse = new gse();
                gse.m18453a(ebs.f11132j);
                if (ebs.f11124b != null) {
                    gse.m18456a(ebs.f11124b.toString());
                }
                gse.m18455a(ebs.f11123a);
                if (ebs.f11134l != null) {
                    gse.m18458b(Long.parseLong(ebs.f11134l));
                }
                gse.m18452a(ebs.f11126d);
                gse.m18454a(ebs.f11136n);
                int i3 = ebs.f11127e;
                int i4 = ebs.f11128f;
                if (!gwb.m2254i(i3)) {
                    i3 = gsb.f16003a;
                } else if (i4 == 1) {
                    i3 = gsb.f16005c;
                } else {
                    i3 = gsb.f16004b;
                }
                gse.m18457b(i3);
                if (ebs.p.f11063c) {
                    gse.m18459b(ebs.f11135m);
                    gse.m18460c(ebs.r);
                }
                arrayList.add(gse.m18451a());
                if (ebs.f11123a == fwy.INCOMING_USER_MESSAGE && ebs.p.f11063c && ebs.f11131i != null) {
                    map.put(ebs.f11135m, ebs.f11131i);
                }
            }
        }
        return arrayList;
    }

    private List<ebs> m18370a(int i, String str, int i2) {
        String str2;
        Uri a = EsProvider.m8251a(EsProvider.f6009l, i);
        if (i2 == 0) {
            str2 = "20";
        } else {
            str2 = String.format(Locale.US, "%d,%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(20)});
        }
        a = a.buildUpon().appendQueryParameter("limit", str2).build();
        List<ebs> arrayList = new ArrayList();
        Cursor query = this.f15986a.getContentResolver().query(a, ebv.f11143a, "conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?))", new String[]{str}, "timestamp DESC");
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    arrayList.add(new ebs(query, i));
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }

    private grw m18369a(int i, String str, Uri uri, hxz hxz, long j, gru gru) {
        Context jyr = new jyr(this.f15986a);
        jyr.getBinder().m25444a(jca.class, new grs((jcf) jyn.m25426a(this.f15986a, jcf.class), i));
        return new grw(this, jyr, str, uri, hxz, j, gru);
    }
}
