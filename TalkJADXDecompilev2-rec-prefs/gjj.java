package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public final class gjj extends HashSet<String> {
    private static final long serialVersionUID = 1;

    private gjj(Collection<String> collection) {
        super(collection);
    }

    public String m17807a() {
        if (size() > 0) {
            return (String) iterator().next();
        }
        return null;
    }

    public static gjj m17806a(String str) {
        if (str != null) {
            return new gjj(Arrays.asList(str.split("\\|")));
        }
        return null;
    }

    public String m17808b() {
        String str = "|";
        if (this == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (String str2 : this) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(str);
            }
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }
}
