package defpackage;

import java.util.regex.Pattern;

/* renamed from: bwe */
public final class bwe {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || btr.a.a((CharSequence) str);
    }
}
