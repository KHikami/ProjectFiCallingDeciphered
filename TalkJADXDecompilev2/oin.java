package defpackage;

import java.util.HashMap;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class oin extends DefaultHandler {
    HashMap<String, String> a = new HashMap();
    Stack<oio> b = new Stack();

    oin() {
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        String value = attributes.getValue("id");
        if (value != null) {
            this.b.push(new oio(this, value));
        }
        if (this.b.size() > 0) {
            oio oio = (oio) this.b.lastElement();
            oio.b++;
            StringBuilder stringBuilder = oio.c;
            stringBuilder.append("<");
            stringBuilder.append(str2);
            for (int i = 0; i < attributes.getLength(); i++) {
                stringBuilder.append(" ");
                stringBuilder.append(attributes.getQName(i));
                stringBuilder.append("='");
                stringBuilder.append(attributes.getValue(i).replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;"));
                stringBuilder.append("'");
            }
            stringBuilder.append(">");
        }
    }

    public void endElement(String str, String str2, String str3) {
        if (this.b.size() > 0) {
            oio oio = (oio) this.b.lastElement();
            oio.c.append("</");
            oio.c.append(str2);
            oio.c.append(">");
            oio.b--;
            if (oio.b == 0) {
                String stringBuilder = oio.c.toString();
                this.a.put(oio.a, stringBuilder);
                this.b.pop();
                if (this.b.size() > 0) {
                    ((oio) this.b.lastElement()).c.append(stringBuilder);
                }
            }
        }
    }
}
