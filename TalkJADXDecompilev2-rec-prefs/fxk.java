package p000;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class fxk {
    private static final Map<String, String> f14249a;
    private fxl f14250b;
    private fxm f14251c;
    private final StringBuilder f14252d = new StringBuilder();
    private final XmlPullParser f14253e;

    static {
        Map hashMap = new HashMap();
        f14249a = hashMap;
        hashMap.put("mcc", "mcc");
        f14249a.put("mnc", "mnc");
        f14249a.put("carrier", "name");
        f14249a.put("apn", "apn");
        f14249a.put("mmsc", "mmsc");
        f14249a.put("mmsproxy", "mmsproxy");
        f14249a.put("mmsport", "mmsport");
        f14249a.put("type", "type");
        f14249a.put("user", "user");
        f14249a.put("password", "password");
        f14249a.put("authtype", "authtype");
        f14249a.put("mvno_match_data", "mvno_match_data");
        f14249a.put("mvno_type", "mvno_type");
        f14249a.put("protocol", "protocol");
        f14249a.put("bearer", "bearer");
        f14249a.put("server", "server");
        f14249a.put("roaming_protocol", "roaming_protocol");
        f14249a.put("proxy", "proxy");
        f14249a.put("port", "port");
        f14249a.put("carrier_enabled", "carrier_enabled");
    }

    private fxk(XmlPullParser xmlPullParser) {
        this.f14253e = xmlPullParser;
        this.f14250b = null;
        this.f14251c = null;
    }

    public fxk m16476a(fxl fxl) {
        this.f14250b = fxl;
        return this;
    }

    public fxk m16477a(fxm fxm) {
        this.f14251c = fxm;
        return this;
    }

    private int m16469a(int i) {
        int next;
        do {
            next = this.f14253e.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        return next;
    }

    public void m16478a() {
        String str;
        try {
            if (m16469a(2) != 2) {
                str = "ApnsXmlProcessor: expecting start tag @";
                String valueOf = String.valueOf(m16474b());
                if (valueOf.length() != 0) {
                    valueOf = str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
                throw new XmlPullParserException(valueOf);
            }
            ContentValues contentValues = new ContentValues();
            String name = this.f14253e.getName();
            if ("apns".equals(name)) {
                while (m16469a(2) == 2) {
                    name = this.f14253e.getName();
                    if ("apn".equals(name)) {
                        m16473a(contentValues);
                    } else if ("mms_config".equals(name)) {
                        m16475c();
                    }
                }
            } else if ("mms_config".equals(name)) {
                m16475c();
            }
        } catch (Throwable e) {
            str = String.valueOf(e);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 30).append("ApnsXmlProcessor: I/O failure ").append(str).toString(), e);
        } catch (Throwable e2) {
            str = String.valueOf(e2);
            glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 34).append("ApnsXmlProcessor: parsing failure ").append(str).toString(), e2);
        }
    }

    private Integer m16472a(String str, Integer num, String str2) {
        try {
            num = Integer.valueOf(Integer.parseInt(str));
        } catch (Exception e) {
            String valueOf = String.valueOf(m16474b());
            glk.m17982e("Babel_SMS", new StringBuilder(((String.valueOf(str).length() + 19) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Invalid value ").append(str).append("for").append(str2).append(" @").append(valueOf).toString(), new Object[0]);
        }
        return num;
    }

    private Boolean m16471a(String str, Boolean bool, String str2) {
        Boolean bool2 = null;
        try {
            bool2 = Boolean.valueOf(Boolean.parseBoolean(str));
        } catch (Exception e) {
            String valueOf = String.valueOf(m16474b());
            glk.m17982e("Babel_SMS", new StringBuilder(((String.valueOf(str).length() + 19) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Invalid value ").append(str).append("for").append(str2).append(" @").append(valueOf).toString(), new Object[0]);
        }
        return bool2;
    }

    private String m16474b() {
        int i = 0;
        this.f14252d.setLength(0);
        if (this.f14253e != null) {
            try {
                String str;
                int eventType = this.f14253e.getEventType();
                StringBuilder stringBuilder = this.f14252d;
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
                    this.f14252d.append('<').append(this.f14253e.getName());
                    while (i < this.f14253e.getAttributeCount()) {
                        this.f14252d.append(' ').append(this.f14253e.getAttributeName(i)).append('=').append(this.f14253e.getAttributeValue(i));
                        i++;
                    }
                    this.f14252d.append("/>");
                }
                return this.f14252d.toString();
            } catch (Throwable e) {
                String valueOf = String.valueOf(e);
                glk.m17980d("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 23).append("xmlParserDebugContext: ").append(valueOf).toString(), e);
            }
        }
        return "Unknown";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16475c() {
        String text;
        String a = fzo.m16706a(this.f14253e.getAttributeValue(null, "mcc"), this.f14253e.getAttributeValue(null, "mnc"));
        while (true) {
            int next = this.f14253e.next();
            if (next != 4) {
                if (next != 2) {
                    break;
                }
                int next2;
                String attributeValue = this.f14253e.getAttributeValue(null, "name");
                String name = this.f14253e.getName();
                next = this.f14253e.next();
                if (next == 4) {
                    text = this.f14253e.getText();
                    next2 = this.f14253e.next();
                } else {
                    next2 = next;
                    text = null;
                }
                if (next2 != 3) {
                    break;
                } else if (!ajf.m2609a().mo2116a(attributeValue, name)) {
                    glk.m17981d("Babel_SMS", new StringBuilder((String.valueOf(attributeValue).length() + 32) + String.valueOf(name).length()).append("MmsConfig: invalid key=").append(attributeValue).append(" or type=").append(name).toString(), new Object[0]);
                } else if (this.f14251c != null) {
                    this.f14251c.mo2111a(a, attributeValue, text, name);
                }
            }
        }
        String str = "ApnsXmlProcessor: expecting end tag @";
        text = String.valueOf(m16474b());
        throw new XmlPullParserException(text.length() != 0 ? str.concat(text) : new String(str));
    }

    public static fxk m16470a(XmlPullParser xmlPullParser) {
        iil.m21875b("Expected non-null", (Object) xmlPullParser);
        return new fxk(xmlPullParser);
    }

    private void m16473a(ContentValues contentValues) {
        String str;
        iil.m21875b("Expected non-null", (Object) contentValues);
        contentValues.clear();
        for (int i = 0; i < this.f14253e.getAttributeCount(); i++) {
            str = (String) f14249a.get(this.f14253e.getAttributeName(i));
            if (str != null) {
                contentValues.put(str, this.f14253e.getAttributeValue(i));
            }
        }
        contentValues.put("numeric", fzo.m16706a(contentValues.getAsString("mcc"), contentValues.getAsString("mnc")));
        str = contentValues.getAsString("authtype");
        if (str != null) {
            contentValues.put("authtype", m16472a(str, Integer.valueOf(-1), "apn authtype"));
        }
        str = contentValues.getAsString("carrier_enabled");
        if (str != null) {
            contentValues.put("carrier_enabled", m16471a(str, null, "apn carrierEnabled"));
        }
        str = contentValues.getAsString("bearer");
        if (str != null) {
            contentValues.put("bearer", m16472a(str, Integer.valueOf(0), "apn bearer"));
        }
        if (this.f14253e.next() != 3) {
            String str2 = "Apn: expecting end tag @";
            str = String.valueOf(m16474b());
            throw new XmlPullParserException(str.length() != 0 ? str2.concat(str) : new String(str2));
        } else if (this.f14250b != null) {
            this.f14250b.mo593a(contentValues);
        }
    }
}
