package com.jstarcraft.cloud.configuration;

import com.jstarcraft.core.common.option.Option;

/**
 * 配置监控器
 * 
 * @author Birdy
 *
 */
public interface ConfigurationMonitor {

    /**
     * 变更
     * 
     * @param name
     * @param from
     * @param to
     */
    void change(String name, Option from, Option to);

}
