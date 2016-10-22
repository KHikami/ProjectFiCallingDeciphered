package com.google.android.apps.hangouts.conversation.v2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import bxy;
import cib;
import cic;
import cid;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import fdq;
import fwn;
import fwo;
import glk;
import gwb;
import java.util.concurrent.TimeUnit;
import jca;
import jcu;
import jzc;

public class PreviewImageActivity extends jzc {
    public View n;
    public View o;
    public ImageView p;
    public VideoView q;
    public TextView r;
    public FloatingActionButton s;
    public bxy t;
    public boolean u;
    public long v;
    public Boolean w;
    public String x;
    public cid y;
    private final jca z;

    public PreviewImageActivity() {
        this.z = new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.lQ);
        Toolbar toolbar = (Toolbar) findViewById(gwb.lH);
        a(toolbar);
        g().b(true);
        g().c(false);
        setTitle("");
        toolbar.bringToFront();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("photo_url");
        if (intent.hasExtra("is_video")) {
            this.w = Boolean.valueOf(intent.getBooleanExtra("is_video", false));
        }
        if (intent.hasExtra("content_type")) {
            this.x = intent.getStringExtra("content_type");
        }
        this.u = intent.getBooleanExtra("from_camera", false);
        Uri parse = Uri.parse(stringExtra);
        String str = "Babel_PreviewImage";
        String str2 = "Starting preview for: ";
        stringExtra = String.valueOf(parse.toString());
        if (stringExtra.length() != 0) {
            stringExtra = str2.concat(stringExtra);
        } else {
            stringExtra = new String(str2);
        }
        glk.c(str, stringExtra, new Object[0]);
        this.n = findViewById(gwb.lL);
        this.n.bringToFront();
        this.n.setVisibility(8);
        this.o = findViewById(gwb.lM);
        int a = this.z.a();
        this.v = TimeUnit.SECONDS.toMillis(fdq.H.c(a));
        this.p = (ImageView) findViewById(gwb.lI);
        this.q = (VideoView) findViewById(gwb.lK);
        this.r = (TextView) findViewById(gwb.lN);
        this.s = (FloatingActionButton) findViewById(gwb.lJ);
        this.s.setOnClickListener(new cib(this));
        if (gwb.b(this.w)) {
            this.s.setContentDescription(getString(gwb.me));
        }
        this.y = new cid(this, this, a, parse);
        fwn fwn = (fwn) this.E.a(fwn.class);
        if (fwn.a(intent)) {
            fwn.a();
        } else {
            j();
        }
    }

    public void j() {
        this.y.execute(new Void[0]);
    }

    protected void a(Bundle bundle) {
        super.a(bundle);
        this.E.a(fwo.class, new cic(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                super.onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
