package com.app.lokesh.service;

import org.springframework.stereotype.Component;

@Component
public class ProcessService {

	private int processId;
	private String processName;

	public int getProcessId() {
		return processId;
	}

	public void setProcessId(int processId) {
		this.processId = processId;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	@Override
	public String toString() {
		return "ProcessService [processId=" + processId + ", processName=" + processName + "]";
	}
	
	

}
