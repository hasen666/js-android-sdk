/*
 * Copyright (C) 2016 TIBCO Jaspersoft Corporation. All rights reserved.
 * http://community.jaspersoft.com/project/mobile-sdk-android
 *
 * Unless you have purchased a commercial license agreement from TIBCO Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of TIBCO Jaspersoft Mobile SDK for Android.
 *
 * TIBCO Jaspersoft Mobile SDK is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TIBCO Jaspersoft Mobile SDK is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with TIBCO Jaspersoft Mobile SDK for Android. If not, see
 * <http://www.gnu.org/licenses/lgpl>.
 */

package com.jaspersoft.android.sdk.service.filter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Tom Koptel
 * @since 2.3
 */
class ControlLocation {
    private final String mUri;
    private final Set<String> mIds;

    ControlLocation(String uri) {
        mUri = uri;
        mIds = new HashSet<>();
    }

    public String getUri() {
        return mUri;
    }

    public Set<String> getIds() {
        return mIds;
    }

    public ControlLocation addId(String id) {
        mIds.add(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ControlLocation that = (ControlLocation) o;

        if (mIds != null ? !mIds.equals(that.mIds) : that.mIds != null) return false;
        if (mUri != null ? !mUri.equals(that.mUri) : that.mUri != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mUri != null ? mUri.hashCode() : 0;
        result = 31 * result + (mIds != null ? mIds.hashCode() : 0);
        return result;
    }
}
