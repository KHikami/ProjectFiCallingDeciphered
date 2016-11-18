package p000;

import android.app.AlertDialog.Builder;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class ccu extends AsyncTask<Void, Void, Void> {
    final /* synthetic */ cct f5023a;
    private final List<Map<String, String>> f5024b = new ArrayList();
    private final List<ArrayList<ky<String, String>>> f5025c = new ArrayList();

    ccu(cct cct) {
        this.f5023a = cct;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7218b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7215a();
    }

    private static void m7217a(ArrayList<ky<String, String>> arrayList, String str, String str2) {
        ky kyVar = new ky();
        kyVar.put("main", str);
        kyVar.put("sub", str2);
        arrayList.add(kyVar);
    }

    private void m7216a(String str, dak dak, blo blo) {
        if (dak == null) {
            ky kyVar = new ky();
            kyVar.put("text", String.valueOf(str).concat("/ no contacts match"));
            this.f5024b.add(kyVar);
            this.f5025c.add(new ArrayList());
            return;
        }
        kyVar = new ky();
        String valueOf = String.valueOf(dak.m11389c());
        kyVar.put("text", new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()).append(str).append("/").append(valueOf).toString());
        this.f5024b.add(kyVar);
        ArrayList arrayList = new ArrayList();
        for (dap dap : dak.m11392f()) {
            String str2;
            String str3 = dap.f9435a;
            CharSequence a = blo.m5951a(null, str3);
            bmh a2 = blo.m5946a(gwb.m2130d(this.f5023a.f5022a.f4999a, str3), false, 3);
            if (TextUtils.equals(this.f5023a.f5022a.f5003e, a)) {
                str2 = "(INCL)";
            } else {
                str2 = "(EXCL)";
            }
            Locale locale = Locale.US;
            String str4 = "    %s\n    computed merge key: %s %s\n    conversation exists? %s";
            Object[] objArr = new Object[4];
            objArr[0] = dap.f9436b;
            objArr[1] = a;
            objArr[2] = str2;
            objArr[3] = Boolean.valueOf(a2 != null);
            ccu.m7217a(arrayList, str3, String.format(locale, str4, objArr));
        }
        for (dan dan : dak.m11393g()) {
            ccu.m7217a(arrayList, "email", dan.f9432a);
        }
        ccu.m7217a(arrayList, "qualifiedId", dak.m11388b());
        this.f5025c.add(arrayList);
    }

    private void m7215a() {
        Builder builder = new Builder(this.f5023a.f5022a.f4999a);
        ExpandableListAdapter simpleExpandableListAdapter = new SimpleExpandableListAdapter(this.f5023a.f5022a.f4999a, this.f5024b, gwb.gi, new String[]{"text"}, new int[]{16908308}, this.f5025c, gwb.gj, new String[]{"main", "sub"}, new int[]{16908308, 16908309});
        View expandableListView = new ExpandableListView(this.f5023a.f5022a.f4999a);
        expandableListView.setLayoutParams(new LayoutParams(-1, -1));
        expandableListView.setAdapter(simpleExpandableListAdapter);
        builder.setView(expandableListView);
        builder.show();
    }

    private Void m7218b() {
        blo blo = new blo(this.f5023a.f5022a.f4999a, this.f5023a.f5022a.f5000b.m5638g());
        edk edk = this.f5023a.f5022a.f5002d;
        bjm a = ((bjn) jyn.m25426a(this.f5023a.f5022a.f4999a, bjn.class)).mo1757a(this.f5023a.f5022a.f5000b.m5638g());
        try {
            if (a.mo1755b()) {
                String str;
                if (edk.f11213b.f11244a != null) {
                    str = edk.f11213b.f11244a;
                    m7216a(str, dak.m11379a(this.f5023a.f5022a.f4999a, a.mo1756c(str)), blo);
                } else if (edk.f11214c != null) {
                    str = edk.f11214c;
                    m7216a(str, blo.m6010b(str, a), blo);
                }
            }
            a.mo1753a();
            return null;
        } catch (Throwable th) {
            a.mo1753a();
        }
    }
}
