package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.api.client.http.HttpStatusCodes;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class ajd {
    public static final char[] f997a = "0123456789ABCDEF".toCharArray();
    private static final String f998b;
    private static final Pattern f999c = Pattern.compile("##(\\S+)##");

    static {
        Locale locale = Locale.getDefault();
        StringBuilder stringBuilder = new StringBuilder();
        String language = locale.getLanguage();
        if (language == null) {
            language = null;
        } else if ("iw".equals(language)) {
            language = "he";
        } else if ("in".equals(language)) {
            language = "id";
        } else if ("ji".equals(language)) {
            language = "yi";
        }
        if (language != null) {
            stringBuilder.append(language);
            language = locale.getCountry();
            if (language != null) {
                stringBuilder.append("-");
                stringBuilder.append(language);
            }
        }
        if (!Locale.US.equals(locale)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("en-US");
        }
        f998b = stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m2607a(Context context, long j, String str, byte[] bArr, int i, boolean z, String str2, int i2, boolean z2) {
        ajg a;
        Exception e;
        Throwable th;
        if (str == null) {
            throw new IllegalArgumentException("URL must not be null.");
        }
        try {
            URI uri = new URI(str);
            HttpHost httpHost = new HttpHost(uri.getHost(), uri.getPort(), "http");
            a = ajg.m2635a(ajf.m2609a().mo2123g(), context, z2);
            HttpParams params = a.getParams();
            HttpProtocolParams.setContentCharset(params, "UTF-8");
            HttpConnectionParams.setSoTimeout(params, ajf.m2609a().mo2131o());
            switch (i) {
                case 1:
                    try {
                        HttpEntity ajo = new ajo(context, -1, bArr);
                        ajo.setContentType("application/vnd.wap.mms-message");
                        HttpPost httpPost = new HttpPost(str);
                        httpPost.setEntity(ajo);
                        HttpRequest httpRequest = httpPost;
                        break;
                    } catch (URISyntaxException e2) {
                        e = e2;
                        try {
                            ajd.m2606a(e);
                            if (a != null) {
                                a.m2638a();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (a != null) {
                                a.m2638a();
                            }
                            throw th;
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        ajd.m2606a(e);
                        if (a != null) {
                            a.m2638a();
                        }
                        return null;
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        ajd.m2606a(e);
                        if (a != null) {
                            a.m2638a();
                        }
                        return null;
                    } catch (SocketException e5) {
                        e = e5;
                        ajd.m2606a(e);
                        if (a != null) {
                            a.m2638a();
                        }
                        return null;
                    } catch (Exception e6) {
                        e = e6;
                        ajd.m2606a(e);
                        if (a != null) {
                            a.m2638a();
                        }
                        return null;
                    }
                case 2:
                    Object httpGet = new HttpGet(str);
                    break;
                default:
                    if (a != null) {
                        a.m2638a();
                    }
                    return null;
            }
        } catch (URISyntaxException e7) {
            e = e7;
            a = null;
            ajd.m2606a(e);
            if (a != null) {
                a.m2638a();
            }
            return null;
        } catch (IllegalStateException e8) {
            e = e8;
            a = null;
            ajd.m2606a(e);
            if (a != null) {
                a.m2638a();
            }
            return null;
        } catch (IllegalArgumentException e9) {
            e = e9;
            a = null;
            ajd.m2606a(e);
            if (a != null) {
                a.m2638a();
            }
            return null;
        } catch (SocketException e10) {
            e = e10;
            a = null;
            ajd.m2606a(e);
            if (a != null) {
                a.m2638a();
            }
            return null;
        } catch (Exception e11) {
            e = e11;
            a = null;
            ajd.m2606a(e);
            if (a != null) {
                a.m2638a();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.m2638a();
            }
            throw th;
        }
        int i3;
        int i4;
        Object obj;
        DataInputStream dataInputStream;
        int i5;
        StringBuilder stringBuilder;
        if (i3 == -1 && i4 > 0 && r4 == null) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(obj, 0, bArr2, 0, i4);
        }
        try {
            dataInputStream.close();
        } catch (IOException e12) {
        }
        if (r10 != null) {
            r10.consumeContent();
        }
        if (r9.getStatusCode() == HttpStatusCodes.STATUS_CODE_OK) {
            stringBuilder = new StringBuilder();
            if (bArr2 != null) {
                stringBuilder.append("response: text=").append(new String(bArr2)).append('\n');
            }
            for (Header header : r8.getAllHeaders()) {
                if (header == null) {
                    stringBuilder.append("header: ").append(header.getName()).append('=').append(header.getValue()).append('\n');
                }
            }
            String str3 = "HTTP error: ";
            String valueOf = String.valueOf(r9.getReasonPhrase());
            throw new IOException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        } else if (a != null) {
            return bArr2;
        } else {
            a.m2638a();
            return bArr2;
        }
        if (r10 != null) {
            r10.consumeContent();
        }
        if (r9.getStatusCode() == HttpStatusCodes.STATUS_CODE_OK) {
            stringBuilder = new StringBuilder();
            if (bArr2 != null) {
                stringBuilder.append("response: text=").append(new String(bArr2)).append('\n');
            }
            for (i5 = 0; i5 < i3; i5++) {
                if (header == null) {
                    stringBuilder.append("header: ").append(header.getName()).append('=').append(header.getValue()).append('\n');
                }
            }
            String str32 = "HTTP error: ";
            String valueOf2 = String.valueOf(r9.getReasonPhrase());
            if (valueOf2.length() != 0) {
            }
            throw new IOException(valueOf2.length() != 0 ? str32.concat(valueOf2) : new String(str32));
        } else if (a != null) {
            return bArr2;
        } else {
            a.m2638a();
            return bArr2;
        }
        if (r10.isChunked()) {
            int e13 = ajf.m2609a().mo2121e();
            obj = new byte[e13];
            dataInputStream = new DataInputStream(r10.getContent());
            i3 = 0;
            i4 = 0;
            Object obj2 = null;
            do {
                try {
                    i3 = dataInputStream.read(obj, i4, e13);
                    if (i3 > 0) {
                        e13 -= i3;
                        i4 += i3;
                    }
                    if (i3 >= 0) {
                    }
                } catch (IOException e14) {
                    obj2 = 1;
                }
                byte[] bArr22 = new byte[i4];
                System.arraycopy(obj, 0, bArr22, 0, i4);
                dataInputStream.close();
            } while (e13 > 0);
            byte[] bArr222 = new byte[i4];
            System.arraycopy(obj, 0, bArr222, 0, i4);
            dataInputStream.close();
        }
        if (r10 != null) {
            r10.consumeContent();
        }
        if (r9.getStatusCode() == HttpStatusCodes.STATUS_CODE_OK) {
            stringBuilder = new StringBuilder();
            if (bArr222 != null) {
                stringBuilder.append("response: text=").append(new String(bArr222)).append('\n');
            }
            for (i5 = 0; i5 < i3; i5++) {
                if (header == null) {
                    stringBuilder.append("header: ").append(header.getName()).append('=').append(header.getValue()).append('\n');
                }
            }
            String str322 = "HTTP error: ";
            String valueOf22 = String.valueOf(r9.getReasonPhrase());
            if (valueOf22.length() != 0) {
            }
            throw new IOException(valueOf22.length() != 0 ? str322.concat(valueOf22) : new String(str322));
        } else if (a != null) {
            return bArr222;
        } else {
            a.m2638a();
            return bArr222;
        }
    }

    private static void m2606a(Exception exception) {
        IOException iOException = new IOException(exception.getMessage());
        iOException.initCause(exception);
        throw iOException;
    }

    private static String m2605a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f999c.matcher(str);
        int i = 0;
        StringBuilder stringBuilder = null;
        while (matcher.find()) {
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            int start = matcher.start();
            if (start > i) {
                stringBuilder.append(str.substring(i, start));
            }
            String b = ajf.m2609a().mo2118b(matcher.group(1));
            if (b != null) {
                stringBuilder.append(b);
            }
            i = matcher.end();
        }
        if (stringBuilder != null && i < str.length()) {
            stringBuilder.append(str.substring(i));
        }
        return stringBuilder != null ? stringBuilder.toString() : str;
    }
}
