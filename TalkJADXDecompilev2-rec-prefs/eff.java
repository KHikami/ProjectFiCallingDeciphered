package p000;

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

final class eff implements eeq {
    static final Pattern f11343a = Pattern.compile("\\s|,|-|\"");
    private static final StyleSpan f11344h = new StyleSpan(1);
    final Context f11345b;
    final eer f11346c;
    fmz<efa> f11347d;
    String f11348e;
    int f11349f;
    final dth f11350g;
    private final efl f11351i;
    private final ForegroundColorSpan f11352j;
    private final efi f11353k = new efi(this);

    public eff(Context context, int i, eer eer) {
        this.f11345b = context;
        this.f11349f = i;
        this.f11346c = eer;
        this.f11351i = new efl(this, i);
        this.f11352j = new ForegroundColorSpan(context.getResources().getColor(ba.mm));
        this.f11350g = ((dti) jyn.m25426a(context, dti.class)).mo1673a(17);
    }

    private boolean m13760a(int i) {
        this.f11349f = i;
        return fdq.f12762D.m14370b(i);
    }

    public lk<Integer, fh<Cursor>> mo1859a() {
        if (m13760a(this.f11349f)) {
            return new lk(Integer.valueOf(this.f11351i.f11371a), this.f11351i);
        }
        return null;
    }

    public void mo1860a(String str) {
        this.f11348e = str;
    }

    public synchronized fmz<efa> mo1858a(fna fna) {
        fmz<efa> fmz_efa;
        if (m13760a(this.f11349f)) {
            if (this.f11347d == null) {
                int i = eey.f11329g;
                gou gou = gou.UNKNOWN;
                this.f11347d = new efh(this, i, true, false, fna);
            }
            fmz_efa = this.f11347d;
        } else {
            fmz_efa = null;
        }
        return fmz_efa;
    }

    public eex mo1857a(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        if (this.f11347d == null) {
            glk.m17981d("Babel_GroupSearch", "partition is null, ignore onCreateViewHolder", new Object[0]);
            return null;
        } else if (i == this.f11347d.m13775b()) {
            return new efj(this, layoutInflater.inflate(ba.mo, viewGroup, false));
        } else {
            if (i != this.f11347d.m13777c()) {
                return null;
            }
            View inflate = layoutInflater.inflate(ba.mn, viewGroup, false);
            if (inflate instanceof ConversationListItemView) {
                ((ConversationListItemView) inflate).m9273a(this.f11353k);
            }
            gld.m17934a(inflate, true);
            inflate.setFocusable(true);
            return new efk(this, inflate);
        }
    }

    SpannableStringBuilder m13761a(String str, List<String> list) {
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
                            spannableStringBuilder.setSpan(CharacterStyle.wrap(f11344h), i2, i3, 0);
                            spannableStringBuilder.setSpan(CharacterStyle.wrap(this.f11352j), i2, i3, 0);
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
