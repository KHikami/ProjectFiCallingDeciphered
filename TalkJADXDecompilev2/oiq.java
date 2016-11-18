package defpackage;

import org.xml.sax.Attributes;

final class oiq {
    oit a = null;
    Attributes b;

    oiq(Attributes attributes) {
        this.b = attributes;
        String b = oik.b("style", attributes);
        if (b != null) {
            this.a = new oit(b);
        }
    }

    public String a(String str) {
        String a;
        if (this.a != null) {
            a = this.a.a(str);
        } else {
            a = null;
        }
        if (a != null) {
            return a;
        }
        Attributes attributes = this.b;
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public String b(String str) {
        return a(str);
    }

    public Integer c(String str) {
        String a = a(str);
        if (a == null) {
            return null;
        }
        if (!a.startsWith("#") || (a.length() != 4 && a.length() != 7)) {
            return (Integer) oij.a.get(a);
        }
        try {
            int parseInt = Integer.parseInt(a.substring(1), 16);
            if (a.length() == 4) {
                parseInt = (parseInt & 15) | ((((((parseInt & 3840) << 8) | ((parseInt & 3840) << 12)) | ((parseInt & 240) << 4)) | ((parseInt & 240) << 8)) | ((parseInt & 15) << 4));
            }
            return Integer.valueOf(parseInt);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Float d(String str) {
        Float f = null;
        String a = a(str);
        if (a != null) {
            try {
                f = Float.valueOf(Float.parseFloat(a));
            } catch (NumberFormatException e) {
            }
        }
        return f;
    }
}
