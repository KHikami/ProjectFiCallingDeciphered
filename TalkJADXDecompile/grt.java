import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class grt {
    Context a;
    private gru b;

    grt(Context context) {
        this.a = context;
        this.b = new gru(context, (bhl) jyn.a(context, bhl.class));
    }

    public gsd a(Cursor cursor, bko bko, String str, Uri uri, hxz hxz, long j, Map<String, String> map) {
        grw a = a(bko.g(), str, uri, hxz, j, this.b);
        a.a(cursor, bko.g(), (Map) map);
        return a.n;
    }

    public ArrayList<hxz> a(int i, String str, int i2, Map<String, String> map) {
        List<ebs> a = a(i, str, i2);
        ArrayList<hxz> arrayList = new ArrayList();
        if (!a.isEmpty()) {
            for (ebs ebs : a) {
                gse gse = new gse();
                gse.a(ebs.j);
                if (ebs.b != null) {
                    gse.a(ebs.b.toString());
                }
                gse.a(ebs.a);
                if (ebs.l != null) {
                    gse.b(Long.parseLong(ebs.l));
                }
                gse.a(ebs.d);
                gse.a(ebs.n);
                int i3 = ebs.e;
                int i4 = ebs.f;
                if (!gwb.i(i3)) {
                    i3 = gsb.a;
                } else if (i4 == 1) {
                    i3 = gsb.c;
                } else {
                    i3 = gsb.b;
                }
                gse.b(i3);
                if (ebs.p.c) {
                    gse.b(ebs.m);
                    gse.c(ebs.r);
                }
                arrayList.add(gse.a());
                if (ebs.a == fwy.INCOMING_USER_MESSAGE && ebs.p.c && ebs.i != null) {
                    map.put(ebs.m, ebs.i);
                }
            }
        }
        return arrayList;
    }

    private List<ebs> a(int i, String str, int i2) {
        String str2;
        Uri a = EsProvider.a(EsProvider.l, i);
        if (i2 == 0) {
            str2 = "20";
        } else {
            str2 = String.format(Locale.US, "%d,%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(20)});
        }
        a = a.buildUpon().appendQueryParameter("limit", str2).build();
        List<ebs> arrayList = new ArrayList();
        Cursor query = this.a.getContentResolver().query(a, ebv.a, "conversation_id IN (SELECT + conversation_id FROM merge_keys WHERE merge_key=( SELECT merge_key FROM merge_keys WHERE conversation_id=?))", new String[]{str}, "timestamp DESC");
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

    private grw a(int i, String str, Uri uri, hxz hxz, long j, gru gru) {
        Context jyr = new jyr(this.a);
        jyr.getBinder().a(jca.class, new grs((jcf) jyn.a(this.a, jcf.class), i));
        return new grw(this, jyr, str, uri, hxz, j, gru);
    }
}
