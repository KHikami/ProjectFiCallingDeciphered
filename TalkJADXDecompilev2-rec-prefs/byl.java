package p000;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

final class byl implements ContentHandler {
    private final ContentHandler f4772a;
    private Attributes f4773b;

    byl(ContentHandler contentHandler) {
        this.f4772a = contentHandler;
    }

    Attributes m6912a() {
        return this.f4773b;
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f4773b = attributes;
        this.f4772a.startElement(str, str2, str3, attributes);
    }

    public void endElement(String str, String str2, String str3) {
        this.f4772a.endElement(str, str2, str3);
    }

    public void setDocumentLocator(Locator locator) {
        this.f4772a.setDocumentLocator(locator);
    }

    public void startDocument() {
        this.f4772a.startDocument();
    }

    public void endDocument() {
        this.f4772a.endDocument();
    }

    public void startPrefixMapping(String str, String str2) {
        this.f4772a.startPrefixMapping(str, str2);
    }

    public void endPrefixMapping(String str) {
        this.f4772a.endPrefixMapping(str);
    }

    public void characters(char[] cArr, int i, int i2) {
        this.f4772a.characters(cArr, i, i2);
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) {
        this.f4772a.ignorableWhitespace(cArr, i, i2);
    }

    public void processingInstruction(String str, String str2) {
        this.f4772a.processingInstruction(str, str2);
    }

    public void skippedEntity(String str) {
        this.f4772a.skippedEntity(str);
    }
}
