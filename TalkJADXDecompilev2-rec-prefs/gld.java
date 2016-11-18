package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.Bidi;
import java.util.List;
import java.util.Locale;

public final class gld {
    public static final kad f15536a = new kad("debug.chat.debug_enabled");
    public static String f15537b;
    private static final int[] f15538c = new int[]{16843534};

    public static boolean m17936a() {
        if (gwb.m1906a(gwb.m1400H(), "babel_debugging", false) || ((gmp) jyn.m25426a(gwb.m1400H(), gmp.class)).mo2298a()) {
            return true;
        }
        return false;
    }

    private static String m17946c() {
        if (f15537b == null) {
            f15537b = gwb.m1400H().getResources().getString(bc.cB);
        }
        return f15537b;
    }

    public static StringBuilder m17930a(StringBuilder stringBuilder, List<CharSequence> list) {
        for (CharSequence a : list) {
            gld.m17929a(stringBuilder, a);
        }
        return stringBuilder;
    }

    public static StringBuilder m17929a(StringBuilder stringBuilder, CharSequence charSequence) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append(gld.m17946c());
        }
        stringBuilder.append(charSequence);
        return stringBuilder;
    }

    public static SpannableStringBuilder m17925a(SpannableStringBuilder spannableStringBuilder, List<CharSequence> list) {
        for (CharSequence a : list) {
            gld.m17924a(spannableStringBuilder, a);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder m17923a(Context context, SpannableStringBuilder spannableStringBuilder, List<CharSequence> list) {
        if (gwb.m1906a(context, "babel_can_append_spannable", true)) {
            for (CharSequence a : list) {
                gld.m17924a(spannableStringBuilder, a);
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (CharSequence a2 : list) {
                gld.m17929a(stringBuilder, a2);
            }
            spannableStringBuilder.append(stringBuilder.toString());
            Linkify.addLinks(spannableStringBuilder, 7);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder m17924a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.append(gld.m17946c());
            }
            spannableStringBuilder.append(charSequence);
        }
        return spannableStringBuilder;
    }

    public static void m17933a(View view, AccessibilityManager accessibilityManager, CharSequence charSequence) {
        AccessibilityManager accessibilityManager2;
        Context applicationContext = view.getContext().getApplicationContext();
        if (accessibilityManager == null) {
            accessibilityManager2 = (AccessibilityManager) applicationContext.getSystemService("accessibility");
        } else {
            accessibilityManager2 = accessibilityManager;
        }
        if (accessibilityManager2.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(charSequence);
            obtain.setEnabled(view.isEnabled());
            obtain.setClassName(view.getClass().getName());
            obtain.setPackageName(applicationContext.getPackageName());
            new rf(obtain).m33692a(view);
            accessibilityManager2.sendAccessibilityEvent(obtain);
        }
    }

    public static void m17931a(int i) {
        try {
            MediaPlayer create = MediaPlayer.create(gwb.m1400H(), i);
            if (create == null) {
                glk.m17982e("Babel", "Could not create MediaPlayer for " + i, new Object[0]);
                return;
            }
            create.setOnCompletionListener(new gle());
            create.start();
        } catch (Throwable e) {
            iil.m21870a("Exception in MediaPlayer.create");
            glk.m17980d("Babel", "MediaPlayer.create: ", e);
        }
    }

    public static String m17942b(int i) {
        Resources resources = gwb.m1400H().getResources();
        return String.format(Locale.US, "android.resource://%s/%s/%d", new Object[]{r0.getPackageName(), resources.getResourceTypeName(i), Integer.valueOf(i)});
    }

    public static Uri m17944c(int i) {
        return Uri.parse(gld.m17942b(i));
    }

    public static String m17928a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.equals(parse.getHost(), "maps.googleapis.com") || !TextUtils.isEmpty(parse.getQueryParameter("key")) || !TextUtils.isEmpty(parse.getQueryParameter("client"))) {
            return str;
        }
        Object b = gwb.m1998b(gwb.m1400H(), "babel_map_api_key", "AIzaSyBK6MmN29Pi3wq8XFUBhmukENGaH5_tGXw");
        if (TextUtils.isEmpty(b)) {
            return str;
        }
        return parse.buildUpon().appendQueryParameter("key", b).build().toString();
    }

    public static String m17943b(String str) {
        return gsl.m18472a(gwb.m1400H().getContentResolver()).m18473a(str).m18474a(str);
    }

    public static String m17941b() {
        int i = 0;
        SharedPreferences sharedPreferences = gwb.m1400H().getSharedPreferences("batch_tag_pref", 0);
        int i2 = sharedPreferences.getInt("batch_tag", 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        String valueOf = String.valueOf(i);
        Editor edit = sharedPreferences.edit();
        edit.putInt("batch_tag", i);
        edit.apply();
        return valueOf;
    }

    public static Uri m17945c(String str) {
        return TextUtils.isEmpty(str) ? null : Uri.parse(str);
    }

    public static int m17920a(String str, String str2) {
        int i = 0;
        if (str != null) {
            int length = str2.length();
            int i2 = -length;
            while (true) {
                i2 = str.indexOf(str2, i2 + length);
                if (i2 < 0) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static boolean m17938a(View view) {
        return VERSION.SDK_INT >= 17 && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static void m17934a(View view, boolean z) {
        Drawable drawable;
        if (z) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(f15538c);
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        } else {
            drawable = null;
        }
        view.setBackground(drawable);
    }

    public static void m17932a(Context context, String str, Spanned spanned) {
        Spannable valueOf = SpannableString.valueOf(spanned);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(valueOf);
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.findViewById(16908299);
        if (textView != null) {
            gob.m18199a(context).mo2308a(valueOf, null, textView);
            Linkify.addLinks(textView, 7);
        }
    }

    public static boolean m17937a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static String m17947d(String str) {
        return ke.m25637a().m25642a(str, kp.f22600a);
    }

    public static boolean m17939a(char[] cArr) {
        int i = 0;
        boolean z = false;
        while (!z && i < cArr.length - 1) {
            z = Bidi.requiresBidi(cArr, i, Math.min(cArr.length, i + 256));
            i += 255;
        }
        return z;
    }

    public static boolean m17948d(int i) {
        return i != 0;
    }

    public static int m17921a(boolean z) {
        return z ? 1 : 0;
    }

    public static Integer m17926a(Boolean bool) {
        if (bool != null) {
            return Integer.valueOf(gld.m17921a(gwb.m2061b(bool)));
        }
        return null;
    }

    public static Object m17927a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
    }

    public static byte[] m17940a(Object obj) {
        if (obj == null) {
            return null;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static Spannable m17922a(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            return (Spannable) charSequence;
        }
        return new SpannableString(charSequence);
    }

    public static void m17935a(TextView textView, View view, int i, int i2, int i3, int i4) {
        Resources resources = textView.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        int length = spannableStringBuilder.length();
        CharSequence text = resources.getText(i);
        spannableStringBuilder.append(text);
        if (VERSION.SDK_INT >= 21) {
            spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), length, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        }
        stringBuilder.append(text);
        if (i3 != 0) {
            spannableStringBuilder.append('\n');
            int length2 = spannableStringBuilder.length();
            CharSequence text2 = resources.getText(i3);
            spannableStringBuilder.append(text2);
            spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), length2, spannableStringBuilder.length(), 33);
            if (i4 != 0) {
                text2 = resources.getText(i4);
            }
            gld.m17929a(stringBuilder, text2);
        }
        textView.setText(spannableStringBuilder);
        if (view != null) {
            View view2 = view;
        }
        textView.setContentDescription(stringBuilder.toString());
    }

    public static int m17949e(int i) {
        return i == 9 ? 5 : i / 2;
    }

    public static int m17919a(Integer num) {
        switch (gwb.m1508a(num, -1)) {
            case 0:
            case 4:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return -1;
        }
    }
}
