package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.hangouts.views.ConversationListItemView;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: eff */
final class eff implements eeq {
    static final Pattern a;
    private static final StyleSpan h;
    final Context b;
    final eer c;
    fmz<efa> d;
    String e;
    int f;
    final dth g;
    private final efl i;
    private final ForegroundColorSpan j;
    private final efi k;

    static {
        h = new StyleSpan(1);
        a = Pattern.compile("\\s|,|-|\"");
    }

    public eff(Context context, int i, eer eer) {
        this.k = new efi(this);
        this.b = context;
        this.f = i;
        this.c = eer;
        this.i = new efl(this, i);
        this.j = new ForegroundColorSpan(context.getResources().getColor(ba.mm));
        this.g = ((dti) jyn.a(context, dti.class)).a(17);
    }

    private boolean a(int i) {
        this.f = i;
        return fdq.D.b(i);
    }

    public lk<Integer, fh<Cursor>> a() {
        if (a(this.f)) {
            return new lk(Integer.valueOf(this.i.a), this.i);
        }
        return null;
    }

    public void a(String str) {
        this.e = str;
    }

    public synchronized fmz<efa> a(fna fna) {
        fmz<efa> fmz_efa;
        if (a(this.f)) {
            if (this.d == null) {
                int i = eey.g;
                gou gou = gou.UNKNOWN;
                this.d = new efh(this, i, true, false, fna);
            }
            fmz_efa = this.d;
        } else {
            fmz_efa = null;
        }
        return fmz_efa;
    }

    public eex a(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        if (this.d == null) {
            glk.d("Babel_GroupSearch", "partition is null, ignore onCreateViewHolder", new Object[0]);
            return null;
        } else if (i == this.d.b()) {
            return new efj(this, layoutInflater.inflate(ba.mo, viewGroup, false));
        } else {
            if (i != this.d.c()) {
                return null;
            }
            View inflate = layoutInflater.inflate(ba.mn, viewGroup, false);
            if (inflate instanceof ConversationListItemView) {
                ((ConversationListItemView) inflate).a(this.k);
            }
            gld.a(inflate, true);
            inflate.setFocusable(true);
            return new efk(this, inflate);
        }
    }

    SpannableStringBuilder a(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return null;
        }
        String[] split = str.split(",");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = split.length;
        int i = 0;
        Object obj = 1;
        while (i < length) {
            Object obj2;
            String trim = split[i].trim();
            if (TextUtils.isEmpty(trim)) {
                obj2 = obj;
            } else {
                if (obj == null) {
                    spannableStringBuilder.append(", ");
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append(trim);
                for (String trim2 : list) {
                    String trim3 = trim2.trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        int length3 = trim3.length();
                        int i2 = 0;
                        while (i2 >= 0) {
                            Object obj3;
                            i2 = trim.toUpperCase(Locale.getDefault()).indexOf(trim3.toUpperCase(Locale.getDefault()), i2);
                            if (i2 < 0 || i2 >= trim.length()) {
                                obj3 = null;
                            } else if (i2 == 0) {
                                obj3 = 1;
                            } else {
                                char charAt = trim.charAt(i2 - 1);
                                if ((charAt < ' ' || charAt > '/') && ((charAt < ':' || charAt > '@') && ((charAt < '[' || charAt > '`') && (charAt < '{' || charAt > '~')))) {
                                    obj3 = null;
                                } else {
                                    obj3 = 1;
                                }
                            }
                            if (obj3 != null) {
                                break;
                            } else if (i2 >= 0) {
                                i2 += length3;
                            }
                        }
                        if (i2 >= 0) {
                            i2 += length2;
                            int i3 = i2 + length3;
                            spannableStringBuilder.setSpan(CharacterStyle.wrap(h), i2, i3, 0);
                            spannableStringBuilder.setSpan(CharacterStyle.wrap(this.j), i2, i3, 0);
                        }
                    }
                }
            }
            i++;
            obj = obj2;
        }
        return spannableStringBuilder.length() == 0 ? null : spannableStringBuilder;
    }
}
