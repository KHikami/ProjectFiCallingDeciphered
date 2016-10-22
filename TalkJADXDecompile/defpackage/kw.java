package defpackage;

import java.util.Locale;

/* renamed from: kw */
class kw {
    kw() {
    }

    public int a(Locale locale) {
        if (!(locale == null || locale.equals(kv.b))) {
            String a = kh.a.a(locale);
            if (a == null) {
                switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                    case wi.j /*1*/:
                    case wi.l /*2*/:
                        return 1;
                    default:
                        return 0;
                }
            } else if (a.equalsIgnoreCase(kv.c) || a.equalsIgnoreCase(kv.d)) {
                return 1;
            }
        }
        return 0;
    }
}
