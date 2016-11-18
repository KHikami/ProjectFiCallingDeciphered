package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.hangouts.phone.HelpAndFeedbackActivity;

public final class eom extends WebViewClient {
    final /* synthetic */ View f11932a;
    final /* synthetic */ HelpAndFeedbackActivity f11933b;

    public eom(HelpAndFeedbackActivity helpAndFeedbackActivity, View view) {
        this.f11933b = helpAndFeedbackActivity;
        this.f11932a = view;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f11932a.setVisibility(0);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f11932a.setVisibility(8);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        if ("https".equals(parse.getScheme()) && HelpAndFeedbackActivity.f6689r.contains(parse.getHost())) {
            webView.loadUrl(str);
        } else {
            this.f11933b.startActivity(gwb.m2397z(str));
        }
        return true;
    }
}
