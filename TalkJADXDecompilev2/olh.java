package defpackage;

import java.io.InputStream;

public final class olh<ReqT, RespT> {
    private final olj a;
    private final String b;
    private final oli<ReqT> c;
    private final oli<RespT> d;
    private final boolean e = false;

    public static <RequestT, ResponseT> olh<RequestT, ResponseT> a(olj olj, String str, oli<RequestT> oli_RequestT, oli<ResponseT> oli_ResponseT) {
        return new olh(olj, str, oli_RequestT, oli_ResponseT, false);
    }

    private olh(olj olj, String str, oli<ReqT> oli_ReqT, oli<RespT> oli_RespT, boolean z) {
        this.a = (olj) bm.a(olj, "type");
        this.b = (String) bm.a(str, "fullMethodName");
        this.c = (oli) bm.a(oli_ReqT, "requestMarshaller");
        this.d = (oli) bm.a(oli_RespT, "responseMarshaller");
    }

    public olj a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public RespT a(InputStream inputStream) {
        return this.d.a(inputStream);
    }

    public InputStream a(ReqT reqT) {
        return this.c.a(reqT);
    }

    public boolean c() {
        return this.e;
    }

    public static String a(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("/").append(str2).toString();
    }
}
