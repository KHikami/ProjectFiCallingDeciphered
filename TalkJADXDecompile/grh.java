import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class grh implements bhm {
    private grm a;
    private jcf b;

    public int a(Context context, bhb bhb) {
        Throwable th;
        this.a = ((grq) jyn.a(context, grq.class)).a(context);
        this.b = (jcf) jyn.a(context, jcf.class);
        grt a = ((grv) jyn.a(context, grv.class)).a(context);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.a.a().a(1000, TimeUnit.MILLISECONDS);
            int i;
            if (this.a.a().e()) {
                bko a2;
                String f = this.a.f();
                if (f == null) {
                    a2 = a();
                } else {
                    a2 = grm.b(f);
                    if (!a(a2)) {
                        a2 = a();
                    }
                }
                if (a2 == null) {
                    a(new ArrayList(0));
                    glk.d("Babel_wear", "No valid account", new Object[0]);
                    if (glk.a("Babel_wear", 2)) {
                        new StringBuilder(79).append("WearableService.sendConversations empty account list sent: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    i = bhn.a;
                    this.a.e();
                    return i;
                }
                Uri build = EsProvider.a(EsProvider.h, a2.g()).buildUpon().appendQueryParameter("limit", "20").build();
                Map hashMap = new HashMap();
                String format = String.format("/hangouts/%s/conversations/", new Object[]{a2.b().a});
                gri a3 = a(format);
                if (glk.a("Babel_wear", 2)) {
                    new StringBuilder(83).append("WearableService.sendConversations old conversations retrieved: ").append(System.currentTimeMillis() - currentTimeMillis);
                }
                Cursor query;
                try {
                    long currentTimeMillis2;
                    query = context.getContentResolver().query(build, dbi.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s = %d", new Object[]{"is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp", "status", Integer.valueOf(2)}), null, "call_media_type DESC, sort_timestamp DESC");
                    while (query != null) {
                        if (!query.moveToNext()) {
                            break;
                        }
                        Asset asset;
                        String b = EsProvider.b(query.getString(1), (int) ConversationListFragment.a(query));
                        long j = 0;
                        hxz hxz = (hxz) a3.a.remove(b);
                        if (hxz != null) {
                            gsd gsd = new gsd(hxz);
                            Asset b2 = gsd.b();
                            j = gsd.c();
                            asset = b2;
                        } else {
                            asset = null;
                        }
                        String valueOf = String.valueOf(format);
                        f = String.valueOf(b);
                        if (f.length() != 0) {
                            f = valueOf.concat(f);
                        } else {
                            try {
                                f = new String(valueOf);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        hyg a4 = hyg.a(f);
                        gsd a5 = a.a(query, a2, b, a4.a(), a4.b(), j, hashMap);
                        if (asset != null) {
                            a5.a(asset);
                        }
                        this.a.b().a(this.a.a(), a4.c()).a();
                    }
                    if (query != null) {
                        query.close();
                    }
                    if (glk.a("Babel_wear", 2)) {
                        new StringBuilder(78).append("WearableService.sendConversations new conversations sent: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    int[] g = grm.g();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 : g) {
                        bko bko;
                        gsc gsc = new gsc();
                        if (a2.g() == i2) {
                            gsc.a(true);
                            bko = a2;
                        } else {
                            bko = grm.b(i2);
                            gsc.a(false);
                        }
                        if (a(bko)) {
                            String str = bko.b().a;
                            gsc.e(str);
                            gsc.a(bko.a());
                            gsc.b(bko.c());
                            Object B = bko.B();
                            if (!TextUtils.isEmpty(B)) {
                                gsc.c(glq.i(gwb.H(), B));
                            }
                            B = bko.u();
                            if (!TextUtils.isEmpty(B)) {
                                gsc.d(glq.i(gwb.H(), B));
                            }
                            gsc.b(bko.l());
                            arrayList.add(gsc.a());
                            hashMap.put(str, bko.p());
                            a3.b.remove(str);
                            a3.c.remove(str);
                        }
                    }
                    a(arrayList);
                    if (glk.a("Babel_wear", 2)) {
                        new StringBuilder(69).append("WearableService.sendConversations accounts sent: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    this.a.a(a2, hashMap, a3.c);
                    if (glk.a("Babel_wear", 2)) {
                        currentTimeMillis2 = System.currentTimeMillis();
                        String.format("WearableService.sendConversations profile pictures sent %d (not used: %d): %d", new Object[]{Integer.valueOf(hashMap.size()), Integer.valueOf(a3.c.size()), Long.valueOf(currentTimeMillis2 - currentTimeMillis)});
                    }
                    a(format, a3.a);
                    if (glk.a("Babel_wear", 2)) {
                        new StringBuilder(77).append("WearableService.sendConversations cleanup conversations: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    a(a3.b);
                    if (hashMap.size() + a3.c.size() > 50) {
                        b(a3.c);
                        if (glk.a("Babel_wear", 2)) {
                            currentTimeMillis2 = System.currentTimeMillis();
                            String.format("WearableService.sendConversations cleanup profile pictures (%d deleted): %d", new Object[]{Integer.valueOf(a3.c.size()), Long.valueOf(currentTimeMillis2 - currentTimeMillis)});
                        }
                    }
                    if (glk.a("Babel_wear", 2)) {
                        new StringBuilder(60).append("WearableService.sendConversations done: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    this.a.e();
                    return bhn.a;
                } catch (Throwable th3) {
                    th = th3;
                    query = null;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            Log.e("Babel_wear", "GoogleApiClient failed to connect");
            i2 = bhn.d;
            return i2;
        } finally {
            this.a.e();
        }
    }

    private bko a() {
        for (int b : grm.g()) {
            bko b2 = grm.b(b);
            if (a(b2)) {
                this.a.a(b2.a());
                return b2;
            }
        }
        return null;
    }

    private boolean a(bko bko) {
        return bko != null && bko.e() && this.b.d(bko.g());
    }

    private void a(ArrayList<hxz> arrayList) {
        hyg a = hyg.a("/hangouts/accounts/");
        a.b().a("2", (ArrayList) arrayList);
        this.a.b().a(this.a.a(), a.c()).a();
    }

    private void a(Map<String, List<Uri>> map) {
        for (List<Uri> it : map.values()) {
            for (Uri b : it) {
                this.a.b().b(this.a.a(), b).a();
            }
        }
    }

    private void a(String str, Map<String, hxz> map) {
        for (String str2 : map.keySet()) {
            Builder scheme = new Builder().scheme("wear");
            String valueOf = String.valueOf(str);
            String str22 = String.valueOf(str22);
            this.a.b().b(this.a.a(), scheme.path(str22.length() != 0 ? valueOf.concat(str22) : new String(valueOf)).build()).a();
        }
    }

    private void b(Map<String, Uri> map) {
        for (Uri b : map.values()) {
            this.a.b().b(this.a.a(), b).a();
        }
    }

    private gri a(String str) {
        gri gri = new gri();
        hxy hxy = (hxy) this.a.b().a(this.a.a()).a();
        try {
            if (hxy.k().d()) {
                Iterator it = hxy.iterator();
                while (it.hasNext()) {
                    hxw hxw = (hxw) it.next();
                    String path = hxw.a().getPath();
                    if (path.startsWith(str)) {
                        gri.a.put(hxw.a().getLastPathSegment(), grm.b(hxw));
                    } else if (path.startsWith("/hangouts/profiles/")) {
                        Uri a = hxw.a();
                        gri.c.put(a.getLastPathSegment(), a);
                    } else if (path.contains("/conversations/")) {
                        path = (String) hxw.a().getPathSegments().get(1);
                        List list = (List) gri.b.get(path);
                        if (list == null) {
                            list = new ArrayList();
                            gri.b.put(path, list);
                        }
                        list.add(hxw.a());
                    }
                }
            }
            hxy.b();
            return gri;
        } catch (Throwable th) {
            hxy.b();
        }
    }
}
