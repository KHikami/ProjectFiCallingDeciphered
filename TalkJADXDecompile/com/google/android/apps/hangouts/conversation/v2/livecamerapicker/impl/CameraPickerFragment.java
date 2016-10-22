package com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup;
import bxo;
import ccy;
import cku;
import ckv;
import ckw;
import ckx;
import cky;
import ckz;
import cla;
import clb;
import cld;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import glk;
import gwb;
import java.io.File;
import jzn;
import wi;

public class CameraPickerFragment extends jzn {
    public Camera a;
    public FloatingActionButton aj;
    public FloatingActionButton ak;
    public byte[] al;
    public int am;
    public int an;
    public File ao;
    private TextureView ap;
    private int aq;
    private FloatingActionButton ar;
    private FloatingActionButton as;
    private FloatingActionButton at;
    private int au;
    private SurfaceTextureListener av;
    MediaRecorder b;
    public SurfaceTexture c;
    public int d;
    public int e;
    public boolean f;
    public FloatingActionButton g;
    public FloatingActionButton h;
    public FloatingActionButton i;

    public CameraPickerFragment() {
        this.am = -1;
        this.an = -1;
        this.av = new cld(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                this.an = i;
            } else if (cameraInfo.facing == 1) {
                this.am = i;
            }
        }
        this.au = this.an;
        View inflate = layoutInflater.inflate(gwb.nb, viewGroup, false);
        this.g = (FloatingActionButton) inflate.findViewById(gwb.mY);
        this.g.setOnClickListener(new cku(this));
        this.h = (FloatingActionButton) inflate.findViewById(gwb.mZ);
        this.h.setOnClickListener(new ckv(this));
        this.ar = (FloatingActionButton) inflate.findViewById(gwb.mT);
        this.ar.setOnClickListener(new ckw(this));
        this.i = (FloatingActionButton) inflate.findViewById(gwb.mS);
        this.i.setOnClickListener(new ckx(this));
        this.at = (FloatingActionButton) inflate.findViewById(gwb.mW);
        this.at.setOnClickListener(new cky(this));
        this.as = (FloatingActionButton) inflate.findViewById(gwb.mU);
        this.as.setOnClickListener(new ckz(this));
        if (numberOfCameras > 1) {
            this.as.setVisibility(0);
        }
        this.aj = (FloatingActionButton) inflate.findViewById(gwb.mX);
        this.aj.setOnClickListener(new cla(this));
        this.ak = (FloatingActionButton) inflate.findViewById(gwb.mV);
        this.ak.setOnClickListener(new clb(this));
        this.ap = (TextureView) inflate.findViewById(gwb.mR);
        this.ap.setSurfaceTextureListener(this.av);
        return inflate;
    }

    public void onPause() {
        super.onPause();
        c();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.ao != null && this.ao.exists()) {
            this.ao.delete();
            this.ao = null;
        }
    }

    public void a(int i) {
        if (this.a != null) {
            this.a.stopPreview();
            this.a.release();
            this.a = null;
        }
        this.au = i;
        if (i == this.an) {
            this.at.setVisibility(8);
            this.as.setVisibility(0);
        } else {
            this.at.setVisibility(0);
            this.as.setVisibility(8);
        }
        e();
    }

    private Camera q() {
        Camera camera = null;
        try {
            camera = Camera.open(this.au);
        } catch (Throwable e) {
            glk.d("Babel", "Exception opening camera for preview", e);
        }
        return camera;
    }

    public void a() {
        this.ak.setVisibility(8);
        this.aj.setVisibility(8);
        this.as.setVisibility(8);
        this.at.setVisibility(8);
    }

    public void b() {
        a();
        this.h.setVisibility(8);
        this.ar.setVisibility(0);
        this.b = new MediaRecorder();
        this.a.unlock();
        this.b.setCamera(this.a);
        this.b.setAudioSource(0);
        this.b.setVideoSource(1);
        this.b.setOrientationHint(this.aq);
        this.b.setProfile(CamcorderProfile.get(1));
        this.ao = ccy.a(bxo.VIDEO);
        this.b.setOutputFile(this.ao.toString());
        try {
            this.b.prepare();
            this.b.start();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void c() {
        if (this.b != null) {
            this.b.stop();
            this.b.reset();
            this.b.release();
            this.b = null;
        }
        if (this.a != null) {
            this.a.lock();
            this.a.stopPreview();
        }
        this.ar.setVisibility(8);
        this.i.setVisibility(0);
    }

    public void d() {
        float f = 1.0f;
        if (this.f && this.a != null) {
            float f2;
            float f3;
            Size previewSize = this.a.getParameters().getPreviewSize();
            if (this.aq == 90 || this.aq == 270) {
                f2 = (float) previewSize.height;
                f3 = (float) previewSize.width;
            } else {
                f2 = (float) previewSize.width;
                f3 = (float) previewSize.height;
            }
            f3 = f2 / f3;
            f2 = (((float) this.d) * 1.0f) / ((float) this.e);
            if (f3 > f2) {
                f = f3 / f2;
                f3 = 1.0f;
            } else {
                f3 = f2 / f3;
            }
            f2 = (float) (this.d / 2);
            float f4 = (float) (this.e / 2);
            Matrix matrix = new Matrix();
            matrix.setScale(f, f3, f2, f4);
            this.ap.setTransform(matrix);
        }
    }

    public void e() {
        int i = 0;
        if (this.c != null) {
            try {
                this.a = q();
                if (this.a != null) {
                    this.a.setPreviewTexture(this.c);
                    int i2 = this.au;
                    Camera camera = this.a;
                    CameraInfo cameraInfo = new CameraInfo();
                    Camera.getCameraInfo(i2, cameraInfo);
                    switch (getActivity().getWindowManager().getDefaultDisplay().getRotation()) {
                        case wi.j /*1*/:
                            i = 90;
                            break;
                        case wi.l /*2*/:
                            i = 180;
                            break;
                        case wi.z /*3*/:
                            i = 270;
                            break;
                    }
                    if (cameraInfo.facing == 1) {
                        this.aq = (i + cameraInfo.orientation) % 360;
                        i = (360 - this.aq) % 360;
                    } else {
                        this.aq = ((cameraInfo.orientation - i) + 360) % 360;
                        i = this.aq;
                    }
                    Parameters parameters = camera.getParameters();
                    parameters.setRotation(this.aq);
                    camera.setParameters(parameters);
                    camera.setDisplayOrientation(i);
                    d();
                    this.a.startPreview();
                }
            } catch (Throwable e) {
                glk.d("Babel", "Error setting camera preview texture", e);
            }
        }
    }
}
