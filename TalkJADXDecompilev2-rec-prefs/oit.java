package p000;

import java.util.HashMap;

final class oit {
    HashMap<String, String> f33047a = new HashMap();

    oit(String str) {
        for (String split : str.split(";")) {
            String[] split2 = split.split(":");
            if (split2.length == 2) {
                this.f33047a.put(split2[0], split2[1]);
            }
        }
    }

    public String m38516a(String str) {
        return (String) this.f33047a.get(str);
    }
}
