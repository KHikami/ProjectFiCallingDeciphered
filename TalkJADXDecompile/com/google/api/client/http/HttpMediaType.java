package com.google.api.client.http;

import bc;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HttpMediaType {
    private static final Pattern FULL_MEDIA_TYPE_REGEX;
    private static final Pattern PARAMETER_REGEX;
    private static final Pattern TOKEN_REGEX;
    private static final Pattern TYPE_REGEX;
    private String cachedBuildResult;
    private final SortedMap<String, String> parameters;
    private String subType;
    private String type;

    static {
        TYPE_REGEX = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
        TOKEN_REGEX = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
        String str = "[^\\s/=;\"]+";
        String str2 = ";.*";
        FULL_MEDIA_TYPE_REGEX = Pattern.compile(new StringBuilder(((String.valueOf(str).length() + 14) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("\\s*(").append(str).append(")/(").append(str).append(")\\s*(").append(str2).append(")?").toString(), 32);
        str2 = "\"([^\"]*)\"";
        String str3 = "[^\\s;\"]*";
        str2 = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str3).length()).append(str2).append("|").append(str3).toString();
        PARAMETER_REGEX = Pattern.compile(new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(str2).length()).append("\\s*;\\s*(").append(str).append(")=(").append(str2).append(")").toString());
    }

    public HttpMediaType(String str, String str2) {
        this.type = "application";
        this.subType = "octet-stream";
        this.parameters = new TreeMap();
        setType(str);
        setSubType(str2);
    }

    public HttpMediaType(String str) {
        this.type = "application";
        this.subType = "octet-stream";
        this.parameters = new TreeMap();
        fromString(str);
    }

    public HttpMediaType setType(String str) {
        bc.a(TYPE_REGEX.matcher(str).matches(), (Object) "Type contains reserved characters");
        this.type = str;
        this.cachedBuildResult = null;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public HttpMediaType setSubType(String str) {
        bc.a(TYPE_REGEX.matcher(str).matches(), (Object) "Subtype contains reserved characters");
        this.subType = str;
        this.cachedBuildResult = null;
        return this;
    }

    public String getSubType() {
        return this.subType;
    }

    private HttpMediaType fromString(String str) {
        Matcher matcher = FULL_MEDIA_TYPE_REGEX.matcher(str);
        bc.a(matcher.matches(), (Object) "Type must be in the 'maintype/subtype; parameter=value' format");
        setType(matcher.group(1));
        setSubType(matcher.group(2));
        CharSequence group = matcher.group(3);
        if (group != null) {
            Matcher matcher2 = PARAMETER_REGEX.matcher(group);
            while (matcher2.find()) {
                String group2 = matcher2.group(1);
                String group3 = matcher2.group(3);
                if (group3 == null) {
                    group3 = matcher2.group(2);
                }
                setParameter(group2, group3);
            }
        }
        return this;
    }

    public HttpMediaType setParameter(String str, String str2) {
        if (str2 == null) {
            removeParameter(str);
        } else {
            bc.a(TOKEN_REGEX.matcher(str).matches(), (Object) "Name contains reserved characters");
            this.cachedBuildResult = null;
            this.parameters.put(str.toLowerCase(), str2);
        }
        return this;
    }

    public String getParameter(String str) {
        return (String) this.parameters.get(str.toLowerCase());
    }

    public HttpMediaType removeParameter(String str) {
        this.cachedBuildResult = null;
        this.parameters.remove(str.toLowerCase());
        return this;
    }

    public void clearParameters() {
        this.cachedBuildResult = null;
        this.parameters.clear();
    }

    public Map<String, String> getParameters() {
        return Collections.unmodifiableMap(this.parameters);
    }

    static boolean matchesToken(String str) {
        return TOKEN_REGEX.matcher(str).matches();
    }

    private static String quoteString(String str) {
        String replace = str.replace("\\", "\\\\").replace("\"", "\\\"");
        return new StringBuilder(String.valueOf(replace).length() + 2).append("\"").append(replace).append("\"").toString();
    }

    public String build() {
        if (this.cachedBuildResult != null) {
            return this.cachedBuildResult;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.type);
        stringBuilder.append('/');
        stringBuilder.append(this.subType);
        if (this.parameters != null) {
            for (Entry entry : this.parameters.entrySet()) {
                String str = (String) entry.getValue();
                stringBuilder.append("; ");
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append("=");
                if (!matchesToken(str)) {
                    str = quoteString(str);
                }
                stringBuilder.append(str);
            }
        }
        this.cachedBuildResult = stringBuilder.toString();
        return this.cachedBuildResult;
    }

    public String toString() {
        return build();
    }

    public boolean equalsIgnoreParameters(HttpMediaType httpMediaType) {
        return httpMediaType != null && getType().equalsIgnoreCase(httpMediaType.getType()) && getSubType().equalsIgnoreCase(httpMediaType.getSubType());
    }

    public static boolean equalsIgnoreParameters(String str, String str2) {
        return (str == null && str2 == null) || !(str == null || str2 == null || !new HttpMediaType(str).equalsIgnoreParameters(new HttpMediaType(str2)));
    }

    public HttpMediaType setCharsetParameter(Charset charset) {
        setParameter("charset", charset == null ? null : charset.name());
        return this;
    }

    public Charset getCharsetParameter() {
        String parameter = getParameter("charset");
        return parameter == null ? null : Charset.forName(parameter);
    }

    public int hashCode() {
        return build().hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpMediaType)) {
            return false;
        }
        HttpMediaType httpMediaType = (HttpMediaType) obj;
        if (equalsIgnoreParameters(httpMediaType) && this.parameters.equals(httpMediaType.parameters)) {
            return true;
        }
        return false;
    }
}
