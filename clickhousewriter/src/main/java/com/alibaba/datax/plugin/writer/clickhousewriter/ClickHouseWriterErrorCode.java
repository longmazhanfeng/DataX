package com.alibaba.datax.plugin.writer.clickhousewriter;

import com.alibaba.datax.common.spi.ErrorCode;

public enum ClickHouseWriterErrorCode implements ErrorCode {
	TUPLE_NOT_SUPPORTED_ERROR("ClickHouseWriter-00", "不支持TUPLE类型导入."),
	;

	private final String code;
	private final String description;

	private ClickHouseWriterErrorCode(String code, String description) {
		this.code = code;
		this.description = description;
	}

	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return String.format("Code:[%s], Description:[%s].", this.code, this.description);
	}
}
