package p000;

import java.io.InputStream;

public final class olh<ReqT, RespT> {
    private final olj f33156a;
    private final String f33157b;
    private final oli<ReqT> f33158c;
    private final oli<RespT> f33159d;
    private final boolean f33160e = false;

    public static <RequestT, ResponseT> olh<RequestT, ResponseT> m38674a(olj olj, String str, oli<RequestT> oli_RequestT, oli<ResponseT> oli_ResponseT) {
        return new olh(olj, str, oli_RequestT, oli_ResponseT, false);
    }

    private olh(olj olj, String str, oli<ReqT> oli_ReqT, oli<RespT> oli_RespT, boolean z) {
        this.f33156a = (olj) bm.a(olj, "type");
        this.f33157b = (String) bm.a(str, "fullMethodName");
        this.f33158c = (oli) bm.a(oli_ReqT, "requestMarshaller");
        this.f33159d = (oli) bm.a(oli_RespT, "responseMarshaller");
    }

    public olj m38677a() {
        return this.f33156a;
    }

    public String m38678b() {
        return this.f33157b;
    }

    public RespT m38676a(InputStream inputStream) {
        return this.f33159d.a(inputStream);
    }

    public InputStream m38675a(ReqT reqT) {
        return this.f33158c.a(reqT);
    }

    public boolean m38679c() {
        return this.f33160e;
    }

    public static String m38673a(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append("/").append(str2).toString();
    }
}
