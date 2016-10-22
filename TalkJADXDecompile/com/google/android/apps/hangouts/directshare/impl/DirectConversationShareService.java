package com.google.android.apps.hangouts.directshare.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import boz;
import com.google.android.apps.hangouts.phone.ConversationActivity;
import com.google.api.client.http.HttpStatusCodes;
import cqs;
import cqw;
import cxg;
import glk;
import gwb;
import iih;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import jyn;
import mcp;
import mcq;

public class DirectConversationShareService extends ChooserTargetService {
    private ComponentName a;
    private Icon b;
    private cqw c;

    public void onCreate() {
        super.onCreate();
        this.b = Icon.createWithBitmap(((boz) jyn.a((Context) this, boz.class)).b());
        this.a = new ComponentName(getPackageName(), ConversationActivity.class.getCanonicalName());
        if (((cxg) jyn.a((Context) this, cxg.class)).a("directshare")) {
            this.c = (cqw) jyn.a((Context) this, cqw.class);
            this.c.a();
        }
    }

    public List<ChooserTarget> onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        List<ChooserTarget> arrayList = new ArrayList();
        if (!((cxg) jyn.a((Context) this, cxg.class)).a("directshare")) {
            return arrayList;
        }
        Set<Integer> hashSet = new HashSet();
        mcq mcq = new mcq();
        mcq.a = UUID.randomUUID().toString();
        mcq.d = Integer.valueOf(a(intentFilter));
        Cursor a = a();
        a(a);
        this.c.a((long) gwb.a((Context) this, "babel_max_direct_share_avatar_load_time_ms", (int) HttpStatusCodes.STATUS_CODE_SERVER_ERROR));
        iih iih;
        if (a == null || !a.moveToFirst()) {
            if (a != null) {
                a.close();
            }
            this.c.b();
            iih = (iih) jyn.a((Context) this, iih.class);
            for (Integer a2 : hashSet) {
                iih.a(gwb.a(a2, -1)).b().a(mcq).c(3058);
            }
            return arrayList;
        }
        mcq.b = new mcp[a.getCount()];
        do {
            String str = mcq.a;
            CharSequence string = a.getString(cqs.NAME.a());
            if (TextUtils.isEmpty(string)) {
                string = a.getString(cqs.GENERATED_NAME.a());
            }
            String string2 = a.getString(cqs.CONVERSATION_ID.a());
            String string3 = a.getString(cqs.PACKED_AVATAR_URLS.a());
            int i = a.getInt(cqs.CONVERSATION_TYPE.a());
            int i2 = a.getInt(cqs.ACCOUNT_ID.a());
            CharSequence string4 = a.getString(cqs.ACCOUNT_UI_NAME.a());
            int i3 = a.getInt(cqs.ACCOUNT_COUNT.a());
            int i4 = a.getInt(cqs.TARGET_INDEX.a());
            Bundle bundle = new Bundle();
            gwb.a(bundle, i2, string2, i);
            bundle.putString("direct_share_guid", str);
            bundle.putInt("direct_share_target_index", i4);
            Object spannableStringBuilder = new SpannableStringBuilder();
            if (i3 > 1) {
                if (string.length() > 12) {
                    String substring = string.substring(0, 11);
                    spannableStringBuilder.append(getString(gwb.nM, new Object[]{substring}));
                } else {
                    spannableStringBuilder.append(string);
                }
                spannableStringBuilder.append('\n');
                spannableStringBuilder.append(string4, new ForegroundColorSpan(-7829368), 33);
            } else {
                spannableStringBuilder.append(string);
            }
            Icon icon = this.b;
            Bitmap a3 = this.c.a(string2, string3);
            if (a3 != null) {
                icon = Icon.createWithBitmap(a3);
            }
            arrayList.add(new ChooserTarget(spannableStringBuilder, icon, 1.0f, this.a, bundle));
            int i5 = a.getInt(cqs.TARGET_INDEX.a());
            mcp[] mcpArr = mcq.b;
            mcp mcp = new mcp();
            mcp.a = Integer.valueOf(a.getInt(cqs.TARGET_INDEX.a()));
            mcp.b = Integer.valueOf(a.getInt(cqs.CONVERSATION_TYPE.a()));
            mcp.c = Integer.valueOf(a.getInt(cqs.SHARE_COUNT.a()));
            mcp.d = Long.valueOf(a.getLong(cqs.MILLIS_SINCE_LAST_SHARE.a()));
            mcp.e = Float.valueOf(a.getFloat(cqs.SHARE_SCORE.a()));
            mcp.f = Long.valueOf(a.getLong(cqs.SORT_TIMESTAMP.a()));
            mcpArr[i5] = mcp;
            hashSet.add(Integer.valueOf(a.getInt(cqs.ACCOUNT_ID.a())));
        } while (a.moveToNext());
        if (a != null) {
            a.close();
        }
        this.c.b();
        iih = (iih) jyn.a((Context) this, iih.class);
        while (r2.hasNext()) {
            iih.a(gwb.a(a2, -1)).b().a(mcq).c(3058);
        }
        return arrayList;
    }

    private static int a(IntentFilter intentFilter) {
        for (int i = 0; i < intentFilter.countDataTypes(); i++) {
            String dataType = intentFilter.getDataType(i);
            if (dataType.equals("text/plain")) {
                return 1;
            }
            if (dataType.startsWith("image/")) {
                return 2;
            }
            if (dataType.startsWith("video/")) {
                return 3;
            }
            glk.d("Babel_DirectSharing", "Encountered unsupported data type in share intent filter: %s", dataType);
        }
        return 0;
    }

    private Cursor a() {
        long clearCallingIdentity;
        if (VERSION.SDK_INT == 23) {
            clearCallingIdentity = Binder.clearCallingIdentity();
        } else {
            clearCallingIdentity = 0;
        }
        try {
            Cursor query = getContentResolver().query(DirectShareProvider.b.buildUpon().appendQueryParameter("target_count", "3").appendQueryParameter("share_time_millis", String.valueOf(System.currentTimeMillis())).build(), null, null, null, null);
            return query;
        } finally {
            if (VERSION.SDK_INT == 23) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    private void a(Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            do {
                this.c.a(cursor.getString(cqs.ACCOUNT_NAME.a()), cursor.getString(cqs.CONVERSATION_ID.a()), cursor.getString(cqs.PACKED_AVATAR_URLS.a()), cursor.getString(cqs.GENERATED_NAME.a()));
            } while (cursor.moveToNext());
        }
    }
}
