package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class jdm {
    final /* synthetic */ jcx f19900a;
    private final kac f19901b = new kac();

    jdm(jcx jcx) {
        this.f19900a = jcx;
    }

    String m23989a() {
        Map all = this.f19900a.f19875b.getAll();
        for (Integer intValue : this.f19900a.mo3453a()) {
            int intValue2 = intValue.intValue();
            this.f19901b.println("Account ID: " + intValue2 + " {");
            String str = intValue2 + ".";
            ArrayList arrayList = new ArrayList();
            for (String str2 : all.keySet()) {
                if (str2.startsWith(str)) {
                    arrayList.add(str2);
                }
            }
            Collections.sort(arrayList);
            m23988a(all, arrayList, str, "account_name", "effective_gaia_id", "is_plus_page", "created", "is_google_plus", "logged_in", "logged_out", "display_name", "gaia_id");
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                m23986a("    ", all, str, ((String) obj).substring(str.length()));
            }
            this.f19901b.println("}");
        }
        m23987a(all);
        return this.f19901b.toString();
    }

    private void m23988a(Map<String, ?> map, ArrayList<String> arrayList, String str, String... strArr) {
        for (String str2 : strArr) {
            m23986a("  ", (Map) map, str, str2);
            String valueOf = String.valueOf(str);
            String str22 = String.valueOf(str22);
            arrayList.remove(str22.length() != 0 ? valueOf.concat(str22) : new String(valueOf));
        }
    }

    private void m23986a(String str, Map<String, ?> map, String str2, String str3) {
        kac kac = this.f19901b;
        String valueOf = String.valueOf(str2);
        String valueOf2 = String.valueOf(str3);
        valueOf2 = String.valueOf(map.get(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
        kac.println(new StringBuilder(((String.valueOf(str).length() + 3) + String.valueOf(str3).length()) + String.valueOf(valueOf2).length()).append(str).append(str3).append(" = ").append(valueOf2).toString());
    }

    private void m23987a(Map<String, ?> map) {
        List arrayList = new ArrayList();
        for (String str : map.keySet()) {
            if (str.startsWith("key.")) {
                arrayList.add(str.substring(4));
            }
        }
        Collections.sort(arrayList);
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            String str2;
            int i2 = i + 1;
            String str3 = (String) arrayList2.get(i);
            int d = this.f19900a.mo3468d(str3);
            if (d == -1) {
                str2 = "<INVALID_ID>";
            } else {
                try {
                    jch a = this.f19900a.mo3456a(d);
                    String valueOf = String.valueOf(a.mo3440b("account_name"));
                    str2 = String.valueOf(a.mo3440b("effective_gaia_id"));
                    str2 = new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(str2).length()).append("(").append(valueOf).append(", ").append(str2).append(")").toString();
                } catch (jcj e) {
                    str2 = "<ACCOUNT NOT FOUND>";
                }
            }
            this.f19901b.println(new StringBuilder((String.valueOf(str3).length() + 29) + String.valueOf(str2).length()).append("Account key '").append(str3).append("' = ").append(d).append(" ").append(str2).toString());
            i = i2;
        }
    }
}
