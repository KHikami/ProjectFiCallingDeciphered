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
    final eri a;
    private final Context b;
    private final jcf c;
    private final fzw d;
    private final int e;
    private final Set<String> f;
    private final SparseArray<List<String>> g;
    private final Map<String, erf> h;
    private final fip i;

    public erb(Context context, jcf jcf, fzw fzw, int i, eri eri) {
        this.f = new HashSet();
        this.g = new SparseArray();
        this.h = new ky();
        this.i = new erc(this);
        this.b = context;
        this.c = jcf;
        this.d = fzw;
        this.e = i;
        this.a = eri;
    }

    boolean a(String str, erl erl, int i) {
        if (this.h.isEmpty()) {
            RealTimeChatService.a(this.i);
        }
        erf erf = (erf) this.h.get(str);
        if (erf == null) {
            erf erf2 = new erf(str);
            erf2.b = this.a.a(this.e, str, false);
            this.h.put(str, erf2);
            if (erf2.b == null) {
                new ere(this, this.b, this.c, this.e, str).execute(new Void[0]);
            }
            erf = erf2;
        }
        return erf.a(erl, i);
    }

    boolean a(erl erl) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            if (!((erf) it.next()).a(erl)) {
                it.remove();
            }
        }
        boolean isEmpty = this.h.isEmpty();
        if (isEmpty) {
            a();
        }
        return !isEmpty;
    }

    void a() {
        RealTimeChatService.b(this.i);
    }

    void a(String str, etx etx, Object obj) {
        esn a = a(str, false);
        if (a != null) {
            a(a, str, etx, obj);
        } else {
            new erd(this, this.b, this.c, this.e, str, etx, obj).execute(new Void[0]);
        }
    }

    void a(esn esn, String str, etx etx, Object obj) {
        if (esn.a(etx, obj, glj.a())) {
            a(esn, str, etx.l);
        }
    }

    void a(long j) {
        if (this.c.d(this.e) && !this.d.a(this.e)) {
            int a;
            SparseArray sparseArray = new SparseArray();
            for (erf erf : this.h.values()) {
                a = erf.a(j);
                if (a != 0) {
                    List list = (List) sparseArray.get(a);
                    if (list == null) {
                        list = new ArrayList();
                        sparseArray.put(a, list);
                    }
                    list.add(erf.a);
                }
            }
            int size = sparseArray.size();
            for (a = 0; a < size; a++) {
                int i;
                int keyAt = sparseArray.keyAt(a);
                ArrayList arrayList = (ArrayList) sparseArray.valueAt(a);
                int a2 = ((fmf) jyn.a(this.b, fmf.class)).a().a();
                if (glk.a("Babel", 3)) {
                    i = this.e;
                    int size2 = arrayList.size();
                    String valueOf = String.valueOf(TextUtils.join(",", arrayList));
                    glk.b("Babel", new StringBuilder(String.valueOf(valueOf).length() + 117).append("Presence request: requestId=").append(a2).append(", account=").append(i).append(", fieldMask=").append(keyAt).append(", gaiaCount=").append(size2).append(", gaiaList=").append(valueOf).toString(), new Object[0]);
                }
                this.g.put(a2, arrayList);
                RealTimeChatService.a(a2, this.e, arrayList, keyAt);
                arrayList = arrayList;
                i = arrayList.size();
                keyAt = 0;
                while (keyAt < i) {
                    Object obj = arrayList.get(keyAt);
                    keyAt++;
                    ((erf) this.h.get((String) obj)).a(a2, true);
                }
            }
        }
    }

    esn a(String str, boolean z) {
        erf erf = (erf) this.h.get(str);
        if (erf == null) {
            return this.a.a(this.e, str, z);
        }
        if (erf.b != null) {
            return erf;
        }
        if (!z) {
            return null;
        }
        erf.b = this.a.a(this.e, str);
        return erf;
    }

    private void a(esn esn, String str, int i) {
        if (this.c.d(this.e)) {
            ContentValues contentValues = new ContentValues();
            esn.a(i, contentValues);
            RealTimeChatService.a(this.e, str, contentValues);
        }
    }

    void a(int i, fiu fiu) {
        synchronized (this.a) {
            List list = (List) this.g.get(i);
            if (list == null) {
                return;
            }
            this.f.addAll(list);
            this.g.remove(i);
            for (String str : this.f) {
                erf erf = (erf) this.h.get(str);
                if (erf != null) {
                    erf.a(i, false);
                }
            }
            evz c = fiu.c();
            if (c instanceof eyt) {
                eyt eyt = (eyt) c;
                List<fbc> k = eyt.k();
                int c2 = ((fgz) eyt.c()).c();
                if (glk.a("Babel", 3)) {
                    glk.b("Babel", "Presence response: requestId=" + i + ", gaiaCount=" + k.size(), new Object[0]);
                }
                for (fbc fbc : k) {
                    String str2 = fbc.b;
                    this.f.remove(str2);
                    esn a = a(str2, true);
                    a.a(fbc, c2);
                    a(a, str2, c2);
                }
            }
            if (!this.f.isEmpty()) {
                String valueOf = String.valueOf(glk.b(TextUtils.join(",", this.f)));
                glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 68).append("Server did not return presence for: requestId=").append(i).append(", gaiaList=").append(valueOf).toString(), new Object[0]);
            }
            this.f.clear();
        }
    }
}
