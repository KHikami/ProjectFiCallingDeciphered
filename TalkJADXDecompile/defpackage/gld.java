package defpackage;

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

/* renamed from: gld */
public final class gld {
    public static final kad a;
    public static String b;
    private static final int[] c;

    static {
        c = new int[]{16843534};
        a = new kad("debug.chat.debug_enabled");
    }

    public static boolean a() {
        if (gwb.a(gwb.H(), "babel_debugging", false) || ((gmp) jyn.a(gwb.H(), gmp.class)).a()) {
            return true;
        }
        return false;
    }

    private static String c() {
        if (b == null) {
            b = gwb.H().getResources().getString(bc.cB);
        }
        return b;
    }

    public static StringBuilder a(StringBuilder stringBuilder, List<CharSequence> list) {
        for (CharSequence a : list) {
            gld.a(stringBuilder, a);
        }
        return stringBuilder;
    }

    public static StringBuilder a(StringBuilder stringBuilder, CharSequence charSequence) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append(gld.c());
        }
        stringBuilder.append(charSequence);
        return stringBuilder;
    }

    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, List<CharSequence> list) {
        for (CharSequence a : list) {
            gld.a(spannableStringBuilder, a);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a(Context context, SpannableStringBuilder spannableStringBuilder, List<CharSequence> list) {
        if (gwb.a(context, "babel_can_append_spannable", true)) {
            for (CharSequence a : list) {
                gld.a(spannableStringBuilder, a);
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (CharSequence a2 : list) {
                gld.a(stringBuilder, a2);
            }
            spannableStringBuilder.append(stringBuilder.toString());
            Linkify.addLinks(spannableStringBuilder, 7);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.append(gld.c());
            }
            spannableStringBuilder.append(charSequence);
        }
        return spannableStringBuilder;
    }

    public static void a(View view, AccessibilityManager accessibilityManager, CharSequence charSequence) {
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
            new rf(obtain).a(view);
            accessibilityManager2.sendAccessibilityEvent(obtain);
        }
    }

    public static void a(int i) {
        try {
            MediaPlayer create = MediaPlayer.create(gwb.H(), i);
            if (create == null) {
                glk.e("Babel", "Could not create MediaPlayer for " + i, new Object[0]);
                return;
            }
            create.setOnCompletionListener(new gle());
            create.start();
        } catch (Throwable e) {
            iil.a("Exception in MediaPlayer.create");
            glk.d("Babel", "MediaPlayer.create: ", e);
        }
    }

    public static String b(int i) {
        Resources resources = gwb.H().getResources();
        return String.format(Locale.US, "android.resource://%s/%s/%d", new Object[]{r0.getPackageName(), resources.getResourceTypeName(i), Integer.valueOf(i)});
    }

    public static Uri c(int i) {
        return Uri.parse(gld.b(i));
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.equals(parse.getHost(), "maps.googleapis.com") || !TextUtils.isEmpty(parse.getQueryParameter("key")) || !TextUtils.isEmpty(parse.getQueryParameter("client"))) {
            return str;
        }
        Object b = gwb.b(gwb.H(), "babel_map_api_key", "AIzaSyBK6MmN29Pi3wq8XFUBhmukENGaH5_tGXw");
        if (TextUtils.isEmpty(b)) {
            return str;
        }
        return parse.buildUpon().appendQueryParameter("key", b).build().toString();
    }

    public static String b(String str) {
        return gsl.a(gwb.H().getContentResolver()).a(str).a(str);
    }

    public static String b() {
        int i = 0;
        SharedPreferences sharedPreferences = gwb.H().getSharedPreferences("batch_tag_pref", 0);
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

    public static Uri c(String str) {
        return TextUtils.isEmpty(str) ? null : Uri.parse(str);
    }

    public static int a(String str, String str2) {
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

    public static boolean a(View view) {
        return VERSION.SDK_INT >= 17 && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static void a(View view, boolean z) {
        Drawable drawable;
        if (z) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(c);
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        } else {
            drawable = null;
        }
        view.setBackground(drawable);
    }

    public static void a(Context context, String str, Spanned spanned) {
        Spannable valueOf = SpannableString.valueOf(spanned);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(valueOf);
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.findViewById(16908299);
        if (textView != null) {
            gob.a(context).a(valueOf, null, textView);
            Linkify.addLinks(textView, 7);
        }
    }

    public static boolean a(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static String d(String str) {
        return ke.a().a(str, kp.a);
    }

    public static boolean a(char[] cArr) {
        int i = 0;
        boolean z = false;
        while (!z && i < cArr.length - 1) {
            z = Bidi.requiresBidi(cArr, i, Math.min(cArr.length, i + 256));
            i += 255;
        }
        return z;
    }

    public static boolean d(int i) {
        return i != 0;
    }

    public static int a(boolean z) {
        return z ? 1 : 0;
    }

    public static Integer a(Boolean bool) {
        if (bool != null) {
            return Integer.valueOf(gld.a(gwb.b(bool)));
        }
        return null;
    }

    public static Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
    }

    public static byte[] a(Object obj) {
        if (obj == null) {
            return null;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static Spannable a(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            return (Spannable) charSequence;
        }
        return new SpannableString(charSequence);
    }

    public static void a(TextView textView, View view, int i, int i2, int i3, int i4) {
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
            gld.a(stringBuilder, text2);
        }
        textView.setText(spannableStringBuilder);
        if (view != null) {
            View view2 = view;
        }
        textView.setContentDescription(stringBuilder.toString());
    }

    public static int e(int i) {
        return i == 9 ? 5 : i / 2;
    }

    public static int a(Integer num) {
        switch (gwb.a(num, -1)) {
            case wi.w /*0*/:
            case wi.h /*4*/:
                return 1;
            case wi.l /*2*/:
                return 3;
            case wi.z /*3*/:
                return 4;
            case wi.p /*5*/:
                return 7;
            case wi.s /*6*/:
                return 8;
            default:
                return -1;
        }
    }
}
