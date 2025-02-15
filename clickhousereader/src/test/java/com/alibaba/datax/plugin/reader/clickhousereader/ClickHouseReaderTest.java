package com.alibaba.datax.plugin.reader.clickhousereader;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;

import com.alibaba.datax.common.util.Configuration;
import org.junit.Test;

/**
 * @author : donghao
 * @version : 1.0
 * @className : com.alibaba.datax.plugin.reader.clickhousereader.ClickHouseReaderTest
 * @description: 测试类
 * @date : 2022-07-27 11:18
 */
public class ClickHouseReaderTest {

    ClickHouseReader.Job job;

    @Before
    public void before() {
        job = new ClickHouseReader.Job();
        File file = new File(
            "C:\\Users\\Mobvista\\Documents\\其他\\test_ck_reader_events.json");

        Configuration configuration = Configuration.from(file);
        job.setPluginJobConf(configuration);
    }

    @Test
    public void jobInit() {
        // when
        job.init();
        // assert
        Configuration conf = job.getPluginJobConf();

        Assert.assertEquals("xxx", conf.getString("username"));
        Assert.assertEquals("xxx", conf.getString("password"));
        Assert.assertEquals(new Integer(2000), conf.getInt("fetchSize"));

        job.destroy();
    }
}
