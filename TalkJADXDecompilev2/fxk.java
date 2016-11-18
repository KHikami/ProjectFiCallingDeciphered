package defpackage;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class fxk {
    private static final Map<String, String> a;
    private fxl b;
    private fxm c;
    private final StringBuilder d = new StringBuilder();
    private final XmlPullParser e;

    static {
        Map hashMap = new HashMap();
        a = hashMap;
        hashMap.put("mcc", "mcc");
        a.put("mnc", "mnc");
        a.put("carrier", "name");
        a.put("apn", "apn");
        a.put("mmsc", "mmsc");
        a.put("mmsproxy", "mmsproxy");
        a.put("mmsport", "mmsport");
        a.put("type", "type");
        a.put("user", "user");
        a.put("password", "password");
        a.put("authtype", "authtype");
        a.put("mvno_match_data", "mvno_match_data");
        a.put("mvno_type", "mvno_type");
        a.put("protocol", "protocol");
        a.put("bearer", "bearer");
        a.put("server", "server");
        a.put("roaming_protocol", "roaming_protocol");
        a.put("proxy", "proxy");
        a.put("port", "port");
        a.put("carrier_enabled", "carrier_enabled");
    }

    private fxk(XmlPullParser xmlPullParser) {
        this.e = xmlPullParser;
        this.b = null;
        this.c = null;
    }

    public fxk a(fxl fxl) {
        this.b = fxl;
        return this;
    }

    public fxk a(fxm fxm) {
        this.c = fxm;
        return this;
    }

    private int a(int i) {
        int next;
        do {
            next = this.e.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        return next;
    }

    public void a() {
        String str;
        try {
            if (a(2) != 2) {
                str = "ApnsXmlProcessor: expecting start tag @";
                String valueOf = String.valueOf(b());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                throw new XmlPullParserException(valueOf);
            }
            ContentValues contentValues = new ContentValues();
            String name = this.e.getName();
            if ("apns".equals(name)) {
                while (a(2) == 2) {
                    name = this.e.getName();
                    if ("apn".equals(name)) {
                        a(contentValues);
                    } else if ("mms_config".equals(name)) {
                        c();
                    }
                }
            } else if ("mms_config".equals(name)) {
                c();
            }
        } catch (Throwable e) {
            str = String.valueOf(e);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 30).append("ApnsXmlProcessor: I/O failure ").append(str).toString(), e);
        } catch (Throwable e2) {
            str = String.valueOf(e2);
            glk.d("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 34).append("ApnsXmlProcessor: parsing failure ").append(str).toString(), e2);
        }
    }

    private Integer a(String str, Integer num, String str2) {
        try {
            num = Integer.valueOf(Integer.parseInt(str));
        } catch (Exception e) {
            String valueOf = String.valueOf(b());
            glk.e("Babel_SMS", new StringBuilder(((String.valueOf(str).length() + 19) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Invalid value ").append(str).append("for").append(str2).append(" @").append(valueOf).toString(), new Object[0]);
        }
        return num;
    }

    private Boolean a(String str, Boolean bool, String str2) {
        Boolean bool2 = null;
        try {
            bool2 = Boolean.valueOf(Boolean.parseBoolean(str));
        } catch (Exception e) {
            String valueOf = String.valueOf(b());
            glk.e("Babel_SMS", new StringBuilder(((String.valueOf(str).length() + 19) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Invalid value ").append(str).append("for").append(str2).append(" @").append(valueOf).toString(), new Object[0]);
        }
        return bool2;
    }

    private String b() {
        int i = 0;
        this.d.setLength(0);
        if (this.e != null) {
            try {
                String str;
                int eventType = this.e.getEventType();
                StringBuilder stringBuilder = this.d;
                switch (eventType) {
                    case 0:
                        str = "START_DOCUMENT";
                        break;
                    case 1:
                        str = "END_DOCUMENT";
                        break;
                    case 2:
                        str = "START_TAG";
                        break;
                    case 3:
                        str = "END_TAG";
                        break;
                    case 4:
                        str = "TEXT";
                        break;
                    default:
                        str = Integer.toString(eventType);
                        break;
                }
                stringBuilder.append(str);
                if (eventType == 2 || eventType == 3 || eventType == 4) {
                    this.d.append('<').append(this.e.getName());
                    while (i < this.e.getAttributeCount()) {
                        this.d.append(' ').append(this.e.getAttributeName(i)).append('=').append(this.e.getAttributeValue(i));
                        i++;
                    }
                    this.d.append("/>");
                }
                return this.d.toString();
            } catch (Throwable e) {
                String valueOf = String.valueOf(e);
                glk.d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 23).append("xmlParserDebugContext: ").append(valueOf).toString(), e);
            }
        }
        return "Unknown";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r10 = this;
        r9 = 4;
        r8 = 3;
        r1 = 0;
        r0 = r10.e;
        r2 = "mcc";
        r0 = r0.getAttributeValue(r1, r2);
        r2 = r10.e;
        r3 = "mnc";
        r2 = r2.getAttributeValue(r1, r3);
        r3 = defpackage.fzo.a(r0, r2);
    L_0x0017:
        r0 = r10.e;
        r0 = r0.next();
        if (r0 == r9) goto L_0x0017;
    L_0x001f:
        r2 = 2;
        if (r0 != r2) goto L_0x00b4;
    L_0x0022:
        r0 = r10.e;
        r2 = "name";
        r4 = r0.getAttributeValue(r1, r2);
        r0 = r10.e;
        r5 = r0.getName();
        r0 = r10.e;
        r0 = r0.next();
        if (r0 != r9) goto L_0x00d7;
    L_0x0038:
        r0 = r10.e;
        r0 = r0.getText();
        r2 = r10.e;
        r2 = r2.next();
    L_0x0044:
        if (r2 == r8) goto L_0x0066;
    L_0x0046:
        r1 = new org.xmlpull.v1.XmlPullParserException;
        r2 = "ApnsXmlProcessor: expecting end tag @";
        r0 = r10.b();
        r0 = java.lang.String.valueOf(r0);
        r3 = r0.length();
        if (r3 == 0) goto L_0x0060;
    L_0x0058:
        r0 = r2.concat(r0);
    L_0x005c:
        r1.<init>(r0);
        throw r1;
    L_0x0060:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x005c;
    L_0x0066:
        r2 = defpackage.ajf.a();
        r2 = r2.a(r4, r5);
        if (r2 == 0) goto L_0x007a;
    L_0x0070:
        r2 = r10.c;
        if (r2 == 0) goto L_0x0017;
    L_0x0074:
        r2 = r10.c;
        r2.a(r3, r4, r0, r5);
        goto L_0x0017;
    L_0x007a:
        r0 = "Babel_SMS";
        r2 = new java.lang.StringBuilder;
        r6 = java.lang.String.valueOf(r4);
        r6 = r6.length();
        r6 = r6 + 32;
        r7 = java.lang.String.valueOf(r5);
        r7 = r7.length();
        r6 = r6 + r7;
        r2.<init>(r6);
        r6 = "MmsConfig: invalid key=";
        r2 = r2.append(r6);
        r2 = r2.append(r4);
        r4 = " or type=";
        r2 = r2.append(r4);
        r2 = r2.append(r5);
        r2 = r2.toString();
        r4 = 0;
        r4 = new java.lang.Object[r4];
        defpackage.glk.d(r0, r2, r4);
        goto L_0x0017;
    L_0x00b4:
        if (r0 == r8) goto L_0x00d6;
    L_0x00b6:
        r1 = new org.xmlpull.v1.XmlPullParserException;
        r2 = "MmsConfig: expecting start or end tag @";
        r0 = r10.b();
        r0 = java.lang.String.valueOf(r0);
        r3 = r0.length();
        if (r3 == 0) goto L_0x00d0;
    L_0x00c8:
        r0 = r2.concat(r0);
    L_0x00cc:
        r1.<init>(r0);
        throw r1;
    L_0x00d0:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x00cc;
    L_0x00d6:
        return;
    L_0x00d7:
        r2 = r0;
        r0 = r1;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: fxk.c():void");
    }

    public static fxk a(XmlPullParser xmlPullParser) {
        iil.b("Expected non-null", (Object) xmlPullParser);
        return new fxk(xmlPullParser);
    }

    private void a(ContentValues contentValues) {
        String str;
        iil.b("Expected non-null", (Object) contentValues);
        contentValues.clear();
        for (int i = 0; i < this.e.getAttributeCount(); i++) {
            str = (String) a.get(this.e.getAttributeName(i));
            if (str != null) {
                contentValues.put(str, this.e.getAttributeValue(i));
            }
        }
        contentValues.put("numeric", fzo.a(contentValues.getAsString("mcc"), contentValues.getAsString("mnc")));
        str = contentValues.getAsString("authtype");
        if (str != null) {
            contentValues.put("authtype", a(str, Integer.valueOf(-1), "apn authtype"));
        }
        str = contentValues.getAsString("carrier_enabled");
        if (str != null) {
            contentValues.put("carrier_enabled", a(str, null, "apn carrierEnabled"));
        }
        str = contentValues.getAsString("bearer");
        if (str != null) {
            contentValues.put("bearer", a(str, Integer.valueOf(0), "apn bearer"));
        }
        if (this.e.next() != 3) {
            String str2 = "Apn: expecting end tag @";
            str = String.valueOf(b());
            throw new XmlPullParserException(str.length() != 0 ? str2.concat(str) : new String(str2));
        } else if (this.b != null) {
            this.b.a(contentValues);
        }
    }
}
