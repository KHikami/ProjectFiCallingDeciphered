package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

public final class dtv extends gpf {
    public dtv(Context context) {
        this(context, null);
    }

    private dtv(Context context, AttributeSet attributeSet) {
        super(context, null);
    }

    public static boolean m12687b(String str) {
        try {
            String toLowerCase = new URL(str).getHost().toLowerCase(Locale.getDefault());
            if (!toLowerCase.equals("www.youtube.com") && !toLowerCase.equals("youtube.com") && !toLowerCase.equals("m.youtube.com") && !toLowerCase.equals("youtube.googleapis.com") && !toLowerCase.equals("youtu.be") && !toLowerCase.equals("gaming.youtu.be") && !toLowerCase.equals("music.youtu.be") && !toLowerCase.equals("go.youtu.be") && !toLowerCase.equals("kids.youtu.be")) {
                if (toLowerCase.equals("gaming.youtube.com") || toLowerCase.equals("music.youtube.com") || toLowerCase.equals("go.youtube.com") || toLowerCase.equals("kids.youtube.com")) {
                    if (TextUtils.isEmpty(dtv.m12688f(str))) {
                        return false;
                    }
                    return true;
                }
                return false;
            } else if (TextUtils.isEmpty(dtv.m12689g(str))) {
                return false;
            } else {
                return true;
            }
        } catch (MalformedURLException e) {
        }
    }

    private static String m12688f(String str) {
        String path;
        try {
            URL url = new URL(str);
            path = url.getPath();
            if (TextUtils.isEmpty(path)) {
                return null;
            }
            if (path.equals("/watch")) {
                Object query = url.getQuery();
                if (TextUtils.isEmpty(query)) {
                    return null;
                }
                for (String split : query.split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2 && split2[0].equals("v")) {
                        return split2[1];
                    }
                }
            }
            if (path.startsWith("/v/")) {
                return dtv.m12686a("/v/", path);
            }
            return null;
        } catch (Throwable e) {
            Throwable th = e;
            path = "Babel";
            String str2 = "Malformed url found trying to discover if youtube link for ";
            String valueOf = String.valueOf(str);
            glk.m17980d(path, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    private static String m12689g(String str) {
        String toLowerCase;
        String path;
        try {
            URL url = new URL(str);
            path = url.getPath();
            if (TextUtils.isEmpty(path)) {
                return null;
            }
            if (path.equals("/watch") || path.equals("/apiplayer")) {
                Object query = url.getQuery();
                if (TextUtils.isEmpty(query)) {
                    return null;
                }
                for (String split : query.split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2 && ((path.equals("/watch") && split2[0].equals("v")) || (path.equals("/apiplayer") && split2[0].equals("video_id")))) {
                        return split2[1];
                    }
                }
            }
            toLowerCase = url.getHost().toLowerCase(Locale.getDefault());
            if (toLowerCase.equals("youtu.be") || toLowerCase.equals("gaming.youtu.be") || toLowerCase.equals("music.youtu.be") || toLowerCase.equals("go.youtu.be") || toLowerCase.equals("kids.youtu.be")) {
                if (path.startsWith("/addme/")) {
                    return null;
                }
                return dtv.m12686a("/", path);
            } else if (path.startsWith("/embed/")) {
                return dtv.m12686a("/embed/", path);
            } else {
                if (path.startsWith("/v/")) {
                    return dtv.m12686a("/v/", path);
                }
                return null;
            }
        } catch (Throwable e) {
            Throwable th = e;
            path = "Babel";
            String str2 = "Malformed url found trying to discover if youtube link for ";
            toLowerCase = String.valueOf(str);
            glk.m17980d(path, toLowerCase.length() != 0 ? str2.concat(toLowerCase) : new String(str2), th);
        }
    }

    private static String m12686a(String str, String str2) {
        return str2.substring(str.length());
    }

    public void m12690a(int i, boolean z, String str) {
        String str2;
        dtv.m12689g(str);
        setOnClickListener(new dtw(this, str));
        bko e = fde.m15018e(i);
        Object g = dtv.m12689g(str);
        if (TextUtils.isEmpty(g)) {
            glk.m17982e("Babel", "Found no videoId when trying to get the thumbnail for the youtube video", new Object[0]);
            str2 = str;
        } else {
            StringBuilder stringBuilder = new StringBuilder("https://img.youtube.com/vi/");
            stringBuilder.append(g);
            stringBuilder.append("/0.jpg");
            str2 = stringBuilder.toString();
        }
        super.m6622a(e, z, str2, 480, 360, 0);
    }

    public void p_() {
        super.p_();
    }

    public void mo716a(String str) {
    }
}
