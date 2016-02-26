/*
    ShengDao Android Client, DownLoad
    Copyright (c) 2014 ShengDao Tech Company Limited
 */

package io.rong.app.server.network.async;

public class AsyncRequest {

	/**
	 * 请求id
	 */
	private int requestCode;
	/**
	 * 是否检查网络，true表示检查，false表示不检查
	 */
	private boolean isCheckNetwork;
	/**
	 * 处理监听
	 */
	private OnDataListener listener;

	public AsyncRequest() {
		super();
	}

	public AsyncRequest(int requestCode, boolean isCheckNetwork, OnDataListener listener) {
		this.requestCode = requestCode;
		this.isCheckNetwork = isCheckNetwork;
		this.listener = listener;
	}

	public int getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(int requestCode) {
		this.requestCode = requestCode;
	}

	public boolean isCheckNetwork() {
		return isCheckNetwork;
	}

	public void setCheckNetwork(boolean isCheckNetwork) {
		this.isCheckNetwork = isCheckNetwork;
	}

	public OnDataListener getListener() {
		return listener;
	}

	public void setListener(OnDataListener listener) {
		this.listener = listener;
	}

}