package p000;

import java.util.Locale;

class kw {
    kw() {
    }

    public int mo3680a(Locale locale) {
        if (!(locale == null || locale.equals(kv.f23534b))) {
            String a = kh.f21676a.mo3677a(locale);
            if (a == null) {
                switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                    case (byte) 1:
                    case (byte) 2:
                        return 1;
                    default:
                        return 0;
                }
            } else if (a.equalsIgnoreCase(kv.f23535c) || a.equalsIgnoreCase(kv.f23536d)) {
                return 1;
            }
        }
        return 0;
    }
}
