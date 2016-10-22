package com.google.api.client.http;

import bc;
import com.google.api.client.util.GenericData;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import kgr;
import kgs;
import kgt;

public class GenericUrl extends GenericData {
    private static final kgs URI_FRAGMENT_ESCAPER;
    private String fragment;
    private String host;
    private List<String> pathParts;
    private int port;
    private String scheme;
    private String userInfo;

    static {
        URI_FRAGMENT_ESCAPER = new kgt("=&-_.!~*'()@:$,;/?:", false);
    }

    public GenericUrl() {
        this.port = -1;
    }

    public GenericUrl(String str) {
        this(parseURL(str));
    }

    public GenericUrl(URI uri) {
        this(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getRawPath(), uri.getRawFragment(), uri.getRawQuery(), uri.getRawUserInfo());
    }

    public GenericUrl(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    private GenericUrl(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        String str7 = null;
        this.port = -1;
        this.scheme = str.toLowerCase();
        this.host = str2;
        this.port = i;
        this.pathParts = toPathParts(str3);
        this.fragment = str4 != null ? kgr.a(str4) : null;
        if (str5 != null) {
            UrlEncodedParser.parse(str5, (Object) this);
        }
        if (str6 != null) {
            str7 = kgr.a(str6);
        }
        this.userInfo = str7;
    }

    public int hashCode() {
        return build().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof GenericUrl)) {
            return false;
        }
        return build().equals(((GenericUrl) obj).toString());
    }

    public String toString() {
        return build();
    }

    public GenericUrl clone() {
        GenericUrl genericUrl = (GenericUrl) super.clone();
        if (this.pathParts != null) {
            genericUrl.pathParts = new ArrayList(this.pathParts);
        }
        return genericUrl;
    }

    public GenericUrl set(String str, Object obj) {
        return (GenericUrl) super.set(str, obj);
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final void setScheme(String str) {
        this.scheme = (String) bc.a((Object) str);
    }

    public String getHost() {
        return this.host;
    }

    public final void setHost(String str) {
        this.host = (String) bc.a((Object) str);
    }

    public final String getUserInfo() {
        return this.userInfo;
    }

    public final void setUserInfo(String str) {
        this.userInfo = str;
    }

    public int getPort() {
        return this.port;
    }

    public final void setPort(int i) {
        bc.a(i >= -1, (Object) "expected port >= -1");
        this.port = i;
    }

    public List<String> getPathParts() {
        return this.pathParts;
    }

    public void setPathParts(List<String> list) {
        this.pathParts = list;
    }

    public String getFragment() {
        return this.fragment;
    }

    public final void setFragment(String str) {
        this.fragment = str;
    }

    public final String build() {
        String valueOf = String.valueOf(buildAuthority());
        String valueOf2 = String.valueOf(buildRelativeUrl());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final String buildAuthority() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String) bc.a(this.scheme));
        stringBuilder.append("://");
        if (this.userInfo != null) {
            stringBuilder.append(kgr.d.a(this.userInfo)).append('@');
        }
        stringBuilder.append((String) bc.a(this.host));
        int i = this.port;
        if (i != -1) {
            stringBuilder.append(':').append(i);
        }
        return stringBuilder.toString();
    }

    public final String buildRelativeUrl() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.pathParts != null) {
            appendRawPathFromParts(stringBuilder);
        }
        addQueryParams(entrySet(), stringBuilder);
        String str = this.fragment;
        if (str != null) {
            stringBuilder.append('#').append(URI_FRAGMENT_ESCAPER.a(str));
        }
        return stringBuilder.toString();
    }

    public final URI toURI() {
        return toURI(build());
    }

    public final URL toURL() {
        return parseURL(build());
    }

    public final URL toURL(String str) {
        try {
            return new URL(toURL(), str);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Object getFirst(String str) {
        Object obj = get(str);
        if (!(obj instanceof Collection)) {
            return obj;
        }
        Iterator it = ((Collection) obj).iterator();
        return it.hasNext() ? it.next() : null;
    }

    public Collection<Object> getAll(String str) {
        Object obj = get(str);
        if (obj == null) {
            return Collections.emptySet();
        }
        if (obj instanceof Collection) {
            return Collections.unmodifiableCollection((Collection) obj);
        }
        return Collections.singleton(obj);
    }

    public String getRawPath() {
        if (this.pathParts == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        appendRawPathFromParts(stringBuilder);
        return stringBuilder.toString();
    }

    public void setRawPath(String str) {
        this.pathParts = toPathParts(str);
    }

    public void appendRawPath(String str) {
        if (str != null && str.length() != 0) {
            List toPathParts = toPathParts(str);
            if (this.pathParts == null || this.pathParts.isEmpty()) {
                this.pathParts = toPathParts;
                return;
            }
            int size = this.pathParts.size();
            List list = this.pathParts;
            int i = size - 1;
            String valueOf = String.valueOf((String) this.pathParts.get(size - 1));
            String valueOf2 = String.valueOf((String) toPathParts.get(0));
            list.set(i, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            this.pathParts.addAll(toPathParts.subList(1, toPathParts.size()));
        }
    }

    public static List<String> toPathParts(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        List<String> arrayList = new ArrayList();
        Object obj = 1;
        int i = 0;
        while (obj != null) {
            String substring;
            int indexOf = str.indexOf(47, i);
            obj = indexOf != -1 ? 1 : null;
            if (obj != null) {
                substring = str.substring(i, indexOf);
            } else {
                substring = str.substring(i);
            }
            arrayList.add(kgr.a(substring));
            i = indexOf + 1;
        }
        return arrayList;
    }

    private void appendRawPathFromParts(StringBuilder stringBuilder) {
        int size = this.pathParts.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.pathParts.get(i);
            if (i != 0) {
                stringBuilder.append('/');
            }
            if (str.length() != 0) {
                stringBuilder.append(kgr.b.a(str));
            }
        }
    }

    static void addQueryParams(Set<Entry<String, Object>> set, StringBuilder stringBuilder) {
        boolean z = true;
        for (Entry entry : set) {
            boolean z2;
            Object value = entry.getValue();
            if (value != null) {
                String a = kgr.e.a((String) entry.getKey());
                if (value instanceof Collection) {
                    z2 = z;
                    for (Object appendParam : (Collection) value) {
                        z2 = appendParam(z2, stringBuilder, a, appendParam);
                    }
                    z = z2;
                } else {
                    z2 = appendParam(z, stringBuilder, a, value);
                }
            } else {
                z2 = z;
            }
            z = z2;
        }
    }

    private static boolean appendParam(boolean z, StringBuilder stringBuilder, String str, Object obj) {
        if (z) {
            z = false;
            stringBuilder.append('?');
        } else {
            stringBuilder.append('&');
        }
        stringBuilder.append(str);
        String a = kgr.e.a(obj.toString());
        if (a.length() != 0) {
            stringBuilder.append('=').append(a);
        }
        return z;
    }

    private static URI toURI(String str) {
        try {
            return new URI(str);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static URL parseURL(String str) {
        try {
            return new URL(str);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }
}
