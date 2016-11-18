package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.hangouts.phone.HelpAndFeedbackActivity;

public final class eom extends WebViewClient {
    final /* synthetic */ View a;
    final /* synthetic */ HelpAndFeedbackActivity b;

    public eom(HelpAndFeedbackActivity helpAndFeedbackActivity, View view) {
        this.b = helpAndFeedbackActivity;
        this.a = view;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.a.setVisibility(0);
    }

    public void onPageFinished(WebView webView, String str) {
        this.a.setVisibility(8);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        if ("https".equals(parse.getScheme()) && HelpAndFeedbackActivity.r.contains(parse.getHost())) {
            webView.loadUrl(str);
        } else {
            this.b.startActivity(gwb.z(str));
        }
        return true;
    }
}
