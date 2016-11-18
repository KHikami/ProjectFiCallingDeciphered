package defpackage;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

final class byl implements ContentHandler {
    private final ContentHandler a;
    private Attributes b;

    byl(ContentHandler contentHandler) {
        this.a = contentHandler;
    }

    Attributes a() {
        return this.b;
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.b = attributes;
        this.a.startElement(str, str2, str3, attributes);
    }

    public void endElement(String str, String str2, String str3) {
        this.a.endElement(str, str2, str3);
    }

    public void setDocumentLocator(Locator locator) {
        this.a.setDocumentLocator(locator);
    }

    public void startDocument() {
        this.a.startDocument();
    }

    public void endDocument() {
        this.a.endDocument();
    }

    public void startPrefixMapping(String str, String str2) {
        this.a.startPrefixMapping(str, str2);
    }

    public void endPrefixMapping(String str) {
        this.a.endPrefixMapping(str);
    }

    public void characters(char[] cArr, int i, int i2) {
        this.a.characters(cArr, i, i2);
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) {
        this.a.ignorableWhitespace(cArr, i, i2);
    }

    public void processingInstruction(String str, String str2) {
        this.a.processingInstruction(str, str2);
    }

    public void skippedEntity(String str) {
        this.a.skippedEntity(str);
    }
}
