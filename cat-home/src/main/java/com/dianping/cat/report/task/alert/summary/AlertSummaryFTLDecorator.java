package com.dianping.cat.report.task.alert.summary;

public class AlertSummaryFTLDecorator extends SummaryDecorator {

	public static final String ID = "AlertSummaryFTLDecorator";

	@Override
	protected String getID() {
		return ID;
	}

	@Override
	protected String getTemplateAddress() {
		return "summary.ftl";
	}

}
