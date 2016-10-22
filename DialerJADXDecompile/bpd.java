import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public class bpd extends bno {
    private bpe a;

    public bpd(bnp bnp, bpe bpe) {
        super(bnp);
        this.a = bpe;
    }

    private final fr a(XmlResourceParser xmlResourceParser) {
        Object trim;
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String toLowerCase = xmlResourceParser.getName().toLowerCase();
                    String trim2;
                    if (toLowerCase.equals("screenname")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim2 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim2))) {
                            this.a.a(toLowerCase, trim2);
                        }
                    } else if (toLowerCase.equals("string")) {
                        Object attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        trim2 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(attributeValue) || trim2 == null)) {
                            this.a.b(attributeValue, trim2);
                        }
                    } else if (toLowerCase.equals("bool")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.a.a(toLowerCase, Boolean.parseBoolean(trim));
                            } catch (NumberFormatException e) {
                                c("Error parsing bool configuration value", trim, e);
                            }
                        }
                    } else if (toLowerCase.equals("integer")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.a.a(toLowerCase, Integer.parseInt(trim));
                            } catch (NumberFormatException e2) {
                                c("Error parsing int configuration value", trim, e2);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            e("Error parsing tracker configuration file", e3);
        } catch (IOException e4) {
            e("Error parsing tracker configuration file", e4);
        }
        return this.a.a();
    }

    public final fr a(int i) {
        try {
            return a(this.f.b.getResources().getXml(i));
        } catch (NotFoundException e) {
            d("inflate() called with unknown resourceId", e);
            return null;
        }
    }

    public bpd(bnp bnp) {
        this(bnp, new bph(bnp));
    }

    public bpd(bnp bnp, byte b) {
        this(bnp, new bpo(bnp));
    }
}
