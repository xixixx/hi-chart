/*
 * Copyright (c) 2017. Xi'an iRain IOT Technology service CO., Ltd (ShenZhen). All Rights Reserved.
 */
package com.parkingwang.hichart.axis.extend;

import android.support.annotation.NonNull;

import com.parkingwang.hichart.axis.XAxis;

import java.util.ArrayList;
import java.util.List;

/**
 * Fixed X-axis。
 *
 * @author 黄浩杭 (huanghaohang@parkingwang.com)
 * @since 2017-06-14 0.1
 */
public class FixedXAxis extends XAxis {
    private List<String> mLabels = new ArrayList<>();

    @NonNull
    public List<String> getLabels() {
        return mLabels;
    }

    /**
     * Set the labels to X-axis for show.
     *
     * @param labels The labels to set.
     */
    public void setLabels(List<String> labels) {
        mLabels = (labels == null) ? new ArrayList<String>() : labels;
    }
}
