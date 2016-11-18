package p000;

import org.xml.sax.Attributes;

final class oiq {
    oit f33006a = null;
    Attributes f33007b;

    oiq(Attributes attributes) {
        this.f33007b = attributes;
        String b = oik.m38485b("style", attributes);
        if (b != null) {
            this.f33006a = new oit(b);
        }
    }

    public String m38489a(String str) {
        String a;
        if (this.f33006a != null) {
            a = this.f33006a.m38516a(str);
        } else {
            a = null;
        }
        if (a != null) {
            return a;
        }
        Attributes attributes = this.f33007b;
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public String m38490b(String str) {
        return m38489a(str);
    }

    public Integer m38491c(String str) {
        String a = m38489a(str);
        if (a == null) {
            return null;
        }
        if (!a.startsWith("#") || (a.length() != 4 && a.length() != 7)) {
            return (Integer) oij.f32981a.get(a);
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

    public Float m38492d(String str) {
        Float f = null;
        String a = m38489a(str);
        if (a != null) {
            try {
                f = Float.valueOf(Float.parseFloat(a));
            } catch (NumberFormatException e) {
            }
        }
        return f;
    }
}
