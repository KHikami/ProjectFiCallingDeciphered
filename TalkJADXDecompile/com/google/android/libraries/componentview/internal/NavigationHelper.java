package com.google.android.libraries.componentview.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.libraries.componentview.api.external.ComponentViewErrorCode.Error;
import com.google.android.libraries.componentview.components.base.api.nano.ActionProto.Action;
import com.google.android.libraries.componentview.inject.annotations.ExecutorType.UI;
import com.google.android.libraries.componentview.services.application.Fetcher;
import com.google.android.libraries.componentview.services.application.Fetcher.Response;
import com.google.android.libraries.componentview.services.application.Logger;
import com.google.android.libraries.componentview.services.application.Navigator;
import com.google.android.libraries.componentview.services.application.Notification;
import com.google.api.client.http.HttpStatusCodes;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.Executor;
import msx;
import msy;
import ofe;

public class NavigationHelper {
    final Navigator a;
    final Logger b;
    private final Notification c;
    private final Fetcher d;
    private final Executor e;
    private final Context f;

    class 1 implements msx<Response> {
        final /* synthetic */ Action a;
        final /* synthetic */ NavigationHelper b;

        1(NavigationHelper navigationHelper, Action action) {
            this.b = navigationHelper;
            this.a = action;
        }

        public void a(Response response) {
            if (response == null || !response.c) {
                L.a("NavigationHelper", "Ad fetch failed with result null or failure", new Object[0]);
            } else if ((response.d != HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY && response.d != HttpStatusCodes.STATUS_CODE_FOUND) || TextUtils.isEmpty(response.f)) {
                L.a("NavigationHelper", "Ad fetch failed with status as " + response.d, new Object[0]);
            } else if (response.d == HttpStatusCodes.STATUS_CODE_MOVED_PERMANENTLY) {
                this.b.a(response.f, this.a, null);
            } else {
                this.b.a.a(response.f);
                NavigationHelper navigationHelper = this.b;
                Action action = this.a;
                if (action.d() > -1) {
                    new HashMap().put("action_type", Long.toString(action.d()));
                }
            }
        }

        public void a(Throwable th) {
            String str = "NavigationHelper";
            String str2 = "Unable to handle action: ";
            String valueOf = String.valueOf(this.a.toString());
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            L.a(str, th, valueOf, Error.REDIRECT_FETCH_FAILURE, this.b.b, "", new Object[0]);
        }
    }

    public NavigationHelper(Navigator navigator, Logger logger, Notification notification, Fetcher fetcher, @UI Executor executor, Context context) {
        this.a = navigator;
        this.b = logger;
        this.c = notification;
        this.d = fetcher;
        this.e = executor;
        this.f = context;
    }

    void a(String str, Action action, ofe ofe) {
        URI uri;
        if (ofe != null) {
            try {
                if (!TextUtils.isEmpty(ofe.d())) {
                    String d = ofe.d();
                    Builder buildUpon = Uri.parse(str).buildUpon();
                    buildUpon.appendQueryParameter("ved", d);
                    uri = new URI(buildUpon.toString());
                    msy.a(this.d.a(uri, null, null, false), new 1(this, action), this.e);
                }
            } catch (Throwable e) {
                L.a("NavigationHelper", e, "Invalid URI in executeAdsRequest!", Error.INVALID_URI, this.b, "", new Object[0]);
                return;
            }
        }
        uri = new URI(str);
        msy.a(this.d.a(uri, null, null, false), new 1(this, action), this.e);
    }
}
