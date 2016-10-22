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
    final /* synthetic */ cct a;
    private final List<Map<String, String>> b;
    private final List<ArrayList<ky<String, String>>> c;

    ccu(cct cct) {
        this.a = cct;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return b();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a();
    }

    private static void a(ArrayList<ky<String, String>> arrayList, String str, String str2) {
        ky kyVar = new ky();
        kyVar.put("main", str);
        kyVar.put("sub", str2);
        arrayList.add(kyVar);
    }

    private void a(String str, dak dak, blo blo) {
        if (dak == null) {
            ky kyVar = new ky();
            kyVar.put("text", String.valueOf(str).concat("/ no contacts match"));
            this.b.add(kyVar);
            this.c.add(new ArrayList());
            return;
        }
        kyVar = new ky();
        String valueOf = String.valueOf(dak.c());
        kyVar.put("text", new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()).append(str).append("/").append(valueOf).toString());
        this.b.add(kyVar);
        ArrayList arrayList = new ArrayList();
        for (dap dap : dak.f()) {
            String str2;
            String str3 = dap.a;
            CharSequence a = blo.a(null, str3);
            bmh a2 = blo.a(gwb.d(this.a.a.a, str3), false, 3);
            if (TextUtils.equals(this.a.a.e, a)) {
                str2 = "(INCL)";
            } else {
                str2 = "(EXCL)";
            }
            Locale locale = Locale.US;
            String str4 = "    %s\n    computed merge key: %s %s\n    conversation exists? %s";
            Object[] objArr = new Object[4];
            objArr[0] = dap.b;
            objArr[1] = a;
            objArr[2] = str2;
            objArr[3] = Boolean.valueOf(a2 != null);
            a(arrayList, str3, String.format(locale, str4, objArr));
        }
        for (dan dan : dak.g()) {
            a(arrayList, "email", dan.a);
        }
        a(arrayList, "qualifiedId", dak.b());
        this.c.add(arrayList);
    }

    private void a() {
        Builder builder = new Builder(this.a.a.a);
        ExpandableListAdapter simpleExpandableListAdapter = new SimpleExpandableListAdapter(this.a.a.a, this.b, gwb.gi, new String[]{"text"}, new int[]{16908308}, this.c, gwb.gj, new String[]{"main", "sub"}, new int[]{16908308, 16908309});
        View expandableListView = new ExpandableListView(this.a.a.a);
        expandableListView.setLayoutParams(new LayoutParams(-1, -1));
        expandableListView.setAdapter(simpleExpandableListAdapter);
        builder.setView(expandableListView);
        builder.show();
    }

    private Void b() {
        blo blo = new blo(this.a.a.a, this.a.a.b.g());
        edk edk = this.a.a.d;
        bjm a = ((bjn) jyn.a(this.a.a.a, bjn.class)).a(this.a.a.b.g());
        try {
            if (a.b()) {
                String str;
                if (edk.b.a != null) {
                    str = edk.b.a;
                    a(str, dak.a(this.a.a.a, a.c(str)), blo);
                } else if (edk.c != null) {
                    str = edk.c;
                    a(str, blo.b(str, a), blo);
                }
            }
            a.a();
            return null;
        } catch (Throwable th) {
            a.a();
        }
    }
}
