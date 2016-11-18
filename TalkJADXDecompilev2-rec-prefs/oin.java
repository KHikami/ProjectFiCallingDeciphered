package p000;

import java.util.HashMap;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

final class oin extends DefaultHandler {
    HashMap<String, String> f32998a = new HashMap();
    Stack<oio> f32999b = new Stack();

    oin() {
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        String value = attributes.getValue("id");
        if (value != null) {
            this.f32999b.push(new oio(this, value));
        }
        if (this.f32999b.size() > 0) {
            oio oio = (oio) this.f32999b.lastElement();
            oio.f33001b++;
            StringBuilder stringBuilder = oio.f33002c;
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
        if (this.f32999b.size() > 0) {
            oio oio = (oio) this.f32999b.lastElement();
            oio.f33002c.append("</");
            oio.f33002c.append(str2);
            oio.f33002c.append(">");
            oio.f33001b--;
            if (oio.f33001b == 0) {
                String stringBuilder = oio.f33002c.toString();
                this.f32998a.put(oio.f33000a, stringBuilder);
                this.f32999b.pop();
                if (this.f32999b.size() > 0) {
                    ((oio) this.f32999b.lastElement()).f33002c.append(stringBuilder);
                }
            }
        }
    }
}
