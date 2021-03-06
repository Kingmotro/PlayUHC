package com.microcraftmc.playuhc.exceptions;

/**
 * Copyright Statement
 * ----------------------
 * Copyright (C) Microcraft MC - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Class information
 * ---------------------
 * Package: com.microcraftmc.playuhc
 * Project: PlayUHC
 *
 */

public class UhcPlayerNotOnlineException extends UhcException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1159293747235742412L;
	public UhcPlayerNotOnlineException(String name){
		super("Error : Player "+name+" is not online");
	}
}
