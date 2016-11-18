package p000;

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
    private grm f15953a;
    private jcf f15954b;

    public int mo539a(Context context, bhb bhb) {
        Throwable th;
        this.f15953a = ((grq) jyn.m25426a(context, grq.class)).mo2324a(context);
        this.f15954b = (jcf) jyn.m25426a(context, jcf.class);
        grt a = ((grv) jyn.m25426a(context, grv.class)).mo2325a(context);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f15953a.m18345a().mo2508a(1000, TimeUnit.MILLISECONDS);
            int i;
            if (this.f15953a.m18345a().mo2524e()) {
                bko a2;
                String f = this.f15953a.m18354f();
                if (f == null) {
                    a2 = m18324a();
                } else {
                    a2 = grm.m18339b(f);
                    if (!m18329a(a2)) {
                        a2 = m18324a();
                    }
                }
                if (a2 == null) {
                    m18327a(new ArrayList(0));
                    glk.m17981d("Babel_wear", "No valid account", new Object[0]);
                    if (glk.m17973a("Babel_wear", 2)) {
                        new StringBuilder(79).append("WearableService.sendConversations empty account list sent: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    i = bhn.f3348a;
                    this.f15953a.m18353e();
                    return i;
                }
                Uri build = EsProvider.m8251a(EsProvider.f6005h, a2.m5638g()).buildUpon().appendQueryParameter("limit", "20").build();
                Map hashMap = new HashMap();
                String format = String.format("/hangouts/%s/conversations/", new Object[]{a2.m5632b().f11244a});
                gri a3 = m18325a(format);
                if (glk.m17973a("Babel_wear", 2)) {
                    new StringBuilder(83).append("WearableService.sendConversations old conversations retrieved: ").append(System.currentTimeMillis() - currentTimeMillis);
                }
                Cursor query;
                try {
                    long currentTimeMillis2;
                    query = context.getContentResolver().query(build, dbi.f9471a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s = %d", new Object[]{"is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp", "status", Integer.valueOf(2)}), null, "call_media_type DESC, sort_timestamp DESC");
                    while (query != null) {
                        if (!query.moveToNext()) {
                            break;
                        }
                        Asset asset;
                        String b = EsProvider.m8268b(query.getString(1), (int) ConversationListFragment.m8483a(query));
                        long j = 0;
                        hxz hxz = (hxz) a3.f15955a.remove(b);
                        if (hxz != null) {
                            gsd gsd = new gsd(hxz);
                            Asset b2 = gsd.m18441b();
                            j = gsd.m18446c();
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
                        hyg a4 = hyg.m21248a(f);
                        gsd a5 = a.m18371a(query, a2, b, a4.m21249a(), a4.m21250b(), j, hashMap);
                        if (asset != null) {
                            a5.m18437a(asset);
                        }
                        this.f15953a.m18350b().m21193a(this.f15953a.m18345a(), a4.m21251c()).mo2418a();
                    }
                    if (query != null) {
                        query.close();
                    }
                    if (glk.m17973a("Babel_wear", 2)) {
                        new StringBuilder(78).append("WearableService.sendConversations new conversations sent: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    int[] g = grm.m18342g();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 : g) {
                        bko bko;
                        gsc gsc = new gsc();
                        if (a2.m5638g() == i2) {
                            gsc.m18428a(true);
                            bko = a2;
                        } else {
                            bko = grm.m18338b(i2);
                            gsc.m18428a(false);
                        }
                        if (m18329a(bko)) {
                            String str = bko.m5632b().f11244a;
                            gsc.m18433e(str);
                            gsc.m18427a(bko.m5629a());
                            gsc.m18429b(bko.m5634c());
                            Object B = bko.m5615B();
                            if (!TextUtils.isEmpty(B)) {
                                gsc.m18431c(glq.m18038i(gwb.m1400H(), B));
                            }
                            B = bko.m5652u();
                            if (!TextUtils.isEmpty(B)) {
                                gsc.m18432d(glq.m18038i(gwb.m1400H(), B));
                            }
                            gsc.m18430b(bko.m5643l());
                            arrayList.add(gsc.m18426a());
                            hashMap.put(str, bko.m5647p());
                            a3.f15956b.remove(str);
                            a3.f15957c.remove(str);
                        }
                    }
                    m18327a(arrayList);
                    if (glk.m17973a("Babel_wear", 2)) {
                        new StringBuilder(69).append("WearableService.sendConversations accounts sent: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    this.f15953a.m18348a(a2, hashMap, a3.f15957c);
                    if (glk.m17973a("Babel_wear", 2)) {
                        currentTimeMillis2 = System.currentTimeMillis();
                        String.format("WearableService.sendConversations profile pictures sent %d (not used: %d): %d", new Object[]{Integer.valueOf(hashMap.size()), Integer.valueOf(a3.f15957c.size()), Long.valueOf(currentTimeMillis2 - currentTimeMillis)});
                    }
                    m18326a(format, a3.f15955a);
                    if (glk.m17973a("Babel_wear", 2)) {
                        new StringBuilder(77).append("WearableService.sendConversations cleanup conversations: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    m18328a(a3.f15956b);
                    if (hashMap.size() + a3.f15957c.size() > 50) {
                        m18330b(a3.f15957c);
                        if (glk.m17973a("Babel_wear", 2)) {
                            currentTimeMillis2 = System.currentTimeMillis();
                            String.format("WearableService.sendConversations cleanup profile pictures (%d deleted): %d", new Object[]{Integer.valueOf(a3.f15957c.size()), Long.valueOf(currentTimeMillis2 - currentTimeMillis)});
                        }
                    }
                    if (glk.m17973a("Babel_wear", 2)) {
                        new StringBuilder(60).append("WearableService.sendConversations done: ").append(System.currentTimeMillis() - currentTimeMillis);
                    }
                    this.f15953a.m18353e();
                    return bhn.f3348a;
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
            i2 = bhn.f3351d;
            return i2;
        } finally {
            this.f15953a.m18353e();
        }
    }

    private bko m18324a() {
        for (int b : grm.m18342g()) {
            bko b2 = grm.m18338b(b);
            if (m18329a(b2)) {
                this.f15953a.m18349a(b2.m5629a());
                return b2;
            }
        }
        return null;
    }

    private boolean m18329a(bko bko) {
        return bko != null && bko.m5636e() && this.f15954b.mo3469d(bko.m5638g());
    }

    private void m18327a(ArrayList<hxz> arrayList) {
        hyg a = hyg.m21248a("/hangouts/accounts/");
        a.m21250b().m21224a("2", (ArrayList) arrayList);
        this.f15953a.m18350b().m21193a(this.f15953a.m18345a(), a.m21251c()).mo2418a();
    }

    private void m18328a(Map<String, List<Uri>> map) {
        for (List<Uri> it : map.values()) {
            for (Uri b : it) {
                this.f15953a.m18350b().m21194b(this.f15953a.m18345a(), b).mo2418a();
            }
        }
    }

    private void m18326a(String str, Map<String, hxz> map) {
        for (String str2 : map.keySet()) {
            Builder scheme = new Builder().scheme("wear");
            String valueOf = String.valueOf(str);
            String str22 = String.valueOf(str22);
            this.f15953a.m18350b().m21194b(this.f15953a.m18345a(), scheme.path(str22.length() != 0 ? valueOf.concat(str22) : new String(valueOf)).build()).mo2418a();
        }
    }

    private void m18330b(Map<String, Uri> map) {
        for (Uri b : map.values()) {
            this.f15953a.m18350b().m21194b(this.f15953a.m18345a(), b).mo2418a();
        }
    }

    private gri m18325a(String str) {
        gri gri = new gri();
        hxy hxy = (hxy) this.f15953a.m18350b().m21190a(this.f15953a.m18345a()).mo2418a();
        try {
            if (hxy.mo1279k().m9663d()) {
                Iterator it = hxy.iterator();
                while (it.hasNext()) {
                    hxw hxw = (hxw) it.next();
                    String path = hxw.mo1291a().getPath();
                    if (path.startsWith(str)) {
                        gri.f15955a.put(hxw.mo1291a().getLastPathSegment(), grm.m18340b(hxw));
                    } else if (path.startsWith("/hangouts/profiles/")) {
                        Uri a = hxw.mo1291a();
                        gri.f15957c.put(a.getLastPathSegment(), a);
                    } else if (path.contains("/conversations/")) {
                        path = (String) hxw.mo1291a().getPathSegments().get(1);
                        List list = (List) gri.f15956b.get(path);
                        if (list == null) {
                            list = new ArrayList();
                            gri.f15956b.put(path, list);
                        }
                        list.add(hxw.mo1291a());
                    }
                }
            }
            hxy.mo2073b();
            return gri;
        } catch (Throwable th) {
            hxy.mo2073b();
        }
    }
}
