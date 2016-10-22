package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.google.android.apps.hangouts.conversation.v2.PreviewImageActivity;
import java.io.File;

/* renamed from: chs */
public final class chs {
    private static final String a;

    static {
        String str;
        try {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
            str = "com.google.android.apps.hangouts.conversation.v2";
        } catch (ClassNotFoundException e) {
            str = "com.google.android.apps.hangouts.conversation.v2altbuild";
        }
        a = str;
    }

    public static Intent a(Context context, Uri uri, boolean z) {
        Intent intent = new Intent(context, PreviewImageActivity.class);
        intent.putExtra("photo_url", uri.toString());
        intent.putExtra("is_video", false);
        intent.putExtra("from_camera", z);
        intent.putExtra("account_id", ((jca) jyn.a(context, jca.class)).a());
        return intent;
    }

    public static Intent a(Context context, Uri uri, String str, boolean z) {
        Intent intent = new Intent(context, PreviewImageActivity.class);
        intent.putExtra("photo_url", uri.toString());
        intent.putExtra("is_video", true);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("content_type", str);
        }
        intent.putExtra("from_camera", z);
        intent.putExtra("account_id", ((jca) jyn.a(context, jca.class)).a());
        return intent;
    }

    public static Intent a(boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (!z) {
            intent.setType("image/*");
        } else if (VERSION.SDK_INT >= 19) {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        } else {
            intent.setType("image/*,video/*");
        }
        return intent;
    }

    public static Intent a(Context context, int i, File file) {
        String str;
        Parcelable fromFile = Uri.fromFile(file);
        Object a = FileProvider.a(context, a, file);
        biw biw = (biw) jyn.a(context, biw.class);
        if (i == 1) {
            str = "android.media.action.IMAGE_CAPTURE";
        } else {
            str = "android.media.action.VIDEO_CAPTURE";
        }
        Intent intent = new Intent(str);
        boolean z = i == 2 && !biw.a("babel_vid_cap_pass_file", true);
        if (z) {
            return intent;
        }
        boolean z2;
        if (gwb.c()) {
            z2 = true;
        } else if (i == 2) {
            z2 = biw.a("babel_use_content_uri_for_camera_video", true);
        } else {
            z2 = biw.a("babel_use_content_uri_for_camera", true);
        }
        if (z2) {
            intent.putExtra("output", a);
            intent.setFlags(3);
            intent.setClipData(ClipData.newUri(context.getContentResolver(), context.getResources().getString(gwb.lT), a));
            intent.setFlags(3);
        } else {
            intent.putExtra("output", fromFile);
        }
        return intent;
    }
}
