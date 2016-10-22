package com.google.api.client.http;

import bc;
import com.google.api.client.util.GenericData;
import gwb;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import kfb;
import kfi;
import kfm;
import kfu;
import kfx;
import kfz;
import kgn;

public class HttpHeaders extends GenericData {
    @kfz(a = "Accept")
    private List<String> accept;
    @kfz(a = "Accept-Encoding")
    private List<String> acceptEncoding;
    @kfz(a = "Age")
    private List<Long> age;
    @kfz(a = "WWW-Authenticate")
    private List<String> authenticate;
    @kfz(a = "Authorization")
    private List<String> authorization;
    @kfz(a = "Cache-Control")
    private List<String> cacheControl;
    @kfz(a = "Content-Encoding")
    private List<String> contentEncoding;
    @kfz(a = "Content-Length")
    private List<Long> contentLength;
    @kfz(a = "Content-MD5")
    private List<String> contentMD5;
    @kfz(a = "Content-Range")
    private List<String> contentRange;
    @kfz(a = "Content-Type")
    private List<String> contentType;
    @kfz(a = "Cookie")
    private List<String> cookie;
    @kfz(a = "Date")
    private List<String> date;
    @kfz(a = "ETag")
    private List<String> etag;
    @kfz(a = "Expires")
    private List<String> expires;
    @kfz(a = "If-Match")
    private List<String> ifMatch;
    @kfz(a = "If-Modified-Since")
    private List<String> ifModifiedSince;
    @kfz(a = "If-None-Match")
    private List<String> ifNoneMatch;
    @kfz(a = "If-Range")
    private List<String> ifRange;
    @kfz(a = "If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @kfz(a = "Last-Modified")
    private List<String> lastModified;
    @kfz(a = "Location")
    private List<String> location;
    @kfz(a = "MIME-Version")
    private List<String> mimeVersion;
    @kfz(a = "Range")
    private List<String> range;
    @kfz(a = "Retry-After")
    private List<String> retryAfter;
    @kfz(a = "User-Agent")
    private List<String> userAgent;

    class HeaderParsingFakeLevelHttpRequest extends LowLevelHttpRequest {
        private final ParseHeaderState state;
        private final HttpHeaders target;

        HeaderParsingFakeLevelHttpRequest(HttpHeaders httpHeaders, ParseHeaderState parseHeaderState) {
            this.target = httpHeaders;
            this.state = parseHeaderState;
        }

        public void addHeader(String str, String str2) {
            this.target.parseHeader(str, str2, this.state);
        }

        public LowLevelHttpResponse execute() {
            throw new UnsupportedOperationException();
        }
    }

    final class ParseHeaderState {
        final kfb arrayValueMap;
        final kfi classInfo;
        final List<Type> context;
        final StringBuilder logger;

        public ParseHeaderState(HttpHeaders httpHeaders, StringBuilder stringBuilder) {
            this.context = Arrays.asList(new Type[]{httpHeaders.getClass()});
            this.classInfo = kfi.a(r0, true);
            this.logger = stringBuilder;
            this.arrayValueMap = new kfb(httpHeaders);
        }

        void finish() {
            this.arrayValueMap.a();
        }
    }

    public HttpHeaders() {
        super(EnumSet.of(kfx.IGNORE_CASE));
        this.acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    }

    public HttpHeaders clone() {
        return (HttpHeaders) super.clone();
    }

    public HttpHeaders set(String str, Object obj) {
        return (HttpHeaders) super.set(str, obj);
    }

    public final String getAccept() {
        return (String) getFirstHeaderValue(this.accept);
    }

    public HttpHeaders setAccept(String str) {
        this.accept = getAsList(str);
        return this;
    }

    public final String getAcceptEncoding() {
        return (String) getFirstHeaderValue(this.acceptEncoding);
    }

    public HttpHeaders setAcceptEncoding(String str) {
        this.acceptEncoding = getAsList(str);
        return this;
    }

    public final String getAuthorization() {
        return (String) getFirstHeaderValue(this.authorization);
    }

    public final List<String> getAuthorizationAsList() {
        return this.authorization;
    }

    public HttpHeaders setAuthorization(String str) {
        return setAuthorization(getAsList(str));
    }

    public HttpHeaders setAuthorization(List<String> list) {
        this.authorization = list;
        return this;
    }

    public final String getCacheControl() {
        return (String) getFirstHeaderValue(this.cacheControl);
    }

    public HttpHeaders setCacheControl(String str) {
        this.cacheControl = getAsList(str);
        return this;
    }

    public final String getContentEncoding() {
        return (String) getFirstHeaderValue(this.contentEncoding);
    }

    public HttpHeaders setContentEncoding(String str) {
        this.contentEncoding = getAsList(str);
        return this;
    }

    public final Long getContentLength() {
        return (Long) getFirstHeaderValue(this.contentLength);
    }

    public HttpHeaders setContentLength(Long l) {
        this.contentLength = getAsList(l);
        return this;
    }

    public final String getContentMD5() {
        return (String) getFirstHeaderValue(this.contentMD5);
    }

    public HttpHeaders setContentMD5(String str) {
        this.contentMD5 = getAsList(str);
        return this;
    }

    public final String getContentRange() {
        return (String) getFirstHeaderValue(this.contentRange);
    }

    public HttpHeaders setContentRange(String str) {
        this.contentRange = getAsList(str);
        return this;
    }

    public final String getContentType() {
        return (String) getFirstHeaderValue(this.contentType);
    }

    public HttpHeaders setContentType(String str) {
        this.contentType = getAsList(str);
        return this;
    }

    public final String getCookie() {
        return (String) getFirstHeaderValue(this.cookie);
    }

    public HttpHeaders setCookie(String str) {
        this.cookie = getAsList(str);
        return this;
    }

    public final String getDate() {
        return (String) getFirstHeaderValue(this.date);
    }

    public HttpHeaders setDate(String str) {
        this.date = getAsList(str);
        return this;
    }

    public final String getETag() {
        return (String) getFirstHeaderValue(this.etag);
    }

    public HttpHeaders setETag(String str) {
        this.etag = getAsList(str);
        return this;
    }

    public final String getExpires() {
        return (String) getFirstHeaderValue(this.expires);
    }

    public HttpHeaders setExpires(String str) {
        this.expires = getAsList(str);
        return this;
    }

    public final String getIfModifiedSince() {
        return (String) getFirstHeaderValue(this.ifModifiedSince);
    }

    public HttpHeaders setIfModifiedSince(String str) {
        this.ifModifiedSince = getAsList(str);
        return this;
    }

    public final String getIfMatch() {
        return (String) getFirstHeaderValue(this.ifMatch);
    }

    public HttpHeaders setIfMatch(String str) {
        this.ifMatch = getAsList(str);
        return this;
    }

    public final String getIfNoneMatch() {
        return (String) getFirstHeaderValue(this.ifNoneMatch);
    }

    public HttpHeaders setIfNoneMatch(String str) {
        this.ifNoneMatch = getAsList(str);
        return this;
    }

    public final String getIfUnmodifiedSince() {
        return (String) getFirstHeaderValue(this.ifUnmodifiedSince);
    }

    public HttpHeaders setIfUnmodifiedSince(String str) {
        this.ifUnmodifiedSince = getAsList(str);
        return this;
    }

    public final String getIfRange() {
        return (String) getFirstHeaderValue(this.ifRange);
    }

    public HttpHeaders setIfRange(String str) {
        this.ifRange = getAsList(str);
        return this;
    }

    public final String getLastModified() {
        return (String) getFirstHeaderValue(this.lastModified);
    }

    public HttpHeaders setLastModified(String str) {
        this.lastModified = getAsList(str);
        return this;
    }

    public final String getLocation() {
        return (String) getFirstHeaderValue(this.location);
    }

    public HttpHeaders setLocation(String str) {
        this.location = getAsList(str);
        return this;
    }

    public final String getMimeVersion() {
        return (String) getFirstHeaderValue(this.mimeVersion);
    }

    public HttpHeaders setMimeVersion(String str) {
        this.mimeVersion = getAsList(str);
        return this;
    }

    public final String getRange() {
        return (String) getFirstHeaderValue(this.range);
    }

    public HttpHeaders setRange(String str) {
        this.range = getAsList(str);
        return this;
    }

    public final String getRetryAfter() {
        return (String) getFirstHeaderValue(this.retryAfter);
    }

    public HttpHeaders setRetryAfter(String str) {
        this.retryAfter = getAsList(str);
        return this;
    }

    public final String getUserAgent() {
        return (String) getFirstHeaderValue(this.userAgent);
    }

    public HttpHeaders setUserAgent(String str) {
        this.userAgent = getAsList(str);
        return this;
    }

    public final String getAuthenticate() {
        return (String) getFirstHeaderValue(this.authenticate);
    }

    public final List<String> getAuthenticateAsList() {
        return this.authenticate;
    }

    public HttpHeaders setAuthenticate(String str) {
        this.authenticate = getAsList(str);
        return this;
    }

    public final Long getAge() {
        return (Long) getFirstHeaderValue(this.age);
    }

    public HttpHeaders setAge(Long l) {
        this.age = getAsList(l);
        return this;
    }

    public HttpHeaders setBasicAuthentication(String str, String str2) {
        String str3 = (String) bc.a((Object) str);
        String str4 = (String) bc.a((Object) str2);
        str4 = "Basic ";
        str3 = String.valueOf(gwb.g(kgn.a(new StringBuilder((String.valueOf(str3).length() + 1) + String.valueOf(str4).length()).append(str3).append(":").append(str4).toString())));
        return setAuthorization(str3.length() != 0 ? str4.concat(str3) : new String(str4));
    }

    private static void addHeader(Logger logger, StringBuilder stringBuilder, StringBuilder stringBuilder2, LowLevelHttpRequest lowLevelHttpRequest, String str, Object obj, Writer writer) {
        if (obj != null && !kfm.a(obj)) {
            String str2;
            String toStringValue = toStringValue(obj);
            if (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) {
                str2 = "<Not Logged>";
            } else {
                str2 = toStringValue;
            }
            if (stringBuilder != null) {
                stringBuilder.append(str).append(": ");
                stringBuilder.append(str2);
                stringBuilder.append(kgn.a);
            }
            if (stringBuilder2 != null) {
                stringBuilder2.append(" -H '").append(str).append(": ").append(str2).append("'");
            }
            if (lowLevelHttpRequest != null) {
                lowLevelHttpRequest.addHeader(str, toStringValue);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(toStringValue);
                writer.write("\r\n");
            }
        }
    }

    private static String toStringValue(Object obj) {
        return obj instanceof Enum ? kfu.a((Enum) obj).b() : obj.toString();
    }

    static void serializeHeaders(HttpHeaders httpHeaders, StringBuilder stringBuilder, StringBuilder stringBuilder2, Logger logger, LowLevelHttpRequest lowLevelHttpRequest) {
        serializeHeaders(httpHeaders, stringBuilder, stringBuilder2, logger, lowLevelHttpRequest, null);
    }

    public static void serializeHeadersForMultipartRequests(HttpHeaders httpHeaders, StringBuilder stringBuilder, Logger logger, Writer writer) {
        serializeHeaders(httpHeaders, stringBuilder, null, logger, null, writer);
    }

    static void serializeHeaders(HttpHeaders httpHeaders, StringBuilder stringBuilder, StringBuilder stringBuilder2, Logger logger, LowLevelHttpRequest lowLevelHttpRequest, Writer writer) {
        HashSet hashSet = new HashSet();
        for (Entry entry : httpHeaders.entrySet()) {
            String str = (String) entry.getKey();
            bc.a(hashSet.add(str), "multiple headers of the same name (headers are case insensitive): %s", str);
            Object value = entry.getValue();
            if (value != null) {
                String b;
                kfu a = httpHeaders.getClassInfo().a(str);
                if (a != null) {
                    b = a.b();
                } else {
                    b = str;
                }
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object value2 : gwb.M(value2)) {
                        addHeader(logger, stringBuilder, stringBuilder2, lowLevelHttpRequest, b, value2, writer);
                    }
                } else {
                    addHeader(logger, stringBuilder, stringBuilder2, lowLevelHttpRequest, b, value2, writer);
                }
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    public final void fromHttpResponse(LowLevelHttpResponse lowLevelHttpResponse, StringBuilder stringBuilder) {
        clear();
        ParseHeaderState parseHeaderState = new ParseHeaderState(this, stringBuilder);
        int headerCount = lowLevelHttpResponse.getHeaderCount();
        for (int i = 0; i < headerCount; i++) {
            parseHeader(lowLevelHttpResponse.getHeaderName(i), lowLevelHttpResponse.getHeaderValue(i), parseHeaderState);
        }
        parseHeaderState.finish();
    }

    private <T> T getFirstHeaderValue(List<T> list) {
        return list == null ? null : list.get(0);
    }

    private <T> List<T> getAsList(T t) {
        if (t == null) {
            return null;
        }
        List<T> arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    public String getFirstHeaderStringValue(String str) {
        Object obj = get(str.toLowerCase());
        if (obj == null) {
            return null;
        }
        Class cls = obj.getClass();
        if ((obj instanceof Iterable) || cls.isArray()) {
            Iterator it = gwb.M(obj).iterator();
            if (it.hasNext()) {
                return toStringValue(it.next());
            }
        }
        return toStringValue(obj);
    }

    public List<String> getHeaderStringValues(String str) {
        Object obj = get(str.toLowerCase());
        if (obj == null) {
            return Collections.emptyList();
        }
        Class cls = obj.getClass();
        if (!(obj instanceof Iterable) && !cls.isArray()) {
            return Collections.singletonList(toStringValue(obj));
        }
        List arrayList = new ArrayList();
        for (Object toStringValue : gwb.M(obj)) {
            arrayList.add(toStringValue(toStringValue));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void fromHttpHeaders(HttpHeaders httpHeaders) {
        try {
            ParseHeaderState parseHeaderState = new ParseHeaderState(this, null);
            serializeHeaders(httpHeaders, null, null, null, new HeaderParsingFakeLevelHttpRequest(this, parseHeaderState));
            parseHeaderState.finish();
        } catch (Throwable e) {
            throw gwb.a(e);
        }
    }

    void parseHeader(String str, String str2, ParseHeaderState parseHeaderState) {
        List list = parseHeaderState.context;
        kfi kfi = parseHeaderState.classInfo;
        kfb kfb = parseHeaderState.arrayValueMap;
        StringBuilder stringBuilder = parseHeaderState.logger;
        if (stringBuilder != null) {
            stringBuilder.append(new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(str2).length()).append(str).append(": ").append(str2).toString()).append(kgn.a);
        }
        kfu a = kfi.a(str);
        if (a != null) {
            Type a2 = kfm.a(list, a.c());
            if (gwb.a(a2)) {
                Object a3 = gwb.a(list, gwb.b(a2));
                kfb.a(a.a(), a3, parseValue(a3, list, str2));
                return;
            } else if (gwb.a(gwb.a(list, a2), Iterable.class)) {
                Collection collection = (Collection) a.a((Object) this);
                if (collection == null) {
                    collection = kfm.b(a2);
                    a.a((Object) this, (Object) collection);
                }
                collection.add(parseValue(a2 == Object.class ? null : gwb.c(a2), list, str2));
                return;
            } else {
                a.a((Object) this, parseValue(a2, list, str2));
                return;
            }
        }
        ArrayList arrayList = (ArrayList) get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            set(str, (Object) arrayList);
        }
        arrayList.add(str2);
    }

    private static Object parseValue(Type type, List<Type> list, String str) {
        return kfm.a(kfm.a((List) list, type), str);
    }
}
