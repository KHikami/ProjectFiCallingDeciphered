package p000;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class erb {
    final eri f12100a;
    private final Context f12101b;
    private final jcf f12102c;
    private final fzw f12103d;
    private final int f12104e;
    private final Set<String> f12105f = new HashSet();
    private final SparseArray<List<String>> f12106g = new SparseArray();
    private final Map<String, erf> f12107h = new ky();
    private final fip f12108i = new erc(this);

    public erb(Context context, jcf jcf, fzw fzw, int i, eri eri) {
        this.f12101b = context;
        this.f12102c = jcf;
        this.f12103d = fzw;
        this.f12104e = i;
        this.f12100a = eri;
    }

    boolean m14310a(String str, erl erl, int i) {
        if (this.f12107h.isEmpty()) {
            RealTimeChatService.m9040a(this.f12108i);
        }
        erf erf = (erf) this.f12107h.get(str);
        if (erf == null) {
            erf erf2 = new erf(str);
            erf2.f12116b = this.f12100a.m14328a(this.f12104e, str, false);
            this.f12107h.put(str, erf2);
            if (erf2.f12116b == null) {
                new ere(this, this.f12101b, this.f12102c, this.f12104e, str).execute(new Void[0]);
            }
            erf = erf2;
        }
        return erf.m14325a(erl, i);
    }

    boolean m14309a(erl erl) {
        Iterator it = this.f12107h.values().iterator();
        while (it.hasNext()) {
            if (!((erf) it.next()).m14324a(erl)) {
                it.remove();
            }
        }
        boolean isEmpty = this.f12107h.isEmpty();
        if (isEmpty) {
            m14304a();
        }
        return !isEmpty;
    }

    void m14304a() {
        RealTimeChatService.m9077b(this.f12108i);
    }

    void m14308a(String str, etx etx, Object obj) {
        esn a = m14303a(str, false);
        if (a != null) {
            m14307a(a, str, etx, obj);
        } else {
            new erd(this, this.f12101b, this.f12102c, this.f12104e, str, etx, obj).execute(new Void[0]);
        }
    }

    void m14307a(esn esn, String str, etx etx, Object obj) {
        if (esn.mo1940a(etx, obj, glj.m17956a())) {
            m14302a(esn, str, etx.f12271l);
        }
    }

    void m14306a(long j) {
        if (this.f12102c.mo3469d(this.f12104e) && !this.f12103d.mo2146a(this.f12104e)) {
            int a;
            SparseArray sparseArray = new SparseArray();
            for (erf erf : this.f12107h.values()) {
                a = erf.m14319a(j);
                if (a != 0) {
                    List list = (List) sparseArray.get(a);
                    if (list == null) {
                        list = new ArrayList();
                        sparseArray.put(a, list);
                    }
                    list.add(erf.f12115a);
                }
            }
            int size = sparseArray.size();
            for (a = 0; a < size; a++) {
                int i;
                int keyAt = sparseArray.keyAt(a);
                ArrayList arrayList = (ArrayList) sparseArray.valueAt(a);
                int a2 = ((fmf) jyn.m25426a(this.f12101b, fmf.class)).mo2035a().m15674a();
                if (glk.m17973a("Babel", 3)) {
                    i = this.f12104e;
                    int size2 = arrayList.size();
                    String valueOf = String.valueOf(TextUtils.join(",", arrayList));
                    glk.m17976b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 117).append("Presence request: requestId=").append(a2).append(", account=").append(i).append(", fieldMask=").append(keyAt).append(", gaiaCount=").append(size2).append(", gaiaList=").append(valueOf).toString(), new Object[0]);
                }
                this.f12106g.put(a2, arrayList);
                RealTimeChatService.m8993a(a2, this.f12104e, arrayList, keyAt);
                arrayList = arrayList;
                i = arrayList.size();
                keyAt = 0;
                while (keyAt < i) {
                    Object obj = arrayList.get(keyAt);
                    keyAt++;
                    ((erf) this.f12107h.get((String) obj)).m14323a(a2, true);
                }
            }
        }
    }

    esn m14303a(String str, boolean z) {
        erf erf = (erf) this.f12107h.get(str);
        if (erf == null) {
            return this.f12100a.m14328a(this.f12104e, str, z);
        }
        if (erf.f12116b != null) {
            return erf;
        }
        if (!z) {
            return null;
        }
        erf.f12116b = this.f12100a.m14327a(this.f12104e, str);
        return erf;
    }

    private void m14302a(esn esn, String str, int i) {
        if (this.f12102c.mo3469d(this.f12104e)) {
            ContentValues contentValues = new ContentValues();
            esn.mo1939a(i, contentValues);
            RealTimeChatService.m9000a(this.f12104e, str, contentValues);
        }
    }

    void m14305a(int i, fiu fiu) {
        synchronized (this.f12100a) {
            List list = (List) this.f12106g.get(i);
            if (list == null) {
                return;
            }
            this.f12105f.addAll(list);
            this.f12106g.remove(i);
            for (String str : this.f12105f) {
                erf erf = (erf) this.f12107h.get(str);
                if (erf != null) {
                    erf.m14323a(i, false);
                }
            }
            evz c = fiu.m15392c();
            if (c instanceof eyt) {
                eyt eyt = (eyt) c;
                List<fbc> k = eyt.m14794k();
                int c2 = ((fgz) eyt.m8129c()).m15300c();
                if (glk.m17973a("Babel", 3)) {
                    glk.m17976b("Babel", "Presence response: requestId=" + i + ", gaiaCount=" + k.size(), new Object[0]);
                }
                for (fbc fbc : k) {
                    String str2 = fbc.f12617b;
                    this.f12105f.remove(str2);
                    esn a = m14303a(str2, true);
                    a.mo1938a(fbc, c2);
                    m14302a(a, str2, c2);
                }
            }
            if (!this.f12105f.isEmpty()) {
                String valueOf = String.valueOf(glk.m17974b(TextUtils.join(",", this.f12105f)));
                glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 68).append("Server did not return presence for: requestId=").append(i).append(", gaiaList=").append(valueOf).toString(), new Object[0]);
            }
            this.f12105f.clear();
        }
    }
}
