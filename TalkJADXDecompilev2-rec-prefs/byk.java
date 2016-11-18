package p000;

import android.text.Editable;
import android.text.Html.TagHandler;
import org.xml.sax.XMLReader;

public final class byk implements TagHandler {
    private byl f4771a;

    public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (z && str.equalsIgnoreCase("injectattributecache")) {
            this.f4771a = new byl(xMLReader.getContentHandler());
            xMLReader.setContentHandler(this.f4771a);
        } else if (str.equalsIgnoreCase("usermention")) {
            int length = editable.length();
            if (z) {
                editable.setSpan(new byi(), length, length, 17);
                return;
            }
            Object obj;
            Object[] spans = editable.getSpans(0, editable.length(), byi.class);
            if (spans.length == 0) {
                obj = null;
            } else {
                obj = spans[spans.length - 1];
            }
            int spanStart = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            String value = this.f4771a.m6912a().getValue("id");
            String value2 = this.f4771a.m6912a().getValue("email");
            if (spanStart != length) {
                editable.setSpan(new byi(value, value2), spanStart, length, 33);
            }
        }
    }
}
