package com.google.android.libraries.hangouts.video.internal;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative
public class VideoViewRequest {
    @UsedByNative
    public final int frameRate;
    @UsedByNative
    public final int height;
    @UsedByNative
    public final int rendererId;
    @UsedByNative
    public final long rendererManagerNativeContext;
    @UsedByNative
    public final int ssrc;
    @UsedByNative
    public final int width;

    public VideoViewRequest(int i, Renderer renderer, int i2, int i3, int i4) {
        this.ssrc = i;
        this.width = i2;
        this.height = i3;
        this.frameRate = i4;
        this.rendererManagerNativeContext = renderer.mRendererManager.b();
        this.rendererId = renderer.mRendererID;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoViewRequest)) {
            return false;
        }
        VideoViewRequest videoViewRequest = (VideoViewRequest) obj;
        if (this.ssrc == videoViewRequest.ssrc && this.width == videoViewRequest.width && this.height == videoViewRequest.height && this.frameRate == videoViewRequest.frameRate && this.rendererManagerNativeContext == videoViewRequest.rendererManagerNativeContext && this.rendererId == videoViewRequest.rendererId) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "VideoViewRequest: ssrc=" + this.ssrc + ",w=" + this.width + ",h=" + this.height + ",fps=" + this.frameRate + ")";
    }
}
