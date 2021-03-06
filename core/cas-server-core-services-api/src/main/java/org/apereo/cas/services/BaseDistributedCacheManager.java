package org.apereo.cas.services;

import org.apereo.cas.DistributedCacheManager;
import org.apereo.cas.DistributedCacheObject;

import java.io.Serializable;

/**
 * This is {@link BaseDistributedCacheManager}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
public abstract class BaseDistributedCacheManager<K extends Serializable, V extends DistributedCacheObject> implements DistributedCacheManager<K, V> {
    @Override
    public void close() {
    }
}
