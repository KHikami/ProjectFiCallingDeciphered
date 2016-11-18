package defpackage;

import java.util.HashMap;

final class oit {
    HashMap<String, String> a = new HashMap();

    oit(String str) {
        for (String split : str.split(";")) {
            String[] split2 = split.split(":");
            if (split2.length == 2) {
                this.a.put(split2[0], split2[1]);
            }
        }
    }

    public String a(String str) {
        return (String) this.a.get(str);
    }
}
